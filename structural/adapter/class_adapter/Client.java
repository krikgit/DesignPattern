package structural.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern - Class & Object");
        System.out.println("---------------------------------------");

        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class Adapter Value:"+classAdapter.getValue());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerVal());
        System.out.println("Object Adapter Value:"+objectAdapter.getValue());

    }
}
