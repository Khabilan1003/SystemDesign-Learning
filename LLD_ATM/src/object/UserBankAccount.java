package object;

public class UserBankAccount {
    private int balance;

    public UserBankAccount() {
    }

    public UserBankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawlBalance(int amount) throws Exception{
        if(this.balance < amount) throw new Exception("Amount given to withdrawl is greater than the balance.");

        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
