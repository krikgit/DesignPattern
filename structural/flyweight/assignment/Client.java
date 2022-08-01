package structural.flyweight.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Flyweight Design Pattern");
        System.out.println("------------------------");

        String playerType [] = {"T","C"};
        String[] weapon = {"AK-47","M249","M416","M24"};


        Player player = PlayerFactory.getPlayer(playerType[0]);
        player.assignWeapon(weapon[1]);
        player.mission();

        player = PlayerFactory.getPlayer(playerType[1]);
        player.assignWeapon(weapon[3]);
        player.mission();
        //new terrorist will not be generated and same for counter terrorist
        player = PlayerFactory.getPlayer(playerType[0]);
        player.assignWeapon(weapon[2]);
        player.mission();

        player = PlayerFactory.getPlayer(playerType[1]);
        player.assignWeapon(weapon[0]);
        player.mission();

        System.out.println("Total object:"+PlayerFactory.totalObj());

    }
}
