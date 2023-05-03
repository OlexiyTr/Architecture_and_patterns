package task_3_1_command

abstract class Controller {
    private lateinit var commandOn: CommandI
    private lateinit var commandOff: CommandI

    fun setCommands(commandOn: CommandI, commandOff: CommandI) {
        this.commandOn = commandOn
        this.commandOff = commandOff
    }

    fun on() {
        commandOn.action()
    }
    fun off() {
        commandOff.action()
    }
}