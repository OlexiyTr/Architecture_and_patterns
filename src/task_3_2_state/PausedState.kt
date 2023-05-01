package task_3_2_state

class PausedState(player: MediaPlayer) : State(player, "paused") {
    override fun play() {
        super.player.changeState(PlayingState(player))
    }

    override fun pause() {}

    override fun next() {
        super.player.next()
    }

    override fun prev() {
        super.player.prev()

    }

    override fun stop() {}

}