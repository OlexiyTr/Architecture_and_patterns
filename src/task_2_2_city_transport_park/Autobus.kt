package task_2_2_city_transport_park

interface Autobus : CarCost {

    override fun getCost(): Long
    override fun getDistanceCost(singleCostOfDistance: Long): Long

}

class VolvoBus(private val cost: Long) : Autobus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }

}

class SkodaBus(private val cost: Long) : Autobus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }

}

class HyundaiBus(private val cost: Long) : Autobus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }

}