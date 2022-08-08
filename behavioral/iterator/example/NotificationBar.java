package behavioral.iterator.example;

class NotificationBar {
    private NotificationCollection notificationCollection;

    NotificationBar(NotificationCollection notificationCollection){
        this.notificationCollection = notificationCollection;
    }

    public void printNotification(){
        Iterator iterator = notificationCollection.createIterator();
        System.out.println("===Notifications===");
        while (iterator.hasNext()){
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
