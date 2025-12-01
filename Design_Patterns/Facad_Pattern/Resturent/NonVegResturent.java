public class NonVegResturent implements Hotel {
    @Override
    public Menus getMenue() {
        NonVegMenue nv = new NonVegMenue();
        return nv;
    }
    
}
