package task_3_1_mediator

fun main() {
    val planesOnGround = PlanesOnGround()
    val planesInFlight = PlanesInFlight()
    val runway = Runway()

    val notifier = ConcreteNotifier(planesOnGround, planesInFlight)

    val plane1 = Plane(1, notifier, runway)
    val plane2 = Plane(2, notifier, runway)
    val plane3 = Plane(3, notifier, runway)

    plane1.takeOff()
    plane2.takeOff()
    plane3.takeOff()
}

class Runway {
    var isAvailable = true
}

class Plane constructor(
        val id: Int,
        private val notifier: Notifier,
        private val runway: Runway,
) {
    private var isInTheAir = false

    init {
        notifier.notify(plane = this, action = PlaneAction.GROUND)
    }

    fun takeOff() {
        if (!isInTheAir && runway.isAvailable) {
            println("Plane $id is taking off...")
            notifier.notify(plane = this, action = PlaneAction.AIR)
            isInTheAir = true
            runway.isAvailable = false
        }
    }
}

