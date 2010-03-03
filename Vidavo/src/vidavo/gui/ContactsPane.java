/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

/**
 *
 * @author Serban
 */
public class ContactsPane extends javax.swing.JPanel{

    private java.util.ListResourceBundle resourceMap;

    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel contactLabel1;
    private javax.swing.JLabel contactLabel2;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JTextField emailTextField2;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JLabel firstNameLabel2;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField firstNameTextField1;
    private javax.swing.JTextField firstNameTextField2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JLabel lastNameLabel2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField lastNameTextField1;
    private javax.swing.JTextField lastNameTextField2;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JLabel phoneLabel2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField phoneTextField1;
    private javax.swing.JTextField phoneTextField2;
    private javax.swing.JLabel relationshipLabel;
    private javax.swing.JLabel relationshipLabel1;
    private javax.swing.JLabel relationshipLabel2;
    private javax.swing.JTextField relationshipTextField;
    private javax.swing.JTextField relationshipTextField1;
    private javax.swing.JTextField relationshipTextField2;

 
    public ContactsPane(java.util.ListResourceBundle rm){
        this.resourceMap = rm;
        initPane();
    }

    private void initPane(){

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
        emailTextField1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        phoneLabel1 = new javax.swing.JLabel();
        phoneTextField1 = new javax.swing.JTextField();
        relationshipTextField1 = new javax.swing.JTextField();
        relationshipLabel1 = new javax.swing.JLabel();
        lastNameTextField1 = new javax.swing.JTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        firstNameTextField1 = new javax.swing.JTextField();
        firstNameLabel1 = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        emailTextField2 = new javax.swing.JTextField();
        firstNameLabel2 = new javax.swing.JLabel();
        firstNameTextField2 = new javax.swing.JTextField();
        lastNameLabel2 = new javax.swing.JLabel();
        phoneTextField2 = new javax.swing.JTextField();
        relationshipTextField2 = new javax.swing.JTextField();
        relationshipLabel2 = new javax.swing.JLabel();
        lastNameTextField2 = new javax.swing.JTextField();
        phoneLabel2 = new javax.swing.JLabel();
        contactLabel1 = new javax.swing.JLabel();
        contactLabel2 = new javax.swing.JLabel();

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contactLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contactLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        firstNameLabel.setText(resourceMap.getString("firstNameLabel.text"));
        lastNameLabel.setText(resourceMap.getString("lastNameLabel.text"));
        relationshipLabel.setText(resourceMap.getString("relationshipLabel.text"));
        phoneLabel.setText(resourceMap.getString("phoneLabel.text"));
        emailLabel.setText(resourceMap.getString("emailLabel.text"));
        emailLabel1.setText(resourceMap.getString("emailLabel.text"));
        phoneLabel1.setText(resourceMap.getString("phoneLabel.text"));
        relationshipLabel1.setText(resourceMap.getString("relationshipLabel.text"));
        lastNameLabel1.setText(resourceMap.getString("lastNameLabel.text"));
        firstNameLabel1.setText(resourceMap.getString("firstNameLabel.text"));
        emailLabel2.setText(resourceMap.getString("emailLabel.text"));
        firstNameLabel2.setText(resourceMap.getString("firstNameLabel.text"));
        lastNameLabel2.setText(resourceMap.getString("lastNameLabel.text"));
        relationshipLabel2.setText(resourceMap.getString("relationshipLabel.text"));
        phoneLabel2.setText(resourceMap.getString("phoneLabel.text"));
        contactLabel.setText(resourceMap.getString("contactLabel.text"));
        contactLabel1.setText(resourceMap.getString("contact1Label.text"));
        contactLabel2.setText(resourceMap.getString("contact2Label.text"));

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
                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)))
                    .addComponent(contactLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel1)
                            .addComponent(firstNameLabel1)
                            .addComponent(lastNameLabel1)
                            .addComponent(relationshipLabel1)
                            .addComponent(emailLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relationshipTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(firstNameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(lastNameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(phoneTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(emailTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)))
                    .addComponent(contactLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel2)
                            .addComponent(firstNameLabel2)
                            .addComponent(lastNameLabel2)
                            .addComponent(relationshipLabel2)
                            .addComponent(emailLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relationshipTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(firstNameTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(lastNameTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(phoneTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                            .addComponent(emailTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))))
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
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(contactLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel1)
                    .addComponent(firstNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel1)
                    .addComponent(lastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relationshipLabel1)
                    .addComponent(relationshipTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel1)
                    .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel1)
                    .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(contactLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel2)
                    .addComponent(firstNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel2)
                    .addComponent(lastNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relationshipLabel2)
                    .addComponent(relationshipTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel2)
                    .addComponent(phoneTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel2)
                    .addComponent(emailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>
    
}
