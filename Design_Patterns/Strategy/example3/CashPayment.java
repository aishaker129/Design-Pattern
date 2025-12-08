package Design_Patterns.Strategy.example3;
public class CashPayment implements Payment{
    public void pay(int ammount){
        System.out.println("Payment in Cash and the amount is: "+ammount);
    }
}
