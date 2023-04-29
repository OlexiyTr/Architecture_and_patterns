package task_9_3_1_composite

fun main() {
    ExpensesClient()
}

class ExpensesClient {

    init {
        val milkTeam = milkTeam()
        val meatTeam = meatTeam()
        val sugarTeam = confectioneryTeam()

        val teamOfShop = SalesTeam("SHOP \uD83D\uDE0B")

        teamOfShop.add(milkTeam)
        teamOfShop.add(meatTeam)
        teamOfShop.add(sugarTeam)

        teamOfShop.payExpenses()
    }

    private fun milkTeam() : SalesTeam {
        val team = SalesTeam("Milk \uD83E\uDD5B")
        val manager = Manager(name = "John", expense = 10.0)
        team.add(manager)
        val salesPerson1 = SalesPerson(name = "Taras", expense = 5.0, manager = manager)
        val salesPerson2 = SalesPerson(name = "Nata", expense = 5.0, manager = manager)
        val salesPerson3 = SalesPerson(name = "Sasha", expense = 4.0, manager = manager)
        team.add(salesPerson1)
        team.add(salesPerson2)
        team.add(salesPerson3)
        return team
    }

    private fun meatTeam() : SalesTeam {
        val team = SalesTeam("Meat \uD83E\uDD69")
        val manager = Manager(name = "Oleksiy", expense = 15.0)
        team.add(manager)
        val salesPerson1 = SalesPerson(name = "Egor", expense = 4.0, manager = manager)
        val salesPerson2 = SalesPerson(name = "Tanya", expense = 6.0, manager = manager)
        val salesPerson3 = SalesPerson(name = "Valentin", expense = 8.0, manager = manager)
        team.add(salesPerson1)
        team.add(salesPerson2)
        team.add(salesPerson3)
        return team
    }

    private fun confectioneryTeam(): SalesTeam {
        val team = SalesTeam("Sugar \uD83C\uDF6D")
        val manager = Manager(name = "Yoshi", expense = 15.0)
        team.add(manager)
        val salesPerson1 = SalesPerson(name = "Chan", expense = 5.0, manager = manager)
        val salesPerson2 = SalesPerson(name = "Abu", expense = 8.0, manager = manager)
        val salesPerson3 = SalesPerson(name = "Richard", expense = 8.0, manager = manager)
        team.add(salesPerson1)
        team.add(salesPerson2)
        team.add(salesPerson3)
        return team

    }

}
