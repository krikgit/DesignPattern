package structural.flyweight.example.size;

public interface Robot {
    public  void print();
}

class SmallRobot implements Robot{

    @Override
    public void print() {
        System.out.println("This is Small Robot");
    }
}
class LargeRobot implements Robot{

    @Override
    public void print() {
        System.out.println("This is Large Robot");
    }
}