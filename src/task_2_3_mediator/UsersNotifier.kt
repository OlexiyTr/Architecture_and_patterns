package task_2_3_mediator

class UsersNotifier : Notifier {
    private val users = mutableMapOf<String, User>()

    override fun addUser(user: User) {
        this.users[user.getId()] = user
    }

    override fun notify(from: String, to: String, message: String) {
        this.users[to]?.receiveMassage(message = message, from = from)
    }

    override fun notifyAll(from: String, message: String) {
        this.users.values.forEach { user ->
            user.receiveMassage(message = message, from =from)
        }
    }

    //for task_3_2
    override fun notifyGroup(from: String, toUserIds: List<String>, message: String) {
        toUserIds.forEach { id ->
            if (id in this.users.keys) {
                this.users[id]?.receiveMassage(message = message, from = from)
            }
        }
    }

}