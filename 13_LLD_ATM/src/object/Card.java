package object;

public class Card {
    private int cardNumber;
    private int ccv;
    private int expiryDate;
    private String holderName;
    private int pinNumber;
    private UserBankAccount userBankAccount;

    public Card() {
    }

    public Card(int cardNumber, int ccv, int expiryDate, String holderName, int pinNumber, UserBankAccount userBankAccount) {
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.expiryDate = expiryDate;
        this.holderName = holderName;
        this.pinNumber = pinNumber;
        this.userBankAccount = userBankAccount;
    }

    public boolean isCorrentPINEntered(int number) {
        if(this.pinNumber == number) return true;

        return false;
    }

    public int getBankBalance() {
        return userBankAccount.getBalance();
    }

    public void setBankBalance(int balance) {
        userBankAccount.setBalance(balance);
    }

    public void deductBankBalance(int amount) {
        try {
            userBankAccount.withdrawlBalance(amount);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public UserBankAccount getUserBankAccount() {
        return userBankAccount;
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
