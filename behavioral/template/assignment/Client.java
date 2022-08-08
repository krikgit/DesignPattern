package behavioral.template.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Template Design Pattern");
        System.out.println("=======================");

        OrderProcesstemplate processtemplate = new NetOrder();
        processtemplate.processOrder(true);

        System.out.println("========================");

        processtemplate = new StoreOrder();
        processtemplate.processOrder(false);
    }
}
