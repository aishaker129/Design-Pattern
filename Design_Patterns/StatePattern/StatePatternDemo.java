public class StatePatternDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        simulatePhoneClick(phone);
    }

    public static void simulatePhoneClick(Phone phone){
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());

    }
}
