package behavioral.state.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("State Design Pattern");
        System.out.println("======================");

        Off initState = new Off();
        //initially tv is off
        TV tv = new TV(initState);
        //toggling action i.e; off to on
        tv.pressButton();
        //again toggling i.e; on to off
        tv.pressButton();

    }
}
