package task_3_1_state

internal class PlayerPlaying(player: MediaPlayer) : MediaPlayerState(player) {
    override fun play() {}

    override fun pause() {
        super.player.changeState(PlayerPaused(player), icon = Icon.PLAY)
        println("Video paused, icon set to play button")
    }
}