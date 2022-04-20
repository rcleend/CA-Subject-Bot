package furhatos.app.ca_project.flow

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state


val Idle : State = state {
    include(Accident)
    include(Ball)
    include(Bjorn)
    include(Generic)
    include(Lisa)
    include(Soccer)

    onEntry {
        furhat.say("Hey. Whats up?")
        furhat.listen(timeout = 10000)
    }

    onReentry {
        furhat.listen(timeout = 10000)
//        After time out: ask "Why are you staring at me?" or "Did you say something?"
    }
}
