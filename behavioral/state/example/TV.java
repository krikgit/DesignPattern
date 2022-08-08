package behavioral.state.example;

public class TV {

    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state = state;
    }

    public void pressButton(){
        this.state.pressSwitch(this);
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }
}
