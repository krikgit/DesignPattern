package creational.builder.example;

public interface Builder {
    void addWheel();
    void addHeadLights();
    void addGlass();
    Product getVehicle();
}

class Car implements Builder{

     private Product product = new Product();

    @Override
    public void addWheel() {
        product.add("Car::4 Wheel added.");
    }

    @Override
    public void addHeadLights() {
        product.add("Car::2 head lights added.");
    }

    @Override
    public void addGlass() {
        product.add("Car::Glass added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
class Bike implements Builder{

    private Product product = new Product();

    @Override
    public void addWheel() {
        product.add("Bike::2 Wheel added.");
    }

    @Override
    public void addHeadLights() {
        product.add("Bike::1 head lights added.");
    }

    @Override
    public void addGlass() {
        product.add("Bike::Glass added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}