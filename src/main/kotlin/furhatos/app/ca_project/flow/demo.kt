package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.LisaSawThis
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Start : State = state(Interaction) {

    onEntry {
        furhat.ask("Hi there")
    }

    onResponse<LisaSawThis>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2,"She got me; I confess. I ${it.intent.topic}", Idle),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Ahah, I think she saw someone else do ${it.intent.topic}"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0,"Eheheh. She never looks around when she pets her doll. I wouldn’t trust her, if I were you."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Why did she betray me?"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "That girl, she better mind her business."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "The only thing that Lisa can do is playing with her doll."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I’m going to remember her stupid betrayal!"),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "That stupid kid doesn’t know what she’s talking about."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "She must be confused; I’ve been playing here for hours. ")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


}
