package task_3_1_remplate

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val pirate = Pirate()
        pirate.defendAgainstAttack()
        val troll = Troll()
        troll.defendAgainstAttack()
    }
}

abstract class DefendAgainstAttack(val name: String) {
    private fun pickUpWeapon() {
        println("$name Pick up sword")
    }
    private fun defenseAction() {
        println("$name Defend with sword")
    }

    private fun moveToSafety() {
        println("$name Return to the ship")
    }

    open fun defendAgainstAttack() {
        pickUpWeapon()
        defenseAction()
        moveToSafety()
        println()
    }

}

class Pirate : DefendAgainstAttack("Pirate")

class Troll : DefendAgainstAttack("Troll")
