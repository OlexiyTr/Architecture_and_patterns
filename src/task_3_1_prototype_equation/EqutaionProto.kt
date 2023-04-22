package task_3_1_prototype_equation

interface Equation {

    fun clone(): Equation

    fun solve(): List<Double>

}


class QuadraticEquation : Equation {

    private val odds: List<Int> = emptyList()

    private val imageOfOdds: String = odds.toString()
    override fun clone(): Equation {
        return this
    }

    override fun solve(): List<Double> {
        return emptyList()
    }

}

class BiQuadraticalEquation : Equation {
    override fun clone(): Equation {
        return this
    }

    override fun solve(): List<Double> {
        return emptyList()
    }

}