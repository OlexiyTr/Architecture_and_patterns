package examen

interface CakeBuilder {

    fun reset()

    fun addChocolate(chocolate: Chocolate)
    fun addCream(cream: Cream)
    fun addFrosting(frosting: Frosting)

    fun addStrawberry(strawberry: Strawberry)

}

class CakeBuilderConcrete : CakeBuilder {

    private var cake: CakeDefault? = null
    override fun reset() {
        cake = null
    }

    override fun addChocolate(chocolate: Chocolate) {
        cake?.addFiller(chocolate) ?: run {
            additionalCreator(chocolate)
        }
    }

    override fun addCream(cream: Cream) {
        cake?.addFiller(cream) ?: run {
            additionalCreator(cream)
        }
    }

    override fun addFrosting(frosting: Frosting) {
        cake?.addFiller(frosting) ?: run {
            additionalCreator(frosting)
        }
    }

    override fun addStrawberry(strawberry: Strawberry) {
        cake?.addFiller(strawberry) ?: {
            additionalCreator(strawberry)
        }
    }

    private fun <T : Filler> additionalCreator(item: T) {
        val newCake = Cake()
        newCake.addFiller(item)
        cake = newCake
    }

    fun result() = cake
}
