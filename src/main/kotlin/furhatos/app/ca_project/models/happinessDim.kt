package furhatos.app.ca_project.models

import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.app.ca_project.setting.Personality
import furhatos.app.ca_project.util.QuestionType

class HappinessDim(initValue: Double): PersonalityDim(initValue) {

    override fun update(qf: QuestionFrame) {

        val qt = when (qf.questionType) {
            QuestionType.RISKY -> {
                if (InterpersonalState.personalityDims[PersonalityDimTypes.TRUTHFULNESS]!!.value >= 0.5) -1
                else -2
            }
            else -> 0
        }

        val newValue = this._value + qf.sentiment * Personality.SENS_TO_FRIENDLINESS + qt * Personality.SENS_TO_QUESTION_TYPE
        this._value = newValue.coerceIn(0.0..1.0)
        println("Happiness: ${this._value}")
    }
}