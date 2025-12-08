package Design_Patterns.StatePattern.example2;

public class OffState implements FanState {
    @Override
    public void handleSpeed(Fan fan) {
        System.out.println("Fan is off..");
        fan.setState(new LowState());
    }
}
