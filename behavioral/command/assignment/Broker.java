package behavioral.command.assignment;

import java.util.ArrayList;
import java.util.List;

class Broker {

    //invoker
    private List<Order> list = new ArrayList<>();
    
    public void takeOrder(Order order){
        list.add(order);
    }

    public void placeOrder(){
        for (Order order:list){
            order.execute();
        }
        list.clear();
    }
}
