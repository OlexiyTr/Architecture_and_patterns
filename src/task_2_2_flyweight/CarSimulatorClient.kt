package task_2_2_flyweight

import java.util.Random

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
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)
        carSimulator.createCar(Wheel(2), Engine(4), CarColor.WHITE)

        carSimulator.showCars()
    }
}

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

class CarBuilder {
    companion object {
        private val carTypes = mutableListOf<CarType>()
        fun getCarType(wheel: Wheel, engine: Engine, color: CarColor): CarType {
            return carTypes.find {
                it.color == color && it.engine == engine && it.wheel == wheel
            } ?: run {
                val newCarType = CarType(wheel, engine, color)
                carTypes.add(newCarType)
                newCarType
            }
        }
    }
}

enum class CarColor {
    BLACK, RED, BLUE, WHITE, GRAY
}

data class Wheel(val size: Int)
data class Engine(val power: Int)
data class CarType(val wheel: Wheel, val engine: Engine, val color: CarColor)
data class Car(val number: String, val type: CarType) {
    fun show() {
        println("Car with number:${number} and with features:${this.type} (${this.type.hashCode()} type hashcode for show reuse)")
    }
}

