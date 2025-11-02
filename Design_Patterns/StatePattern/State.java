public abstract class State{
    protected Phone phone;
    public State(Phone phone){
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onOffOn();
}

class Phone{
    private State state;

    public Phone(){
        state = new OffState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public String lock(){
        return "Locking phone and turning off the screen";
    }

    public String home(){
        return "Going to home-screen";
    }

    public String unlock(){
        return "Unlocking the phone";
    }

    public String turnOn(){
        return "Turning on. device still locked..";
    }

    public String clickHome(){
        return state.onHome();
    }

    public String clickPower(){
        return state.onOffOn();
    }
}

class LockState extends State{
    public LockState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
    
}

class OffState extends State{

    
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockState(phone));
        return phone.turnOn();
    }
    
}

class ReadyState extends State{

    public ReadyState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome() {
       return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
    
}