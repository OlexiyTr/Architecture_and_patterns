package task_3_1_decorator

class PostWordDecorator(wrappee: Printable, private val word: String) : BaseStringDecorator(wrappee) {
    override fun print() {
        wrappee.print()
        print(word)
    }
}