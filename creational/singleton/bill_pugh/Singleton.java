package creational.singleton.bill_pugh;
//this is bill pugh initialization which is  thread safe
public class Singleton {

    private int data=0;

    //NPrivate as no client should instantiate the object
    private Singleton() {
    }

    //bill pugh approach
    private  static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }
    //adding getter and setter to test singleton
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
