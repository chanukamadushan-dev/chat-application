package chat_application.model;

public class Message {

    private String text;
    private String sender;

    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public void display() {
        System.out.println(sender+" : " + text);
    }

}
