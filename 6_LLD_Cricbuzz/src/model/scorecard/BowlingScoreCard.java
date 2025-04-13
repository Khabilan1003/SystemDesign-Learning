package model.scorecard;

public class BowlingScoreCard {
    private int totalOversCount;
    private int runsGiven;
    private int wicketsTaken;
    private int noBallCount;
    private int wideBallCount;
    private double economyRate;

    public BowlingScoreCard() {
        this.totalOversCount = 0;
        this.runsGiven = 0;
        this.wicketsTaken = 0;
        this.noBallCount = 0;
        this.wideBallCount = 0;
        this.economyRate = 0;

    }

    public BowlingScoreCard(int totalOversCount, int runsGiven, int wicketsTaken, int noBallCount, int wideBallCount, double economyRate) {
        this.totalOversCount = totalOversCount;
        this.runsGiven = runsGiven;
        this.wicketsTaken = wicketsTaken;
        this.noBallCount = noBallCount;
        this.wideBallCount = wideBallCount;
        this.economyRate = economyRate;
    }

    public int getTotalOversCount() {
        return totalOversCount;
    }

    public void setTotalOversCount(int totalOversCount) {
        this.totalOversCount = totalOversCount;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public int getNoBallCount() {
        return noBallCount;
    }

    public void setNoBallCount(int noBallCount) {
        this.noBallCount = noBallCount;
    }

    public int getWideBallCount() {
        return wideBallCount;
    }

    public void setWideBallCount(int wideBallCount) {
        this.wideBallCount = wideBallCount;
    }

    public double getEconomyRate() {
        return economyRate;
    }

    public void setEconomyRate(double economyRate) {
        this.economyRate = economyRate;
    }
}
