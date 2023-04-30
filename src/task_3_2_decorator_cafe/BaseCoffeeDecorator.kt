package task_3_2_decorator_cafe

open class BaseCoffeeDecorator(private val beverage: Beverage) : Beverage() {
    override fun description(): String {
        return beverage.description()
    }
}