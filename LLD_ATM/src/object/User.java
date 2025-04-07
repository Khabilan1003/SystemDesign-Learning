package object;

import object.Card;

public class User {
    Card card;
    UserBankAccount bankAccount;

    public User(Card card, UserBankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public User() {
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public UserBankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
