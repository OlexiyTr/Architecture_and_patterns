package task_8_3_2_bridge_refactoring.task_3_2

abstract class UserSize {
    abstract fun getSelfSize(): String
}

class Medium : UserSize() {
    override fun getSelfSize(): String {
        return this.javaClass.simpleName
    }
}

class Small : UserSize() {
    override fun getSelfSize(): String {
        return this.javaClass.simpleName
    }
}

class Large : UserSize() {
    override fun getSelfSize(): String {
        return this.javaClass.simpleName
    }
}
