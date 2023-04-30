package task_2_2_proxy

import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JLabel
import javax.swing.JOptionPane

class ImageFile(path: String) : DisplayObject {

    private var bufferedImage: BufferedImage? = null

    init {
        bufferedImage = load(path)
    }

    override fun display() {
        println("Displaying image.")
        val icon = ImageIcon(bufferedImage)
        val label = JLabel(icon)
        JOptionPane.showMessageDialog(null, label)
    }

    private fun load(path: String): BufferedImage? {
        println("Loading image $path ...")
        bufferedImage = null
        try {
            bufferedImage = ImageIO.read(File(path))
        } catch (e: IOException) {
            e.printStackTrace();
        }

        return bufferedImage
    }
}