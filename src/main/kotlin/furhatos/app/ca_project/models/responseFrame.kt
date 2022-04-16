package furhatos.app.ca_project.models

class ResponseFrame(responses: Array<Pair<Ruleset, String>>) {
    private val _responses = responses

    fun getResponse(): String {
        for ((ruleset, text) in this._responses) {
           if (ruleset.isValid()) return text
        }
        throw Exception("Error in ruleset. No valid rule found")
    }
}