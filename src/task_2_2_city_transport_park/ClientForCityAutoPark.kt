package task_2_2_city_transport_park

import java.util.Scanner

class ClientForCityAutoPark {

    private val skodaFactory = SkodaFactory()
    private val volvoFactory = VolvoFactory()
    private val hyundaiFactory = HyundaiFactory()
    fun show() {
        val inputer = Scanner(System.`in`)
        print("Number of distance = ")
        val distance = inputer.nextLong()
        print("Number of buses = ")
        val numberOfBuses = inputer.nextLong()
        print("Number of trolleybuses = ")
        val numberOfTrolleybuses = inputer.nextLong()
        print("Number of tramways = ")
        val numberOfTramways = inputer.nextLong()

        val skodaPark = createCars(skodaFactory, numberOfBuses, numberOfTrolleybuses, numberOfTramways)
        val volvoPark = createCars(volvoFactory, numberOfBuses, numberOfTrolleybuses, numberOfTramways)
        val hyundaiPark = createCars(hyundaiFactory, numberOfBuses, numberOfTrolleybuses, numberOfTramways)

        val skodaCost = calcuateCost(skodaPark, distance)
        val volvoCost = calcuateCost(volvoPark, distance)
        val hyundaiCost = calcuateCost(hyundaiPark, distance)

        showResult(skodaCost, volvoCost, hyundaiCost)

    }

    private fun showResult(skodaCost: Long, volvoCost: Long, hyundaiCost: Long) {
        val mapOfTransportToCost = mapOf(
                TypeOfCityTransport.SKODA to skodaCost,
                TypeOfCityTransport.VOLVO to volvoCost,
                TypeOfCityTransport.HYUNDAI to hyundaiCost,
        )

        val result = mapOfTransportToCost.minBy { it.value }
        println("Best way company for city autopark is ${result.key.name}, with cost is ${result.value}")
    }

    private fun createCars(factory: CarForParkFactory, numberOfBusses: Long, numberOfTrolleybuses: Long, numberOfTramways: Long): List<CarCost> {
        val items = mutableListOf<CarCost>()
        for (i in 0..numberOfBusses) {
            items.add(factory.createAutobus())
        }
        for (i in 0..numberOfTrolleybuses) {
            items.add(factory.createTrolleybus())
        }
        for (i in 0..numberOfTramways) {
            items.add(factory.createTramway())
        }
        return items.toList()
    }

    private fun calcuateCost(carCosts: List<CarCost>, distanceCost: Long): Long {
        return carCosts.sumOf { it.getCost() } + carCosts.sumOf { it.getDistanceCost(distanceCost) }
    }

    enum class TypeOfCityTransport {
        SKODA, VOLVO, HYUNDAI
    }

}