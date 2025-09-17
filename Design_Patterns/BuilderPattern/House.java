class House {
    private int rooms;
    private int barthrooms;
    private boolean hasGarden;
    private boolean hasSwimmingPool;
    private boolean hasGarage;

    House(HouseBuilder builder){
        this.rooms = builder.rooms;
        this.barthrooms = builder.barthrooms;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarage = builder.hasGarage;
    }

    public String toString(){
        return "House [rooms= " + rooms + ", barthrooms= " + barthrooms + ", garden= " + hasGarden + ", swimmingPool= " + hasSwimmingPool + ", garage= " + hasGarage + "]";
    }

}

class HouseBuilder{
    int rooms;
    int barthrooms;
    boolean hasGarden;
    boolean hasSwimmingPool;
    boolean hasGarage;

    public HouseBuilder setRooms(int rooms){
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setBarthRooms(int barthrooms){
        this.barthrooms = barthrooms;
        return this;
    }
    public HouseBuilder setGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }
    public HouseBuilder setSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }
    public HouseBuilder setGarage(boolean hasGarage){
        this.hasGarage = hasGarage;
        return this;
    }

    public House build(){
        return new House(this);
    }
}
