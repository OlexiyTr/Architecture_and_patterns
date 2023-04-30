package task_3_1_facade_video_converter

fun main() {
    VideoConverterMain()
}
class VideoConverterMain {
    init {
        val fileName = "youtubevideo.ogg"
        val videoFile = VideoFile(fileName,
                Buffer("Byte buffer of video"),
                Buffer("Byte buffer of audio"))
        videoFile.play(MPEG4CompressionCodec())
        println("\n======= VideoConversionFacade: conversion started. =======")
        val converter = VideoConverter()
        val converted = converter.convert(videoFile)
        converted.play(MPEG4CompressionCodec())
        println("====== VideoConversionFacade: conversion completed =======\n")
    }
}