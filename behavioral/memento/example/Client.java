package behavioral.memento.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Memento Design Pattern");
        System.out.println("======================");

        FileWriterCareTaker careTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("Set of data:\nAmi\nTumi\nTahara");
        System.out.println(fileWriter);
        //saving current state
        careTaker.save(fileWriter);
        //adding new data
        fileWriter.write("\nSe");
        System.out.println("=========After Appending New============");
        System.out.println(fileWriter);
        careTaker.undo(fileWriter);
        //after undo
        System.out.println("=========After Undo============");
        System.out.println(fileWriter);
    }
}
