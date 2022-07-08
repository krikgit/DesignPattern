package creational.singleton.syncronized;
//this is synchronized initialization which is  thread safe
public class Singleton {
    //private reference
    private static Singleton uniqueInstance = null;
    private int data=0;

    //NPrivate as no client should instantiate the object
    private Singleton() {
    }

    //by adding synchronized keyword we are forcing thread to wait till any other execution
    //hence it becomes thread safe
    public static synchronized Singleton getInstance(){
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
