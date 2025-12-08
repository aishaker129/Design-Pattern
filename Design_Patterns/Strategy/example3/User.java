package Design_Patterns.Strategy.example3;

public class User {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new BkashPayment());
        cart.checkout(1000);

        ShoppingCart cart1 = new ShoppingCart(new CashPayment());
        cart1.checkout(500);

        ShoppingCart cart2 = new ShoppingCart(new CartPatment());
        cart2.checkout(2000);
    }
}
