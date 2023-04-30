package task_3_2_decorator_cafe

fun main() {
    CoffeeDecoratorClient()
}

class CoffeeDecoratorClient {
    init {
        printCoffeeExample(SugarDecorator(Espresso("Espresso"), 2))
        printCoffeeExample(SugarDecorator(TopsDecorator(DarkRoast("Dark roast")), 2))
        printCoffeeExample((SugarDecorator(CreamDecorator(DarkRoast("Dark roast")), 1)))
        printCoffeeExample(SugarDecorator(MilkDecorator(Decaf("Decaf")), 2))
    }

    private fun printCoffeeExample(coffee: Beverage) {
        println(coffee.description())
    }
}

abstract class Beverage {
    abstract fun description(): String
}

