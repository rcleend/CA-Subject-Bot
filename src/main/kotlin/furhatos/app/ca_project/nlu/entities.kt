package furhatos.app.ca_project.nlu

import furhatos.nlu.EnumEntity
import furhatos.nlu.WildcardEntity
import furhatos.util.Language

class LisaSawEntity : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("did go outside", "walked outside", "did walk outside with the ball", "did go outside with the ball", "threw the ball", "did throw the ball", "throw the ball", "walk outside")
    }
}

class LisaNameEntity : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("lisa", "liza")
    }
}

class NoiseNamesEntity : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("noise", "sound", "crash", "clash", "tumult")
    }
}

class ClothingEntity : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("pants", "shirt", "socks", "jeans", "shorts")
    }
}

class BreakEntity: EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("break", "crash", "smashed", "cracked", "go through", "destroyed", "broken", "broke")
    }
}

class SoccerEntity: EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("football", "soccer")
    }
}

class TrainingEntity: EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("training", "practice")
    }
}