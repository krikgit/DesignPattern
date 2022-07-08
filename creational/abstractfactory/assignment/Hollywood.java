package creational.abstractfactory.assignment;

interface Hollywood {
    void getMovieName();
}

class HollywoodAction implements Hollywood{

    @Override
    public void getMovieName() {
        System.out.println("Hollywood - Action:: WhiteHouse");
    }
}
class HollywoodComedy implements Hollywood{

    @Override
    public void getMovieName() {
        System.out.println("Hollywood - Comedy:: The Mask");
    }
}