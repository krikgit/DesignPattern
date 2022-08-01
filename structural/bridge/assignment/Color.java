package structural.bridge.assignment;

interface Color {
    void fillWithColor(int border);
}

class Red implements Color{

    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with "+border+" inch border");
    }
}

class Blue implements Color{

    @Override
    public void fillWithColor(int border) {
        System.out.println("Blue color with "+border+" inch border");
    }
}