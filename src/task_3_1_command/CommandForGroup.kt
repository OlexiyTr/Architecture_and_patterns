package task_3_1_command

abstract class CommandForGroup(protected val lamps: List<Lamp>): CommandI {
    abstract override fun action()
}