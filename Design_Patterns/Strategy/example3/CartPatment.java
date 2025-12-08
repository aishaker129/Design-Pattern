package Design_Patterns.Strategy.example3;

public class CartPatment implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("Payment with Cart and the ammount is: "+amount);
    }
    
}
