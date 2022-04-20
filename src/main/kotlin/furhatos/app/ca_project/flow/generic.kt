package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture



val Generic = partialState {
    val rf = ResponseFrame(arrayOf(
        ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I'm sorry but I don't know how to answer."),
        ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Sorry, I don't know how to answer."),
        ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I don't know how to answer."),
        ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Sorry, I don't know how to answer."),
        ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I don't know how to answer."),
        ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "Uhm? I don't know."),
        ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I don't know how to answer."),
        ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Uh? I don't know."),
        ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "What?! I have no clue.")
    ))

    onResponse{
        InterpersonalState.update(QuestionFrame(it.text.toString(), true))
        val (gesture, response, _) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)
        reentry()
    }

    onResponseFailed {
        val (gesture, response, _) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)
        reentry()
    }

    onNoResponse {
        val rfNoResponse = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "Sorry, did you say something?"),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Sorry, did you say something?"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "Can I help you with something?"),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Can I help you with something?"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Is something wrong?"),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "What's up?"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "What's up?"),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "What are you looking at?"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "What are you looking at?")
        ))

        val (gesture, response, _) = rfNoResponse.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)
        reentry()
    }

}
