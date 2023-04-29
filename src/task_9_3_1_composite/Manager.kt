package task_9_3_1_composite

class Manager constructor(val name: String, private val expense: Double) : Employee {
    override fun payExpenses(): Double {
        println("I'm manager $name pay $expense")
        return expense
    }
}
