package Design_Patterns.Strategy.example3;

public class ShoppingCart {
    private Payment payment;

    ShoppingCart(Payment payment){
        this.payment = payment;
    }

    public void checkout(int ammount){
        payment.pay(ammount);
    }
}
