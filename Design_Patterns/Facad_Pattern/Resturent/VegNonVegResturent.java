public class VegNonVegResturent implements Hotel {
    @Override
    public Menus getMenue() {
        VegNonVegBothMenue vnv = new VegNonVegBothMenue();
        return vnv;
    }
    
}
