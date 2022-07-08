package creational.singleton.assignment;

public class Client {
    public static void main(String[] args) {
        MakeCaptain cap = MakeCaptain.getCaptain();

        MakeCaptain caps = MakeCaptain.getCaptain();

        if(cap.hashCode() == caps.hashCode()){
            System.out.println("Singleton");
        }else {
            System.out.println("Not Singleton");
        }
    }
}
