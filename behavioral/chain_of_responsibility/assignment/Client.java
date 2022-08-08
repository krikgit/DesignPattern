package behavioral.chain_of_responsibility.assignment;

public class Client {

    public static void main(String[] args) {

        System.out.println("Chain of Responsibility Design Pattern");
        System.out.println("========================================");
        //making the chain first
        Reciever faxHandler,emailHandler;
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();

        faxHandler.setNextChain(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);
        Message message = new Message("Fax reaching late",MessagePriority.Normal);
        Message _message = new Message("Email not going",MessagePriority.High);
        Message message_ = new Message("Email reaching late",MessagePriority.Normal);
        Message msg= new Message("Fax not reaching",MessagePriority.High);

        Message messages = new Message("I am a normal message!",MessagePriority.High);

        raiser.raiseMessage(message);
        raiser.raiseMessage(message_);
        raiser.raiseMessage(_message);
        raiser.raiseMessage(msg);
        raiser.raiseMessage(messages);
    }
}
