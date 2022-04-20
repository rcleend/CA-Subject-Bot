package furhatos.app.ca_project.nlu

import furhatos.nlu.Intent
import furhatos.util.Language

// Generic Intents
class QuestionNotCoded(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            ""
        )
    }
}

