/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vidavo.util.ImageFilter;
import vidavo.util.ImagePreview;

/**
 *
 * @author Serban
 */
public class PhotosPane extends javax.swing.JPanel implements ActionListener, ListSelectionListener{

    private javax.swing.JButton browseButton;
    private javax.swing.JLabel listLabel;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JButton openButton;
    private javax.swing.JList photosList;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel renameLabel;
    private javax.swing.JTextField renameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField selectPhotoTextField;
    private ImagePreview previewPanel;

    private  java.util.ListResourceBundle resourceMap;
    private String patientDirectoryName;
    private Path path;

    public PhotosPane(java.util.ListResourceBundle rm){
        this.resourceMap = rm;
        initPane();
    }

    private void initPane(){

        selectPhotoTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        listScrollPane = new javax.swing.JScrollPane();
        photosList = new javax.swing.JList();
        listLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        renameLabel = new javax.swing.JLabel();
        renameTextField = new javax.swing.JTextField();

        previewPanel = new ImagePreview();

        listScrollPane.setViewportView(photosList);
        photosList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectPhotoTextField.setEditable(false);

        selectPhotoTextField.setText(resourceMap.getString("selectPhotoTextField.text"));
        browseButton.setText(resourceMap.getString("browseButton.text"));
        saveButton.setText(resourceMap.getString("savePhotoButton.text"));
        listLabel.setText(resourceMap.getString("listLabel.text"));
        openButton.setText(resourceMap.getString("openButton.text"));
        removeButton.setText(resourceMap.getString("removeButton.text"));
        renameLabel.setText(resourceMap.getString("renameLabel.text"));

        browseButton.addActionListener(this);
        saveButton.addActionListener(this);
        openButton.addActionListener(this);
        removeButton.addActionListener(this);

        browseButton.setActionCommand("browse");
        saveButton.setActionCommand("save");
        openButton.setActionCommand("open");
        removeButton.setActionCommand("remove");

        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(openButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(renameLabel)
                                .addGap(10, 10, 10)
                                .addComponent(renameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
                            .addComponent(selectPhotoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(saveButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(renameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(renameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openButton)
                        .addGap(4, 4, 4)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(listScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap())
        );

        photosList.addListSelectionListener(this);

    }// </editor-fold>

    public void actionPerformed(ActionEvent e) {
         String action = e.getActionCommand();

         if (action.equals("browse")){
            JFileChooser fc = new JFileChooser("Browse");
            fc.setAcceptAllFileFilterUsed(false);
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setMultiSelectionEnabled(false);
            int returnVal = fc.showOpenDialog(this);
            fc.updateUI();

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            path = fc.getSelectedFile().toPath();
            this.selectPhotoTextField.setText(path.toString());
            this.renameTextField.setText(path.getName().toString());
        } 

         }
         if (action.equals("save")){
            File userDir;
            if (!this.patientDirectoryName.equals("photos\\") && !this.selectPhotoTextField.getText().equals(resourceMap.getString("selectPhotoTextField.text"))){
                userDir = new File(patientDirectoryName);
                if (!userDir.exists())
                     userDir.mkdirs();
                try {
                    copyFile(new File(path.toString()), new File(patientDirectoryName + "\\" + this.renameTextField.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else
                javax.swing.JOptionPane.showMessageDialog(this, resourceMap.getString("savePhotoError.text"),"Please complete the information", javax.swing.JOptionPane.INFORMATION_MESSAGE);

         }
         if (action.equals("open")){
            if (!photosList.isSelectionEmpty())
            try {
                 java.awt.Desktop.getDesktop().open(new File(patientDirectoryName + "/" + photosList.getSelectedValue().toString()));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
         }
         if (action.equals("remove")){
            if (!photosList.isSelectionEmpty()){
                 File temp = new File(patientDirectoryName + "/" + photosList.getSelectedValue().toString());
                 temp.delete();
            }
         }
         populateList();
    }
    

    public String getPatientDirectoryName() {
        return patientDirectoryName;
    }

    public void setPatientDirectoryName(String patientDirectoryName) {
        this.patientDirectoryName = "photos\\" + patientDirectoryName.trim();
    }

    private static void copyFile(File sourceFile, File destFile)
                throws IOException {
        if (!sourceFile.exists()) {
                return;
        }
        if (!destFile.exists()) {
                destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
                destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
                source.close();
        }
        if (destination != null) {
                destination.close();
        }
    }

    public void populateList() {

        File dir = new File(patientDirectoryName);
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return !file.isDirectory();
            }
        };
        File[] files = dir.listFiles(fileFilter);

        if (files != null){
            DefaultListModel model = new DefaultListModel();
            if (files.length > 0)
                for (int i=0; i<files.length; i++)
                    model.addElement(files[i].getName());    
            photosList.setModel(model);
        }
    }

    public void valueChanged(ListSelectionEvent e) {
        if (!photosList.isSelectionEmpty()) {
            previewPanel.loadImage(getPatientDirectoryName() + "\\" + photosList.getSelectedValue());
        }
    }
}
