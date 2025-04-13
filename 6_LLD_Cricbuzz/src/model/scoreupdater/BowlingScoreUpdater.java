package model.scoreupdater;

import model.ball.BallDetails;
import model.ball.BallType;
import model.ball.RunType;

public class BowlingScoreUpdater implements ScoreUpdaterObserver{
    @Override
    public void update(BallDetails ballDetails) {
        if (ballDetails.getBallNumber() == 6 && ballDetails.getBallType() == BallType.NORMAL) {
            int totalOversCount = ballDetails.getBowledBy().getBowlingScoreCard().getTotalOversCount();
            ballDetails.getBowledBy().getBowlingScoreCard().setTotalOversCount(totalOversCount + 1);;
        }

        int runsGiven = ballDetails.getBowledBy().getBowlingScoreCard().getRunsGiven();
        if (RunType.ONE == ballDetails.getRunType()) {
            ballDetails.getBowledBy().getBowlingScoreCard().setRunsGiven(runsGiven + 1);
        } else if (RunType.TWO == ballDetails.getRunType()) {
            ballDetails.getBowledBy().getBowlingScoreCard().setRunsGiven(runsGiven + 2);
        } else if (RunType.FOUR == ballDetails.getRunType()) {
            ballDetails.getBowledBy().getBowlingScoreCard().setRunsGiven(runsGiven + 4);
        } else if (RunType.SIX == ballDetails.getRunType()) {
            ballDetails.getBowledBy().getBowlingScoreCard().setRunsGiven(runsGiven + 6);
        }

        int wicketsTaken = ballDetails.getBowledBy().getBowlingScoreCard().getWicketsTaken();
        if (ballDetails.getWicket() != null) {
            ballDetails.getBowledBy().getBowlingScoreCard().setWicketsTaken(wicketsTaken + 1);
        }

        int noBallCount = ballDetails.getBowledBy().getBowlingScoreCard().getNoBallCount();
        if (ballDetails.getBallType() == BallType.NOBALL) {
            ballDetails.getBowledBy().getBowlingScoreCard().setNoBallCount(noBallCount + 1);
        }

        int wideBallCount = ballDetails.getBowledBy().getBowlingScoreCard().getWideBallCount();
        if (ballDetails.getBallType() == BallType.WIDEBALL) {
            ballDetails.getBowledBy().getBowlingScoreCard().setWideBallCount(wideBallCount + 1);
        }
    }
}
