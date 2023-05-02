package task_2_3_mediator

interface Notifier {
    fun notify(from: String, to: String, message: String)
    fun notifyAll(from: String, message: String)

    fun notifyGroup(from: String, toUserIds: List<String>, message: String)

    fun addUser(user: User)
}