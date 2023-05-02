package task_3_2_iterator

interface ShopCollection {
    fun createIteratorByAlphabet() : ShopIterator
    fun createIteratorByNumber() : ShopIterator
}
class Shop: ShopCollection {
    val items = HashMap<String, ShopItem>()
    fun putItem(item: ShopItem) {
        items[item.name] = item
    }
    override fun createIteratorByAlphabet(): ShopIterator {
        return ShopIteratorByAlphabet(this)
    }

    override fun createIteratorByNumber(): ShopIterator {
        return ShopIteratorByNumber(this)
    }
}