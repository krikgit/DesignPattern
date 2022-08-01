package structural.bridge.example;

abstract class Workshop {
    abstract void work();
}

class Produce extends Workshop{

    @Override
    void work() {
        System.out.println("Produce");
    }
}

class Assemble extends Workshop{

    @Override
    void work() {
        System.out.println("And Assembled.");
    }
}