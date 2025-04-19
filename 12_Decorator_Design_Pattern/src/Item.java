public class Item extends Product{
    public Item(String name, Double price , ProductType productType) {
        super(name , price, productType);
    }

    @Override
    public Double getPrice() {
        return this.getOriginalPrice();
    }
}
