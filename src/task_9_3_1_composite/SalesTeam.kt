package task_9_3_1_composite

class SalesTeam(private val teamName: String) : Employee {

    private val members: MutableList<Employee> = mutableListOf()

    fun add(member: Employee) {
        members.add(member)
    }

    override fun payExpenses(): Double {
        val result = members.sumOf { it.payExpenses() }
        println("Team $teamName pays $result")
        return result
    }
}
