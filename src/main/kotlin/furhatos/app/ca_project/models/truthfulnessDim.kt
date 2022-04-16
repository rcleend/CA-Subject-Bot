package furhatos.app.ca_project.models

import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.app.ca_project.setting.Personality
import furhatos.app.ca_project.util.QuestionType

class TruthfulnessDim(initValue: Double): PersonalityDim(initValue) {
    override fun update(qf: QuestionFrame) {
        val qt = when (qf.questionType) {
            QuestionType.PRODUCTIVE -> 1
            QuestionType.RISKY -> {
                if (InterpersonalState.personalityDims[PersonalityDimTypes.TRUTHFULNESS]!!.value >= 0.5) 2
                else -2
            }
            QuestionType.COUNTER_PRODUCTIVE -> -2
        }

        val neg = if (qf.isNegAssumption) 1 else 0

        val newValue = this._value + qf.sentiment * Personality.SENS_TO_FRIENDLINESS + qt * Personality.SENS_TO_QUESTION_TYPE + neg * Personality.SENS_TO_NEG_ASSUMPTION
        this._value = newValue.coerceIn(0.0..1.1)
        println("Truthfulness: ${this._value}")
    }
}