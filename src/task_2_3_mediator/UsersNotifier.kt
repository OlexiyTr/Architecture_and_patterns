package task_2_3_mediator

class UsersNotifier : Notifier {
    private val users = mutableMapOf<String, User>()

    override fun addUser(user: User) {
        this.users[user.getId()] = user
    }

    override fun notify(user: String, message: String) {
        this.users[user]?.receiveMassage(message = message, user = user)
    }

    override fun notifyAll(message: String) {
        this.users.values.forEach { user ->
            user.receiveMassage(message, user.getId())
        }
    }

}