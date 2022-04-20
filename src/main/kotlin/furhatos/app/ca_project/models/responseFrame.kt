package furhatos.app.ca_project.models

import furhatos.gestures.Gesture
import furhatos.flow.kotlin.furhat

class ResponseFrame(responses: Array<Triple<Ruleset, Gesture, String>>) {
    private val _responses = responses

    fun getResponse(): Pair<Gesture, String> {
        for ((ruleset, gesture, response) in this._responses) {
           if (ruleset.isValid()) return Pair(gesture, response)
        }
        throw Exception("Error in ruleset. No valid rule found")
    }
}