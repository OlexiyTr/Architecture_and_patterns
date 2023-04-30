package task_3_1_decorator

class PreWordDecorator(wrappee: Printable, private val word: String) : BaseStringDecorator(wrappee) {
    override fun print() {
        print(word)
        wrappee.print()
    }
}