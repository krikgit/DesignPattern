package behavioral.memento.assignment;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> list = new ArrayList<>();

    public void addState(Memento state){
        list.add(state);
    }
    public Memento getState(int index){
       return list.get(index);
    }
}
