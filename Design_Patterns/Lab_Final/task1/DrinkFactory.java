import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

class Drink {
    private final String name;
    private final List<String> ingredients;
    private final double basePrice;

    public Drink(String name, List<String> ingredients, double basePrice) {
        this.name = name;
        this.ingredients = ingredients;
        this.basePrice = basePrice;
    }


    public void serve(String customer, String size, String addons,double price) {
        System.out.println(size + " " + name + " for " + customer 
            + " Addons: [" + addons 
            + "] and Total Price is: $" + price);
    }


    public double getBasePrice() {
        return basePrice;
    }
}

class DrinkFactory {
    private static final Map<String, Drink> drinkPool = new HashMap<>();

    public static Drink getDrink(String type) {
        if(!drinkPool.containsKey(type)) {
            if("Cappuccino".equals(type)) {
                drinkPool.put(type, new Drink(
                        "Cappuccino",
                        Arrays.asList("Espresso", "Steamed Milk", "Foam"),
                        5.0
                ));
            }
            else if("Latte".equals(type)) {
                drinkPool.put(type, new Drink(
                        "Latte",
                        Arrays.asList("Espresso", "Steamed Milk"),
                        4.5
                ));
            }
            else if("Espresso".equals(type)) {
                drinkPool.put(type, new Drink(
                        "Espresso",
                        Arrays.asList("Espresso"),
                        3.0
                ));
            }
            else if("Americano".equals(type)) {
                drinkPool.put(type, new Drink(
                        "Americano",
                        Arrays.asList("Espresso", "Hot Water"),
                        3.5
                ));
            }
            else {
                throw new IllegalArgumentException("Unknown drink type: " + type);
            }
        }
        return drinkPool.get(type);
    }
}
