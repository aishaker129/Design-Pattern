package Design_Patterns.Facad_Pattern.example;

public class Broker {
    private ACBus acBus;
    private NonAcBus nonAcBus;

    public Broker() {
        acBus = new ACBus("Volvo AC", 1500);
        nonAcBus = new NonAcBus("Tata Non-AC", 800);
        
    }

    public void bookAcBus(){
        acBus.book();
    }

    public void bookNonAcBus(){
        nonAcBus.book();
    }
}
