package behavioral.chain_of_responsibility.assignment;

public interface Reciever {
    boolean processMessage(Message message);
    void setNextChain(Reciever reciever);
}

class FaxErrorHandler implements Reciever{

    private Reciever reciever;

    @Override
    public boolean processMessage(Message message) {
        if (message.getMessage().contains("Fax")){
            System.out.println("FaxErrorHandler process "+message.getPriority()
                    +" priority & issue is:"+message.getMessage());
            return true;
        }else {
            if (reciever != null){
                this.reciever.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(Reciever reciever) {
        this.reciever = reciever;
    }
}

class EmailErrorHandler implements Reciever{

    private Reciever reciever;

    @Override
    public boolean processMessage(Message message) {
        if (message.getMessage().contains("Email")){
            System.out.println("EmailErrorHandler process "+message.getPriority()
                    +" priority & issue is:"+message.getMessage());
            return true;
        }else {
            if (reciever != null){
                this.reciever.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(Reciever reciever) {
        this.reciever = reciever;
    }
}

