package behavioral.iterator.example;

interface Collection {
    Iterator createIterator();
}
class NotificationCollection implements Collection{
    final int max = 6;
    int numOfEle = 0;
    Notification notificationList[];
    public  NotificationCollection(){
        notificationList = new Notification[max];

        addItem("Notification : 1");
        addItem("Notification : 2");
        addItem("Notification : 3");
        addItem("Notification : 4");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if (numOfEle>=max){
            System.err.println("Full!!");
        }else {
            notificationList[numOfEle] = notification;
            numOfEle++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}