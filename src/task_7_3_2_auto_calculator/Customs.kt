package task_7_3_2_auto_calculator


enum class AutoModel(val nameOfModel: String) {
    CAR("car"), TRUCK("truck")
}

data class Auto(val age: Int, val model: AutoModel, val damaged: Boolean, val mileage: Int)

interface Customs {

    fun vehiclePrice(auto: Auto): Float

    fun tax(auto: Auto): Float

}

class UsaToUkraineCustoms : Customs {

    private val carCalculator = CarCalculator()
    private val truckCalculator = TruckCalculator()
    private val exchangeRate = 38.5f
    private val taxValue = 0.17f
    override fun vehiclePrice(auto: Auto): Float {
        return if (auto.model == AutoModel.CAR) {
            priceForCar(auto)
        } else {
            priceForTruck(auto)
        }
    }

    private fun priceForTruck(auto: Auto): Float {
        val car = truckFromAuto(auto)
        truckCalculator.setVehicle(car)
        return (truckCalculator.calculatePrice().toFloatOrNull() ?: 0f) * exchangeRate
    }

    private fun priceForCar(auto: Auto): Float {
        val car = carFromAuto(auto)
        carCalculator.setVehicle(car)
        return (carCalculator.calculatePrice().toFloatOrNull() ?: 0f) * exchangeRate
    }

    private fun carFromAuto(auto: Auto): Car {
        return Car(
                model = auto.model.nameOfModel,
                age = auto.age,
                damaged = if (auto.damaged) 0.5f else 0f,
                mileage = auto.mileage.toFloat())
    }

    private fun truckFromAuto(auto: Auto): Truck {
        return Truck(
                model = auto.model.nameOfModel,
                age = auto.age,
                damaged = if (auto.damaged) 0.6f else 0f,
                mileage = auto.mileage.toFloat())
    }

    override fun tax(auto: Auto): Float {
        return vehiclePrice(auto) * taxValue
    }
}

class CustomsClient {

    private val adapter = UsaToUkraineCustoms()

    init {
        val autoCar = Auto(age = 10, model = AutoModel.CAR, damaged = true, mileage = 100)
        val autoTurck = Auto(age = 1, model = AutoModel.TRUCK, damaged = false, mileage = 10)
        listOf(autoCar, autoTurck).forEach { item ->
            val nameModel = item.model.nameOfModel
            println("Price for $nameModel is ${adapter.vehiclePrice(item)}")
            println("Tax for $nameModel is ${adapter.tax(item)}")
            println("=============================================")
        }
    }
}

fun main() {
    CustomsClient()
}