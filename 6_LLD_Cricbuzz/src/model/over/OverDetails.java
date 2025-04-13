package model.over;

import model.ball.BallDetails;
import model.ball.BallType;
import model.player.Player;
import model.team.Team;

import java.util.ArrayList;
import java.util.List;

public class OverDetails {

    private int overNumber;
    private List<BallDetails> balls;
    private int extraBallsCount;
    private Player bowledBy;

    public OverDetails(int overNumber, Player bowledBy){
        this.overNumber = overNumber;
        balls = new ArrayList<>();
        this.bowledBy = bowledBy;
    }

    public int getOverNumber() {
        return overNumber;
    }

    public void setOverNumber(int overNumber) {
        this.overNumber = overNumber;
    }

    public List<BallDetails> getBalls() {
        return balls;
    }

    public void setBalls(List<BallDetails> balls) {
        this.balls = balls;
    }

    public int getExtraBallsCount() {
        return extraBallsCount;
    }

    public void setExtraBallsCount(int extraBallsCount) {
        this.extraBallsCount = extraBallsCount;
    }

    public Player getBowledBy() {
        return bowledBy;
    }

    public void setBowledBy(Player bowledBy) {
        this.bowledBy = bowledBy;
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) throws Exception{

        int ballCount = 1;
        while(ballCount<=6){

            BallDetails ball = new BallDetails(ballCount);
            ball.startBallDelivery(battingTeam, bowlingTeam, this);
            if(ball.getBallType() == BallType.NORMAL) {
                balls.add(ball);
                ballCount++;
                if(ball.getWicket() != null) {
                    battingTeam.chooseNextBatsMan();
                }

                if( runsToWin != -1 && battingTeam.getTotalRuns() >= runsToWin){
                    battingTeam.setWinner(true);
                    return true;
                }
            }
            else {
                extraBallsCount++;
            }
        }

        return false;
    }

}

