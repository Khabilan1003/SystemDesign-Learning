package amountWithdrawl;

import object.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {

        int required =  remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductTwoThousandNotes(required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required-atm.getNoOfFiveHundredNotes()) * 500;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }

}
