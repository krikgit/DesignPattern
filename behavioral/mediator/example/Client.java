package behavioral.mediator.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Mediator Design Pattern");
        System.out.println("=======================");

        ChatMediator chatMediator = new ChatMediatorImpl() ;

        User users = new UserImpl(chatMediator,"John");
        User user_ = new UserImpl(chatMediator,"Robert");
        User _user = new UserImpl(chatMediator,"Lucy");
        User user = new UserImpl(chatMediator,"Venkat");

        chatMediator.addUser(user);
        chatMediator.addUser(user_);
        chatMediator.addUser(_user);
        chatMediator.addUser(users);

        user.send("Hello Everyone!!");

    }
}

