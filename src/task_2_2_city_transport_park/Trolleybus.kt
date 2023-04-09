package task_2_2_city_transport_park

interface Trolleybus : CarCost {
    override fun getCost(): Long
}

class VolvoTrolleybus(private val cost: Long) : Trolleybus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}

class SkodaTrolleybus(private val cost: Long) : Trolleybus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}

class HyundaiTrolleybus(private val cost: Long) : Trolleybus {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}