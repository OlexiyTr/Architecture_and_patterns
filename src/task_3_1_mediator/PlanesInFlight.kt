package task_3_1_mediator

class PlanesInFlight {

    private val planes = mutableListOf<Plane>()
    fun add(plane: Plane) {
        planes.add(plane)
        println("Planes is air: ${planes.map { it.id }}")
    }

    fun remove(plane: Plane) {
        planes.remove(plane)
    }
}
class PlanesOnGround {
    private val planes = mutableListOf<Plane>()
    fun add(plane: Plane) {
        planes.add(plane)
        println("Planes on ground: ${planes.map { it.id }}")
    }

    fun remove(plane: Plane) {
        planes.remove(plane)
    }
}