package Design_Patterns.Visitor_Pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateTotal(Visitor visitor){
        double sum = 0;
        for(Product product: products){
            sum +=product.accept(visitor);
        }
        return sum;
    }
}
