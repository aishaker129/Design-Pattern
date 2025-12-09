package Design_Patterns.Visitor_Pattern.example1;

public class DiscountCalculator implements Visitor{

    @Override
    public double visit(Book book) {
        double discount = book.getPrice()>50 ? 10:5;
        double finalPrice = book.getPrice()-discount;
        System.out.println("Book Name: "+book.getName()+" and price is: "+finalPrice);
        return finalPrice;
    }

    @Override
    public double visit(Phone phone) {
    
        double finalPrice = phone.getPrice() - phone.getPrice()*.10;
        System.out.println("Phone name: "+phone.getName()+" and price is: "+finalPrice);
        return finalPrice;
    }
    
    
}
