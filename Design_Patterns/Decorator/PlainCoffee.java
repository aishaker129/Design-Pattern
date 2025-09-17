interface Coffee{
    public String getDescription();
    public double getCost();
}

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return " Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
    
}

abstract class CoffeeDecorator implements Coffee{
    protected Coffee decorateCoffee;

    public CoffeeDecorator(Coffee decorateCoffee){
        this.decorateCoffee = decorateCoffee;
    }

    public String getDescription(){
        return decorateCoffee.getDescription();
    }
    public double getCost(){
        return decorateCoffee.getCost();
    }
}

class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee decorateCoffee){
        super(decorateCoffee);
    }

    public String getDescription(){
        return decorateCoffee.getDescription()+" Milk";
    }

    public double getCost(){
        return decorateCoffee.getCost()+0.5;
    }
}

class SugerCofee extends CoffeeDecorator{
    public SugerCofee(Coffee decorateCoffee){
        super(decorateCoffee);
    }

    public String getDescription(){
        return decorateCoffee.getDescription()+" Suger";
    }

    public double getCost(){
        return decorateCoffee.getCost()+0.2;
    }
}
