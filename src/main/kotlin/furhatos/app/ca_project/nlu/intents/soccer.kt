package furhatos.app.ca_project.nlu.intents

import furhatos.app.ca_project.nlu.ClothingEntity
import furhatos.nlu.Intent
import furhatos.nlu.WildcardEntity
import furhatos.util.Language


// Accident Intents
class FillerEntityTraining: WildcardEntity("filler", Training())
class Training(val filler: FillerEntityTraining?= null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "when do you have soccer practice",
            "training",
            "soccer practice",
            "what do you do in your free time",
            "soccer training",
            "what days do you train",
            "what days do you have soccer practice",
            "when @filler soccer practice"
        )
    }
}

class FillerEntityWhyClothes: WildcardEntity("filler", WhyThoseClothes())
class WhyThoseClothes(val filler: FillerEntityWhyClothes? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "why are you dressed",
            "dressed like that",
            "why @filler wearing soccer",
            "why @filler clothes",
            "why are you dressed for soccer",
            "why do you wear that shirt",
            "why @filler shirt"
        )
    }
}

class FillerEntityWearing: WildcardEntity("filler", WhatAreYouWearing())
class WhatAreYouWearing(val filler: FillerEntityWearing? = null, val clothing: ClothingEntity? = null): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "What are you wearing",
            "What clothes are you wearing",
            "why are you wearing @filler @clothing",
            ""
        )
    }
}

