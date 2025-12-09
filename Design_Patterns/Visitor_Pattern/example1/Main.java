package Design_Patterns.Visitor_Pattern.example1;

public class Main {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();

        cart.addProduct(new Book("Design Pattern", 400));
        cart.addProduct(new Phone("Motorola g85", 23000));
        cart.addProduct(new Book("Java", 200));
        
        Visitor discount = new DiscountCalculator();
        double total = cart.calculateTotal(discount);

        System.out.println("Total prise is :"+total);
    }
}
