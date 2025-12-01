public class HotelStaff implements HotelKeper {
    @Override
    public VegMenue getVegMenue() {
        VegResturent vegResturent = new VegResturent();
        return (VegMenue) vegResturent.getMenue();
    }

    @Override
    public NonVegMenue getNonVegMenue() {
        NonVegResturent nonVegResturent = new NonVegResturent();
        return (NonVegMenue) nonVegResturent.getMenue();
    }

    @Override
    public VegNonVegBothMenue getVegNonVegMenue() {
        VegNonVegResturent vegNonVegResturent = new VegNonVegResturent();
        return (VegNonVegBothMenue) vegNonVegResturent.getMenue();
    }
    
}
