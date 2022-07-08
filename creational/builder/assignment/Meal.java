package creational.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> list = null;
    Meal(){
        list = new ArrayList<>();
    }

    public void addItem(Item i){
        list.add(i);
    }

    public double getCost(){
        double cost = 0;
        for (Item i:list){
            cost += i.price();
        }
        return  cost;
    }

    public void ShowDetails(){
        for (Item i:list){
            System.out.println("Item name:"+i.name());
            System.out.println("Packing:"+i.pack().pack());
            System.out.println("Price:"+i.price());
        }
    }
}
