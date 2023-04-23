package task_3_1_text_editor_autofactory_director

enum class BodyType {
    SEDAN, HATCHBACK, UNIVERSAL
}

enum class WheelRimsType {
    CAST, STAMPED, FORGED
}

enum class CarColor {
    RED, BLACK, YELLOW, BLUE
}
interface CarResult
interface CarBuilder {
    fun createBodyType(type: BodyType): CarBuilder
    fun createEngine(engine: Engine): CarBuilder
    fun createWheelRims(rims: WheelRimsType): CarBuilder
    fun createBodyColor(color: CarColor): CarBuilder

    fun build(): CarResult

}