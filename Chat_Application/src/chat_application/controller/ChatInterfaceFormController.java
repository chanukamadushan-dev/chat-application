package chat_application.controller;

import chat_application.model.Message;
import chat_application.view.chatInterfaceForm;
import java.util.ArrayList;

public class ChatInterfaceFormController {

    private ArrayList<chatInterfaceForm> users = new ArrayList<>();
    private ArrayList<String> addedUsers = new ArrayList<>();

    public void addUser(chatInterfaceForm user) {
        users.add(user);
        String userName = user.getName();
        
        if(!addedUsers.contains(userName)){
            addedUsers.add(userName);
        }
    }
    
    public ArrayList<String> getAddedUsers(){
        return addedUsers;
    }

    public void sendMessage(Message message, chatInterfaceForm sender) {
        for (chatInterfaceForm user : users) {

            if (user == sender) {
                user.showOwnMessage(message);
            } else {
                user.reciveMessage(message);
            }

        }
    }
    
    public void removeUser(chatInterfaceForm user){
        users.remove(user);
    }
    
    public void openUser(String userName){
        
        for (chatInterfaceForm user : users){
            
            if(user.getUserName().equals(userName)){
                user.setVisible(true);
                user.toFront();
                return;
            }
        }
        
        chatInterfaceForm newUser = new chatInterfaceForm(userName, this);
        newUser.setVisible(true);
    }

}
