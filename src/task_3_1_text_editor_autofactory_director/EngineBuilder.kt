package task_3_1_text_editor_autofactory_director

enum class FuelType {
    GASOLINE, KEROSENE, DIESEL
}

data class Engine(
        val power: Int,
        val capacity: Double,
        val fuelType: FuelType,
)

class EngineBuilder {

    private var power: Int = 0
    private var capacity: Double = 0.0
    private var fuelType: FuelType = FuelType.KEROSENE
    fun addPower(value: Int): EngineBuilder {
        this.power = value
        return this
    }

    fun addCapacity(value: Double): EngineBuilder {
        this.capacity = value
        return this
    }

    fun addFuelType(value: FuelType): EngineBuilder {
        this.fuelType = value
        return this
    }

    fun build(): Engine {
        return Engine(power, capacity, fuelType)
    }
}