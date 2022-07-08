package creational.singleton.lazy_initialization;
//this is lazy initialization which is not thread safe
public class Singleton {
    //private reference
    private static Singleton uniqueInstance = null;
    private int data=0;

    //NPrivate as no client should instantiate the object
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
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
