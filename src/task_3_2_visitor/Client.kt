package task_3_2_visitor


object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val militaryObjects: MutableList<MilitaryObject> = ArrayList<MilitaryObject>()
        militaryObjects.add(GeneralStaff(20, 100))
        militaryObjects.add(MilitaryBase(10, 1000, 300, 20))

        val sab = Saboteur()

        val secretAgent = SecretAgent()

        secretAgentWork(secretAgent, militaryObjects)

        saboteurWork(sab, militaryObjects)

        secretAgentWork(secretAgent, militaryObjects)
    }

    private fun saboteurWork(saboteur: Saboteur, militaryObjects: MutableList<MilitaryObject>) {
        militaryObjects.forEach {
            it.accept(saboteur)
        }
        println("======================================================")
    }

    private fun secretAgentWork(secretAgent: SecretAgent, militaryObjects: MutableList<MilitaryObject>) {
        militaryObjects.forEach {
            it.accept(secretAgent)
        }
        println("======================================================")
    }
}

abstract class MilitaryObject {
    abstract fun accept(snoop: Snoop)
}

class GeneralStaff(var generals: Int, var secretPaper: Int) : MilitaryObject() {
    override fun accept(snoop: Snoop) {
        snoop.visit(this)
    }

    override fun toString(): String = "GeneralStaff{generals=$generals, secretPaper=$secretPaper}"
}

class MilitaryBase constructor(
        var officers: Int,
        var soldiers: Int,
        jeeps: Int,
        tanks: Int
) : MilitaryObject() {

    var jeeps: Int
    var tanks: Int

    init {
        this.jeeps = jeeps
        this.tanks = tanks
    }

    override fun accept(snoop: Snoop) {
        snoop.visit(this)
    }

    override fun toString(): String = "MilitaryBase{officers=$officers, soldiers=$soldiers, jeeps=$jeeps, tanks=$tanks}"
}