package task_7_3_2_auto_calculator

class TruckCalculator : VehicleCalculator {

    private val truckPromotion = 5

    private var truck: Truck? = null
    override fun setVehicle(vehicle: Vehicle) {
        this.truck = (vehicle as Truck)
    }

    override fun calculatePrice(): String {
        return truck?.let {
            val damaged = pointsFromDamagedCar(it.getDamage())
            val age = pointsOfAge(it.getAge())
            val mileage = pointsOfMileage(it.getMileage())
            val result = damaged.plus(age).plus(mileage).plus(truckPromotion) * 100
            return result.toString()
        } ?: "0"
    }

    private fun pointsFromDamagedCar(value: Float): Int {
        return when (value) {
            in 0f..0.5f -> 2
            else -> 1
        }
    }


    private fun pointsOfAge(value: Int): Int {
        return when (value) {
            1 -> 10
            in 2..5 -> 7
            else -> 1
        }
    }

    private fun pointsOfMileage(value: Float): Int {
        return when (value) {
            in 0f..1000f -> 10
            in 1001f..5000f -> 7
            else -> 1
        }
    }

}

data class Truck(
        private val model: String,
        private val age: Int,
        private val damaged: Float,
        private val mileage: Float,
) : Vehicle(model, age, damaged, mileage) {
    override fun getDamage(): Float {
        return super.getDamage()
    }

    override fun getAge(): Int {
        return super.getAge()
    }

    override fun getModel(): String {
        return super.getModel()
    }

    override fun getMileage(): Float {
        return super.getMileage()
    }

}