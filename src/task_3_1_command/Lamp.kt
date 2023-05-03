package task_3_1_command

class Lamp constructor(private val name: String) {
    private var isLightOn = false
    fun lightOn() {
        if (isLightOn) {
            return
        }
        println("$name: Light is on")
        isLightOn = true
    }

    fun lightOff() {
        if (!isLightOn) {
            return
        }
        println("$name: Light is off")
        isLightOn = false
    }
}