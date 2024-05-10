package furhatos.app.openaiskills

import furhatos.app.openaiskills.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class OpenaiskillsSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
