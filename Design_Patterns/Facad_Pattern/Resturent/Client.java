public class Client {

    public static void main(String[] args) {
        HotelKeper hk = new HotelStaff();

      
        VegMenue vegMenue = hk.getVegMenue();
        vegMenue.showMenu();    
        System.out.println();

        NonVegMenue nonVegMenue = hk.getNonVegMenue();
        nonVegMenue.showMenu();
        System.out.println();
        
        VegNonVegBothMenue vegNonVegBothMenue = hk.getVegNonVegMenue();
        vegNonVegBothMenue.showMenu();
    }
}