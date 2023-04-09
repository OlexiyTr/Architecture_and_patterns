package task_2_2_city_transport_park

interface CarCost {

    fun getCost() : Long

    fun getDistanceCost(singleCostOfDistance: Long): Long
}