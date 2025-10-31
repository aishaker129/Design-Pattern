package Design_Patterns.Strategy;

public class PlainStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " on Plain.");
        System.out.println("Cost: High cost");
        System.out.println("Time: Less time");
        System.out.println("Convenience: Low");
    }
    
}
