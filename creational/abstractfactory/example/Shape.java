package creational.abstractfactory.example;

interface Shape {
    void draw();
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}