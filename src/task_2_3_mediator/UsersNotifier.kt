package task_2_3_mediator

class UsersNotifier : Notifier {
    private val users = mutableListOf<User>()

    override fun addUser(user: User) {
        this.users.add(user)
    }

    override fun notify(user: User, message: String) {
        user.receiveMassage(message = message, user = user)
    }

    override fun notifyAll(message: String) {
        this.users.forEach {user ->
            user.receiveMassage(message, user)
        }
    }

}