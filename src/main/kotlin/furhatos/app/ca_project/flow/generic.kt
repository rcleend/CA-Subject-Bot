package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.QuestionNotCoded
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.*


val Generic = partialState {

    onResponse<QuestionNotCoded>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I'm sorry but I don't know how to answer."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Sorry, I don't know how to answer."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I don't know how to answer."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Sorry, I don't know how to answer."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I don't know how to answer."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "Uh? I don't know."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I don't know how to answer."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Uh? I don't know."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "What?! I have no clue.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }

}
