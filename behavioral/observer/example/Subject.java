package behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    //to add and remove topic
    public void register(Observer observer);
    public void deregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer); //get update from observer

}

class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean isChanged;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null passed in register!!");
        }
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> localList = null;
        if (!isChanged)
            return;

        localList = new ArrayList<>(observers);
        this.isChanged = false;
        for (Observer observer:observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    //in order to trigger notification
    public void postMessage(String message){
        System.out.println("Message posted is triggered to topic:"+message);
        this.isChanged= true;
        this.message = message;
        notifyObservers();
    }
}
