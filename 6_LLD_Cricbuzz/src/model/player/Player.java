package model.player;

import model.scorecard.BattingScoreCard;
import model.scorecard.BowlingScoreCard;

public class Player {
    private Person person;
    private PlayerType playerType;
    private BattingScoreCard battingScoreCard;
    private BowlingScoreCard bowlingScoreCard;

    public Player() {
    }

    public Player(Person person , PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
        this.battingScoreCard = new BattingScoreCard();
        this.bowlingScoreCard = new BowlingScoreCard();
    }

    public Player(Person person, PlayerType playerType, BattingScoreCard battingScoreCard, BowlingScoreCard bowlingScoreCard) {
        this.person = person;
        this.playerType = playerType;
        this.battingScoreCard = battingScoreCard;
        this.bowlingScoreCard = bowlingScoreCard;
    }

    public void printBattingScoreCard(){

        System.out.println("PlayerName: " + person.getName() + " -- totalRuns: " + battingScoreCard.getTotalRuns()
                + " -- totalBallsPlayed: " + battingScoreCard.getTotalBallsPlayed() + " -- 4s: " + battingScoreCard.getTotalFours()
                + " -- 6s: " + battingScoreCard.getTotalSix() + " -- outby: " +   ((battingScoreCard.getWicketDetails() != null) ? battingScoreCard.getWicketDetails().getTakenBy().person.getName() : "notout"));
    }

    public void printBowlingScoreCard(){
        System.out.println("PlayerName: " + person.getName() + " -- totalOversThrown: " + bowlingScoreCard.getTotalOversCount()
                + " -- totalRunsGiven: " + bowlingScoreCard.getRunsGiven() + " -- WicketsTaken: " + bowlingScoreCard.getWicketsTaken());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public void setBattingScoreCard(BattingScoreCard battingScoreCard) {
        this.battingScoreCard = battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }

    public void setBowlingScoreCard(BowlingScoreCard bowlingScoreCard) {
        this.bowlingScoreCard = bowlingScoreCard;
    }
}
