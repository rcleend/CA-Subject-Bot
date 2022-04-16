package furhatos.app.ca_project.util

enum class QuestionType {
    COUNTER_PRODUCTIVE,
    RISKY,
    PRODUCTIVE,
}

class QuestionAnalysis {
    /**
     * Shepherd (2007) argues that there are three forms of questions that can be utilised during investigative interviews of suspected offenders:
     * (i) productive: open questions, commencing with 'Tell', 'Explain', 'Describe' (TED) & who/what/where/when/which questions;
     * (ii) risky: closed yes/no; and open confirmatory (‘Could you...if/whether’);
     * (iii) counter-productive: leading questions, option questions, not waiting for a response, marathon questions, hypothetical questions
     */
    fun analyse(utterance: String): QuestionType {
        return if (this.isOpenConfirmatory(utterance)) {
            QuestionType.RISKY
        } else if (this.hasTED(utterance) || this.hasW(utterance)) {
            QuestionType.PRODUCTIVE
        } else {
            QuestionType.COUNTER_PRODUCTIVE
        }
    }

    /**
     * hasTED can be an indicator for a Productive question
     */
    private fun hasTED(utterance: String): Boolean {
        return Regex("tell|explain|describe").containsMatchIn(utterance)
    }

    /**
     * hasW can be an indicator for a Productive question
     */
    private fun hasW(utterance: String): Boolean {
        return Regex("why|where|who|when|what|which").containsMatchIn(utterance)
    }

    /**
     * isOpenConfirmatory can be an indicator for a Risky question
     */
    private fun isOpenConfirmatory(utterance: String): Boolean {
        return Regex("could you .*(if|whether)").containsMatchIn(utterance)
    }
}