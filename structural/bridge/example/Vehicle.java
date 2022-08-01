package structural.bridge.example;

abstract class Vehicle {
    protected Workshop workshop;
    protected Workshop _Workshop;

    public Vehicle(Workshop workshop, Workshop _Workshop) {
        this.workshop = workshop;
        this._Workshop = _Workshop;
    }

    abstract void manufacture();
}

class Car extends Vehicle{

    public Car(Workshop workshop, Workshop _Workshop) {
        super(workshop, _Workshop);
    }

    @Override
    void manufacture() {
        System.out.println("Car");
        workshop.work();
        _Workshop.work();
    }
}

class Bike extends Vehicle{

    public Bike(Workshop workshop, Workshop _Workshop) {
        super(workshop, _Workshop);
    }

    @Override
    void manufacture() {
        System.out.println("Bike");
        workshop.work();
        _Workshop.work();
    }
}