package task_3_2_strategy_calculator

class MultiplyStrategy() : CalculatorStrategy {
    override fun operation(a: Int, b: Int) {
        println("Result:${a * b}")
    }
}