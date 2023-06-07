package examen

interface Filler {
    fun identify(): String
}

class Chocolate : Filler {
    override fun identify(): String {
        return "Chocolate(id:${this.hashCode()})"
    }
}

class Cream : Filler {
    override fun identify(): String {
        return "Cream(id:${this.hashCode()})"
    }
}

class Frosting : Filler {
    override fun identify(): String {
        return "Frosting(id:${this.hashCode()})"
    }
}

class Strawberry : Filler {
    override fun identify(): String {
        return "Strawberry(id:${this.hashCode()})"
    }

}
