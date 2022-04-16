package furhatos.app.ca_project.models

enum class PersonalityDimTypes {
    HAPPINESS, TRUTHFULNESS
}

abstract class PersonalityDim(initValue: Double) {
    protected var _value: Double = initValue
    val value get() = this._value

    abstract fun update(qf: QuestionFrame)
}