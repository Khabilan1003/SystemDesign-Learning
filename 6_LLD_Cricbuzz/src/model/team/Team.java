package model.team;

import model.player.Player;
import model.player.PlayerBattingController;
import model.player.PlayerBowlingController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Team {
    private String teamName;
    private Queue<Player> playing11;
    private List<Player> bench;
    private PlayerBattingController playerBattingController;
    private PlayerBowlingController playerBowlingController;
    private Boolean isWinner;

    public Team(String teamName, Queue<Player> playing11 , List<Player> bench , List<Player> bowlers) {
        this.teamName = teamName;
        this.playing11 = new LinkedList<>();
        this.playing11.addAll(playing11);
        this.bench = new ArrayList<>();
        this.bench.addAll(bench);
        this.playerBattingController = new PlayerBattingController(playing11);
        this.playerBowlingController = new PlayerBowlingController(bowlers);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Queue<Player> getPlaying11() {
        return playing11;
    }

    public void setPlaying11(Queue<Player> playing11) {
        this.playing11 = playing11;
    }

    public List<Player> getBench() {
        return bench;
    }

    public void setBench(List<Player> bench) {
        this.bench = bench;
    }

    public PlayerBattingController getPlayerBattingController() {
        return playerBattingController;
    }

    public void setPlayerBattingController(PlayerBattingController playerBattingController) {
        this.playerBattingController = playerBattingController;
    }

    public PlayerBowlingController getPlayerBowlingController() {
        return playerBowlingController;
    }

    public void setPlayerBowlingController(PlayerBowlingController playerBowlingController) {
        this.playerBowlingController = playerBowlingController;
    }

    public Boolean getWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        isWinner = winner;
    }

    public void chooseNextBatsMan() throws Exception{
        playerBattingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler){
        playerBowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public Player getStriker() {
        return playerBattingController.getStriker();
    }

    public Player getNonStriker() {
        return playerBattingController.getNonStriker();
    }

    public void setStriker(Player player) {
        playerBattingController.setStriker(player);
    }

    public void setNonStriker(Player player) {
        playerBattingController.setNonStriker(player);
    }

    public Player getCurrentBowler() {
        return playerBowlingController.getCurrentBowler();
    }

    public void printBattingScoreCard(){

        for(Player playerDetails : playing11){
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard(){

        for(Player playerDetails : playing11){
            if(playerDetails.getBowlingScoreCard().getTotalOversCount() > 0) {
                playerDetails.printBowlingScoreCard();
            }
        }
    }

    public int getTotalRuns(){
        int totalRun=0;
        for (Player player :  playing11){

            totalRun+=player.getBattingScoreCard().getTotalRuns();
        }
        return totalRun;
    }
}
