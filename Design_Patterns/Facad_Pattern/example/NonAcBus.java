package Design_Patterns.Facad_Pattern.example;

public class NonAcBus {
    private String busName;
    private int price;

    public NonAcBus(String busName, int price) {
        this.busName = busName;
        this.price = price;
    }
    public void book() {
        System.out.println("Booking Non A/C Bus: " + busName + " with price: " + price);
    }
}
