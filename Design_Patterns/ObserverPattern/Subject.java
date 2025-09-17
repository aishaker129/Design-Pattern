import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObserbers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObserbers(){
        for(Observer observer:observers){
            observer.update();
        }
    }


}

abstract class Observer{
    public Subject subject;
    public abstract void update();
}

class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        // this.subject.detach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string : "+Integer.toBinaryString(subject.getState()));
    }
}

class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        // this.subject.detach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string : "+Integer.toOctalString(subject.getState()));
    }
    
}

class HexaDecimalObserver extends Observer{

    public HexaDecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        // this.subject.detach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: "+Integer.toHexString(subject.getState()));
    }
    
}