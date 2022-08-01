package structural.facade.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern");
        System.out.println("------------------------");

        HotelKeeperFacade keeper = new HotelKeeperFacade();
        keeper.getBothMenu();
        keeper.getNonVegMenu();
        keeper.getVegMenu();
    }
}
