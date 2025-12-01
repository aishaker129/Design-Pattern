import java.util.ArrayList;
import java.util.List;

interface OrderMediator {
    void placeOrder(Customer customer, String drinkType, String size, String addons);
    void registerBarista(Barista b);
}

class OrderManager implements OrderMediator {
    private List<Barista> baristas = new ArrayList<>();
    private int index = 0;

    @Override
    public void registerBarista(Barista b) {
        baristas.add(b);
    }

    @Override
    public void placeOrder(Customer customer, String drinkType, String size, String addons) {

        
        Drink drink = DrinkFactory.getDrink(drinkType);

        Order order = new Order(customer.getName(), drink, size, addons);

        
        Barista assigned = baristas.get(index);
        index = (index + 1) % baristas.size();

        assigned.prepare(order);
    }
}

class Barista{
    private String name;

    public Barista(String name) {
        this.name = name;
    }

    public void prepare(Order order) {
        System.out.println(name + " preparing order...");
        order.getDrink().serve(order.getCustomer(), order.getSize(), order.getAddons(),order.calculatePrice());
    }
}

class Customer{
    private String name;
    private OrderMediator mediator;

    public Customer(String name, OrderMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void orderDrink(String type, String size, String addons) {
        mediator.placeOrder(this, type, size, addons);
    }
}

public class Order {
    private String customer;
    private Drink drink;
    private String size;
    private String addons;

    public Order(String customer, Drink drink, String size, String addons) {
        this.customer = customer;
        this.drink = drink;
        this.size = size;
        this.addons = addons;
    }

    public String getCustomer() { return customer; }
    public Drink getDrink() { return drink; }
    public String getSize() { return size; }
    public String getAddons() { return addons; }
    public double calculatePrice(){
        double price = drink.getBasePrice();
        switch (size.toLowerCase()) {
            case "small":
                price *=1.0;
                break;
            case "medium":
                price *=1.25;
                break;
            case "large":
                price *=1.5;
                break;
            default:
                price *=1.0;
                break;
        }
        return price;
    }
}
