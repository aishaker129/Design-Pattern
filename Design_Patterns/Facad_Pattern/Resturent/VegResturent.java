public class VegResturent implements Hotel {
    @Override
    public Menus getMenue() {
        VegMenue v = new VegMenue();
        return v;
    }
    
}
