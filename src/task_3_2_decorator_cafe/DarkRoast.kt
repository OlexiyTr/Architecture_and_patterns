package task_3_2_decorator_cafe

class DarkRoast(private val desc: String) : Beverage() {
    override fun description(): String {
        return desc
    }

}