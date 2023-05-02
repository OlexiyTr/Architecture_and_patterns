package task_3_1_observer

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

fun main() {
    val fileReader = FileReaderNative("input01.txt")
    fileReader.read()
}

class FileReaderNative(private val filePath: String) {
    init {
        val thread = Thread { read() }
        thread.start()
    }

    fun read() {
        try {
            BufferedReader(FileReader(filePath)).use { reader -> reader.lines().forEach { line: String? -> onLineRead(line) } }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun onLineRead(line: String?) {
        println(line)
    }
}