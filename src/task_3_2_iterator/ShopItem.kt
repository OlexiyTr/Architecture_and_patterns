package task_3_2_iterator

fun main() {
    val pens = ShopItem("pen", 175)
    val pencils = ShopItem("pencil", 0)
    val paper = ShopItem("paper", 500)
    val shop = Shop()
    shop.putItem(pens)
    shop.putItem(pencils)
    shop.putItem(paper)

    val iteratorByAlphabet = shop.createIteratorByAlphabet()
    while(iteratorByAlphabet.hasNext()) {
        println(iteratorByAlphabet.next())
    }

    println("====================================")

    val iteratorByNumber = shop.createIteratorByNumber()
    while(iteratorByNumber.hasNext()) {
        println(iteratorByNumber.next())
    }
}

data class ShopItem(val name: String, val quantity: Int) {

    override fun toString(): String {
        return "Item{name=$name, quantity=$quantity}"
    }
}

