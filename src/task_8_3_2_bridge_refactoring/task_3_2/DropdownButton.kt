package task_8_3_2_bridge_refactoring.task_3_2

class DropdownButton(private val userSize: UserSize, private val sizeOfItemsForDropped: Int) : Button(userSize) {

    private var isDropped = false
    private val nameOfButton = "${userSize.getSelfSize()} ${this.javaClass.simpleName}"
    override fun draw() {
        println("I'm $nameOfButton")
    }

    override fun click() {
        isDropped = !isDropped
        if (isDropped) {
            println("Now you see $sizeOfItemsForDropped items :)")
        } else {
            println("You close the drops")
        }

    }

}
