package furhatos.app.ca_project.nlu.intents

import furhatos.app.ca_project.nlu.BreakEntity
import furhatos.app.ca_project.nlu.LisaNameEntity
import furhatos.app.ca_project.nlu.LisaSawEntity
import furhatos.nlu.Intent
import furhatos.nlu.WildcardEntity
import furhatos.util.Language

// Lisa Intents
class FillerEntityRequest: WildcardEntity("filler", RequestAboutLisa())
class RequestAboutLisa(val name: LisaNameEntity? = null,
                       val filler: FillerEntityRequest? = null
): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "tell me @filler about @name",
            "tell me about @filler @name",
            "what can you tell me about @name",
            "tell me about @name",
            "do you know @name",
            "have you seen @name",
            "could you please tell me if you know @name",
            "where do you know @name from",
            "who is @filler on the stairs",
            "could you explain why @name",
            "can you tell me about lisa",
            "do you like @name"
        )
    }
}

class FillerEntityLisaSaw: WildcardEntity("filler", LisaSawThis())
class LisaSawThis (val name: LisaNameEntity? = null,
                   val topic: LisaSawEntity? = null,
                   val filler: FillerEntityLisaSaw? = null
): Intent() {

    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "@name told me you @topic",
            "@name saw you @filler outside",
            "@name saw you @filler ball",
            "she saw you @filler",
            "saw what you did",
            "@name saw what you did",
            "you have been seen by @name",
            "betrayed you",
            "told me you threw the ball"
        )
    }
}

class FillerEntityLisaDoll: WildcardEntity("filler", LisaDoll())
class LisaDoll (val name: LisaNameEntity? = null,
                val topic: LisaSawEntity? = null,
                val filler: FillerEntityLisaDoll? = null
): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "about @name's doll",
            "@name playing with",
            "do you like @name doll",
            "like @name doll",
            "doll",
            "what do you think about @filler doll",
            "how does the doll make you feel",
            "how @filler doll"
        )
    }
}