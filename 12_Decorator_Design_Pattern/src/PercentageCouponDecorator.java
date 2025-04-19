public class PercentageCouponDecorator extends CouponDecorator{
    Product product;
    Double discountPercentage;

    public PercentageCouponDecorator(Product product, Double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    public Double getPrice() {
        return product.getPrice() - (product.getPrice() * discountPercentage) / 100;
    }
}
