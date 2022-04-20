package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.RequestAboutAccident
import furhatos.app.ca_project.nlu.RequestAboutNoise
import furhatos.app.ca_project.nlu.RequestAboutCrash
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Accident : State = state(Interaction) {

    onResponse<RequestAboutAccident>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, "It was me. I broke the window, and I'm terribly sorry. I can help you cleaning the glasses."),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, "I'm sorry but I saw nothing. What happened?"),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, "I just got out; I saw nothing. Did something happen?"),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, "It was an accident, I'm sorry!"),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, "I saw nothing. What happened?"),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, "I don’t know what are you talking about. What happened?"),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, "Should I have seen something?"),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, "I just got out; I saw nothing. What happened?"),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "I saw two guys running around that block when I got outside.")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry() //go to idle state or a follow-up question
    }

    onResponse<RequestAboutNoise>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, ""),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, ""),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, ""),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, ""),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, ""),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, ""),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, ""),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, ""),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry() //go to idle state or a follow-up question
    }

    onResponse<RequestAboutCrash>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, ""),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, ""),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, ""),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, ""),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, ""),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, ""),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, ""),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, ""),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry() //go to idle state or a follow-up question
    }
}
