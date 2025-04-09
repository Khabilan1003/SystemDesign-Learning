package Split;

import User.User;

public class Split {
    private User user;
    private double amount;
    private boolean isPaid;

    public Split() {}

    public Split(User user, double amount, boolean isPaid) {
        this.user = user;
        this.amount = amount;
        this.isPaid = isPaid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean getIsPaid() {
        return this.isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
