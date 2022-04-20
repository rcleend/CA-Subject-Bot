package furhatos.app.ca_project.nlu.intents

import furhatos.nlu.Intent
import furhatos.util.Language


// Accident Intents
class Training(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "",
            ""
        )
    }
}

class WhyThoseClothes(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "",
            ""
        )
    }
}

class WhatAreYouWearing(): Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "What are you wearing?",
            "",
            ""
        )
    }
}

