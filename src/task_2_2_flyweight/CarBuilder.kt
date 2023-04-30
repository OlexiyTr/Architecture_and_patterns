package task_2_2_flyweight

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