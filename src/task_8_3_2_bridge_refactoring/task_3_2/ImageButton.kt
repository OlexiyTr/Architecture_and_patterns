package task_8_3_2_bridge_refactoring.task_3_2

class ImageButton(private val userSize: UserSize) : Button(userSize) {
    private val nameOfButton = "${userSize.getSelfSize()} ${this.javaClass.simpleName}"

    override fun draw() {
        println("I'm $nameOfButton")
    }

    override fun click() {
        println("Play gradient animation \uD83D\uDE0A")
    }
}
