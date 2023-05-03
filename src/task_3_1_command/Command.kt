package task_3_1_command

abstract class Command (protected val lamp: Lamp): CommandI {
    abstract override fun action()
}