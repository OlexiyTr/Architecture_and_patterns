package task_3_1_visitor


object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val staffList = StaffList()

        val concreteVisitor = ConcreteVisitor()
        val manager = Manager(60000)
        concreteVisitor.visit(manager)
        staffList.addEmployee(manager)


        val sp1 = SalesPerson(50000)
        concreteVisitor.visit(sp1)
        staffList.addEmployee(sp1)

        val sp2 = SalesPerson(40000)
        concreteVisitor.visit(sp2)
        staffList.addEmployee(sp2)

        println("Total amount paid to staff: ${staffList.salary}")

        staffList.up(0.2)
        staffList.accept(concreteVisitor)
    }
}

interface Employee {
    val salary: Int

    fun up(percent: Double)
    fun down(fine: Int)

    fun accept(v: Visitor)
}

class Manager(override var salary: Int) : Employee {
    override fun up(percent: Double) {
        salary *= ((1 + percent).toInt())
    }

    override fun down(fine: Int) {
        salary -= fine
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}

class SalesPerson(override var salary: Int) : Employee {
    override fun up(percent: Double) {
        salary *= ((1 + percent).toInt())
    }

    override fun down(fine: Int) {
        salary -= fine
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}

class StaffList : Employee {
    var salaries = ArrayList<Employee>()
        private set
    fun addEmployee(employee: Employee) {
        salaries.add(employee)
    }

    override val salary: Int
        get() {
            var sum = 0
            for (salary in salaries) {
                sum += salary.salary
            }
            return sum
        }

    override fun up(percent: Double) {
        salaries.forEach {
            it.up(percent)
        }
    }

    override fun down(fine: Int) {
        salaries.forEach {
            it.down(fine)
        }
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}