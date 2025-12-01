
public class TaskOne {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.registerBarista(new Barista("Alice"));
        manager.registerBarista(new Barista("Bob"));
        manager.registerBarista(new Barista("Charlie"));

        Customer c1 = new Customer("John", manager);
        Customer c2 = new Customer("Emma", manager);
        Customer c3 = new Customer("Mike", manager);

        c1.orderDrink("Cappuccino", "Large", "Extra Short");
        c2.orderDrink("Latte", "Medium", "Almond Milk");
        c1.orderDrink("Espresso", "Small", "No Foam");
        c3.orderDrink("Americano", "Large", "Extra Hot");
    }
}
