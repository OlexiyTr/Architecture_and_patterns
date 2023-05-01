package task_3_1_state

fun main() {
    val mediaPlayer = MediaPlayer()
    mediaPlayer.play()
    mediaPlayer.pause()
    mediaPlayer.pause()
    mediaPlayer.play()
    mediaPlayer.play()
}

abstract class MediaPlayerState(protected val player: MediaPlayer) {

    abstract fun play()
    abstract fun pause()

}