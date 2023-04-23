package task_3_1_text_editor_autofactory_director

data class Car(
        val bodyType: BodyType?,
        val engine: Engine?,
        val color: CarColor,
        val wheelRims: WheelRimsType,
) : CarResult

class CarBuilderConcrete : CarBuilder {

    //props with default values
    private var bodyType: BodyType = BodyType.UNIVERSAL
    private var engine: Engine = Engine(0, 0.0, FuelType.KEROSENE)
    private var color: CarColor = CarColor.BLACK
    private var wheelRims: WheelRimsType = WheelRimsType.CAST
    override fun createBodyType(type: BodyType): CarBuilderConcrete {
        this.bodyType = type
        return this
    }

    override fun createEngine(engine: Engine): CarBuilderConcrete {
        this.engine = engine
        return this
    }

    override fun createWheelRims(rims: WheelRimsType): CarBuilderConcrete {
        this.wheelRims = rims
        return this
    }

    override fun createBodyColor(color: CarColor): CarBuilderConcrete {
        this.color = color
        return this
    }

    override fun build(): Car {
        return Car(bodyType, engine, color, wheelRims)
    }

}