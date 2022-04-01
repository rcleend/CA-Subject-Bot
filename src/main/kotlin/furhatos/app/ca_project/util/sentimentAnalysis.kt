package furhatos.app.ca_project.util

import edu.stanford.nlp.ling.CoreAnnotations
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations
import edu.stanford.nlp.pipeline.StanfordCoreNLP
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations
import java.util.*

class SentimentAnalysis() {
    private val pipeline: StanfordCoreNLP;

    init {
        val props = Properties()
        props.setProperty("annotators","tokenize,ssplit,parse,sentiment")
        props.setProperty("coref.algorithm", "neural")
        this.pipeline = StanfordCoreNLP(props)
    }

    /**
     *  The 'analyse' method uses Stanford Core-NLP sentiment analysis. The classifier returns the following values:
     *  0) Very Negative
     *  1) Negative
     *  2) Neutral
     *  3) Positive
     *  4) Very Positive
     */
    fun analyse(utterance: String): Int {
        println(utterance)

        val annotation = pipeline.process(utterance)

        var sentimentScore = -1
        for (sentence in annotation.get(CoreAnnotations.SentencesAnnotation::class.java)) {
            val tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree::class.java)
            sentimentScore = RNNCoreAnnotations.getPredictedClass(tree)
        }

        return sentimentScore;
    }
}