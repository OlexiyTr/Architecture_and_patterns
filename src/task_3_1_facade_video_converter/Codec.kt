package task_3_1_facade_video_converter

interface Codec {
    fun type(): String
}

class MPEG4CompressionCodec : Codec {
    override fun type(): String { return "mp4" }

}
class OggCompressionCodec : Codec {
    override fun type(): String { return "odd" }

}

class CodecFactory {
    companion object {
        fun extract(file: VideoFile): Codec {
            val type = file.getCodecType()
            return if (type == "mp4"){
                MPEG4CompressionCodec()
            } else {
                OggCompressionCodec()
            }
        }
    }
}