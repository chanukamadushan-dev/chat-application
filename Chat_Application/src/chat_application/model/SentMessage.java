
package chat_application.model;


public class SentMessage extends Message {
    
    public SentMessage(String sender, String text) {
        super(sender, text);
    }
    
    @Override
    public void display(){
            System.out.println("you : "+ getText());
    }
 }
