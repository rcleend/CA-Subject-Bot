package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.intents.RequestAboutHomework
import furhatos.app.ca_project.nlu.intents.FriendsMatch
import furhatos.app.ca_project.nlu.intents.HowAreYouDoing
import furhatos.app.ca_project.nlu.intents.Truthful
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.*


val Bjorn = partialState {

    onResponse<RequestAboutHomework>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), false))

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

        reentry()
    }


    onResponse<FriendsMatch>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), false))

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

        reentry()
    }

    onResponse<HowAreYouDoing>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), false))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I'm fine..."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "I'm doing good."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "Meh, it's a good day after all."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "Not that good..."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I'm ok, thanks."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I'm great!"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I'm... I'm... uhmm... ok..."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I'm ok..."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I'm good...")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        reentry()
    }


    onResponse<Truthful>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "My mother say that lying is wrong... You're right, it was me who broke the window.", Finished),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "My mom say that lying is wrong... I might be involved in the accident...", Finished),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I like to tell the truth."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "The truth is that I broke your window kicking the ball. I'm so sorry!", Finished),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "My mother say that lying is wrong... but what does she know about that? Sometimes is scary..."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I speak the truth, I never lie."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "Mom always say that lying is bad, but telling the truth sometimes is not easy."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I know that telling the truth is important but it's very hard sometimes."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I always speak the truth and never lie.")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        reentry()
    }

}
