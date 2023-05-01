package task_3_1_strategy

class Customer {
    private var strategy: PayStrategy? = null

    fun setCustomer(strategy: PayStrategy) {
        this.strategy = strategy
    }

    fun pay(amount: Int) {
        strategy?.pay(amount) ?: run { println("Choose customer") }
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val customerPayToAmount = mapOf(
                ApplePay() to 100,
                GooglePay() to 200,
                PayPalPay() to 1000,
                P2PPay() to 2000,
        )

        val customer = Customer()
        customerPayToAmount.forEach { (strategy, amount) ->
            customer.setCustomer(strategy)
            customer.pay(amount)
        }

    }
}