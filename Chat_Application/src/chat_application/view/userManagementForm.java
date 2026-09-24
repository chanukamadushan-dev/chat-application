package chat_application.view;

import chat_application.controller.ChatInterfaceFormController;

public class userManagementForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(userManagementForm.class.getName());

    private ChatInterfaceFormController controller;

    public userManagementForm(ChatInterfaceFormController controller) {
        initComponents();
        setDefaultCloseOperation(
                  javax.swing.WindowConstants.DISPOSE_ON_CLOSE
        );
        this.controller = controller;
        loadUsers();
    }

    public void loadUsers() {
        CmbAddedUsers.removeAllItems();

        for (String user : controller.getAddedUsers()) {
            CmbAddedUsers.addItem(user);
           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CmbAddedUsers = new javax.swing.JComboBox<>();
        lblAddedUsers = new javax.swing.JLabel();
        btnOpenUserForms = new javax.swing.JButton();
        btnAddUsers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsers = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CmbAddedUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbAddedUsers.addActionListener(this::CmbAddedUsersActionPerformed);

        lblAddedUsers.setText("Added Users");

        btnOpenUserForms.setText("Open");
        btnOpenUserForms.addActionListener(this::btnOpenUserFormsActionPerformed);

        btnAddUsers.setText("ADD");
        btnAddUsers.addActionListener(this::btnAddUsersActionPerformed);

        jLabel1.setText("Enter user Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnAddUsers))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddedUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbAddedUsers, 0, 92, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(btnOpenUserForms)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lblAddedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbAddedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenUserForms))
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddUsers)
                    .addComponent(txtUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenUserFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenUserFormsActionPerformed
        String selectedUser = (String) CmbAddedUsers.getSelectedItem();
        if (selectedUser != null) {
            controller.openUser(selectedUser);
        }
    }//GEN-LAST:event_btnOpenUserFormsActionPerformed

    private void btnAddUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsersActionPerformed
         String newUserName = txtUsers.getText();

        chatInterfaceForm newUser = new chatInterfaceForm(newUserName, controller);

        newUser.setVisible(true);
        txtUsers.setText("");
        loadUsers();
    }//GEN-LAST:event_btnAddUsersActionPerformed

    private void CmbAddedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAddedUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbAddedUsersActionPerformed

    public static void main(String args[]) {

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbAddedUsers;
    private javax.swing.JButton btnAddUsers;
    private javax.swing.JButton btnOpenUserForms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddedUsers;
    private javax.swing.JTextField txtUsers;
    // End of variables declaration//GEN-END:variables
}
