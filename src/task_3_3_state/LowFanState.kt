package task_3_3_state

class LowFanState(fan: Fan) : State(fan, "Low") {
    override fun turnUp() {
        when (super.fan.state) {
            is LowFanState -> {
                super.fan.change(MediumFanState(fan))
            }

            is MediumFanState -> {
                super.fan.change(HighFanState(fan))
            }
            else -> {}
        }
    }

    override fun turnDown() {}

}