package behavioral.memento.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Memento Design Pattern");
        System.out.println("=======================");

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("I am at state #1");
        originator.setState("I am at state #2");
        originator.setState("I am at state #3");

        careTaker.addState(originator.saveState());
        System.out.println("Current state is:"+originator.getState());

        originator.setState("I am at state #4");
        careTaker.addState(originator.saveState());
        System.out.println("Current state is:"+originator.getState());

        originator.setState("I am at state #5");
        originator.setState("I am at state #6");
        careTaker.addState(originator.saveState());
        System.out.println("Current state is:"+originator.getState());

        originator.restoreState(careTaker.getState(0));
        System.out.println("After restoring current state is:"+originator.getState());
    }
}
