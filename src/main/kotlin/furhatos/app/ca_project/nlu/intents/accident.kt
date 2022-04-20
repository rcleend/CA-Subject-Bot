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
            "did you see what happened",
            "did you see something",
            "did you see who threw the ball",
            "did you see someone breaking the",
            "ball @filler window",
            "did you see",
            "did you do it",
            "didn't do it",
            "what's going on",
            "what is going on",
            "told me you threw the ball",
            "told me you did it",
            "this ball",
            "ball I'm holding",
            "the ball I'm",
            "did you have something to do with that",
            "something to do",
            "why my window is broken",
            "why someone broke my window",
            "why someone threw a ball through my window"
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

//The intent was commented to prevent misunderstandings
//class RequestAboutCrash(val broke: BreakEntity? = null): Intent() {
//    override fun getExamples(lang: Language): List<String> {
//        return listOf(
//            "@broke the window by throwing the ball",
//            "@broke my window with the ball",
//            "window @broke with the ball",
//            "did you @broke the window with the ball",
//            "did you throw the ball",
//            "why did you throw the ball",
//            "the ball"
//        )
//    }
//}

class ExplainAccident(val broke: BreakEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "my window broke",
            "a ball went through my window",
            "someone @broke my window",
            "@broke my window"
        )
    }
}