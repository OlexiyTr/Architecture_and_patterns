package task_8_3_2_bridge_refactoring.task_3_2

abstract class Button(private var userSize: UserSize) {
    abstract fun draw()

    abstract fun click()

    fun changeSize(userSize: UserSize) {
        println("Size changed from ${this.userSize.javaClass.simpleName} to ${userSize.javaClass.simpleName}")
        this.userSize = userSize
    }
}

public class Canvas {
    init {
        smallButtonExample()
        imageButtonExample()
        radioButtonExample()
        checkboxButtonExample()
    }

    private fun smallButtonExample() {
        val small = Small()
        val smallDropDownButton = DropdownButton(userSize = small, sizeOfItemsForDropped = 4)
        smallDropDownButton.draw()
        smallDropDownButton.click()
        smallDropDownButton.click()
        val large = Large()
        smallDropDownButton.changeSize(large)
        println("====================================")
    }

    private fun imageButtonExample() {
        val big = Large()
        val bigImageButton = ImageButton(big)
        bigImageButton.draw()
        bigImageButton.click()
        val medium = Medium()
        bigImageButton.changeSize(medium)
        println("====================================")
    }

    private fun radioButtonExample() {
        val medium = Medium()
        val mediumRadioButton = RadioButton(medium, false)
        mediumRadioButton.draw()
        mediumRadioButton.click()
        println("====================================")
    }

    private fun checkboxButtonExample() {
        val medium = Medium()
        val mediumCheckButton = CheckboxButton(medium, false)
        mediumCheckButton.draw()
        mediumCheckButton.click()
        println("====================================")
    }

}

fun main() {
    Canvas()
}
