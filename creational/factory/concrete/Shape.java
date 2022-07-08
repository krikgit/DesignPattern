package creational.factory.concrete;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("In Rectangle:draw()");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("In Square:draw()");
    }
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("In Circle:draw()");
    }
}