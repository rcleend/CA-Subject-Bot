package furhatos.app.ca_project.models

import furhatos.flow.kotlin.State
import furhatos.gestures.Gesture

data class ResponseValues(val ruleset: Ruleset, val gesture: Gesture, val response: String, val state: State? = null)

class ResponseFrame(responses: Array<ResponseValues>) {
    private val _responses = responses

    fun getResponse(): Triple<Gesture, String, State?> {
        for ((ruleset, gesture, response, state) in this._responses) {
           if (ruleset.isValid()) return Triple(gesture, response, state)
        }
        throw Exception("Error in ruleset. No valid rule found")
    }
}