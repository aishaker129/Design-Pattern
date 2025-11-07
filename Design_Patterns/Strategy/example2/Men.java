package Design_Patterns.Strategy.example2;

interface BuyCar{
    public void buy();
}

class IcanBuy implements BuyCar{

    @Override
    public void buy() {
        System.out.println("I can Buy a car...");
    }  
}

class IcannotBuy implements BuyCar{
    public void buy(){
        System.out.println("I can not buy a car...");
    }
}
public class Men {
    private BuyCar buyCar;

    public void setCarObject(BuyCar buyCar){
        this.buyCar = buyCar;
    }

    public void tryToBuy(){
        buyCar.buy();
    }
}

class RichMen extends Men{
    public RichMen(){
        super();
        this.setCarObject(new IcanBuy());
    }
}

class PoorMen extends Men{
    public PoorMen(){
        super();
        this.setCarObject(new IcannotBuy());
    }
}
