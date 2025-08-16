public class CarFactory {
    public Car setCar(String carType) {
        if (carType == null) {
            return null;
        }
        switch (carType.toUpperCase()) {
            case "TOYOTA":
                return new Toyota();
            case "AUDI":
                return new Audi();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }
}
