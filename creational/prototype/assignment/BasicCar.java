package creational.prototype.assignment;

abstract class BasicCar implements Cloneable {

    private String color;
    protected String name;
    private double price;

    abstract void description();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
        return clone;
    }
}

class Nano extends BasicCar{
    public Nano(){
        this.name = "Nano";
    }
    public void description(){
        System.out.println("In Nano::description");
    }
}
class Ford extends BasicCar{
    public Ford(){
        name = "Ford";
    }
    public void description(){
        System.out.println("In Ford::description");
    }
}