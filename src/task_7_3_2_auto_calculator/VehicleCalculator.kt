package task_7_3_2_auto_calculator

interface VehicleCalculator {
    fun setVehicle(vehicle: Vehicle)

    fun calculatePrice(): String
}

open class Vehicle constructor(
        private val model: String,
        private val age: Int,
        private val damaged: Float,
        private val mileage: Float,
) {
    open fun getAge(): Int {
        return age
    }

    open fun getModel(): String {
        return model
    }

    open fun getDamage(): Float {
        return damaged
    }

    open fun getMileage(): Float {
        return mileage
    }
}