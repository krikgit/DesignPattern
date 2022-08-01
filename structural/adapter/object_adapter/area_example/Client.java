package structural.adapter.object_adapter.area_example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern - Object");
        System.out.println("--------------------------------");

        Triangle triangle = new Triangle(5,8);
        Calculator  calculatorAdapter = new CalculatorAdapter(triangle);
        calculatorAdapter.getArea(null);

    }
}
