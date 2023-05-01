package task_3_1_strategy

class P2PPay : PayStrategy {
    override fun pay(amount: Int) {
        println("Payment of $$amount made from P2P.")
    }
}