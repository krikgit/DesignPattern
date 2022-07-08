package creational.prototype.example;

abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("In Rectangle::draw()");
    }
}

class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("In Circle::draw()");
    }
}