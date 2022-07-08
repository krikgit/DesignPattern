package creational.abstractfactory.example;

public class FactoryProducer {

    public static AbstractFactory getFamily(String input){
        AbstractFactory choice = null;
        if (input.equalsIgnoreCase("Color")){
            choice = new ColorFactory();
        } else if (input.equalsIgnoreCase("Shape")) {
            choice = new ShapeFactory();
        }
        return choice;
    }
}
