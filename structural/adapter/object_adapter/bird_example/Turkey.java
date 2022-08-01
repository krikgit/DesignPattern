package structural.adapter.object_adapter.bird_example;

interface Turkey {
    void fly();
    void gobble();
}
class WildTurkey implements Turkey{

    @Override
    public void fly() {
        System.out.println("I can fly short distance");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble");
    }
}
