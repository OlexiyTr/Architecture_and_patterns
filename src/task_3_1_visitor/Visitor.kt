package task_3_1_visitor

interface Visitor {

    fun visit(manager: Manager)
    fun visit(salesPerson: SalesPerson)
    fun visit(staffList: StaffList)

}

class ConcreteVisitor : Visitor {
    override fun visit(manager: Manager) {
        println("Manager salary:${manager.salary}")
    }

    override fun visit(salesPerson: SalesPerson) {
        println("SalesPerson salary:${salesPerson.salary}")
    }

    override fun visit(staffList: StaffList) {
        println("StaffList salary:${staffList.salary}")
    }

}


