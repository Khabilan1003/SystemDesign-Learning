package model.scorecard;

import model.team.Wicket;

public class BattingScoreCard {
    private int totalRuns;
    private int totalBallsPlayed;
    private int totalFours;
    private int totalSix;
    private double strikeRate;
    private Wicket wicketDetails;

    public BattingScoreCard() {
        this.totalRuns = 0;
        this.totalBallsPlayed = 0;
        this.totalFours = 0;
        this.totalSix = 0;
        this.strikeRate = 0;
        this.wicketDetails = null;

    }

    public BattingScoreCard(int totalRuns, int totalBallsPlayed, int totalFours, int totalSix, double strikeRate, Wicket wicketDetails) {
        this.totalRuns = totalRuns;
        this.totalBallsPlayed = totalBallsPlayed;
        this.totalFours = totalFours;
        this.totalSix = totalSix;
        this.strikeRate = strikeRate;
        this.wicketDetails = wicketDetails;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public int getTotalSix() {
        return totalSix;
    }

    public void setTotalSix(int totalSix) {
        this.totalSix = totalSix;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public Wicket getWicketDetails() {
        return wicketDetails;
    }

    public void setWicketDetails(Wicket wicketDetails) {
        this.wicketDetails = wicketDetails;
    }
}
