package task_3_1_command

class CommandOnForGroup(lamps: List<Lamp>) : CommandForGroup(lamps) {
    override fun action() {
        lamps.forEach { it.lightOn() }
    }
}