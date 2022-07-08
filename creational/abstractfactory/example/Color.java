package creational.abstractfactory.example;

interface Color {
    void fill();
}
class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Blue::fill()");
    }
}
class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Green::fill()");
    }
}
