package structural.flyweight.example.kingdom;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Flyweight Design Pattern");
        System.out.println("------------------------");

        RobotFactory factory = new RobotFactory();
        MyRobot myRobot = (MyRobot) factory.getRobot("King");
        myRobot.setColor("Red");
        myRobot.print();

        //trying generate same object
        for (int i=0;i<2;i++){
            myRobot = (MyRobot) factory.getRobot("King");
            myRobot.setColor("Black");
            myRobot.print();
        }
        System.out.println("Total object created:"+factory.numberOfObjectCreated());

        for (int i=0;i<3;i++){
            myRobot = (MyRobot) factory.getRobot("Queen");
            myRobot.setColor("Pink");
            myRobot.print();
        }

        System.out.println("Total object created:"+factory.numberOfObjectCreated());
    }
}
