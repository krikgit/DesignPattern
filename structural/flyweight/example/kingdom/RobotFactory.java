package structural.flyweight.example.kingdom;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, Robot> map = new HashMap<>();

    public int numberOfObjectCreated(){
        return map.size();
    }

    public Robot getRobot(String robotType) throws  Exception{
        Robot robot = null;
        if (map.containsKey(robotType)){
            robot = map.get(robotType);
        }else {
            switch (robotType){
                case "King":
                    System.out.println("Creating King robot:");
                    robot = new MyRobot("King");
                    map.put("King",robot);
                    System.out.println("done!");
                    break;

                case "Queen":
                    System.out.println("Creating Queen robot:");
                    robot = new MyRobot("Queen");
                    map.put("Queen",robot);
                    System.out.println("done!");
                    break;

                default:
                    throw new RuntimeException("Oops!! only King or Queen.");
            }
        }
        return robot;
    }
}
