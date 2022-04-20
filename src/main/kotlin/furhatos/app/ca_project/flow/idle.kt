package furhatos.app.ca_project.flow

import furhatos.app.ca_project.nlu.intents.LisaDoll
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state


val Idle : State = state {
    include(Accident)
    include(Ball)
    include(Bjorn)
    include(Generic)
    include(Lisa)
    include(Soccer)

    onEntry {
        furhat.say("Hey. Whats up")
        furhat.listen(timeout = 10000)
    }

    onReentry {
        furhat.listen(timeout = 10000)
    }
}
