package model.player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    private Queue<Player> yetToPlay;
    private Player striker;
    private Player nonStriker;

    public PlayerBattingController() {
    }

    public PlayerBattingController(Queue<Player> yetToPlay) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(yetToPlay);
    }

    public void getNextPlayer() throws Exception {

        if (yetToPlay.isEmpty()) {
            throw new Exception();
        }

        if (striker == null) {
            striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

    public Player getStriker() {
        return striker;
    }

    public void setStriker(Player striker) {
        this.striker = striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(Player nonStriker) {
        this.nonStriker = nonStriker;
    }
}
