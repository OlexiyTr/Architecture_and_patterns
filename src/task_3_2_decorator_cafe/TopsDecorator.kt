package task_3_2_decorator_cafe

class TopsDecorator(beverage: Beverage) : BaseCoffeeDecorator(beverage) {
    override fun description(): String {
        return "${super.description()} with tops"
    }
}