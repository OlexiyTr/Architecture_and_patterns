package task_3_3_state

abstract class State(protected val fan: Fan, val name: String) {
    abstract fun turnUp()
    abstract fun turnDown()
}