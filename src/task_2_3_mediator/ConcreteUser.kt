package task_2_3_mediator

class ConcreteUser(private val userId: String, private val notifier: Notifier) : User {

    init {
        notifier.addUser(this)
    }
    override fun getId(): String {
        return userId
    }

    override fun sendMessageAll(message: String) {
        notifier.notifyAll(message)
    }
    override fun sendMessage(message: String, user: User) {
        notifier.notify(user = user, message = message)
    }
    override fun receiveMassage(message: String, user: User) {
        println("User $userId receives message: $message from user ${user.getId()}")
    }
}