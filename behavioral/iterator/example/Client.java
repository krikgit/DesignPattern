package behavioral.iterator.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Iterator Design Pattern");
        System.out.println("==========================");

        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotification();
    }
}
