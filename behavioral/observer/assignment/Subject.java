package behavioral.observer.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//implemented by cricket data
public interface Subject {
    public void register(Observer observer);
    public void deregister(Observer observer);
    public void notifyObs();

}

class CricketData implements Subject{

    private int run;
    private int wicket;
    private double overs;
    private List<Observer> list = null;

    public CricketData() {
        this.list = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        list.remove(list.indexOf(observer));
    }

    @Override
    public void notifyObs() {
        for (Iterator<Observer> iterator = list.iterator();iterator.hasNext();){
            Observer observer = iterator.next();
            observer.update(run,wicket,overs);
        }
    }

    private int latestRun(){
        return 90;
    }
    private int latestWicket(){
        return 2;
    }
    private double latestOvers(){
        return 13.2;
    }

    public void changedData(){
        run = latestRun();
        wicket = latestWicket();
        overs = latestOvers();

        notifyObs();
    }
}
