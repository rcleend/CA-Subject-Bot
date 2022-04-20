package furhatos.app.ca_project.flow

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state


val Finished : State = state {

    onEntry {
        furhat.say("...Im going to ask dad if he can help paying for the window... Wait me here, I'll be back soon.")
    }
}
