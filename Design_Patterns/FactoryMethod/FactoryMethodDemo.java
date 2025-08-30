interface Car {
   public void drive(); 
}

class BMW implements Car{
    public void drive(){
        System.out.println("BMW car driving");
    }
}

class Toyota implements Car{
    public void drive(){
        System.out.println("Toyota car driving");
    }
} 

class Marcities implements Car{
    public void drive(){
        System.out.println("Marcities car driving");
    }
}

class CarFactory{
    public static Car createCar(String type){
        if(type.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        else if(type.equalsIgnoreCase("Toyota")){
            return new Toyota();
        }
        else if(type.equalsIgnoreCase("Marcities")){
            return new Marcities();
        }
        else{
            throw new IllegalArgumentException("Car type not supported"+type);
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("BMW");
        car1.drive();

        Car car2 = CarFactory.createCar("Marcities");
        car2.drive();

        Car car3 = CarFactory.createCar("toyota");
        car3.drive();
    }
}
