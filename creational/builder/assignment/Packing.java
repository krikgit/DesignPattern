package creational.builder.assignment;

public interface Packing {
    public String pack();
}

class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}