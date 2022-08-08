package behavioral.iterator.example;

public interface Iterator {
    //check if there is next element is existed or not
    boolean hasNext();
    //return next element
    Object next();
}
class NotificationIterator implements Iterator{
    private Notification[] list;

    int pos = 0;
    public NotificationIterator(Notification[] list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if (pos>=list.length || list[pos]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = list[pos];
        pos++;
        return notification;
    }
}
