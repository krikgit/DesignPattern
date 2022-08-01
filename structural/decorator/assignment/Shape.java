package structural.decorator.assignment;

public interface Shape {
    public void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape :: Rectangle ");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape :: Circle ");
    }
}