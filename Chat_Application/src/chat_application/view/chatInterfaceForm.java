package chat_application.view;

import chat_application.controller.ChatInterfaceFormController;
import chat_application.model.Message;
import chat_application.model.SentMessage;

public class chatInterfaceForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(chatInterfaceForm.class.getName());

    private String userName;
    private ChatInterfaceFormController controller;
    private int userCount = 1;

    public String getUserName() {
        return userName;
    }

    public chatInterfaceForm(String userName, ChatInterfaceFormController controller) {
        initComponents();

        addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                controller.removeUser(chatInterfaceForm.this);
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.userName = userName;
        this.controller = controller;

        controller.addUser(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtField = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChatArea = new javax.swing.JTextArea();
        btnManageUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtField.addActionListener(this::txtFieldActionPerformed);

        btnSend.setText("Send");
        btnSend.addActionListener(this::btnSendActionPerformed);

        btnAddUser.setText("Add user");
        btnAddUser.addActionListener(this::btnAddUserActionPerformed);

        txtChatArea.setColumns(20);
        txtChatArea.setRows(5);
        jScrollPane1.setViewportView(txtChatArea);

        btnManageUsers.setText("Manage");
        btnManageUsers.addActionListener(this::btnManageUsersActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnManageUsers)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAddUser)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String textMessage = txtField.getText();
        if (!textMessage.isEmpty()) {
            Message message = new SentMessage(userName, textMessage);
            controller.sendMessage(message, this);

            txtField.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        userCount++;

        String newUserName = "user" + userCount;

        chatInterfaceForm newUser = new chatInterfaceForm(newUserName, controller);

        newUser.setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed
        btnSendActionPerformed(evt);
    }//GEN-LAST:event_txtFieldActionPerformed

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        userManagementForm form = new userManagementForm(controller);
        form.setVisible(true);
    }//GEN-LAST:event_btnManageUsersActionPerformed

    public void showOwnMessage(Message message) {
        txtChatArea.append("You : " + message.getText() + "\n\n");
    }

    public void reciveMessage(Message message) {
        txtChatArea.append(message.getSender() + " : " + message.getText() + "\n\n");
    }

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChatArea;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
