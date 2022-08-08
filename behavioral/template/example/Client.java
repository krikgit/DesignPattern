package behavioral.template.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Template Design Pattern");
        System.out.println("=======================");

        HouseTemplate template = new WoodenHouse();
        template.buildHouse();
        System.out.println("====================");
        template = new GlassHouse();
        template.buildHouse();
    }
}
