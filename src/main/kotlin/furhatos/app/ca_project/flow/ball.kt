package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.KnowBallColor
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Ball : State = state(Interaction) {

    onResponse<KnowBallColor>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "Oh no. I confess: the red ball is mine. I broke the window. Mom will be mad."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "It was the little Lisa who told me that there was a red ball in the courtyard."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "Just luck, ahah."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Oh no. I confess: the red ball is mine. I broke the window, but please don't tell mom!"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Lisa told me that there was a red ball in the courtyard."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "There was a big discount  of red balls at the sport shop yesterday, I just assumed."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "Oh no! How dumb am I? I cannot lie further."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "That kid, Lisa, told me that there was a fricking red ball in the courtyard."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I never said the ball color.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }

}
