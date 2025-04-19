public class Main {
    public static void main(String[] args) {
        PaymentFlow frnd = new PayToFriendFlow();
        PaymentFlow merchant = new PayToMerchantFlow();

        frnd.sendMoney();
        merchant.sendMoney();
    }
}