public class User {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.setCar("TOYOTA");
        car1.assable();

        Car car2 = carFactory.setCar("AUDI");
        car2.assable();

        Car car3 = carFactory.setCar("BMW");
        car3.assable();
    }
}
