public class BuilderPattern {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                    .setRooms(3)
                    .setBarthRooms(2)
                    .setGarden(true)
                    .setSwimmingPool(false)
                    .setGarage(false)
                    .build();
        System.out.println(house.toString());
    }
}
