package structural.proxy.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Proxy Design Pattern");
        System.out.println("------------------------");

        Image image = new ProxyImage("someFile.ext");
        image.display();
        System.out.println("====");
        image.display();
    }
}
