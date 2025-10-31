package Design_Patterns.Strategy;

public class CarStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " by car.");
        System.out.println("Cost: Less cost");
        System.out.println("Time: More time");
        System.out.println("Convenience: High");
    }
    
}
