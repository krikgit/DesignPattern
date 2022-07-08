package creational.builder.assignment;

interface Item {
    public String name();
    public Packing pack();
    public double price();
}

abstract class Burger implements Item{
    @Override
    public Packing pack(){
        return new Wrapper();
    }
    @Override
    public abstract double price();
}

class VegBurger extends Burger{

    @Override
    public String name() {
        return "The Veg Burger";
    }

    @Override
    public double price() {
        return 35.9;
    }
}

class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "The Chicken Burger";
    }

    @Override
    public double price() {
        return 49.5;
    }
}

abstract class ColdDrinks implements Item{
    @Override
    public Packing pack(){
        return new Bottle();
    }
    @Override
    public abstract double price();
}

class Coke extends ColdDrinks{

    @Override
    public String name() {
        return "The Coke";
    }

    @Override
    public double price() {
        return 20;
    }
}

class Sprite extends ColdDrinks{

    @Override
    public String name() {
        return "The Sprite";
    }

    @Override
    public double price() {
        return 15;
    }
}