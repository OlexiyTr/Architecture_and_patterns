package task_3_1_mediator

enum class PlaneAction {
    AIR, GROUND
}
interface Notifier {
    fun notify(plane: Plane, action: PlaneAction)
}

class ConcreteNotifier constructor(
        private val planesOnGround: PlanesOnGround,
        private val planesInFlight: PlanesInFlight,
) : Notifier {
    override fun notify(plane: Plane, action: PlaneAction) {
        when (action) {
            PlaneAction.AIR -> planeInFlight(plane)
            PlaneAction.GROUND -> planeOnGround(plane)
        }
    }

    private fun planeOnGround(plane: Plane) {
        planesInFlight.remove(plane)
        planesOnGround.add(plane)
    }
    private fun planeInFlight(plane: Plane) {
        planesInFlight.add(plane)
        planesOnGround.remove(plane)
    }

}