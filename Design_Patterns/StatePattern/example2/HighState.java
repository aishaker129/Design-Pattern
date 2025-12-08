package Design_Patterns.StatePattern.example2;

public class HighState implements FanState{
    public void handleSpeed(Fan fan){
        System.out.println("Fan state is high...");
        fan.setState(new OffState());
    }
}
