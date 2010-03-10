/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import vidavo.pojos.Contacts;

/**
 *
 * @author Serban
 */
public class ContactPane extends javax.swing.JPanel{

    private java.util.ListResourceBundle resourceMap;
    private Contacts contacts;
    private String mode;

    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel relationshipLabel;
    private javax.swing.JTextField relationshipTextField;



    public ContactPane(java.util.ListResourceBundle rm,String mode,Contacts contacts){
        this.resourceMap = rm;
        this.mode = mode;
        initPane();
        if(mode.equals("edit"))
        {
            this.contacts = contacts;
            loadContacts(contacts);
        }
    }

    private void initPane(){

        contactLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        relationshipLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        relationshipTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        firstNameLabel.setText(resourceMap.getString("firstNameLabel.text"));
        lastNameLabel.setText(resourceMap.getString("lastNameLabel.text"));
        relationshipLabel.setText(resourceMap.getString("relationshipLabel.text"));
        phoneLabel.setText(resourceMap.getString("phoneLabel.text"));
        emailLabel.setText(resourceMap.getString("emailLabel.text"));
        contactLabel.setText(resourceMap.getString("contactLabel.text"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(relationshipLabel)
                            .addComponent(emailLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relationshipTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relationshipLabel)
                    .addComponent(relationshipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>

    private void loadContacts(Contacts contacts) {
        firstNameTextField.setText(contacts.getFirstName());
        lastNameTextField.setText(contacts.getLastName());
        relationshipTextField.setText(contacts.getRelationship());
        phoneTextField.setText(contacts.getHomePhone());
        emailTextField.setText(contacts.getEmail());
    }

    public Contacts getContacts()
    {
        return new Contacts(relationshipTextField.getText(),
        firstNameTextField.getText(),
        lastNameTextField.getText(),
        phoneTextField.getText(),
        emailTextField.getText());
    }

}
