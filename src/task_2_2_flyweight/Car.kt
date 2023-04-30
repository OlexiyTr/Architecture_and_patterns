package task_2_2_flyweight

data class Car(val number: String, val type: CarType) {
    fun show() {
        println("Car with number:${number} and with features:${this.type} (${this.type.hashCode()} type hashcode for show reuse)")
    }
}