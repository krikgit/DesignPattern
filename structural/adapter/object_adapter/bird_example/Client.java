package structural.adapter.object_adapter.bird_example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern - Object");
        System.out.println("------------------------");

        System.out.println("Duck:");
        MallarDuck duck = new MallarDuck();
        callDuck(duck);

        System.out.println("Turkey:");
        WildTurkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        System.out.println("Turkey Adapter:");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        callDuck(turkeyAdapter);

    }
    public static void callDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
