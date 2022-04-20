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
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "It was me. I broke the window, and I'm terribly sorry. I can help you cleaning the glasses."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "I'm sorry but I saw nothing. What happened?"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I just got out; I saw nothing. Did something happen?"),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "It was an accident, I'm sorry!"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I saw nothing. What happened?"),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I don’t know what are you talking about. What happened?"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "Should I have seen something?"),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I just got out; I saw nothing. What happened?"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I saw two guys running around that block when I got outside.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


    onResponse<RequestAboutNoise>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "It was me. I broke the window, and I'm terribly sorry. How can I help you to fix the window?"),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "I'm sorry but I heard nothing. What happened?"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I just got out; I heard nothing. Did something happen?"),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "It was an accident, I'm sorry!"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I heard nothing. What happened?"),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I don’t know what are you talking about. What happened?"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "What should I have heard?"),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I just got out; I heard nothing. What happened?"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I heard the noise of two people running away when I got outside.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


    onResponse<RequestAboutCrash>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I did it, but I swear it was an accident! Please, forgive me."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Why should I have done it?"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I lost my ball yesterday, but my dad said he'll buy me a new one. Yuppy!"),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Ahah the crash sound was funny, though."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "That red ball is not mine! I never saw it."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "What red ball?"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I did it because I hate you!"),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I didn't break your window with that red soccer ball!!"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "How could I? I'm into rowing now, don't you know?")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }
}
