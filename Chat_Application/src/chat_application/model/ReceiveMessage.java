
package chat_application.model;


public class ReceiveMessage extends Message{
    
    public ReceiveMessage(String sender, String text) {
        super(sender, text);
    }
    
    @Override
    
    public void display(){
        System.out.println("Receiwe Message"+getText());
    }
    
}
