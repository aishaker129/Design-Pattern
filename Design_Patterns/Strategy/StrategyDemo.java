package Design_Patterns.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        // Using Car Strategy
        traveler.setTravelStrategy(new CarStrategy());
        traveler.travel("Dhaka");

        System.out.println();

        // Using Train Strategy
        traveler.setTravelStrategy(new TrainStrategy());
        traveler.travel("Sylhet");

        System.out.println();

        // Using Plain Strategy
        traveler.setTravelStrategy(new PlainStrategy());
        traveler.travel("Chittagong");
    }
}
