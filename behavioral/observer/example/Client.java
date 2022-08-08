package behavioral.observer.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern");
        System.out.println("======================");

        MyTopic topic = new MyTopic();

        //creating observer
        Observer observer = new MyTopicSubscribe("My data set #1");
        Observer observer_ = new MyTopicSubscribe("My data set #2");
        Observer _observer = new MyTopicSubscribe("My data set #3");

        //register topic
        topic.register(observer);
        topic.register(observer_);
        topic.register(_observer);

        //attach observer to subject
        observer.setSubject(topic);
        _observer.setSubject(topic);
        observer_.setSubject(topic);

        //check for update
        observer.update();

        topic.postMessage("I am someone to update everyone!");


    }
}
