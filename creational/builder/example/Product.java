package creational.builder.example;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private LinkedList<String> list = null;

    public Product() {
        this.list = new LinkedList<>();
    }

    public void add(String parts){
        list.addLast(parts);
    }

    public void showVehicleDetails(){
        System.out.println("Below is the vehicle details:");
        for(String parts:list)
            System.out.println(parts);
    }
}
