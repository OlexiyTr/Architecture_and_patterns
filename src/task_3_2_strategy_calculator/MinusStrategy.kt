package task_3_2_strategy_calculator

class MinusStrategy() : CalculatorStrategy {
    override fun operation(a: Int, b: Int) {
        println("Result:${a - b}")
    }
}