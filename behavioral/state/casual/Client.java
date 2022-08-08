package behavioral.state.casual;

public class Client {
    private static final String ON = "on";
    private static final String OFF = "off";

    private String state;
    public void setState(String state) {
        this.state = state;
    }

    public void action(){
        if (this.state.equalsIgnoreCase(ON)){
            System.out.println("On activity in action.");
        } else if (this.state.equalsIgnoreCase(OFF)) {
            System.out.println("Off activity in action.");
        }
    }
    public static void main(String[] args) {
        System.out.println("With out State Design Pattern");
        System.out.println("======================");

        Client client = new Client();
        System.out.println("=======Booting instruction=======");
        client.setState(ON);
        client.action();
        System.out.println("=======Shutting down instruction=======");
        client.setState(OFF);
        client.action();
    }
}
