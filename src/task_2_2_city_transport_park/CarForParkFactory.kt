package task_2_2_city_transport_park

interface CarForParkFactory {

    fun createAutobus(): Autobus
    fun createTramway(): Tramway
    fun createTrolleybus(): Trolleybus

}

class VolvoFactory : CarForParkFactory {
    override fun createAutobus(): Autobus {
        return VolvoBus(6000000)
    }

    override fun createTramway(): Tramway {
        return VolvoTramway(10000000)
    }

    override fun createTrolleybus(): Trolleybus {
        return VolvoTrolleybus(7000000)
    }

}

class SkodaFactory : CarForParkFactory {
    override fun createAutobus(): Autobus {
        return SkodaBus(4500000)
    }

    override fun createTramway(): Tramway {
        return SkodaTramway(9000000)
    }

    override fun createTrolleybus(): Trolleybus {
        return SkodaTrolleybus(6800000)
    }
}

class HyundaiFactory : CarForParkFactory {
    override fun createAutobus(): Autobus {
        return HyundaiBus(5500000)
    }

    override fun createTramway(): Tramway {
        return HyundaiTramway(9500000)
    }

    override fun createTrolleybus(): Trolleybus {
        return HyundaiTrolleybus(7000000)
    }
}