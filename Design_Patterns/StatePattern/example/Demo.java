package Design_Patterns.StatePattern.example;

public class Demo {
    public static void main(String[] args) {
        VandingMachine machine = new VandingMachine();
        machine.request();
        machine.request();
        machine.request();
        machine.request();
        machine.request();
    }
}
