package structural.bridge.assignment;

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int old,int increased);
}
class Triangle extends Shape{
    protected Triangle(Color color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("The Triangle is colored with :");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int old, int increased) {
        System.out.println("Changing border lenth to:"+increased+" times");
        old = old*increased;
        drawShape(old);
    }
}

class Rectangle extends Shape{
    protected Rectangle(Color color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("The Rectangle is colored with :");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int old, int increased) {
        System.out.println("Changing border lenth to:"+increased+" times");
        old = old*increased;
        drawShape(old);
    }
}