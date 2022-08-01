package structural.composite.example;

public interface Employee {
    public void show();
}

class Developer implements Employee{

    long id;
    String name;
    String position;

    public Developer(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void show() {
        System.out.println(id+"--"+name+"--"+position);
    }
}

class Manager implements Employee{

    long id;
    String name;
    String position;

    public Manager(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void show() {
        System.out.println(id+"--"+name+"--"+position);
    }
}