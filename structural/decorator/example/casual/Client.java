package structural.decorator.example.casual;

import structural.decorator.example.casual.ConcreteComponent;
import structural.decorator.example.casual.ConcreteDecoratorEx_1;
import structural.decorator.example.casual.ConcreteDecoratorEx_2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        System.out.println("------------------------");

        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd1 = new ConcreteDecoratorEx_1();
        cd1.setComponent(cc);
        cd1.doJob();

        ConcreteDecoratorEx_2 cd2 = new ConcreteDecoratorEx_2();
        cd2.setComponent(cd1);
        cd2.doJob();
    }
}
