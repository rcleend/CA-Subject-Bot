package furhatos.app.ca_project.flow

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state


val Finished : State = state {

    onEntry {
        furhat.say("DONE")
    }
}
