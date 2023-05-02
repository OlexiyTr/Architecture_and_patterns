package task_3_1_iterator

interface EmployeeIterator {
    fun next(): Employee?

    fun hasMore(): Boolean
}

class StaffListIterator(private val staffList: StaffList) : EmployeeIterator {

    private var currentPosition = 0
    private var sorted = false

    override fun hasMore(): Boolean {
        if (!sorted) sort()
        return currentPosition < staffList.employees.size
    }

    override fun next(): Employee {
        if (!sorted) sort()
        return staffList.employees[currentPosition++]
    }

    private fun sort() {
        for (i in staffList.employees.indices) {
            for (j in i + 1 until staffList.employees.size) {
                if (staffList.employees[j].name < staffList.employees[i].name) {
                    staffList.employees.swap(i, j)
                }
            }
        }
        sorted = true
    }

    private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }

}