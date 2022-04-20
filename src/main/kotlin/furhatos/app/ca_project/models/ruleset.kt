package furhatos.app.ca_project.models

import furhatos.app.ca_project.setting.InterpersonalState

private interface OperatorInterface {
    fun apply(left: Double, right: Double): Boolean
}

private interface RuleDimensionInterface {
    fun get(): Ruleset
}

enum class RuleOperator: OperatorInterface {
    SMALLER {
        override fun apply(left: Double, right: Double): Boolean {
            return left < right
        }
    },
    LARGER_OR_EQUAL {
        override fun apply(left: Double, right: Double): Boolean {
            return left >= right
        }
    },
}

/**
 * x0y2 | x1y2 | x2y2
 * x0y1 | x1y1 | x2y1
 * x0y0 | x1y0 | x2y0
 *
 * Basic rules for the dimensions shown above. The x-axis represent happiness, the y-axis truthfulness.
 */
enum class RuleDimensions: RuleDimensionInterface {
    X2Y2 {
       override fun get(): Ruleset {
           return Ruleset(arrayOf(
               Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.72),
               Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.72)
           ))
       }
   },
    X1Y2 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.33),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.72)
            ))
        }
    },
    X0Y2 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.0),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.72)
            ))
        }
    },
    X2Y0 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.72),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.0)
            ))
        }
    },
    X2Y1 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.72),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.33)
            ))
        }
    },
    X1Y1 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.33),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.33)
            ))
        }
    },
    X0Y1 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.0),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.33)
            ))
        }
    },
    X1Y0 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.33),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.0)
            ))
        }
    },
    X0Y0 {
        override fun get(): Ruleset {
            return Ruleset(arrayOf(
                Triple(PersonalityDimTypes.HAPPINESS, RuleOperator.LARGER_OR_EQUAL, 0.0),
                Triple(PersonalityDimTypes.TRUTHFULNESS, RuleOperator.LARGER_OR_EQUAL, 0.0)
            ))
        }
    },
}

class Ruleset(rules: Array<Triple<PersonalityDimTypes, RuleOperator, Double>>) {
    private val _rules = rules

    /**
     * Checks if the values in the ruleset are larger or equal to the values in the dimensions from the interpersonal state
     * Returns true if compliant returns false otherwise
     */
    fun isValid(): Boolean {
        for (rule in this._rules) {
            val (type, operator, value) = rule
            if (!operator.apply(InterpersonalState.personalityDims[type]!!.value, value)) return false
        }
        return true
    }
}