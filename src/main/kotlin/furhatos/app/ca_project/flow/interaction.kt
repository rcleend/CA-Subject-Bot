package furhatos.app.ca_project.flow

import furhatos.app.ca_project.util.SentimentAnalysis
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import java.util.*


val Start : State = state(Interaction) {

    onEntry {
        furhat.ask("Hi there. how are you doing?")
    }

    onResponse{
        val sentimentAnalysis = SentimentAnalysis()
        sentimentAnalysis.analyse(it.text.toString())
    }
}
