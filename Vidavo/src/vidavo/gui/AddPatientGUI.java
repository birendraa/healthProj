/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import vidavo.*;


/**
 *
 * @author Bosko
 */
public class AddPatientGUI extends JFrame implements ActionListener{

    private PatientManager pm;
    int patientID = 0;

    private JTabbedPane addPatientTabbedPane;
    private JLabel addressLabel;
    private JLabel addressNumLabel;
    private JTextField addressNumTextField;
    private JTextField addressTextField;
    private JLabel amkaLabel;
    private JTextField amkaTextField;
    private JLabel birthDateLabel;
    private JTextField birthDateTextField;
    private JButton cancelButton;
    private JLabel cellLabel;
    private JTextField cellTextField;
    private JLabel childrenLabel;
    private JSpinner childrenSpinner;
    private JPanel chronicDiseasesPane;
    private JPanel chronicMedicationsPane;
    private JLabel citizenshipLabel;
    private JTextField citizenshipTextField;
    private JLabel cityLabel;
    private JTextField cityTextField;
    private JPanel communicationNumPane;
    private JPanel contactsPane;
    private JLabel countryLabel;
    private JTextField countryTextField;
    private JPanel familyHistoryPane;
    private JLabel faxLabel;
    private JTextField faxTextField;
    private JRadioButton femaleRadioButton;
    private JLabel firstNLabel;
    private JTextField firstNTextField;
    private JPanel habitsPane;
    private JLabel heightLabel;
    private JTextField heightTextField;
    private JLabel homeLabel;
    private JTextField homeTextField;
    private JLabel idLabel;
    private JLabel idLabel2;
    private JPanel immunizationHistoryPane;
    private JPanel infoPane;
    private JLabel insuranceLabel;
    private JTextField insuranceTextField;
    private JPanel jPanel16;
    private JLabel lastNLabel;
    private JTextField lastNTextField;
    private JLabel mailLabel;
    private JTextField mailTextField;
    private JPanel mainPanel;
    private JRadioButton maleRadioButton;
    private JRadioButton marriedRadioButton;
    private JPanel medicalHistoryPane;
    private JPanel medicationsPane;
    private JLabel middleNLabel;
    private JTextField middleNTextField;
    private JPanel parallelDiseasesPane;
    private JLabel patientPhotoLabel;
    private JPanel personalInfoPane;
    private JPanel photosPane;
    private JButton pictureButton;
    private JLabel postalCLabel;
    private JTextField postalCTextField;
    private JLabel profLabel;
    private JTextField profTextField;
    private JLabel firstVisitLabel;
    private JTextField firstVisitTextField;
    private JLabel regionLabel;
    private JTextField regionTextField;
    private JButton saveButton;
    private JRadioButton singleRadioButton;
    private JPanel surgeryHistoryPane;
    private JComboBox tameioComboBox;
    private JLabel tameioLabel;
    private JLabel weightLabel;
    private JTextField weightTextField;
    private JLabel workLabel;
    private JTextField workTextField;
    private JLabel ageLabel;
    private JTextField ageTextField;

    /**
     *
     * @param pm
     * @param selectedID
     */
    public AddPatientGUI(PatientManager pm, int selectedID)
    {

        super();
        this.pm = pm;
        assignIdToPatient();
        initComponents();
        

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCancelDialog();
            }
        });
        this.setSize(new Dimension(817, 650));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Add Patient");
        this.pack();
        this.setVisible(true);
    }

    /**
     *
     */
    private void initComponents()
    {

        mainPanel = new JPanel();
        addPatientTabbedPane = new JTabbedPane();
        medicalHistoryPane = new JPanel();
        surgeryHistoryPane = new JPanel();
        familyHistoryPane = new JPanel();
        immunizationHistoryPane = new JPanel();
        habitsPane = new JPanel();
        medicationsPane = new JPanel();
        chronicMedicationsPane = new JPanel();
        chronicDiseasesPane = new JPanel();
        parallelDiseasesPane = new JPanel();
        contactsPane = new JPanel();
        photosPane = new JPanel();
        personalInfoPane = new JPanel();
        infoPane = new JPanel();
        idLabel = new JLabel();
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
        idLabel2 = new JLabel();
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
        childrenSpinner = new JSpinner( new SpinnerNumberModel (0,0,9999,1));
        firstVisitTextField = new JTextField();
        heightTextField = new JTextField();
        weightTextField = new JTextField();
        birthDateTextField = new JTextField();
        profTextField = new JTextField();
        insuranceTextField = new JTextField();
        amkaTextField = new JTextField();
        tameioComboBox = new JComboBox();
        jPanel16 = new JPanel();
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
        saveButton = new JButton();
        cancelButton = new JButton();
        ageLabel = new JLabel();
        ageTextField = new JTextField();


        idLabel.setText("ID* :");
        firstNLabel.setText("First Name* :");
        middleNLabel.setText("Middle Name:");
        lastNLabel.setText("Last Name* :");
        addressLabel.setText("Address:");
        addressNumLabel.setText("Address Number:");
        cityLabel.setText("City:");
        regionLabel.setText("State/Region:");
        countryLabel.setText("Country:");
        postalCLabel.setText("Postal Code:");
        citizenshipLabel.setText("Citizenship:");
        addressNumTextField.setText("");
        addressTextField.setText("");
        lastNTextField.setText("");
        middleNTextField.setText("");
        firstNTextField.setText("");
        cityTextField.setText("");
        regionTextField.setText("");
        countryTextField.setText("");
        postalCTextField.setText("");
        citizenshipTextField.setText("");
        heightLabel.setText("Height (cm)");
        weightLabel.setText("Weight (kg)");
        maleRadioButton.setText("Male");
        femaleRadioButton.setText("Female");
        marriedRadioButton.setText("Married");
        singleRadioButton.setText("Single");
        birthDateLabel.setText("Birth Date:");
        profLabel.setText("Profession:");
        insuranceLabel.setText("Insurance* :");
        amkaLabel.setText("AMKA* :");
        tameioLabel.setText("Tameio* :");
        firstVisitLabel.setText("First Visit:");
        childrenLabel.setText("Children:");
        firstVisitTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        birthDateTextField.setText("");
        profTextField.setText("");
        insuranceTextField.setText("");
        amkaTextField.setText("");
        tameioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ageLabel.setText("Age:");
        ageTextField.setText("");

idLabel2.setText(Integer.toString(patientID));

        jPanel16.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel16.setName("jPanel16");

        ButtonGroup maleFemaleGroup =  new ButtonGroup();
        maleFemaleGroup.add(maleRadioButton);
        maleFemaleGroup.add(femaleRadioButton);

        ButtonGroup marriedSingleGroup =  new ButtonGroup();
        marriedSingleGroup.add(marriedRadioButton);
        marriedSingleGroup.add(singleRadioButton);


        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        patientPhotoLabel.setText("Patient Photo:");
        pictureButton.setText("Take Photo:");

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
                    .addComponent(idLabel)
                    .addComponent(cityLabel)
                    .addComponent(regionLabel)
                    .addComponent(countryLabel)
                    .addComponent(postalCLabel)
                    .addComponent(citizenshipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(citizenshipTextField)
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
                            .addComponent(marriedRadioButton)
                            .addComponent(ageLabel))
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
                                .addComponent(firstVisitTextField)
                                .addComponent(tameioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amkaTextField)
                                .addComponent(insuranceTextField)
                                .addComponent(profTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addGroup(infoPaneLayout.createSequentialGroup()
                                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(infoPaneLayout.createSequentialGroup()
                                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(singleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPaneLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientPhotoLabel)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        infoPaneLayout.setVerticalGroup(
            infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idLabel2)
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
                            .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(firstVisitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(citizenshipLabel)
                            .addComponent(citizenshipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childrenLabel)
                            .addComponent(childrenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoPaneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        communicationNumPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Communication Numbers")); // NOI18N

        homeLabel.setText("Home:");
        workLabel.setText("Work:");
        homeTextField.setText("");
        workTextField.setText("");
        cellLabel.setText("Cell Phone:");
        faxLabel.setText("Fax");
        cellTextField.setText("");
        faxTextField.setText("");
        mailLabel.setText("E-mail:");
        mailTextField.setText("");

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

        saveButton.setText("Save");
        saveButton.addActionListener(this);
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(this);

        javax.swing.GroupLayout personalInfoPaneLayout = new javax.swing.GroupLayout(personalInfoPane);
        personalInfoPane.setLayout(personalInfoPaneLayout);
        personalInfoPaneLayout.setHorizontalGroup(
            personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoPaneLayout.createSequentialGroup()
                .addGroup(personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalInfoPaneLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(communicationNumPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(18, 18, 18))
        );

        addPatientTabbedPane.addTab("Personal Info", personalInfoPane);

        javax.swing.GroupLayout medicalHistoryPaneLayout = new javax.swing.GroupLayout(medicalHistoryPane);
        medicalHistoryPane.setLayout(medicalHistoryPaneLayout);
        medicalHistoryPaneLayout.setHorizontalGroup(
            medicalHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        medicalHistoryPaneLayout.setVerticalGroup(
            medicalHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Medical history", medicalHistoryPane);

        javax.swing.GroupLayout surgeryHistoryPaneLayout = new javax.swing.GroupLayout(surgeryHistoryPane);
        surgeryHistoryPane.setLayout(surgeryHistoryPaneLayout);
        surgeryHistoryPaneLayout.setHorizontalGroup(
            surgeryHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        surgeryHistoryPaneLayout.setVerticalGroup(
            surgeryHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Surgery History", surgeryHistoryPane);

        javax.swing.GroupLayout familyHistoryPaneLayout = new javax.swing.GroupLayout(familyHistoryPane);
        familyHistoryPane.setLayout(familyHistoryPaneLayout);
        familyHistoryPaneLayout.setHorizontalGroup(
            familyHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        familyHistoryPaneLayout.setVerticalGroup(
            familyHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Family history", familyHistoryPane);

        javax.swing.GroupLayout immunizationHistoryPaneLayout = new javax.swing.GroupLayout(immunizationHistoryPane);
        immunizationHistoryPane.setLayout(immunizationHistoryPaneLayout);
        immunizationHistoryPaneLayout.setHorizontalGroup(
            immunizationHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        immunizationHistoryPaneLayout.setVerticalGroup(
            immunizationHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Immunization History", immunizationHistoryPane);

        javax.swing.GroupLayout habitsPaneLayout = new javax.swing.GroupLayout(habitsPane);
        habitsPane.setLayout(habitsPaneLayout);
        habitsPaneLayout.setHorizontalGroup(
            habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        habitsPaneLayout.setVerticalGroup(
            habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Habits", habitsPane);

        javax.swing.GroupLayout medicationsPaneLayout = new javax.swing.GroupLayout(medicationsPane);
        medicationsPane.setLayout(medicationsPaneLayout);
        medicationsPaneLayout.setHorizontalGroup(
            medicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        medicationsPaneLayout.setVerticalGroup(
            medicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Medications", medicationsPane);

        javax.swing.GroupLayout chronicMedicationsPaneLayout = new javax.swing.GroupLayout(chronicMedicationsPane);
        chronicMedicationsPane.setLayout(chronicMedicationsPaneLayout);
        chronicMedicationsPaneLayout.setHorizontalGroup(
            chronicMedicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        chronicMedicationsPaneLayout.setVerticalGroup(
            chronicMedicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Chronic Medications", chronicMedicationsPane);

        javax.swing.GroupLayout chronicDiseasesPaneLayout = new javax.swing.GroupLayout(chronicDiseasesPane);
        chronicDiseasesPane.setLayout(chronicDiseasesPaneLayout);
        chronicDiseasesPaneLayout.setHorizontalGroup(
            chronicDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        chronicDiseasesPaneLayout.setVerticalGroup(
            chronicDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Chronic Diseases", chronicDiseasesPane);

        javax.swing.GroupLayout parallelDiseasesPaneLayout = new javax.swing.GroupLayout(parallelDiseasesPane);
        parallelDiseasesPane.setLayout(parallelDiseasesPaneLayout);
        parallelDiseasesPaneLayout.setHorizontalGroup(
            parallelDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        parallelDiseasesPaneLayout.setVerticalGroup(
            parallelDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Parallel diseases", parallelDiseasesPane);

        javax.swing.GroupLayout contactsPaneLayout = new javax.swing.GroupLayout(contactsPane);
        contactsPane.setLayout(contactsPaneLayout);
        contactsPaneLayout.setHorizontalGroup(
            contactsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        contactsPaneLayout.setVerticalGroup(
            contactsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Contacts", contactsPane);

        javax.swing.GroupLayout photosPaneLayout = new javax.swing.GroupLayout(photosPane);
        photosPane.setLayout(photosPaneLayout);
        photosPaneLayout.setHorizontalGroup(
            photosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        photosPaneLayout.setVerticalGroup(
            photosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        addPatientTabbedPane.addTab("Photo", photosPane);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPatientTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPatientTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.setContentPane(mainPanel);

        /*javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );*/
    //}
    }

    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if(action.equals("Save"))
        {
            try
            {

//                if (patientID < patientNumber)
//                    s.executeUpdate("DELETE FROM personalInfo WHERE patientID=" + patientID + ";");
//                else if(patientID == patientNumber)
//                    s.executeUpdate("INSERT INTO patients VALUES " + "("+ patientID +")" + ";");

                Patient p = new Patient(patientID,firstNTextField.getText(),lastNTextField.getText(),insuranceTextField.getText(),Integer.parseInt(amkaTextField.getText()),tameioComboBox.getSelectedItem().toString());

                if(!middleNTextField.getText().equals(""))
                    (p.getPersonalInfo()).setMName(middleNTextField.getText());

                if(!addressTextField.getText().equals(""))
                    (p.getPersonalInfo()).setAddress(addressTextField.getText());

                if(!addressNumTextField.getText().equals(""))
                    (p.getPersonalInfo()).setAddressNum(Integer.parseInt(addressNumTextField.getText()));

                if(!cityTextField.getText().equals(""))
                    (p.getPersonalInfo()).setCity(cityTextField.getText());

                if(!regionTextField.getText().equals(""))
                    (p.getPersonalInfo()).setState(regionTextField.getText());

                if(!countryTextField.getText().equals(""))
                    (p.getPersonalInfo()).setCountry(countryTextField.getText());

                if(!postalCTextField.getText().equals(""))
                    (p.getPersonalInfo()).setPostalCode(Integer.parseInt(postalCTextField.getText()));

                if(!citizenshipTextField.getText().equals(""))
                    (p.getPersonalInfo()).setCitizenship(citizenshipTextField.getText());

                if(!heightTextField.getText().equals(""))
                    (p.getPersonalInfo()).setHeight(Integer.parseInt(heightTextField.getText()));

                if(!weightTextField.getText().equals(""))
                    (p.getPersonalInfo()).setWeight(Integer.parseInt(weightTextField.getText()));

                if(maleRadioButton.isSelected() == true)
                    (p.getPersonalInfo()).setSex(maleRadioButton.getText());

                if(femaleRadioButton.isSelected() == true)
                    (p.getPersonalInfo()).setSex(femaleRadioButton.getText());

                if(marriedRadioButton.isSelected() == true)
                    (p.getPersonalInfo()).setMaritalStatus(marriedRadioButton.getText());

                if(singleRadioButton.isSelected() == true)
                    (p.getPersonalInfo()).setMaritalStatus(singleRadioButton.getText());

                if(!birthDateTextField.getText().equals(""))
                    (p.getPersonalInfo()).setBirthDate(birthDateTextField.getText());

                if(!profTextField.getText().equals(""))
                    (p.getPersonalInfo()).setProfession(profTextField.getText());

                if(!firstVisitTextField.getText().equals(""))
                    (p.getPersonalInfo()).setFirstVisit(firstVisitTextField.getText());

                if(!childrenSpinner.getValue().equals(null))
                    (p.getPersonalInfo()).setChildren(Integer.parseInt(childrenSpinner.getValue().toString()));

                if(!homeTextField.getText().equals(""))
                    (p.getPersonalInfo()).setHomeNum(homeTextField.getText());

                if(!workTextField.getText().equals(""))
                    (p.getPersonalInfo()).setWorkNum(workTextField.getText());

                if(!cellTextField.getText().equals(""))
                    (p.getPersonalInfo()).setCellPhone(cellTextField.getText());

                if(!faxTextField.getText().equals(""))
                    (p.getPersonalInfo()).setFax(faxTextField.getText());

                if(!mailTextField.getText().equals(""))
                    (p.getPersonalInfo()).setEmail(mailTextField.getText());

                pm.dbUpdate("INSERT INTO personalInfo VALUES " + "(" + patientID + ", " +
                       "\"" + p.getPersonalInfo().getFName() + "\", " +
                       "\"" + p.getPersonalInfo().getMName() + "\", " +
                       "\"" + p.getPersonalInfo().getLName() + "\", " +
                       "\"" + p.getPersonalInfo().getAddress() + "\", " +
                       p.getPersonalInfo().getAddressNum() + ", " +
                       "\"" + p.getPersonalInfo().getCity() + "\", " +
                       "\"" + p.getPersonalInfo().getState() + "\", " +
                       "\"" + p.getPersonalInfo().getCountry() + "\", " +
                       p.getPersonalInfo().getPostalCode() + ", " +
                       "\"" + p.getPersonalInfo().getCitizenship() + "\", " +
                       p.getPersonalInfo().getHeight() + ", " +
                       p.getPersonalInfo().getWeight()+ ", " +
                       "\"" + p.getPersonalInfo().getSex() + "\", " +
                       "\"" + p.getPersonalInfo().getMaritalStatus() + "\", " +
                       "\"" + p.getPersonalInfo().getBirthDate() + "\", " +
                       "\"" + p.getPersonalInfo().getProfession() + "\", " +
                       "\"" + p.getPersonalInfo().getInsurance() + "\", " +
                       "\"" + p.getPersonalInfo().getTameio() + "\", " +
                       p.getPersonalInfo().getAmka() + ", " +
                       p.getPersonalInfo().getFirstVisit() + ", " +
                       p.getPersonalInfo().getChildren() + ", " +
                       p.getPersonalInfo().getHomeNum() + ", " +
                       p.getPersonalInfo().getCellPhone()+ ", " +
                       p.getPersonalInfo().getWorkNum() + ", " +
                       p.getPersonalInfo().getFax() + ", " +
                       "\"" + p.getPersonalInfo().getEmail() + "\");");

//pl.addNewPatient(p);

                this.dispose();
                PatientListGUI plg = new PatientListGUI(pm);
//                plg.loadPatientsList();
            }
            catch (NullPointerException ex){
                JOptionPane.showMessageDialog(null,"Missing obligatory information", "Nothing entered", 2);
            }

            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Enter only digits in the amka field", "Wrong input", 2 );
            }

        }
        if (action.equals("Cancel")){
            showCancelDialog ();
        }
    }

    /**
     *
     */
    private void showCancelDialog(){

        final JDialog dialog = new JDialog(this, "Exit", true);
        final JOptionPane op = new JOptionPane("Are you sure you want to close the window? ", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setContentPane(op);
        dialog.setResizable(false);
        op.addPropertyChangeListener(new PropertyChangeListener(){
            public void propertyChange(PropertyChangeEvent e){
                String prop = e.getPropertyName();
                if (dialog.isVisible() && (e.getSource() == op) && (prop.equals(JOptionPane.VALUE_PROPERTY))) {
                    dialog.setVisible(false);
                }
            }
        });
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setResizable(false);
        dialog.setVisible(true);
        int value = ((Integer) op.getValue()).intValue();
        if (value == JOptionPane.NO_OPTION)
        {
            dialog.dispose();
        }
        else if (value == JOptionPane.YES_OPTION)
        {
            this.dispose();
            new PatientListGUI(pm);
        }
    }

    /**
     *
     * @param selectedID
     */
    public void loadPatientInfo(int selectedID){

          PersonalInfo info = pm.getPL().getPatient(selectedID).getPersonalInfo();
          idLabel2.setText(Integer.toString(selectedID));
          firstNTextField.setText(info.getFName());
          middleNTextField.setText(info.getMName());
          lastNTextField.setText(info.getLName());
          addressTextField.setText(info.getAddress());
          addressNumTextField.setText(Integer.toString(info.getAddressNum()));
          cityTextField.setText(info.getCity());
          regionTextField.setText(info.getState());
          countryTextField.setText(info.getCountry());
          postalCTextField.setText(Integer.toString(info.getPostalCode()));
          citizenshipTextField.setText(info.getCitizenship());
          heightTextField.setText(Integer.toString(info.getHeight()));
          weightTextField.setText(Integer.toString(info.getWeight()));

          if(info.getSex().equals("Male"))
              maleRadioButton.setSelected(true);
          else
              femaleRadioButton.setSelected(true);

          if(info.getMaritalStatus().equals("Married"))
              marriedRadioButton.setSelected(true);
          else
              singleRadioButton.setSelected(true);
          birthDateTextField.setText((info.getBirthDate()));
          profTextField.setText(info.getProfession());
          insuranceTextField.setText(info.getInsurance());
          amkaTextField.setText(Integer.toString(info.getAmka()));

          int selectedItem;
          for(selectedItem = 0; selectedItem <= tameioComboBox.getItemCount(); selectedItem++){
              if(info.getTameio().equals(tameioComboBox.getItemAt(selectedItem)))
                break;
          }
          tameioComboBox.setSelectedIndex(selectedItem);
          firstVisitTextField.setText((info.getFirstVisit()));
          childrenSpinner.setValue(info.getChildren());
          homeTextField.setText(info.getHomeNum());
          workTextField.setText(info.getWorkNum());
          cellTextField.setText(info.getCellPhone());
          faxTextField.setText(info.getFax());
          mailTextField.setText(info.getEmail());

         // ageTextField.setText(calculateAge());
      }

    private void assignIdToPatient(){
        if(pm.getPL() != null){
            for(int i = 0; i < pm.getPL().size(); i++){
                if(pm.getPL().getPatientAtIndex(i) == null){
                    patientID = i;
                }
            }
            if(patientID == 0)
                patientID = pm.getPL().size() + 1;
        }
        else{
            patientID = 1;
        }
    }
//    public void savePhoto(){
//        System.out.println("Insert Image Example!");
//            String driverName = "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/";
//            String dbName = "hibernatetutorial";
//            String userName = "root";
//            String password = "root";
//            Connection con = null;
//            try{
//              Class.forName(driverName);
//              con = DriverManager.getConnection(url+dbName,userName,password);
//              Statement st = con.createStatement();
//              File imgfile = new File("images.jpg");
//              FileInputStream fin = new FileInputStream(imgfile);
//              PreparedStatement pre = con.prepareStatement("insert into Image values(?,?,?)");
//              pre.setInt(1,5);
//              pre.setString(2,"Durga");
//              pre.setBinaryStream(3,fin,(int)imgfile.length());
//              pre.executeUpdate();
//              System.out.println("Inserting Successfully!");
//              pre.close();
//              con.close();
//            }
//            catch (Exception e){
//              System.out.println(e.getMessage());
//            }
//    }

}
