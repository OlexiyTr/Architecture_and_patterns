package task_3_2_state

class PlayingState(player: MediaPlayer) : State(player,"playing") {
    override fun play() {}

    override fun pause() {
        super.player.changeState(PausedState(player))
    }

    override fun next() {
        super.player.next()
    }

    override fun prev() {
        super.player.prev()
    }

    override fun stop() {}

}