package task_3_1_decorator

open class BaseStringDecorator(protected var wrappee: Printable): Printable {

    override fun print() {
        wrappee.print()
    }
}