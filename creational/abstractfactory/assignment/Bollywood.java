package creational.abstractfactory.assignment;

interface Bollywood {
    void getMovieName();
}
class BollywoodComedy implements Bollywood{

    @Override
    public void getMovieName() {
        System.out.println("Bollywood - Comedy:: 3 idiots");
    }
}
class BollywoodAction implements Bollywood{

    @Override
    public void getMovieName() {
        System.out.println("Bollywood - Action:: BangBang");
    }
}