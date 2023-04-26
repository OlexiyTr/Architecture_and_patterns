package task_8_3_2_bridge_refactoring.task_3_2

class RadioButton(private val userSize: UserSize, private val initIsCheckedValue: Boolean) : Button(userSize) {
    private var isChecked = initIsCheckedValue

    private val checkedString = if (isChecked) "checked" else "unchecked"

    private val nameOfButton = "${userSize.getSelfSize()} ${this.javaClass.simpleName}"
    override fun draw() {
        println("I'm $checkedString $nameOfButton")
    }

    override fun click() {
        isChecked = !isChecked
        println("$nameOfButton is checked = $isChecked")
    }
}
