public class PayToFriendFlow extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate Logic For Pay to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fee Logic For Pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic For Pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount Logic For Pay to friend");
    }
}
