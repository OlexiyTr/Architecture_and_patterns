package task_9_3_1_composite

class SalesPerson(val name: String, private val expense: Double, private val manager: Manager) : Employee {

    override fun payExpenses(): Double {
        println("I'm sales person $name pay $expense and my manager is ${manager.name}")
        return expense
    }
}
