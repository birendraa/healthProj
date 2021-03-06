/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import vidavo.pojos.*;
import vidavo.util.ImageFilter;
import vidavo.util.ImagePreview;

/**
 *
 * @author Serban
 */
public class PersonalInfoPane extends javax.swing.JPanel implements ActionListener{

    private com.toedter.calendar.JDateChooser birthDateChooser;
    private com.toedter.calendar.JDateChooser firstVisitChooser;
    private JLabel addressLabel;
    private JLabel addressNumLabel;
    private JTextField addressNumTextField;
    private JTextField addressTextField;
    private JLabel amkaLabel;
    private JTextField amkaTextField;
    private JLabel birthDateLabel;
    private JLabel cellLabel;
    private JTextField cellTextField;
    private JLabel childrenLabel;
    private JSpinner childrenSpinner;
    private JLabel citizenshipLabel;
    private JTextField citizenshipTextField;
    private JLabel cityLabel;
    private JTextField cityTextField;
    private JPanel communicationNumPane;
    private JLabel countryLabel;
    private JTextField countryTextField;
    private JLabel faxLabel;
    private JTextField faxTextField;
    private JRadioButton femaleRadioButton;
    private JLabel firstNLabel;
    private JTextField firstNTextField;
    private JLabel heightLabel;
    private JTextField heightTextField;
    private JLabel homeLabel;
    private JTextField homeTextField;
    private JPanel infoPane;
    private JLabel insuranceLabel;
    private JTextField insuranceTextField;
    private ImagePreview picturePanel;
    private JLabel lastNLabel;
    private JTextField lastNTextField;
    private JLabel mailLabel;
    private JTextField mailTextField;
    private JRadioButton maleRadioButton;
    private JRadioButton marriedRadioButton;
    private JLabel middleNLabel;
    private JTextField middleNTextField;
    private JLabel patientPhotoLabel;
    private JButton pictureButton;
    private JLabel postalCLabel;
    private JTextField postalCTextField;
    private JLabel profLabel;
    private JTextField profTextField;
    private JLabel firstVisitLabel;
    private JLabel regionLabel;
    private JTextField regionTextField;
    private JRadioButton singleRadioButton;
    private JComboBox tameioComboBox;
    private JLabel tameioLabel;
    private JLabel weightLabel;
    private JTextField weightTextField;
    private JLabel workLabel;
    private JTextField workTextField;

    private int patientID = 0;
    private String mode;
    private PersonalInfo pi;
    private Path path;
    private String patientDirectoryName;

   	private java.util.ListResourceBundle resourceMap;

    public PersonalInfoPane(java.util.ListResourceBundle rm, String mode,PersonalInfo pi){
        super();
        this.mode = mode;
        this.resourceMap = rm;
        initPane();
        if(mode.equals("edit"))
        {
            this.pi = pi;
            loadPatientInfo(pi);
            updateDirectoryName();
            File userPhoto;
            if (!this.patientDirectoryName.equals("photos\\")){
                userPhoto = new File(this.patientDirectoryName + "\\" + "personalPhoto.jpg");
                if (userPhoto.exists())
                    picturePanel.loadImage(userPhoto.getPath());
            }
        }
    }

    private void initPane(){
        infoPane = new JPanel();
        firstNLabel = new JLabel();
        middleNLabel = new JLabel();
        lastNLabel = new JLabel();
        addressLabel = new JLabel();
        addressNumLabel = new JLabel();
        cityLabel = new JLabel();
        regionLabel = new JLabel();
        countryLabel = new JLabel();
        postalCLabel = new JLabel();
        citizenshipLabel = new JLabel();
        addressNumTextField = new JTextField();
        addressTextField = new JTextField();
        lastNTextField = new JTextField();
        middleNTextField = new JTextField();
        firstNTextField = new JTextField();
        cityTextField = new JTextField();
        regionTextField = new JTextField();
        countryTextField = new JTextField();
        postalCTextField = new JTextField();
        citizenshipTextField = new JTextField();
        heightLabel = new JLabel();
        weightLabel = new JLabel();
        maleRadioButton = new JRadioButton();
        femaleRadioButton = new JRadioButton();
        marriedRadioButton = new JRadioButton();
        singleRadioButton = new JRadioButton();
        birthDateLabel = new JLabel();
        profLabel = new JLabel();
        insuranceLabel = new JLabel();
        amkaLabel = new JLabel();
        tameioLabel = new JLabel();
        firstVisitLabel = new JLabel();
        childrenLabel = new JLabel();
        childrenSpinner = new JSpinner(new SpinnerNumberModel (0,0,9999,1));
        firstVisitChooser = new com.toedter.calendar.JDateChooser();
        heightTextField = new JTextField();
        weightTextField = new JTextField();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        profTextField = new JTextField();
        insuranceTextField = new JTextField();
        amkaTextField = new JTextField();
        tameioComboBox = new JComboBox();
        picturePanel = new ImagePreview();
        patientPhotoLabel = new JLabel();
        pictureButton = new JButton();
        communicationNumPane = new JPanel();
        homeLabel = new JLabel();
        workLabel = new JLabel();
        homeTextField = new JTextField();
        workTextField = new JTextField();
        cellLabel = new JLabel();
        faxLabel = new JLabel();
        cellTextField = new JTextField();
        faxTextField = new JTextField();
        mailLabel = new JLabel();
        mailTextField = new JTextField();

        firstNLabel.setText(resourceMap.getString("firstNLabel.text"));
        middleNLabel.setText(resourceMap.getString("middleNLabel.text"));
        lastNLabel.setText(resourceMap.getString("lastNLabel.text"));
        addressLabel.setText(resourceMap.getString("addressLabel.text"));
        addressNumLabel.setText(resourceMap.getString("addressNumLabel.text"));
        cityLabel.setText(resourceMap.getString("cityLabel.text"));
        regionLabel.setText(resourceMap.getString("regionLabel.text"));
        countryLabel.setText(resourceMap.getString("countryLabel.text"));
        postalCLabel.setText(resourceMap.getString("postalCLabel.text"));
        citizenshipLabel.setText(resourceMap.getString("citizenshipLabel.text"));
        heightLabel.setText(resourceMap.getString("heightLabel.text"));
        weightLabel.setText(resourceMap.getString("weightLabel.text"));
        maleRadioButton.setText(resourceMap.getString("maleRadioButton.text"));
        femaleRadioButton.setText(resourceMap.getString("femaleRadioButton.text"));
        marriedRadioButton.setText(resourceMap.getString("marriedRadioButton.text"));
        singleRadioButton.setText(resourceMap.getString("singleRadioButton.text"));
        birthDateLabel.setText(resourceMap.getString("birthDateLabel.text"));
        profLabel.setText(resourceMap.getString("profLabel.text"));
        insuranceLabel.setText(resourceMap.getString("insuranceLabel.text"));
        amkaLabel.setText(resourceMap.getString("amkaLabel.text"));
        tameioLabel.setText(resourceMap.getString("tameioLabel.text"));
        firstVisitLabel.setText(resourceMap.getString("firstVisitLabel.text"));
        childrenLabel.setText(resourceMap.getString("childrenLabel.text"));
        tameioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O.G.A.", "DIMOSIO", "O.A.E.E. - T.E.V.E.",
        "I.K.A.", "TEAPAP DEI T.A.Y.T.E.K.O.", "TAPEPA", "EYDAP", "TAP E.T.E",
        "EDOEAP", "ILPAP", "(TATTA) ETAP", "T.S.A.Y.", "T.A.E.", "T.S.M.E.D.E.",
        "KEA - EEEKE"}));

        picturePanel.setBorder(new javax.swing.border.MatteBorder(null));

        ButtonGroup maleFemaleGroup =  new ButtonGroup();
        maleFemaleGroup.add(maleRadioButton);
        maleFemaleGroup.add(femaleRadioButton);

        ButtonGroup marriedSingleGroup =  new ButtonGroup();
        marriedSingleGroup.add(marriedRadioButton);
        marriedSingleGroup.add(singleRadioButton);


        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        patientPhotoLabel.setText(resourceMap.getString("patientPhotoLabel.text"));
        pictureButton.setText(resourceMap.getString("pictureButton.text"));
        pictureButton.addActionListener(this);
        pictureButton.setActionCommand("picture");

        javax.swing.GroupLayout infoPaneLayout = new javax.swing.GroupLayout(infoPane);
        infoPane.setLayout(infoPaneLayout);
        infoPaneLayout.setHorizontalGroup(
            infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressNumLabel)
                    .addComponent(addressLabel)
                    .addComponent(lastNLabel)
                    .addComponent(middleNLabel)
                    .addComponent(firstNLabel)
                    .addComponent(cityLabel)
                    .addComponent(regionLabel)
                    .addComponent(countryLabel)
                    .addComponent(postalCLabel)
                    .addComponent(citizenshipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(citizenshipTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postalCTextField)
                    .addComponent(countryTextField)
                    .addComponent(cityTextField)
                    .addComponent(firstNTextField)
                    .addComponent(middleNTextField)
                    .addComponent(lastNTextField)
                    .addComponent(addressTextField)
                    .addComponent(addressNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(regionTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightLabel)
                            .addComponent(amkaLabel)
                            .addComponent(insuranceLabel)
                            .addComponent(tameioLabel)
                            .addComponent(firstVisitLabel)
                            .addComponent(childrenLabel)
                            .addComponent(weightLabel)
                            .addComponent(maleRadioButton)
                            .addComponent(marriedRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(birthDateLabel)
                            .addComponent(profLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(weightTextField)
                                .addComponent(childrenSpinner)
                                .addComponent(firstVisitChooser)
                                .addComponent(tameioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amkaTextField)
                                .addComponent(insuranceTextField)
                                .addComponent(profTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(heightTextField)
                                .addComponent(birthDateChooser))
                            .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(singleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPaneLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientPhotoLabel)
                                    .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)))
                        .addContainerGap())))
        );
        infoPaneLayout.setVerticalGroup(
            infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientPhotoLabel))
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNLabel)
                            .addComponent(firstNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middleNLabel)
                            .addComponent(middleNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNLabel)
                            .addComponent(lastNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marriedRadioButton)
                            .addComponent(singleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressNumLabel)
                            .addComponent(addressNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityLabel)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insuranceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insuranceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regionLabel)
                            .addComponent(amkaLabel)
                            .addComponent(amkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryLabel)
                            .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tameioLabel)
                            .addComponent(tameioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postalCLabel)
                            .addComponent(postalCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstVisitLabel)
                            .addComponent(firstVisitChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(citizenshipLabel)
                            .addComponent(citizenshipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childrenLabel)
                            .addComponent(childrenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        communicationNumPane.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("communicationNumPane.title"))); // NOI18N

        homeLabel.setText(resourceMap.getString("homeLabel.text"));
        workLabel.setText(resourceMap.getString("workLabel.text"));
        cellLabel.setText(resourceMap.getString("faxLabel.text"));
        faxLabel.setText(resourceMap.getString("cellLabel.text"));
        mailLabel.setText(resourceMap.getString("emailLabel.text"));


        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout communicationNumPaneLayout = new javax.swing.GroupLayout(communicationNumPane);
        communicationNumPane.setLayout(communicationNumPaneLayout);
        communicationNumPaneLayout.setHorizontalGroup(
            communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communicationNumPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeLabel)
                    .addComponent(workLabel))
                .addGap(51, 51, 51)
                .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workTextField)
                    .addComponent(homeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(faxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cellLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(faxTextField)
                    .addComponent(cellTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(mailLabel)
                .addGap(18, 18, 18)
                .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        communicationNumPaneLayout.setVerticalGroup(
            communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communicationNumPaneLayout.createSequentialGroup()
                .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(communicationNumPaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cellLabel)
                                .addComponent(cellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(homeLabel)
                            .addComponent(homeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workLabel)
                            .addComponent(workTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faxLabel)
                            .addComponent(faxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(communicationNumPaneLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(communicationNumPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailLabel)
                            .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout personalInfoPaneLayout = new javax.swing.GroupLayout(this);
        this.setLayout(personalInfoPaneLayout);
        personalInfoPaneLayout.setHorizontalGroup(
            personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoPaneLayout.createSequentialGroup()
                .addGroup(personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalInfoPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoPane, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(communicationNumPane, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        personalInfoPaneLayout.setVerticalGroup(
            personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalInfoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(communicationNumPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("picture")){
                JFileChooser fc = new JFileChooser("Browse");
                fc.setAcceptAllFileFilterUsed(false);
                fc.addChoosableFileFilter(new ImageFilter());
                fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fc.setMultiSelectionEnabled(false);
                int returnVal = fc.showOpenDialog(this);
                fc.updateUI();
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                updateDirectoryName();
                path = fc.getSelectedFile().toPath();
                File userDir;
                if (!this.patientDirectoryName.equals("photos\\")){
                    userDir = new File(patientDirectoryName);
                    if (!userDir.exists())
                         userDir.mkdirs();
                    try {
                        copyFile(new File(path.toString()), new File(patientDirectoryName + "\\" + "personalPhoto.jpg"));
                        picturePanel.loadImage(getPatientDirectoryName() + "\\" + "personalPhoto.jpg");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                else
                    javax.swing.JOptionPane.showMessageDialog(this,"You need to enter the first name, last name, AMKA and photo location before the file can be saved.","Please complete the information",javax.swing.JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

   public void loadPatientInfo(PersonalInfo pi){

          firstNTextField.setText(pi.getFirstName());
          middleNTextField.setText(pi.getMiddleName());
          lastNTextField.setText(pi.getLastName());
          addressTextField.setText(pi.getAddress());
          addressNumTextField.setText(Integer.toString(pi.getAddressNum()));
          cityTextField.setText(pi.getCity());
          regionTextField.setText(pi.getStateRegion());
          countryTextField.setText(pi.getCountry());
          postalCTextField.setText(Integer.toString(pi.getPostalCode()));
          citizenshipTextField.setText(pi.getCitizenship());
          heightTextField.setText(Integer.toString(pi.getHeight()));
          weightTextField.setText(Float.toString(pi.getWeight()));

          if(pi.getGender().equals("Male"))
              maleRadioButton.setSelected(true);
          else
              femaleRadioButton.setSelected(true);

          if(pi.getStatus().equals("Married"))
              marriedRadioButton.setSelected(true);
          else
              singleRadioButton.setSelected(true);

          birthDateChooser.setDate(pi.getBirthDate());
//          birthDateChooser.setText(pi.getBirthDate().toString());
          profTextField.setText(pi.getProfession());
          insuranceTextField.setText(pi.getInsurrance());
          amkaTextField.setText(Long.toString(pi.getInsuranceIdNumber()));
          tameioComboBox.setSelectedItem(pi.getInsuranceType().toString());
          firstVisitChooser.setDate(pi.getFirstVisit());
//          firstVisitChooser.setText((pi.getFirstVisit()).toString());
          childrenSpinner.setValue(pi.getChildren());
          homeTextField.setText(Integer.toString(pi.getHomeNumber()));
          workTextField.setText(Integer.toString(pi.getWorkNumber()));
          cellTextField.setText(Integer.toString(pi.getCellPhoneNumber()));
          faxTextField.setText(Integer.toString(pi.getFaxNumber()));
          mailTextField.setText(pi.getEmail());

         // ageTextField.setText(calculateAge());
      }
   public PersonalInfo getPersonalinfo()throws NumberFormatException
   {
       String sex;
            if(maleRadioButton.isSelected() == true)
                sex = "Male";
            else
                sex = "Female";
            String marital;
            if(marriedRadioButton.isSelected() == true)
                marital = "Married";
            else
                marital = "Single";

            if(addressNumTextField.getText().equals(""))
            {
                addressNumTextField.setText("0");
                System.out.println(addressNumTextField.getText());
            }
            if(postalCTextField.getText().equals(""))
            {
                postalCTextField.setText("0");
                System.out.println(postalCTextField.getText());
            }
            if(heightTextField.getText().equals(""))
            {
                heightTextField.setText("0");
                System.out.println(heightTextField.getText());
            }
            if(weightTextField.getText().equals(""))
            {
                weightTextField.setText("0");
                System.out.println(weightTextField.getText());
            }
            if(amkaTextField.getText().equals(""))
            {
                amkaTextField.setText("0");
                System.out.println(amkaTextField.getText());
            }
            if(childrenSpinner.getValue().toString().equals(""))
            {
                childrenSpinner.setValue("0");
                System.out.println(childrenSpinner.getValue().toString());
            }

             if(homeTextField.getText().equals(""))
            {
                homeTextField.setText("0");
            }
            if(cellTextField.getText().equals(""))
            {
                cellTextField.setText("0");
            }
            if(faxTextField.getText().equals(""))
            {
                faxTextField.setText("0");
            }

            if(workTextField.getText().equals(""))
            {
                workTextField.setText("0");
            }


            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date birthD = new Date();
            Date firstV = new Date();
        try{
            if(birthDateChooser.getDate() == null)
                birthD = df.parse("0000-00-00");
            else
                birthD = df.parse(df.format(birthDateChooser.getDate().getTime()));
            if(firstVisitChooser.getDate() == null)
                firstV = df.parse("0000-00-00");
            else
                firstV = df.parse(df.format(firstVisitChooser.getDate().getTime()));
        }
        catch (ParseException ex){
            ex.printStackTrace();
        }

       return new PersonalInfo(firstNTextField.getText(),middleNTextField.getText(),
               lastNTextField.getText(),addressTextField.getText(),Integer.parseInt(addressNumTextField.getText()),cityTextField.getText(),
               regionTextField.getText(),countryTextField.getText(),
               Integer.parseInt(postalCTextField.getText()),citizenshipTextField.getText(),
               Integer.parseInt(heightTextField.getText()),Float.parseFloat(weightTextField.getText()),
               sex,marital,birthD,profTextField.getText(),insuranceTextField.getText(),
               tameioComboBox.getSelectedItem().toString(),Long.parseLong(amkaTextField.getText()),
               firstV,Integer.parseInt(childrenSpinner.getValue().toString()),
               Integer.parseInt(homeTextField.getText()),Integer.parseInt(cellTextField.getText()),
               Integer.parseInt(workTextField.getText()),
               Integer.parseInt(faxTextField.getText()),
               mailTextField.getText());
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
       public String getPatientDirectoryName() {
        return patientDirectoryName;
    }

    public void setPatientDirectoryName(String patientDirectoryName) {
        this.patientDirectoryName = "photos\\" + patientDirectoryName.trim();
    }
    private void updateDirectoryName(){
        PersonalInfo pinfo;
        pinfo = this.getPersonalinfo();
        if (!pinfo.getLastName().isEmpty() && !pinfo.getFirstName().isEmpty() && !Long.toString(pinfo.getInsuranceIdNumber()).equals("0"))
            this.setPatientDirectoryName(pinfo.getLastName() + " " + pinfo.getFirstName() + " " + pinfo.getInsuranceIdNumber());
        else
            this.setPatientDirectoryName("");
    }
   }
