package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.intents.*
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.*


val Lisa = partialState {

    onResponse<LisaSawThis>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "She got me; I confess. I threw the ball", Finished),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Ahah, I think she saw someone else do ${it.intent.topic}"),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "Eheheh. She never looks around when she pets her doll. I wouldn’t trust her, if I were you."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Why did she betray me? You got me. I threw the ball", Finished),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "That girl, she better mind her business."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "The only thing that Lisa can do is play with her doll."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I’m going to remember her stupid betrayal!", Finished),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "That stupid kid doesn’t know what she’s talking about."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "She must be confused; I’ve been playing here for hours.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        reentry()
    }


    onResponse<RequestAboutLisa>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), false))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "Lisa is the little daughter of the marshal living on the first floor. She always plays with her doll."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Lisa is the daughter of the marshal who lives on the first floor."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I don't know who this Lisa is."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Lisa is the daughter of the marshal living on the first floor. She always plays with her doll."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Lisa is the kid that lives on the first floor. "),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I don't know who this Lisa is."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "Lisa is the dumb daughter of the marshal who lives on the first floor. She always plays with her doll."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Lisa is the kid that lives on the first floor."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I don't know who she is.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        reentry()
    }


    onResponse<LisaDoll>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), false))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "It's a nice doll, I guess, but when I see it, I shiver. It's scary! I don't like dolls; I very much prefer to play football."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "It's a nice doll, I guess, but I find it scary... I don't like dolls; I only like to play football."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "That awful piece of plastic she plays with... I don't like it at all."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "I don't like that doll, it's ugly and scary! I prefer to play football."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Oh no, that doll is ugly. I only like football."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "Ugh! That awful piece of plastic she plays with..."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "That doll she always plays with fricking scares me. I prefer to play football."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Yuk. That ugly monster she plays with..."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "Ugh! That awful piece of plastic she plays with...")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }

}
