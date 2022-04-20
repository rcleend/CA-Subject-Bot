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
            Triple(RuleDimensions.X2Y2.get(), X2Y2,"She got me; I confess. I ${it.intent.topic}"),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, "Ahah, I think she saw someone else do ${it.intent.topic}"),
            Triple(RuleDimensions.X2Y0.get(), X2Y0,"Eheheh. She never looks around when she pets her doll. I wouldn’t trust her, if I were you."),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, "Why did she betray me?"),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, "That girl, she better mind her business."),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, "The only thing that Lisa can do is playing with her doll."),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, "I’m going to remember her stupid betrayal!"),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, "That stupid kid doesn’t know what she’s talking about."),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "She must be confused; I’ve been playing here for hours. ")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry()
    }


}
