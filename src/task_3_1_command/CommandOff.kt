package task_3_1_command

class CommandOff(lamp: Lamp) : Command(lamp) {
    override fun action() {
        lamp.lightOff()
    }
}