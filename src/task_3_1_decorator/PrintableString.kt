package task_3_1_decorator

fun main() {
    PrintableClient()
}
class PrintableClient {
    init {
        val startString = PrintableString("")
        val preWord = PreWordDecorator(wrappee = startString, word = "Hello")
        val comma = PostComaDecorator(wrappee = preWord)
        val space = PostSpaceDecorator(wrappee = comma)
        val postWord = PostWordDecorator(wrappee = space, word = "World")
        val exclaim = PostExclaimDecorator(wrappee = postWord)
        val endLine = PostEndlDecorator(wrappee = exclaim)
        endLine.print()
    }
}

class PrintableString(private val string: String): Printable {
    override fun print() {
        print(string)
    }
}
