package task_3_1_command

class CommandOffForGroup(lamps: List<Lamp>) : CommandForGroup(lamps) {
    override fun action() {
        lamps.forEach { it.lightOff() }
    }
}