package task_2_2_proxy

fun main() {
    val ig = ImageGallery()
    ig.main()
}
class ImageGallery {
    fun main() {
        val images: List<DisplayObject> = listOf(
                ProxyImageFile("image1.jpeg"),
                ProxyImageFile("image2.jpeg"),
                ProxyImageFile("image3.jpeg"),
                ProxyImageFile("image4.jpeg"),
                ProxyImageFile("image5.jpeg"),
                ProxyImageFile("image6.jpeg"),
                ProxyImageFile("image7.jpeg"),
                ProxyImageFile("image8.jpeg"),
                ProxyImageFile("image9.jpeg"),
                ProxyImageFile("image10.jpeg"),
        )

        images.forEach {
            it.display()
        }
    }


}


