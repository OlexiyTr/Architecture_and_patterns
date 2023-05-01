package task_3_1_strategy

class PayPalPay : PayStrategy {
    override fun pay(amount: Int) {
        println("Payment of $$amount made from PayPal.")
    }
}