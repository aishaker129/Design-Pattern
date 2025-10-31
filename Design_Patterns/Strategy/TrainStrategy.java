package Design_Patterns.Strategy;

public class TrainStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " by train.");
        System.out.println("Cost: Medium cost");
        System.out.println("Time: Average time");
        System.out.println("Convenience: Medium");
    }
    
}
