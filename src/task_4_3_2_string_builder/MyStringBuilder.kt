package task_4_3_2_string_builder

interface MyStringBuilder {

    fun insert(index: Int, item: String): MyStringBuilder

    fun addToStart(item: String): MyStringBuilder

    fun addToEnd(item: String): MyStringBuilder

    fun create(): String
}

class MyStringBuilderConcrete : MyStringBuilder {

    private var result: String = ""
    override fun insert(index: Int, item: String): MyStringBuilder {
        val initLength = result.length
        return if (index >= initLength) {
            addToEnd(item)
            this
        } else {
            val firstPart = result.substring(0, index)
            val secondPart = result.substring(index + 1, initLength - 1)
            val newResult = firstPart.plus(item).plus(secondPart)
            result = newResult
            this
        }
    }

    override fun addToStart(item: String): MyStringBuilder {
        val oldResult = result
        result = item.plus(oldResult)
        return this
    }

    override fun addToEnd(item: String): MyStringBuilder {
        val oldResult = result
        result = oldResult.plus(item)
        return this
    }

    override fun create(): String {
        return result
    }

}

class MyStringBuilderClient {
    init {
        val buidler = MyStringBuilderConcrete()
                .addToStart("A")
                .insert(2, "BC")
                .addToEnd("_ER")
        val firstResult = buidler.create()
        println("first string is $firstResult")
        buidler.insert(2, "xxx")
        val secondResult = buidler.create()
        println("second string is $secondResult")
    }
}

fun main() {
    MyStringBuilderClient()
}