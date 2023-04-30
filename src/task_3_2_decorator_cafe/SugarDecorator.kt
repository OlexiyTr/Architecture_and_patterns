package task_3_2_decorator_cafe

class SugarDecorator(beverage: Beverage, private val portionNumber: Int) : BaseCoffeeDecorator(beverage) {
    override fun description(): String {
        return "${super.description()} with $portionNumber portion of sugar"
    }
}