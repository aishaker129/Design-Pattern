package Design_Patterns.Facad_Pattern.example;

public class ACBus {
    private String busName;
    private int price;

    public ACBus(String busName, int price) {
        this.busName = busName;
        this.price = price;
    }
    public void book() {
        System.out.println("Booking A/C Bus: " + busName + " with price: " + price);
    }
}
