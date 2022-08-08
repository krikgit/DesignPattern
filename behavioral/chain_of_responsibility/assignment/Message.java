package behavioral.chain_of_responsibility.assignment;

enum MessagePriority{
    Normal,High;
}

class Message {
    private String message;
    private MessagePriority priority;

    public Message(String message, MessagePriority priority) {
        this.message = message;
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }
}
