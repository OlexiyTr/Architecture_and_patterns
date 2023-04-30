package task_3_1_decorator

class PostEndlDecorator(wrappee: Printable) : BaseStringDecorator(wrappee) {
    override fun print() {
        wrappee.print()
        print("\n")
    }
}