package task_8_3_1_cafe_bridge

abstract class Chocolate : Beverage() {
    val selfCost = 3
}
class BlackChocolate : Chocolate() {
    override fun putSugar(countOfSpoons: Int) { spoonOfSugar = countOfSpoons }
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Black Chocolate")
        cost += selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): BlackChocolate {
        return this
    }

    override fun cost(): Int {
        return cost
    }

}

class MilkChocolate(private val milk: Milk) : Chocolate() {
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Milk Chocolate")
        cost += milk.cost + selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): MilkChocolate {
        return this
    }

    override fun cost(): Int {
        return cost
    }

}