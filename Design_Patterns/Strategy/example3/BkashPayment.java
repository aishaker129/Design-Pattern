package Design_Patterns.Strategy.example3;

public class BkashPayment implements Payment{
    public void pay(int ammount){
        System.out.println("Payment in Bkash and the amount is: "+ammount);
    }
}
