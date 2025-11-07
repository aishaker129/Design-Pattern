package Design_Patterns.Strategy.example2;

public class CarDemo {
    public static void main(String[] args) {
        Men rich = new RichMen();
        Men poor = new PoorMen();

        System.out.print("Rich Men: ");
        rich.tryToBuy();
        System.out.print("Poor Men: ");
        poor.tryToBuy();
    }
}
