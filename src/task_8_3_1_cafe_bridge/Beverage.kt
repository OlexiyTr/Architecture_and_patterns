package task_8_3_1_cafe_bridge

abstract class Beverage {

    private var name: String = ""

    var spoonOfSugar: Int = 0

    var sizeOfCoffee = SizeOfBeverage.MIN

    var cost = when (sizeOfCoffee) {
        SizeOfBeverage.MIN -> 3
        SizeOfBeverage.MIDDLE -> 4
        SizeOfBeverage.LARGE -> 5
    }
    abstract fun prepare(sizeOfBeverage: SizeOfBeverage)
    abstract fun drink(): Beverage
    abstract fun cost(): Int

    open fun putSugar(countOfSpoons: Int) {
        spoonOfSugar + countOfSpoons
    }

    fun name(value: String) {
        name = value
    }

    override fun toString(): String { return "$sizeOfCoffee $name cost:$cost spoonOfSugar:$spoonOfSugar" }

}
