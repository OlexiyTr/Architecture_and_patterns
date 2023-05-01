package task_3_2_strategy_calculator

class CalculatorContext {
    private var strategy: CalculatorStrategy? = null

    fun action(a: Int, b: Int) {
        strategy?.operation(a, b)
    }

    fun setAction(strategy: CalculatorStrategy) {
        this.strategy = strategy
    }
}