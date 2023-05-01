package task_3_2_strategy_calculator

fun main() {
    CalculatorClient()
}

class CalculatorClient {
    init {
        val context = CalculatorContext()
        context.setAction(PlusStrategy())
        context.action(1, 2)

        context.setAction(MinusStrategy())
        context.action(110, 5)

        context.setAction(MultiplyStrategy())
        context.action(36, 85)


    }
}