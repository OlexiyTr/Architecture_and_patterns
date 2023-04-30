package task_3_1_facade_video_converter

class BitrateReader {
    companion object {
        fun read(file: VideoFile, codec: Codec) : Buffer {
            println("Codec of file:  " + codec.type())
            println("BitrateReader: reading file...")
            println("BitrateReader: decode video...")
            return file.getVideoBuffer()
        }

        fun convert(buffer: Buffer?, name: String, codec: Codec): VideoFile {
            System.out.printf("Conversion file to format '%s' \n", codec.type())
            println("BitrateReader: encode video...")
            println("BitrateReader: writing file...")
            val newName = name + "." + codec.type()
            return VideoFile(newName, buffer!!)
        }
    }

}