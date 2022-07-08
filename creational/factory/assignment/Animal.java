package creational.factory.assignment;

interface Animal {
    void canSwim();
    void eatChicken();
}

class Tiger implements Animal{

    @Override
    public void canSwim() {
        System.out.println("Tiger:: can not swim");
    }

    @Override
    public void eatChicken() {
        System.out.println("Tiger:: eats chicken");
    }
}

class Duck implements Animal{

    @Override
    public void canSwim() {
        System.out.println("Duck:: can swim");
    }

    @Override
    public void eatChicken() {
        System.out.println("Duck:: does not eat chicken");
    }
}
