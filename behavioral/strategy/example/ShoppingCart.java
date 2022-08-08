package behavioral.strategy.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list = null;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
    }
    public void deleteItem(Item item){
        list.remove(item);
    }
    public int totalPrice(){
        int total =0;
        for (Item item:list){
            total += Integer.parseInt(item.getPrice());
        }
        return total;
    }
    //pay method needs strategy as argument in order to pay
    public void pay(PaymentStrategy paymentMethod) {
        int amount = totalPrice();
        paymentMethod.pay(amount);
    }
}
