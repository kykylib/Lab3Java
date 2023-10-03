package liberman;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> listOfProducts = new ArrayList<>();

    public void addToCart(Product product){
        listOfProducts.add(product);
        System.out.println("Product has been added");
    }

    public void removeFromCart(Product product){
        listOfProducts.remove(product);
        System.out.println("Product has been removed");
    }

    public List<Product> getProducts() {
        return listOfProducts;
    }
}
