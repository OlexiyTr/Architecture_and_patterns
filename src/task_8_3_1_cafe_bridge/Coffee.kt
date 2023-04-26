package task_8_3_1_cafe_bridge


abstract class Coffee : Beverage() {
    val selfCost = 2
}

class BlackCoffee : Coffee() {
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Black coffee")
        cost += selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): BlackCoffee {
        return this
    }

    override fun cost(): Int {
        return cost
    }

}

class CoffeeWithMilk(private val milk: Milk) : Coffee() {
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Coffee with milk")
        cost += milk.cost + selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): CoffeeWithMilk {
        return this
    }

    override fun cost(): Int {
        return cost
    }

}