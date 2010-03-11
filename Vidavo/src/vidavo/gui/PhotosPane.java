/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import vidavo.util.ImageFilter;

/**
 *
 * @author Serban
 */
public class PhotosPane extends javax.swing.JPanel implements ActionListener{

    private javax.swing.JButton browseButton;
    private javax.swing.JLabel listLabel;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JButton openButton;
    private javax.swing.JList photosList;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel renameLabel;
    private javax.swing.JTextField renameTextField;
    private javax.swing.JButton savePhotoButton;
    private javax.swing.JTextField selectPhotoTextField;

    private  java.util.ListResourceBundle resourceMap;

    public PhotosPane(java.util.ListResourceBundle rm){
        this.resourceMap = rm;
        initPane();
    }

    private void initPane(){

        selectPhotoTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        savePhotoButton = new javax.swing.JButton();
        listScrollPane = new javax.swing.JScrollPane();
        photosList = new javax.swing.JList();
        listLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        renameLabel = new javax.swing.JLabel();
        renameTextField = new javax.swing.JTextField();

        listScrollPane.setViewportView(photosList);

        selectPhotoTextField.setText(resourceMap.getString("selectPhotoTextField.text"));
        browseButton.setText(resourceMap.getString("browseButton.text"));
        savePhotoButton.setText(resourceMap.getString("savePhotoButton.text"));
        listLabel.setText(resourceMap.getString("listLabel.text"));
        openButton.setText(resourceMap.getString("openButton.text"));
        removeButton.setText(resourceMap.getString("removeButton.text"));
        renameLabel.setText(resourceMap.getString("renameLabel.text"));

        browseButton.addActionListener(this);
        savePhotoButton.addActionListener(this);
        openButton.addActionListener(this);
        removeButton.addActionListener(this);

        browseButton.setActionCommand("browse");
        savePhotoButton.setActionCommand("save");
        openButton.setActionCommand("open");
        removeButton.setActionCommand("remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listLabel)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(selectPhotoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(renameLabel)
                                .addGap(10, 10, 10)
                                .addComponent(renameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(savePhotoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(selectPhotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePhotoButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(renameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(renameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    public void actionPerformed(ActionEvent e) {
         String action = e.getActionCommand();

         if (action.equals("browse")){
            JFileChooser fc = new JFileChooser();
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setAcceptAllFileFilterUsed(false);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setMultiSelectionEnabled(false);
            int returnVal = fc.showOpenDialog(this);
            fc.updateUI();

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            System.out.println("Opening: " + file.getName() + "." + "\n");
        } else {
            System.out.println("Open command cancelled by user." + "\n");
        }

         }
         if (action.equals("save")){

         }
         if (action.equals("open")){

         }
         if (action.equals("remove")){

         }
    }

}
