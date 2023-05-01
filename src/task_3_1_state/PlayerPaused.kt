package task_3_1_state

internal class PlayerPaused(player: MediaPlayer) : MediaPlayerState(player) {
    override fun play() {
        super.player.changeState(state = PlayerPlaying(player), icon = Icon.PAUSE)
        println("Video playing, icon set to pause button")
    }

    override fun pause() {}

}