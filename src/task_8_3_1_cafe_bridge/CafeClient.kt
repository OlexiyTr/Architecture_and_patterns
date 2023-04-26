package task_8_3_1_cafe_bridge

fun main() {
    CafeClient()
}
class CafeClient {
    init {
        val orderBlackCoffee = BlackCoffee()
        println(">>order:${orderBlackCoffee.hashCode()}")
        val cafe = Cafe(orderBlackCoffee)
        cafe.prepare(sizeOfBeverage = SizeOfBeverage.MIDDLE)
        cafe.putOfSugar(countOfSpoons = 2)
        val costOfBlackCoffee = cafe.pay()
        println(">>cost:${costOfBlackCoffee}")
        val coffee = cafe.get()
        println(">>order:${orderBlackCoffee.hashCode()}")
        println(">>${coffee}")
        println("========================================")
    }
}
enum class SizeOfBeverage {
    MIN, MIDDLE, LARGE
}


data class Milk(val cost: Int = 1)

class Cafe constructor(private val beverage: Beverage){
    fun prepare(sizeOfBeverage: SizeOfBeverage) {
        beverage.prepare(sizeOfBeverage)
    }

    fun pay(): Int {
        return beverage.cost()
    }

    fun get(): Beverage {
        return beverage.drink()
    }

    fun putOfSugar(countOfSpoons: Int) {
        beverage.putSugar(countOfSpoons)
    }
}
