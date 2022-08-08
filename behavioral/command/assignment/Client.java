package behavioral.command.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Command Design Pattern");
        System.out.println("======================");

        Stock googleStock = new Stock("Google",57);
        Stock microsoftStock = new Stock("Microsoft",20);
        Stock appleStock = new Stock("Apple",53);

        Order  _order = new  BuyStock(googleStock);
        Order  order_ = new SellStock(microsoftStock);

        Broker broker = new Broker();
        broker.takeOrder(_order);
        broker.takeOrder(order_);

        broker.placeOrder();



    }
}
