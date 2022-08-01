package structural.adapter.object_adapter.area_example;

public interface Calculator {
    public void getArea(Rectangle rectangle);
}

class RectangleArea implements Calculator{

    Rectangle rectangle;

    @Override
    public void getArea(Rectangle rectangle) {
        System.out.println("Area of "+this.getClass().getName()+" is:"+rectangle.getLength()*rectangle.getWidth());
    }
}
