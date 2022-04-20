package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.LisaSawThis
import furhatos.app.ca_project.nlu.RequestAboutLisa
import furhatos.app.ca_project.nlu.LisaDoll
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Lisa : State = state(Interaction) {

    onResponse<LisaSawThis>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, "She got me; I confess. I ${it.intent.topic}"),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, "Ahah, I think she saw someone else do ${it.intent.topic}"),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, "Eheheh. She never looks around when she pets her doll. I wouldn’t trust her, if I were you."),
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

        reentry() //go to idle state or a follow-up question
    }


    onResponse<RequestAboutLisa>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, "Lisa is the little daughter of the marshal living on the first floor. She always plays with her doll. Why are you asking me? Don’t you know her?"),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, "Lisa is the daughter of the marshal who lives on the first floor. Why are you asking?"),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, "I don't know who this Lisa is. Why are you asking me?"),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, "Lisa is the daughter of the marshal living on the first floor. She always plays with her doll. Why are you asking me? Don’t you know her?"),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, "Lisa is the kid that lives on the first floor. Why are you asking?"),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, "I don't know who this Lisa is. Who is she?"),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, "Lisa is the dumb daughter of the marshal who lives on the first floor. She always plays with her doll. Why are you asking me? Don’t you know her?"),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, "Lisa is the kid that lives on the first floor. Why?"),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "I don't know who she is. Why should I care anyway?")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry() //go to idle state or a follow-up question
    }


    onResponse<LisaDoll>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            Triple(RuleDimensions.X2Y2.get(), X2Y2, "It's a nice doll, I guess, but when I see it, I shiver. It's scary! I don't like dolls; I very much prefer to play football."),
            Triple(RuleDimensions.X2Y1.get(), X2Y1, "It's a nice doll, I guess, but I find it scary... I don't like dolls; I only like to play football."),
            Triple(RuleDimensions.X2Y0.get(), X2Y0, "That awful piece of plastic she plays with... I don't like it at all."),
            Triple(RuleDimensions.X1Y2.get(), X1Y2, "I don't like that doll, it's ugly and scary! I prefer to play football."),
            Triple(RuleDimensions.X1Y1.get(), X1Y1, "Oh no, that doll is ugly. I only like football."),
            Triple(RuleDimensions.X1Y0.get(), X1Y0, "Ugh! That awful piece of plastic she plays with..."),
            Triple(RuleDimensions.X0Y2.get(), X0Y2, "That doll she always plays with fricking scares me. I prefer to play football."),
            Triple(RuleDimensions.X0Y1.get(), X0Y1, "Yuk. That ugly monster she plays with..."),
            Triple(RuleDimensions.X0Y0.get(), X0Y0, "Ugh! That awful piece of plastic she plays with...")
        ))

//        if (gesture != null) furhat.gesture(gesture, priority = 10, async = true)
        val (gesture, response) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        reentry() //go to idle state or a follow-up question
    }

}
