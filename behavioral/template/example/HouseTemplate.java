package behavioral.template.example;

abstract class HouseTemplate {
    public final void buildHouse(){
        foundation();
        pillar();
        wall();
        windows();
        System.out.println("House is built.");
    }
    //default implementation hook method
    private void foundation(){
        System.out.println("Building foundation with cement, sand and rod.");
    }
    private void windows(){
        System.out.println("Building glass windows.");
    }
    public abstract void pillar();
    public abstract void wall();

}

class WoodenHouse extends HouseTemplate{

    @Override
    public void pillar() {
        System.out.println("Building wooden pillars.");
    }

    @Override
    public void wall() {
        System.out.println("Building wooden wall.");
    }
}

class GlassHouse extends HouseTemplate{

    @Override
    public void pillar() {
        System.out.println("Building glass pillars.");
    }

    @Override
    public void wall() {
        System.out.println("Building glass wall.");
    }
}
