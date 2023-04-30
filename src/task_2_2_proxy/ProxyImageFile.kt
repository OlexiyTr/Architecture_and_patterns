package task_2_2_proxy

class ProxyImageFile(private val path: String) : DisplayObject {
    private var real: ImageFile? = null
    override fun display() {
        real?.display() ?: run {
            real = ImageFile(this.path)
        }
    }
}