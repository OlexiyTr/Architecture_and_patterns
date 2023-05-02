package task_2_3_mediator

interface Notifier {
    fun notify(user: User, message: String)
    fun notifyAll(message: String)

    fun addUser(user: User)
}