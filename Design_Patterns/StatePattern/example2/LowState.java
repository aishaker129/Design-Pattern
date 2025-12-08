package Design_Patterns.StatePattern.example2;

public class LowState implements FanState{
    public void handleSpeed(Fan fan){
        System.out.println("Fan Speed is low");
        fan.setState(new HighState());
    }
}
