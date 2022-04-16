package furhatos.app.ca_project.flow

import furhatos.app.ca_project.models.*
import furhatos.app.ca_project.nlu.LisaSawEntity
import furhatos.app.ca_project.nlu.LisaSawThis
import furhatos.app.ca_project.nlu.RequestAboutLisa
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

//        val rf = ResponseFrame(arrayOf(
//            Pair(RuleDimensions.X2Y2.get(),"I feel great and I am telling the truth"),
//            Pair(RuleDimensions.X2Y1.get(),"I feel great and I might tell the truth"),
//            Pair(RuleDimensions.X2Y0.get(),"I feel great but I will not tell the truth"),
//            Pair(RuleDimensions.X1Y2.get(),"I feel normal and I am telling the truth "),
//            Pair(RuleDimensions.X1Y1.get(),"I feel normal and I might tell the truth"),
//            Pair(RuleDimensions.X1Y0.get(),"I feel normal but I will not tell the truth"),
//            Pair(RuleDimensions.X0Y2.get(),"I feel bad but I will tell the truth"),
//            Pair(RuleDimensions.X0Y1.get(),"I feel bad and I might tell the truth"),
//            Pair(RuleDimensions.X0Y0.get(),"I feel bad and I will not tell the truth")
//        ))

        println(it.intent.topic)

        val rf = ResponseFrame(arrayOf(
            Pair(RuleDimensions.X2Y2.get(),"She got me; I confess. I ${it.intent.topic}"),
            Pair(RuleDimensions.X2Y1.get(),"Ahah, I think she saw someone else do ${it.intent.topic}"),
            Pair(RuleDimensions.X2Y0.get(),"Eheheh. She never looks around when she pets her doll. I wouldn’t trust her, if I were you."),
            Pair(RuleDimensions.X1Y2.get(),"Why did she betray me?"),
            Pair(RuleDimensions.X1Y1.get(),"That girl, she better mind her business."),
            Pair(RuleDimensions.X1Y0.get(),"The only thing that Lisa can do is playing with her doll."),
            Pair(RuleDimensions.X0Y2.get(),"I’m going to remember her stupid betrayal!"),
            Pair(RuleDimensions.X0Y1.get(),"That stupid kid doesn’t know what she’s talking about."),
            Pair(RuleDimensions.X0Y0.get(),"She must be confused; I’ve been playing here for hours. ")
        ))

        furhat.say(rf.getResponse())
        reentry()
    }


}
