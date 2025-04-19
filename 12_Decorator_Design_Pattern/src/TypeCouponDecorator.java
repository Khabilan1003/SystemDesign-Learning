import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator{
    Product product;
    Double discountPercentage;

    static List<ProductType> eligibleProductType;
    static  {
        eligibleProductType = new ArrayList<>();
        eligibleProductType.add(ProductType.ELECTRONIC);
        eligibleProductType.add(ProductType.FURNITURE);
    }

    public TypeCouponDecorator(Product product , Double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }


    @Override
    public Double getPrice() {
        for(ProductType productType: eligibleProductType) {
            if(productType.equals(product.getProductType())) {
                return product.getPrice() - (product.getPrice() * discountPercentage) / 100;
            }
        }
        return product.getPrice();
    }
}
