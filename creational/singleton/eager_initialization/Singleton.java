package creational.singleton.eager_initialization;
//this is eager initialization which is  thread safe
public class Singleton {
    //private reference
    private static Singleton uniqueInstance = new Singleton();
    private int data=0;

    //NPrivate as no client should instantiate the object
    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
    //adding getter and setter to test singleton
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
