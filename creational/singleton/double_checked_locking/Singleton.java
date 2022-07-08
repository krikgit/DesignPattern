package creational.singleton.double_checked_locking;
//this is double-checked locking initialization which is  thread safe
public class Singleton {
    //private reference
    private volatile static Singleton uniqueInstance = null;
    private int data=0;

    //NPrivate as no client should instantiate the object
    private Singleton() {
    }

    //not using synchronized in method signature
    public static Singleton getInstance(){

        if(uniqueInstance==null){
            synchronized (Singleton.class){ //synchronizing for first time
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
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
