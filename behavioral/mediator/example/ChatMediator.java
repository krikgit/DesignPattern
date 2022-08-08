package behavioral.mediator.example;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User user);
}

class ChatMediatorImpl implements ChatMediator{
    private List<User> userList;
    public ChatMediatorImpl(){
        userList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: this.userList){
            if(u != user){
                u.recieve(message);
            }
        }
    }
}