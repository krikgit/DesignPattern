package behavioral.observer.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern");
        System.out.println("======================");

        AverageScore averageScore = new AverageScore();
        CurrentScore currentScore = new CurrentScore();

        CricketData cricketData = new CricketData();
        System.out.println("Subscribe to both score:");
        cricketData.register(averageScore);
        System.out.println("==============================");
        cricketData.register(currentScore);

        cricketData.changedData();
        System.out.println("==============================");
        System.out.println("Unsubscribe to averageScore score:");
        cricketData.deregister(averageScore);

        cricketData.changedData();

    }
}
