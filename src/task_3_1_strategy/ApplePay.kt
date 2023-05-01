package task_3_1_strategy

class ApplePay : PayStrategy {
    override fun pay(amount: Int) {
        println("Payment of $$amount made from ApplePay.")
    }
}