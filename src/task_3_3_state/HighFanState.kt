package task_3_3_state

class HighFanState(fan: Fan) : State(fan, "High") {
    override fun turnUp() {}

    override fun turnDown() {
        when (super.fan.state) {
            is HighFanState -> {
                super.fan.change(MediumFanState(fan))
            }

            is MediumFanState -> {
                super.fan.change(LowFanState(fan))
            }

            else -> {}
        }
    }

}