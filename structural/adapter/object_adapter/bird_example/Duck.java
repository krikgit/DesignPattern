package structural.adapter.object_adapter.bird_example;

interface Duck {
    void quack();
    void fly();
}

class MallarDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}