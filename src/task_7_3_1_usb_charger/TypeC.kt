package task_7_3_1_usb_charger

data class TypeCData(val energyOut: Double)
interface TypeC {

    fun charge(data: TypeCData)

}

data class MicroUSBData(val energyIn: Double)
class MicroUSBService {
    fun charging(data: MicroUSBData, costDownInPercent: Double) {
        //Example of result
        println("We received ${data.energyIn}% charges with a loss of ${((1-costDownInPercent)*100).toFloat()}%")
    }
}

class TypeCToMicroUSBAdapter : TypeC {

    private val service: MicroUSBService = MicroUSBService()

    private val costDownInPercent = 0.95

    override fun charge(data: TypeCData) {
        val microUSBData = mapTypeCToMicroUSB(data)
        service.charging(microUSBData, costDownInPercent)
    }

    //Simple data mapper for show simple logic
    private fun mapTypeCToMicroUSB(data: TypeCData): MicroUSBData {
        return MicroUSBData(energyIn = costDownInPercent * data.energyOut)
    }
}

class TypeCClient {
    init {
        val typeCAdapter = TypeCToMicroUSBAdapter()
        //We have 50 units of charge to pass through the adapter and charge our MicroUSB device
        typeCAdapter.charge(data = TypeCData(energyOut = 50.0))
    }
}

fun main() {
    TypeCClient()
}