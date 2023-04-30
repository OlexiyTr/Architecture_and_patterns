package task_3_1_decorator

class PostExclaimDecorator(wrappee: Printable) : BaseStringDecorator(wrappee) {
    override fun print() {
        wrappee.print()
        print("!")
    }
}