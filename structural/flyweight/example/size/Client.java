package structural.flyweight.example.size;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Flyweight Design Pattern");
        System.out.println("------------------------");

        RobotFactory factory = new RobotFactory();
        Robot robot = factory.getRobot("small");
        robot.print();

        //trying generate same object
        for (int i=0;i<2;i++){
            robot = factory.getRobot("small");
            robot.print();
        }
        System.out.println("Total object created:"+factory.numberOfObjectCreated());

        for (int i=0;i<3;i++){
            robot = factory.getRobot("large");
            robot.print();
        }

        System.out.println("Total object created:"+factory.numberOfObjectCreated());
    }
}
