package behavioral.state.example;

abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class On extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Already on. Shutting down...");
        context.setState(new Off());
    }
}
class Off extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Already off. Booting up...");
        context.setState(new On());
    }
}
