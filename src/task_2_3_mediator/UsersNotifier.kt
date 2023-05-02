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

    //for task_3_2
    override fun notifyGroup(message: String, userIds: List<String>) {
        userIds.forEach { id ->
            if (id in this.users.keys) {
                this.users[id]?.receiveMassage(message = message, user = id)
            }
        }
    }

}