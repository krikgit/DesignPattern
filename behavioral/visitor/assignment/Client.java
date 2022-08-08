package behavioral.visitor.assignment;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Visitable> list = new ArrayList<>();
    public static double calculate(Visitor visitor){
        for (Visitable visitable:list){
            visitable.accept(visitor);
        }
        double cost = visitor.getPostageCost();
        return cost;
    }
    public static void main(String[] args) {
        System.out.println("Visitor Design Pattern");
        System.out.println("=======================");

        Visitable book = new Book(30,60);
        Visitable cd = new CD(10,20);
        Visitable dvd = new DVD(40,90);

        list.add(book);
        list.add(cd);
        list.add(dvd);

        Visitor visitor = new NAVisitorImpl();
        System.out.println("North America postal cost:"+calculate(visitor));

        visitor = new SAVisitorImpl();
        System.out.println("South America postal cost:"+calculate(visitor));

    }
}
