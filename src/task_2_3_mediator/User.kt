package task_2_3_mediator

fun main() {
    val notifier = UsersNotifier()

    val user1 = ConcreteUser("User1", notifier)
    val user2 = ConcreteUser("User2", notifier)
    val user3 = ConcreteUser("User3", notifier)
    val user4 = ConcreteUser("User4", notifier)

    user1.sendMessageAll("Hello, world!")

    user2.sendMessage("Hello!", "User1")

    //for task_3_2
    user3.sendMessageForGroup("Hi, group:)", listOf(user1.getId(), user4.getId()) )


}

interface User {

    fun getId(): String
    fun sendMessageAll(message: String)
    fun sendMessage(message: String, user: String)
    fun receiveMassage(message: String, user: String)

    fun sendMessageForGroup(message: String, userIds: List<String>)
}