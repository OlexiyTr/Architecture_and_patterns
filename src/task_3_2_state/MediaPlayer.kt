package task_3_2_state

fun main(args: Array<String>) {
    val mediaPlayer = MediaPlayer()

    mediaPlayer.addTrack("track1")
    mediaPlayer.addTrack("track2")
    mediaPlayer.addTrack("track3")
    mediaPlayer.addTrack("track4")
    mediaPlayer.addTrack("track5")
    mediaPlayer.addTrack("track6")

    mediaPlayer.play()
    mediaPlayer.pause()
    mediaPlayer.play()

    mediaPlayer.next()
    mediaPlayer.next()

    mediaPlayer.prev()
    mediaPlayer.stop()
    mediaPlayer.play()
    mediaPlayer.next()
    mediaPlayer.stop()
}

class MediaPlayer {
    private val tracks: MutableList<String> = ArrayList()
    private var state: State = PausedState(this)
    private var currentTrackNum = 0
    private val currentTrack: String
        get() = tracks[currentTrackNum]

    fun addTrack(track: String) {
        tracks.add(track)
    }

    fun play() {
        state.play()
        showCurrentState()
    }

    fun pause() {
        state.pause()
        showCurrentState()
    }

    fun next() {
        if (currentTrackNum + 1 >= tracks.size - 1) {
            currentTrackNum = tracks.size - 1
        } else {
            currentTrackNum += 1
        }
        showCurrentState()
    }

    fun prev() {
        if (currentTrackNum - 1 <= 0) {
            currentTrackNum = 0
        } else {
            currentTrackNum -= 1
        }
        showCurrentState()
    }

    fun stop() {
        currentTrackNum = 0
        state.pause()
        showCurrentState()
    }

    fun changeState(state: State) {
        this.state = state
    }

    private fun showCurrentState() {
        println("Player is ${state.name}, current track is $currentTrack (number is ${currentTrackNum})")
    }

}