package task_3_2_iterator

interface ShopIterator {
    fun hasNext(): Boolean
    fun next(): ShopItem
}


class ShopIteratorByNumber(private val shop: Shop) : ShopIterator {

    private val itemsList = shop.items.values.toList().sortedWith(compareBy { it.quantity })
    private var index = 0

    override fun hasNext(): Boolean {
        return index < itemsList.size
    }

    override fun next(): ShopItem {
        val item = itemsList[index]
        index++
        return item
    }

}

class ShopIteratorByAlphabet(private val shop: Shop) : ShopIterator {
    private val itemsList = shop.items.values.toList().sortedWith(compareBy { it.name.toLowerCase() })
    private var index = 0

    override fun hasNext(): Boolean {
        return index < itemsList.size
    }

    override fun next(): ShopItem {
        val item = itemsList[index]
        index++
        return item
    }
}
