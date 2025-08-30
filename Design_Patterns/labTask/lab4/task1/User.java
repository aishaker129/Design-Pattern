public class User {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("TOYOTA");
        car1.assable();

        Car car2 = carFactory.getCar("AUDI");
        car2.assable();

        Car car3 = carFactory.getCar("BMW");
        car3.assable();

        
    }
}
