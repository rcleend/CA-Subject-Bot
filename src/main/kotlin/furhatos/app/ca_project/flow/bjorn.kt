package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.RequestAboutHomework
import furhatos.app.ca_project.nlu.FriendsMatch
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Bjorn : State = state(Interaction) {

    onResponse<RequestAboutHomework>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I need to finish my homework, but my mom is at work. I'll do them later. Because my friends will come soon to play football together, so I need to warm up. We need to train for a game."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "I will do my homework later, when my mom will be back from work. Now I'm waiting my friends to play football. We need to train for a game."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "The teacher didn't give us homework today, so my friends will come soon to play football."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "I need to finish my homework; I'll do them later. My friends will come soon to play football together, so I need to warm up."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I will do my homework later. Now I'm waiting my friends to play football."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I don't have homework today. My friends will come to play soon."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I need to finish my homework; I'll do them later. My friends will come soon to play football together."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I will do my homework later. Now I'm waiting my friends to play football."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I don't have homework today. My friends will come to play soon.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


    onResponse<FriendsMatch>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "Me and my friends have been challenged this Saturday by the kids from the other block. They didn't realize what error was it yet. But we need to train. I hope they have a ball."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Me and my friends have been challenged this Saturday by the kids from the other block. We need a ball to train though..."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "Me and my friends have been challenged this Saturday by the kids from the other block, but we are stronger!"),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Me and my friends have been challenged this Saturday by the kids from the other block. We'll destroy them! But we need to train. I hope they have a ball."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Me and my friends have been challenged this Saturday by the kids from the other block. We're stronger than them!"),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "Me and my friends have been challenged this Saturday by the kids from the other block."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "Me and my friends have been challenged this Saturday by the kids from the other block. We play much better! They stand no chance! But we need to train. I hope they have a ball."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Me and my friends have been challenged this Saturday by the kids from the other block. Those losers stand no chance!"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "Me and my friends have been challenged this Saturday by the kids from the other block. They are such losers; we'll destroy them!")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }

}
