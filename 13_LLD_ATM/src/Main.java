import object.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ATM atm;
    static User user;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ATMRoom atmRoom = new ATMRoom();
        initialize();

        atm.printCurrentATMStatus();
        atm.getCurrentATMState().insertCard(atm, user.getCard());
        atm.getCurrentATMState().authenticatePin(atm, user.getCard(), 112211);
        atm.getCurrentATMState().selectOperation(atm, user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atm.getCurrentATMState().cashWithdrawal(atm, user.getCard(), 2700);
        atm.printCurrentATMStatus();
    }

    public static void initialize() {

        //create ATM
        atm = ATM.getAtm();
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        user = createUser();
    }

    public static User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    public static Card createCard(){
        Card card = new Card();
        card.setUserBankAccount(createBankAccount());
        card.setPinNumber(112211);
        return card;
    }

    public static UserBankAccount createBankAccount() {
        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.setBalance(3000);

        return bankAccount;
    }

}