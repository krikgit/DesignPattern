package structural.flyweight.example.size;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String,Robot> map = new HashMap<>();

    public int numberOfObjectCreated(){
        return map.size();
    }

    public Robot getRobot(String robotCategory) throws  Exception{
        Robot robot = null;
        if (map.containsKey(robotCategory)){
            robot = map.get(robotCategory);
        }else {
            switch (robotCategory){
                case "small":
                    System.out.println("Creating small robot:");
                    robot = new SmallRobot();
                    map.put("King",robot);
                    System.out.println("done!");
                    break;

                case "large":
                    System.out.println("Creating large robot:");
                    robot = new LargeRobot();
                    map.put("Queen",robot);
                    System.out.println("done!");
                    break;

                default:
                    throw new RuntimeException();
            }
        }
        return robot;
    }
}
