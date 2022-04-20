package furhatos.app.ca_project.models

import furhatos.app.ca_project.util.QuestionAnalysis
import furhatos.app.ca_project.util.QuestionType
import furhatos.app.ca_project.util.SentimentAnalysis
import furhatos.app.ca_project.util.Utilities

class QuestionFrame(utterance: String, isNegAssumption: Boolean = false) {
    private val _sentiment: Double
    private val _questionType: QuestionType
    private val _isNegAssumption: Boolean

    val sentiment get() = this._sentiment
    val questionType get() = this._questionType
    val isNegAssumption get() = this._isNegAssumption

    init {
        val sentimentAnalysis = SentimentAnalysis()
        val questionAnalysis = QuestionAnalysis()
        this._sentiment = Utilities.map(sentimentAnalysis.analyse(utterance).toDouble(), 0.0, 4.0, -2.0, 2.0)
        this._questionType = questionAnalysis.analyse(utterance)
        this._isNegAssumption = isNegAssumption
    }
}