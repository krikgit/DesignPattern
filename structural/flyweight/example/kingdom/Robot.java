package structural.flyweight.example.kingdom;

public interface Robot {
    public  void print();
    public void setColor(String color);
}

class MyRobot implements Robot{
    private String robotType;
    private String color;

    public MyRobot(String robotType) {
        this.robotType = robotType;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("This is "+robotType+" Robot with color "+color);
    }

}
