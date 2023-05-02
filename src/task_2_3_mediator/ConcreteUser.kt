package task_2_3_mediator

class ConcreteUser(private val userId: String, private val notifier: Notifier) : User {

    init {
        notifier.addUser(this)
    }

    override fun getId(): String {
        return userId
    }

    override fun sendMessageAll(message: String) {
        notifier.notifyAll(from = this.userId, message = message)
    }

    override fun sendMessage(message: String, user: String) {
        notifier.notify(from = this.userId, to = user, message = message)
    }

    override fun receiveMassage(message: String, from: String) {
        println("User $userId receives message: $message from user $from")
    }

    //for task_3_2
    override fun sendMessageForGroup(message: String, userIds: List<String>) {
        notifier.notifyGroup(from = this.userId, toUserIds = userIds, message = message)
    }
}