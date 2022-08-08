package behavioral.mediator.example;

abstract class User {
    private ChatMediator chatMediator;
    private String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void recieve(String message);

    public ChatMediator getChatMediator() {
        return chatMediator;
    }

    public void setChatMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class UserImpl extends User{

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator,name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.getName()+" send message that:"+message);
        getChatMediator().sendMessage(message,this);
    }

    @Override
    public void recieve(String message) {
        System.out.println(this.getName()+" receive message that:"+message);
    }
}
