package Design_Patterns.StatePattern.exaple2;

interface Traffic{
    public void handle(TrafficControll traffic);
}

public class TrafficControll {
    private Traffic traffic;

    TrafficControll(){
        this.traffic = new ReadState();
    }

    public void setState(Traffic traffic){
        this.traffic = traffic;
    }

    public void request(){
        traffic.handle(this);
    }
}

class ReadState implements Traffic{
    public void handle(TrafficControll trafficControll){
        System.out.println("Red State: Vehicles stop....");
        trafficControll.setState(new GreenState());
    }
}

class GreenState implements Traffic{
    public void handle(TrafficControll trafficControll){
        System.out.println("Green State: Vehicles start to running...");
        trafficControll.setState(new YellowState());
    }
}

class YellowState implements Traffic{
    public void handle(TrafficControll trafficControll){
        System.out.println("Yellow State: Vehicles slow down and try to stop...");
        trafficControll.setState(new ReadState());
    }
}
