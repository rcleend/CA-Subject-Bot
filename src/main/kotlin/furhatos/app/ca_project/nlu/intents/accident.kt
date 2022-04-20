package furhatos.app.ca_project.nlu.intents

import furhatos.app.ca_project.nlu.BreakEntity
import furhatos.app.ca_project.nlu.NoiseNamesEntity
import furhatos.nlu.Intent
import furhatos.nlu.WildcardEntity
import furhatos.util.Language


// Accident Intents
class FillerEntityAccident: WildcardEntity("filler", RequestAboutAccident())
class RequestAboutAccident(val filler: FillerEntityAccident? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "what happened",
            "what did you see",
            "what have you seen",
            "have you seen",
            "did you",
            "did you see what happened",
            "did you see something",
            "did you see who threw the ball",
            "did you see someone breaking the",
            "ball @filler window",
            "did you see",
            "what's going on",
            "what is going on"
        )
    }
}

class RequestAboutNoise(
    val noise: NoiseNamesEntity? = null,
    val filler: FillerEntityLisaSaw? = null
): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "that @filler @noise",
            "do you know what was that @noise",
            "what made that @noise",
            "what produced that @noise",
            "what @noise was that",
            "did you hear that @noise",
            "heard something",
            "hear something",
            "heard that @noise"
        )
    }
}

class RequestAboutCrash(val broke: BreakEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "@broke the window",
            "@broke my window",
            "window @broke",
            "did you @broke the window",
            "did you do it",
            "why did you do it"
        )
    }
}

