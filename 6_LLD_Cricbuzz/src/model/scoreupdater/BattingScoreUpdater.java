package model.scoreupdater;

import model.ball.BallDetails;
import model.ball.RunType;

public class BattingScoreUpdater implements ScoreUpdaterObserver{
    @Override
    public void update(BallDetails ballDetails) {
        int run = 0;
        int totalFours = ballDetails.getPlayedBy().getBattingScoreCard().getTotalFours();
        int totalSixs = ballDetails.getPlayedBy().getBattingScoreCard().getTotalSix();
        int totalRuns = ballDetails.getPlayedBy().getBattingScoreCard().getTotalRuns();
        int totalBallsPlayed = ballDetails.getPlayedBy().getBattingScoreCard().getTotalBallsPlayed();


        if (RunType.ONE == ballDetails.getRunType()) {
            run = 1;
        } else if (RunType.TWO == ballDetails.getRunType()) {
            run = 2;
        } else if (RunType.FOUR == ballDetails.getRunType()) {
            run = 4;
            ballDetails.getPlayedBy().getBattingScoreCard().setTotalFours(totalFours + 1);
        } else if (RunType.SIX == ballDetails.getRunType()) {
            run = 6;
            ballDetails.getPlayedBy().getBattingScoreCard().setTotalSix(totalSixs + 1);
        }
        ballDetails.getPlayedBy().getBattingScoreCard().setTotalRuns(totalRuns + run);

        ballDetails.getPlayedBy().getBattingScoreCard().setTotalBallsPlayed(totalBallsPlayed + 1);

        if (ballDetails.getWicket() != null) {
            ballDetails.getPlayedBy().getBattingScoreCard().setWicketDetails(ballDetails.getWicket());
        }
    }

}
