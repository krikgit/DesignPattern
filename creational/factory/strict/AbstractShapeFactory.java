package creational.factory.strict;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

}

class RectangleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
class SquareFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
class CircleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}