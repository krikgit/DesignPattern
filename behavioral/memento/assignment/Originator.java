package behavioral.memento.assignment;

public class Originator {
    private String state;

    public Memento saveState(){
        return new Memento(this.state);
    }

    public void restoreState(Memento memento){
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
