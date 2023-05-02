package task_3_1_iterator

interface EmployeeCollection {
    fun createIterator() : EmployeeIterator
}

class StaffList : EmployeeCollection {
    val employees: MutableList<Employee> = mutableListOf()
    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    override fun createIterator(): EmployeeIterator {
        return StaffListIterator(this)
    }
}