package task_3_1_facade_video_converter

class VideoFile(name: String, private var videoBuffer: Buffer, private var audioBuffer: Buffer?) {
    private var name: String = ""
    private var codecType: String = ""

    constructor(name: String, videoBuffer: Buffer) : this(name, videoBuffer, null)

    init {
        if (!name.contains(".")) {
            throw RuntimeException("File format is undefined!")
        }
        this.name = name.substring(0, name.lastIndexOf("."))
        this.codecType = name.substring(name.lastIndexOf(".") + 1)
    }

    fun getName(): String {
        return name
    }

    fun setAudioBuffer(audioBuffer: Buffer) {
        this.audioBuffer = audioBuffer
    }

    fun getAudioBuffer(): Buffer? {
        return this.audioBuffer
    }

    fun getVideoBuffer(): Buffer {
        return this.videoBuffer
    }


    fun getCodecType(): String {
        return codecType
    }

    fun play(codec: Codec) {
        if (codec.type() == codecType) {
            println("Video data:" + videoBuffer.data)
            if (audioBuffer == null) {
                println("Audio data is inaccessible!")
                return
            }
            println("Audio data:" + audioBuffer!!.data)
        } else {
            println("Failed to play file ${name}! Codec $codecType required! Use correct codec!")
        }
    }
}