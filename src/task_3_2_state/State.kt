package task_3_2_state

abstract class State(protected val player: MediaPlayer, val name: String) {
    abstract fun play()
    abstract fun pause()
    abstract fun next()
    abstract fun prev()
    abstract fun stop()
}