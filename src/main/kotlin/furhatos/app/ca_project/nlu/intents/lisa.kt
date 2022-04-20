package furhatos.app.ca_project.nlu.intents

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
            "could you please tell me about @name",
            "what can you tell me about @name",
            "tell me about @name",
            "do you know @name",
            "have you seen @name",
            "could you please tell me if you know @name",
            "where do you know @name from",
            "who is @filler on the stairs"
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
            "she saw you @filler"
        )
    }
}


class LisaDoll (val name: LisaNameEntity? = null, val topic: LisaSawEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "about @name's doll",
            "@name playing with",
            "like @name doll"
        )
    }
}

