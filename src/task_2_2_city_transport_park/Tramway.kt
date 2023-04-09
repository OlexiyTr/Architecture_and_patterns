package task_2_2_city_transport_park

interface Tramway : CarCost {
    override fun getCost(): Long
}

class VolvoTramway(private val cost: Long) : Tramway {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}

class SkodaTramway(private val cost: Long) : Tramway {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}

class HyundaiTramway(private val cost: Long) : Tramway {
    override fun getCost(): Long {
        return cost
    }

    override fun getDistanceCost(singleCostOfDistance: Long): Long {
        return singleCostOfDistance * cost
    }
}