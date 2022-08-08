package behavioral.observer.example;

interface Observer {
    //to notify and change the subject

    public void update();
    public void setSubject(Subject subject);
}

class MyTopicSubscribe implements Observer{

    private String name;
    private Subject topic;

    public MyTopicSubscribe(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message == null){
            System.out.println("No new Message");
        }else {
            System.out.println(name+" consuming message:"+message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
