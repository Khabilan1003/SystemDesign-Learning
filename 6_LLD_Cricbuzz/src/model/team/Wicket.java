package model.team;

import model.ball.BallDetails;
import model.over.OverDetails;
import model.player.Player;

public class Wicket {
    private WicketType wicketType;
    private Player takenBy;
    private OverDetails overDetail;
    private BallDetails ballDetail;

    public Wicket() {}

    public Wicket(WicketType wicketType, Player takenBy, OverDetails overDetail, BallDetails ballDetail) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }

    public Player getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(Player takenBy) {
        this.takenBy = takenBy;
    }

    public OverDetails getOverDetail() {
        return overDetail;
    }

    public void setOverDetail(OverDetails overDetail) {
        this.overDetail = overDetail;
    }

    public BallDetails getBallDetail() {
        return ballDetail;
    }

    public void setBallDetail(BallDetails ballDetail) {
        this.ballDetail = ballDetail;
    }
}
