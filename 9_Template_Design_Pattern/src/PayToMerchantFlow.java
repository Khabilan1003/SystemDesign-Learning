public class PayToMerchantFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic For Pay to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fee Logic For Pay to merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic For Pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount Logic For Pay to merchant");
    }
}
