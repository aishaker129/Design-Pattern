public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee plainCoffee = new PlainCoffee();
        System.out.println("Description: "+plainCoffee.getDescription());
        System.out.println("Cost: $"+plainCoffee.getCost());

        // Milk Coffee
        Coffee milk = new MilkCoffee(new PlainCoffee());
        System.out.println("\nDescription: "+milk.getDescription());
        System.out.println("Cost: $"+milk.getCost());

        // suger coffee
        Coffee suger = new SugerCofee(new MilkCoffee(new PlainCoffee()));
        System.out.println("\nDescription: "+suger.getDescription());
        System.out.println("Cost: $"+suger.getCost());
    }
}
