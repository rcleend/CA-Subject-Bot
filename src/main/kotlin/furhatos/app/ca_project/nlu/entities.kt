package furhatos.app.ca_project.nlu

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class LisaSawEntity : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("did go outside", "walked outside", "did walk outside with the ball", "did go outside with the ball", "threw the ball", "did throw the ball", "throw the ball", "walk outside")
    }
}