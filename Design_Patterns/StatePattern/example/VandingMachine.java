package Design_Patterns.StatePattern.example;

interface VendingState{
    void handle(VandingMachine machine);
}

public class VandingMachine {
    private VendingState state;    

    VandingMachine(){
        this.state = new ReadyState();
    }

    public void setState(VendingState state){
        this.state = state;
    }
    public void request(){
        state.handle(this);
    }
}

class ReadyState implements VendingState{

    @Override
    public void handle(VandingMachine machine) {
        System.out.println("Process is started,waiting for product selection...");
        machine.setState(new SelectState());
    }
    
}

class SelectState implements VendingState{
    public void handle(VandingMachine machine){
        System.out.println("Product selected.waiting for Processing state...");
        machine.setState(new ProcessingState());
    }
}

class ProcessingState implements VendingState{
    public void handle(VandingMachine machine){
        System.out.println("Processing payment...");
        machine.setState(new DispenseState());
    }
}

class DispenseState implements VendingState{
    public void handle(VandingMachine machine){
        System.out.println("Dispense product...");
        machine.setState(new OutOfStockState());
    }
}

class OutOfStockState implements VendingState{
    public void handle(VandingMachine machine){
        System.out.println("Product out of stock....");
    }
}

