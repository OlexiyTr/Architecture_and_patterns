package task_2_2_flyweight

fun main() {
    CarSimulatorClient()
}
class CarSimulatorClient {
    init {
        val carSimulator = CarSimulator()
        carSimulator.createCar(Wheel(1), Engine(2), CarColor.BLACK)
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)
        carSimulator.createCar(Wheel(3), Engine(5), CarColor.BLUE)
        carSimulator.createCar(Wheel(2), Engine(5), CarColor.GRAY)
        carSimulator.createCar(Wheel(1), Engine(6), CarColor.RED)

        //Same cars but with different numbers and same hashcode with car types
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)

        carSimulator.showCars()
    }
}
