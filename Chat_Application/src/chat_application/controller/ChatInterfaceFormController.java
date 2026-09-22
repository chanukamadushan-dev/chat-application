
package chat_application.controller;

import chat_application.model.Message;
import chat_application.view.chatInterfaceForm;
import java.util.ArrayList;


public class ChatInterfaceFormController {
    
    private ArrayList<chatInterfaceForm> users = new ArrayList<>();
    private chatInterfaceForm sender;
    
   
    public void addUser(chatInterfaceForm user){
        users.add(user);
    }
    
    
    public void sendMessage(Message message, chatInterfaceForm sender){
        for (chatInterfaceForm user : users) {
            
            if(user == sender){
               user.showOwnMessage(message);
            }else{
              user.reciveMessage(message);   
            }
         
        }
    }
 
}
