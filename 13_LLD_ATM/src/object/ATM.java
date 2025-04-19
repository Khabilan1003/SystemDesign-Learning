package object;

import states.ATMState;
import states.IdleState;

public class ATM {
    private static ATM atm = new ATM();
    private ATMState currentATMState = new IdleState();
    private int atmBalance;
    private int noOfTwoThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;

    private ATM() {}

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public static ATM getAtm() {
        return atm;
    }

    public static void setAtm(ATM atm) {
        ATM.atm = atm;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }
}
