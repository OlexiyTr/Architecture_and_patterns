package examen


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val builder = CakeBuilderConcrete()
        val director = CakeDirector(builder)
        director.createCake()
        val cake = builder.result()
        println(cake)
    }
}

class CakeDirector(private val builder: CakeBuilder) {

    // додати крем
    // Додати шоколад
    // додати шоколад
    // додати глазур
    // додати інший наповнювач
    fun createCake() {
        builder.reset()
        builder.addChocolate(Chocolate())
        builder.addChocolate(Chocolate())
        builder.addStrawberry(Strawberry())
        builder.addCream(Cream())
    }
}

data class Cake(
        private val chocolates: MutableList<Chocolate> = mutableListOf(),
        private val creams: MutableList<Cream> = mutableListOf(),
        private val frostings: MutableList<Frosting> = mutableListOf(),
        private val strawberrys: MutableList<Strawberry> = mutableListOf()
) {

    override fun toString(): String {

        val chocoCount = chocolates.size

        val creamCount = creams.size

        val frostingCount = frostings.size

        val strawberryCount = strawberrys.size

        return "Cake with: chocolate = ${chocoCount}, cream = ${creamCount}, frostings = $frostingCount, strawberry = $strawberryCount"
    }

    fun <T : Filler> addFiller(prop: T) {
        when (prop) {
            is Chocolate -> chocolates.add(prop)
            is Cream -> creams.add(prop)
            is Frosting -> frostings.add(prop)
            is Strawberry -> strawberrys.add(prop)
        }
    }
}