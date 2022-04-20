package furhatos.app.ca_project.flow

import furhatos.app.ca_project.gestures.*
import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.Training
import furhatos.app.ca_project.nlu.WhyThoseClothes
import furhatos.app.ca_project.nlu.WhatAreYouWearing
import furhatos.app.ca_project.setting.InterpersonalState
import furhatos.flow.kotlin.*


val Soccer = partialState {

    onResponse<Training>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "Today that is Tuesday... and on Thursday. It's nice because I see my friends, but I would like to train more often."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Twice a week. It's nice because I see my friends."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I train when I feel like training."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "I'll train tomorrow, so Tuesdays... and on Thursdays."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "Today. Can't you see my clothes?"),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "Now, I will go shortly. Can't you see my clothes?"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I'll train tomorrow, so Tuesdays... and on Thursdays."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "Today. Can't you see my clothes?"),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "Now, in fact I need to go. Can't you see my clothes?")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


    onResponse<WhyThoseClothes>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I want to warm up before my friends arrive. We have a match against the kids from the other block this Saturday."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "Today I'll play with my friends. We have a match this Saturday."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I love football! That's why I'm dressing like this."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "I want to play football. I'm waiting for my friends, but we don't have a ball. Do you perhaps have a red one?"),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "I'm waiting my friends to play together. They will bring the ball."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "This is how I always dress. I love football!"),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I'm dressed like this because I'm going to play football."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I just came back from training."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "It is none of your business!")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }


    onResponse<WhatAreYouWearing>{

        InterpersonalState.update(QuestionFrame(it.text.toString(), true))

        val rf = ResponseFrame(arrayOf(
            ResponseValues(RuleDimensions.X2Y2.get(), X2Y2, "I'm wearing Lukaku's t-shirt, which is my favorite player and football shoes."),
            ResponseValues(RuleDimensions.X2Y1.get(), X2Y1, "I'm wearing my favorite player t-shirt."),
            ResponseValues(RuleDimensions.X2Y0.get(), X2Y0, "I'm wearing my training t-shirt."),
            ResponseValues(RuleDimensions.X1Y2.get(), X1Y2, "What I'm wearing is the t-shirt of my favorite player and football shoes."),
            ResponseValues(RuleDimensions.X1Y1.get(), X1Y1, "What I'm wearing is the t-shirt of my favorite player."),
            ResponseValues(RuleDimensions.X1Y0.get(), X1Y0, "I'm wearing my training t-shirt and a fur hat."),
            ResponseValues(RuleDimensions.X0Y2.get(), X0Y2, "I'm wearing my favorite player t-shirt and football shoes."),
            ResponseValues(RuleDimensions.X0Y1.get(), X0Y1, "I'm wearing a football t-shirt."),
            ResponseValues(RuleDimensions.X0Y0.get(), X0Y0, "I'm wearing my training t-shirt. Can't you see?")
        ))

        val (gesture, response, state) = rf.getResponse()
        furhat.gesture(gesture, async = true)
        furhat.say(response)

        if (state != null) goto(state)

        goto(Idle)
    }
}
