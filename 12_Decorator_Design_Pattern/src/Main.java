public class Main {
    public static void main(String[] args) {
        Product item1 = new Item("Fan" , 10000.0 , ProductType.ELECTRONIC);
        Product item2 = new Item("Dress" , 1500.0 , ProductType.CLOTHES);

        Product discountedItem1 = new TypeCouponDecorator(new PercentageCouponDecorator(item1, 5.0) , 10.0);
        Product discountedItem2 = new TypeCouponDecorator(new PercentageCouponDecorator(item2, 5.0) , 10.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(discountedItem1);
        cart.addProduct(discountedItem2);

        System.out.println("Before Discount :-");
        System.out.println("Item 1 : " + item1.getPrice());
        System.out.println("Item 2 : " + item2.getPrice());

        System.out.println("\nAfter Discount :-");
        System.out.println("Item 1 : " + discountedItem1.getPrice());
        System.out.println("Item 2 : " + discountedItem2.getPrice());
        System.out.println("Total Price : " + cart.totalPrice());
    }
}