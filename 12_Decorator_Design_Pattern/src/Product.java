public abstract class Product {
    private String name;
    private Double originalPrice;
    private ProductType productType;

    public Product() {}

    public Product(String name , Double originalPrice, ProductType productType) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }

    public abstract Double getPrice();

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }
}
