package task_3_1_decorator

class PostSpaceDecorator(wrappee: Printable) : BaseStringDecorator(wrappee) {
    override fun print() {
        wrappee.print()
        print(" ")
    }
}