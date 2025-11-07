package Design_Patterns.Strategy.example;


interface Flys{
    public String fly();
}

class ItCanFly implements Flys{

    @Override
    public String fly() {
        return "It Can fly...";
    }
    
}

class ItCannotFly implements Flys{

    @Override
    public String fly() {
        return "It can not fly...";
    }
    
}

public class Animal {
    private Flys flys;

    public void setFlys(Flys flys){
        this.flys = flys;
    }

    public String tryToFly(){
        return flys.fly();
    }
}

class Bird extends Animal{
    public Bird(){
        super();
        this.setFlys(new ItCanFly());
    }
}

class Dog extends Animal{
    public Dog(){
        super();
        this.setFlys(new ItCannotFly());
    }
}
