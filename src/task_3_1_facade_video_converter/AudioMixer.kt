package task_3_1_facade_video_converter

class AudioMixer {
    fun fix(file: VideoFile, audioBuffer: Buffer) {
        println("AudioMixer: fixing audio...");
        file.setAudioBuffer(audioBuffer)
    }
}