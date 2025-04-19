import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Double totalPrice() {
        AtomicReference<Double> totalAmount = new AtomicReference<>(0.0);

        productList.stream().forEach(product -> totalAmount.updateAndGet(v -> v + product.getPrice()));

        return totalAmount.get();
    }
}
