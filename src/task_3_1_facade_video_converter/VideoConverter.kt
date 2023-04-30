package task_3_1_facade_video_converter

class VideoConverter {
    fun convert(file: VideoFile): VideoFile {
        val sourceCodec = CodecFactory.extract(file)
        val destinationCodec: Codec = MPEG4CompressionCodec()
        val buffer = BitrateReader.read(file, sourceCodec)
        val videoFileConverted = BitrateReader.convert(buffer, file.getName(), destinationCodec)
        val audioMixer = AudioMixer()
        audioMixer.fix(videoFileConverted, file.getAudioBuffer()!!)
        return videoFileConverted
    }
}
