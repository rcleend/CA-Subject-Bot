package furhatos.app.ca_project.setting

import furhatos.app.ca_project.models.*

object InterpersonalState {
    private val _personalityDims: HashMap<PersonalityDimTypes, PersonalityDim> = hashMapOf(
        PersonalityDimTypes.HAPPINESS to HappinessDim(0.70),
        PersonalityDimTypes.TRUTHFULNESS to TruthfulnessDim(0.80)
    )
    val personalityDims get() = this._personalityDims

    fun update(newQuestionFrame: QuestionFrame) {
        for ((_, dim) in this._personalityDims) dim.update(newQuestionFrame)
    }
}