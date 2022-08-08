package behavioral.chain_of_responsibility.assignment;

public class IssueRaiser {
    private Reciever reciever;

    public IssueRaiser(Reciever reciever){
        this.reciever = reciever;
    }

    public void raiseMessage(Message message){
        if (reciever!= null){
            reciever.processMessage(message);
        }
    }
}
