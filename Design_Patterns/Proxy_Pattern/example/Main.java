package Design_Patterns.Proxy_Pattern.example;

public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.png");
        System.out.println("first call..");
        img.display();

        System.out.println("Second call..");
        img.display();
    }
}
