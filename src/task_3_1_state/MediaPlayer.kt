package task_3_1_state

class MediaPlayer {

    private var icon = Icon.PAUSE
    private var state: MediaPlayerState = PlayerPaused(this)

    fun play() {
        state.play()
    }

    fun pause() {
        state.pause()
    }

    internal fun changeState(state: MediaPlayerState, icon: Icon) {
        this.state = state
        this.icon = icon
    }

}