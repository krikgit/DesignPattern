package structural.flyweight.assignment;

import creational.builder.assignment.Packing;
import javafx.concurrent.Task;

interface Player {
    public void assignWeapon(String weapon);
    public void mission();
}

class Terrorist implements Player{
    private  final String TASK;
    private String weapon;

    Terrorist(){
        TASK = "Plant the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with "+weapon+" having task:"+TASK);
    }
}
class CounterTerrorist implements Player{
    private  final String TASK;
    private String weapon;

    CounterTerrorist(){
        TASK = "Defuse the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter terrorist with "+weapon+" having task:"+TASK);
    }
}
