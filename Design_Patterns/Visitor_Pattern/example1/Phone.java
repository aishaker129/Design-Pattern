package Design_Patterns.Visitor_Pattern.example1;

public class Phone implements Product{
    private int price;
    private String name;

    Phone(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    public double accept(Visitor visitor){
       return visitor.visit(this);
    }
}
