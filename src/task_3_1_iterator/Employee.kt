package task_3_1_iterator

fun main() {
    val zak = Employee("Zak")
    val sarah = Employee("Sarah")
    val anna = Employee("Anna")

    val staffList = StaffList()

    staffList.addEmployee(zak)
    staffList.addEmployee(sarah)
    staffList.addEmployee(anna)

    val iterator = staffList.createIterator()
    while (iterator.hasMore()) {
        println(iterator.next())
    }
}

class Employee(val name: String) {

    override fun toString(): String {
        return "Employee{name='$name'}"
    }
}

