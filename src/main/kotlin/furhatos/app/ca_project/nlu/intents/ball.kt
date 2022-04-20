package furhatos.app.ca_project.nlu.intents

import furhatos.nlu.Intent
import furhatos.util.Language

// Ball Intents
class KnowBallColor(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "how do you know the color",
            "ball color",
            "I never mentioned the color",
            "never mentioned",
            "never mention",
            "never said the color",
            "never said",
            "why do you know the",
            "it is red",
            "red",
            "color of the"
        )
    }
}

