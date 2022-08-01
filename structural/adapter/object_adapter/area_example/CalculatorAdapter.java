package structural.adapter.object_adapter.area_example;

public class CalculatorAdapter implements Calculator{

    RectangleArea rectangleArea;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void getArea(Rectangle rectangle) {
        this.rectangleArea = new RectangleArea();

        Rectangle rect = new Rectangle();
        rect.setLength(triangle.getBase());
        rect.setWidth(.5*triangle.getHeight());

        System.out.println("The area of "+this.getClass()+" is:");
        rectangleArea.getArea(rect);
    }
}
