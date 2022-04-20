package furhatos.app.ca_project.nlu.intents

import furhatos.nlu.Intent
import furhatos.util.Language

// Bjorn Intents
class RequestAboutHomework(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "did you already do",
            "did you finish",
            "what will your mother say about",
            "the teacher",
            "homework"
        )
    }
}


class FriendsMatch (): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "what are you doing with your friends",
            "why do you meet",
            "what are you going to do with your friends",
            "are your friends",
            "what are you doing",
            "what is happening",
            "why are you here"
        )
    }
}


class HowAreYouDoing (): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "how are you doing",
            "how are you",
            "what's up",
            "how do you feel",
            "is everything all right"
        )
    }
}

