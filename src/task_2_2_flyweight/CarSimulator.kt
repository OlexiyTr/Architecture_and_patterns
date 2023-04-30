package task_2_2_flyweight

import java.util.*

class CarSimulator {
    private val cars = mutableListOf<Car>()
    private val random = Random()

    fun createCar(wheel: Wheel, engine: Engine, color: CarColor) {
        val type = CarBuilder.getCarType(wheel, engine, color)
        val number = random.nextInt(1000).toString()
        cars.add(Car(number, type))
    }

    fun showCars() {
        cars.forEach {
            it.show()
        }
    }

}