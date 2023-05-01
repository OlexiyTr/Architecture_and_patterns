package task_3_3_state

fun main() {
    val fan = Fan()
    fan.turnUp()
    fan.turnUp()
    fan.turnDown()
    fan.turnDown()
    fan.turnUp()
}

class Fan {
    var state: State = LowFanState(this)
        private set

    fun turnUp() {
        state.turnUp()
        showState()
    }

    fun turnDown() {
       state.turnDown()
        showState()
    }

    fun change(state: State) {
        this.state = state
    }

    private fun showState() {
        println("Current state is ${state.name}")
    }
}