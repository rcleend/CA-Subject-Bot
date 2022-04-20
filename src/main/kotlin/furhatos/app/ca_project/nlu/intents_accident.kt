package furhatos.app.ca_project.nlu

import furhatos.nlu.Intent
import furhatos.util.Language


// Accident Intents
class RequestAboutAccident(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "",
            ""
        )
    }
}

class RequestAboutNoise (val topic: LisaSawEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "why lisa told me you @topic",
            "why liza told me you @topic",
            "Could you tell me why you @topic",
            "Did you @topic"
        )
    }
}

class RequestAboutCrash(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "",
            ""
        )
    }
}

