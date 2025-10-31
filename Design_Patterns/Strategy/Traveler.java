package Design_Patterns.Strategy;

public class Traveler {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel(String destination) {
        if (travelStrategy == null) {
            System.out.println("No travel strategy set.");
        } else {
            travelStrategy.travel(destination);
        }
    }
}
