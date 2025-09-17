public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaDecimalObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("first state change: 15");
        subject.setState(15);
        System.out.println("second state change: 20");
        subject.setState(20);
    }
}
