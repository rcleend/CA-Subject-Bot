package furhatos.app.ca_project

import furhatos.app.ca_project.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class SubjectSkill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
