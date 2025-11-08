package Design_Patterns.StatePattern.exaple2;

public class TrafficDemo {
    public static void main(String[] args) {
        TrafficControll trafficControll = new TrafficControll();

        trafficControll.request();
        trafficControll.request();
        trafficControll.request();
    }
}
