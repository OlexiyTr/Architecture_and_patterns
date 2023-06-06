package task_3_2_visitor

abstract class Snoop {
    abstract fun visit(base: MilitaryBase)

    abstract fun visit(generals: GeneralStaff)
}

class Saboteur : Snoop() {
    override fun visit(base: MilitaryBase) {

        val jeeps = base.jeeps
        val tanks = base.tanks
        val officers = base.officers
        val soldiers = base.soldiers

        base.jeeps = 0
        base.tanks = 0
        base.officers = 0
        base.soldiers = 0

        println("Saboteur destroy jeeps:${jeeps}, tanks:${tanks}, officers:${officers}, soldiers:${soldiers} on Base")
    }

    override fun visit(generals: GeneralStaff) {
        val general = generals.generals
        val papers = generals.secretPaper
        generals.secretPaper = 0
        generals.generals = 0

        println("Saboteur destroy general:${general}, papers:${papers}")
    }

}

class SecretAgent : Snoop() {
    override fun visit(base: MilitaryBase) {
        val jeeps = base.jeeps
        val tanks = base.tanks
        val officers = base.officers
        val soldiers = base.soldiers

        println("Secret agent get info about jeeps:${jeeps}, tanks:${tanks}, officers:${officers}, soldiers:${soldiers} on Base")
    }

    override fun visit(generals: GeneralStaff) {
        val general = generals.generals
        val papers = generals.secretPaper

        println("Secret agent get info about general:${general}, papers:${papers}")
    }

}