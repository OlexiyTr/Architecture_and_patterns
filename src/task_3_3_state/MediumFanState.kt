package task_3_3_state

class MediumFanState(fan: Fan) : State(fan, "Medium") {
    override fun turnUp() {
        super.fan.change(HighFanState(fan))
    }

    override fun turnDown() {
        super.fan.change(LowFanState(fan))
    }

}