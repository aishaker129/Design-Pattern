package Design_Patterns.StatePattern.example2;

public class Fan {
    private FanState fanState;

    Fan(){
        fanState = new OffState();
    }

    public void setState(FanState fanState){
        this.fanState = fanState;
    }

    public void pressRegulator(){
        fanState.handleSpeed(this);
    }
}
