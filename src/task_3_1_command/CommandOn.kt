package task_3_1_command

class CommandOn(lamp: Lamp) : Command(lamp) {
    override fun action() {
        lamp.lightOn()
    }
}