package creational.singleton.bill_pugh;

public class Client {
    public static void main(String[] args) {

        System.out.println("Singleton Design Pattern - Bill Pugh Initialization");
        System.out.println("----------------------------------------------");

        Singleton singleton = Singleton.getInstance();

        singleton.setData(6);
        int value = singleton.getData();

        System.out.println("The data is "+value+" with hashcode :"+singleton.hashCode());

        singleton = null;
        singleton = Singleton.getInstance();

        System.out.println("From 2nd instance:"+singleton.getData()+" hashcode is:"+singleton.hashCode());
    }
}
