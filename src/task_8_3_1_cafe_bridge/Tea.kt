package task_8_3_1_cafe_bridge

abstract class Tea : Beverage() {
    val selfCost = 1
}

class BlackTea : Tea() {
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Black Tea")
        cost += selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): BlackTea {
        return this
    }

    override fun cost(): Int {
        return cost
    }
}

class TeaWithMilk(private val milk: Milk): Tea() {
    override fun prepare(sizeOfBeverage: SizeOfBeverage) {
        name("Tea with milk")
        cost += milk.cost + selfCost
        sizeOfCoffee = sizeOfBeverage
    }

    override fun drink(): TeaWithMilk {
        return this
    }

    override fun cost(): Int {
        return cost
    }

}