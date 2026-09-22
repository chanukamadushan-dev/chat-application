
package chat_application;

import chat_application.controller.ChatInterfaceFormController;
import chat_application.view.chatInterfaceForm;

public class Chat_Application {

    
    public static void main(String[] args) {
        ChatInterfaceFormController formControler = new ChatInterfaceFormController();
        
        new chatInterfaceForm("user1", formControler).setVisible(true);
    }
   
}
