package Expense;

import Split.*;
import User.User;
import java.util.List;
import java.util.Objects;

public class Expense {
    private String expenseId;
    private String expenseName;
    private String expenseDescription;
    private User paidBy;
    private final double totalAmount;
    private List<Split> splits;
    private SplitType splitType;

    public Expense(String expenseId, String expenseName, String expenseDescription, User paidBy, List<Split> splits, SplitType splitType, double totalAmount) {
        this.expenseId = expenseId;
        this.expenseName = expenseName;
        this.expenseDescription = expenseDescription;
        this.paidBy = paidBy;
        this.splits = splits;
        this.splitType = splitType;
        this.totalAmount = totalAmount;
    }

    public void validateExpense() throws Exception {
        Objects.requireNonNull(SplitTypeFactory.getSplitType(splitType)).isValidSplitType(splits, totalAmount);
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}