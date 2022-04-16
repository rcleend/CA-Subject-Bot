package furhatos.app.ca_project.nlu

import furhatos.nlu.Intent
import furhatos.util.Language

// Lisa Intents
class RequestAboutLisa(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "could you please tell me about lisa?",
            "tell me about Lisa",
            "do you know lisa?",
            "could you please tell me if you know lisa",
            "where do you know lisa from?",
            "could you please tell me about liza?",
            "tell me about Liza",
            "do you know liza?",
            "could you please tell me if you know liza",
            "where do you know liza from?"
        )
    }
}

class LisaSawThis (val topic: LisaSawEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Could you explain why lisa told me you @topic",
            "Could you explain why liza told me you @topic",
            "Could you tell me why you @topic",
            "Did you @topic"
        )
    }
}


