public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // Template method
    public final void sendMoney() {
        validateRequest();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
