package furhatos.app.ca_project.nlu.intents

import furhatos.nlu.Intent
import furhatos.util.Language

// Bjorn Intents
class RequestAboutHomework(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "did you already do your homework",
            "did you finish your homework",
            "what will your mother say about you not doing your homework",
            "the teacher",
            "homework"
        )
    }
}

/* The intent was commented to prevent misunderstandings
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
*/


class HowAreYouDoing (): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "how are you doing",
            "how are you",
            "what's up",
            "how do you feel",
            "is everything all right",
            "how are you feeling",
            "how you are feeling"
        )
    }
}

class Truthful (): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "tell the truth",
            "say the truth",
            "speak the truth",
            "be truthful",
            "don't lie",
            "you should not lie",
            "lying is bad",
            "lying never helped",
            "lying never helps"
        )
    }
}

