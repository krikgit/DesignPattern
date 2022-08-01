package structural.flyweight.assignment;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> map = new HashMap<>();

    public static  Player getPlayer(String playerType){
        Player player = null;
        if (map.containsKey(playerType)){
            player = map.get(playerType);
        }else {
            switch (playerType){
                case "T":
                    player = new Terrorist();
                    map.put("T",player);
                    System.out.println("Terrorist created");
                    break;

                case "C":
                    player = new CounterTerrorist();
                    map.put("C",player);
                    System.out.println("CounterTerrorist created");
                    break;

                default:
                    new RuntimeException();
            }
        }
        return player;
    }

    public static int totalObj(){
        return map.size();
    }
}
