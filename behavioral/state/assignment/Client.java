package behavioral.state.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("State Design Pattern");
        System.out.println("======================");

        Alerts alerts = new Alerts(new Vibrate()); // default in vibration
        alerts.action();
        alerts.action();

    }
}
