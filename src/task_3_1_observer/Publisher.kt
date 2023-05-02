package task_3_1_observer


interface Subscriber {
    fun update(value: String)
}

class ReaderSubscriber : Subscriber {
    override fun update(value: String) {
        println(value)
    }

}
class Publisher {

    private val subs = mutableListOf<Subscriber>()

    private var state = ""

    fun subscribe(subscriber: Subscriber) {
        subs.add(subscriber)
    }

    fun unsubscribe(subscriber: Subscriber) {
        subs.remove(subscriber)
    }

}