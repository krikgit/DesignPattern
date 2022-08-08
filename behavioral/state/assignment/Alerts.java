package behavioral.state.assignment;

public class Alerts {
    private Mobile state;

    public Alerts(Mobile state) {
        this.state = state;
    }

    public Mobile getState() {
        return state;
    }

    public void setState(Mobile state) {
        this.state = state;
    }

    public void action(){
        state.alert(this);
    }
}
