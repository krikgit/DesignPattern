package behavioral.strategy.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern");
        System.out.println("======================");

        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("789","70");
        Item item_ = new Item("781","80");
        Item _item = new Item("788","50");

        cart.addItem(item);
        cart.addItem(item_);
        cart.addItem(_item);

        //paying by upi
        cart.pay(new UPIStrategy("fromkk@ybl"));
        //paying by net banking
        cart.pay(new NetBankingStrategy("kk","pass"));
    }
}
