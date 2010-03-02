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

    private javax.swing.JScrollPane finalDiagnosisScrollingArea;
    private javax.swing.JScrollPane reasonOfHospitalizationScrollingArea;
    private javax.swing.JLabel reasonOfHospitalizationLabel;
    private javax.swing.JLabel descriptionOfSurgeryLabel;
    private javax.swing.JTextField descriptionOfSurgeryTextField;
    private javax.swing.JLabel doctorsNameLabel;
    private javax.swing.JTextField doctorsNameTextField;
    private javax.swing.JLabel finalDiagnosisLabel;
    private javax.swing.JTextArea finalDiagnosisTextArea;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JTextArea reasonOfHospitalizationTextArea;

    private javax.swing.JScrollPane familyHistoryScrollpane;

    private javax.swing.JLabel AllesMorfesOikogeniakouIstorikouLabel;
    private javax.swing.JTextField AllesMorfesOikogeniakouIstorikouTextField;
    private javax.swing.JLabel AnomaliesNefrikisPyelouLabel;
    private javax.swing.JLabel DiamartiesDiaplasisKardiakwnDiafragmatwnLabel;
    private javax.swing.JLabel DiamartiesDiaplasisKikloforikouSistimatosLabel;
    private javax.swing.JLabel DiamartiesDiaplasisPneumononLabel;
    private javax.swing.JLabel DiamartiesEnderouLabel;
    private javax.swing.JTextField DiamartiesEnderouTextField;
    private javax.swing.JLabel DiamartiesKardiasLabel;
    private javax.swing.JLabel DiamartiesTraxeiasVrohouLabel;
    private javax.swing.JTextField DiamartiesTraxeiasVrohouTextField;
    private javax.swing.JLabel DiaplasiDermatosLabel;
    private javax.swing.JTextField DiaplasiDermatosTextField;
    private javax.swing.JLabel DiaplasiNefrwnLabel;
    private javax.swing.JTextField DiaplasiNefrwnTextField;
    private javax.swing.JLabel DiaplasiOuritiraLabel;
    private javax.swing.JTextField DiaplasiOuropoiitikouSistimatosTextField;
    private javax.swing.JLabel DiaplasiOuroupoiitikouSistimatosLabel;
    private javax.swing.JLabel DiaplasiPeptikouSistimatosLabel;
    private javax.swing.JTextField DiaplasiPeptikouSistimatosTextField;
    private javax.swing.JLabel DiataraxesNefrouOuritiraLabel;
    private javax.swing.JLabel DisanexiaLaktozisLabel;
    private javax.swing.JTextField DisanexiaLaktozisTextField;
    private javax.swing.JLabel EgefalikoEpisodioLabel;
    private javax.swing.JLabel EleipsiLaktasisLabel;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo1;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo10;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo11;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo12;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo13;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo14;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo15;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo16;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo17;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo18;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo19;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo2;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo20;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo3;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo4;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo5;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo6;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo7;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo8;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonNo9;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes1;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes10;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes11;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes12;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes13;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes14;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes15;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes16;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes17;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes18;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes19;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes2;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes20;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes3;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes4;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes5;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes6;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes7;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes8;
    private javax.swing.JRadioButton FamilyHistoryRadioButtonYes9;
    private javax.swing.JLabel IstorikoAsthmatosLabel;
    private javax.swing.JLabel IstorikoLeuxemiasLabel;
    private javax.swing.JLabel IstorikoSarkomatwnLabel;
    private javax.swing.JLabel KakoithiNeoplasmataLabel;
    private javax.swing.JTextField KakoithiNeoplasmataTextField;
    private javax.swing.JLabel KardiakiKoilotitaLabel;
    private javax.swing.JLabel KataxrisiAlkoolLabel;
    private javax.swing.JLabel KistikiNososNefrwnLabel;
    private javax.swing.JLabel KlironomikiAnaimiaLabel;
    private javax.swing.JLabel KlironomikosDiavitisLabel;
    private javax.swing.JLabel NefrikiAgenesiaLabel;
    private javax.swing.JTextField NefrikiAgenesiaTextField;
    private javax.swing.JLabel PsixikesDiataraxesLabel;
    private javax.swing.JLabel SigenisThiroeidismosLabel;
    private javax.swing.JTextField SigenisThiroeidismosTextField;
    private javax.swing.JLabel StenosiLeptouEnderouLabel;
    private javax.swing.JLabel StenosiPaxeosEnderouLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;

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

        initSurgicalHistory();

//        javax.swing.GroupLayout surgeryHistoryPaneLayout = new javax.swing.GroupLayout(surgeryHistoryPane);
//        surgeryHistoryPane.setLayout(surgeryHistoryPaneLayout);
//        surgeryHistoryPaneLayout.setHorizontalGroup(
//            surgeryHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 806, Short.MAX_VALUE)
//        );
//        surgeryHistoryPaneLayout.setVerticalGroup(
//            surgeryHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 576, Short.MAX_VALUE)
//        );

        addPatientTabbedPane.addTab("Surgery History", surgeryHistoryPane);

//        javax.swing.GroupLayout familyHistoryPaneLayout = new javax.swing.GroupLayout(familyHistoryPane);
//        familyHistoryPane.setLayout(familyHistoryPaneLayout);
//        familyHistoryPaneLayout.setHorizontalGroup(
//            familyHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 806, Short.MAX_VALUE)
//        );
//        familyHistoryPaneLayout.setVerticalGroup(
//            familyHistoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 576, Short.MAX_VALUE)
//        );

        initFamilyHistory();

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

    private void initSurgicalHistory(){
        
        descriptionOfSurgeryLabel = new javax.swing.JLabel();
        hospitalNameLabel = new javax.swing.JLabel();
        reasonOfHospitalizationLabel = new javax.swing.JLabel();
        finalDiagnosisLabel = new javax.swing.JLabel();
        doctorsNameLabel = new javax.swing.JLabel();
        descriptionOfSurgeryTextField = new javax.swing.JTextField();
        hospitalNameTextField = new javax.swing.JTextField();
        reasonOfHospitalizationTextArea = new javax.swing.JTextArea();
        finalDiagnosisTextArea = new javax.swing.JTextArea();
        doctorsNameTextField = new javax.swing.JTextField();

        reasonOfHospitalizationScrollingArea = new JScrollPane(reasonOfHospitalizationTextArea);
        finalDiagnosisScrollingArea = new JScrollPane(finalDiagnosisTextArea);

        descriptionOfSurgeryLabel.setText("Description Of Surgery :");
        hospitalNameLabel.setText("Hospital Name :");
        reasonOfHospitalizationLabel.setText("Hospitalization Reason :");
        finalDiagnosisLabel.setText("Final Diagnosis :");
        doctorsNameLabel.setText("Doctors Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(surgeryHistoryPane);
        surgeryHistoryPane.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionOfSurgeryLabel)
                            .addComponent(hospitalNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospitalNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(descriptionOfSurgeryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonOfHospitalizationLabel)
                            .addComponent(finalDiagnosisLabel)
                            .addComponent(doctorsNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalDiagnosisScrollingArea, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(reasonOfHospitalizationScrollingArea, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(doctorsNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionOfSurgeryLabel)
                    .addComponent(descriptionOfSurgeryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalNameLabel)
                    .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reasonOfHospitalizationLabel)
                    .addComponent(reasonOfHospitalizationScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalDiagnosisLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalDiagnosisScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorsNameLabel))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }

    private void initFamilyHistory(){
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        IstorikoLeuxemiasLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo19 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes19 = new javax.swing.JRadioButton();
        DiaplasiPeptikouSistimatosLabel = new javax.swing.JLabel();
        DiaplasiPeptikouSistimatosTextField = new javax.swing.JTextField();
        FamilyHistoryRadioButtonNo9 = new javax.swing.JRadioButton();
        DiamartiesEnderouTextField = new javax.swing.JTextField();
        KistikiNososNefrwnLabel = new javax.swing.JLabel();
        NefrikiAgenesiaLabel = new javax.swing.JLabel();
        NefrikiAgenesiaTextField = new javax.swing.JTextField();
        FamilyHistoryRadioButtonYes11 = new javax.swing.JRadioButton();
        AnomaliesNefrikisPyelouLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo10 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes10 = new javax.swing.JRadioButton();
        AllesMorfesOikogeniakouIstorikouLabel = new javax.swing.JLabel();
        AllesMorfesOikogeniakouIstorikouTextField = new javax.swing.JTextField();
        FamilyHistoryRadioButtonYes20 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo20 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo16 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes16 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes17 = new javax.swing.JRadioButton();
        IstorikoSarkomatwnLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo7 = new javax.swing.JRadioButton();
        DiamartiesTraxeiasVrohouLabel = new javax.swing.JLabel();
        DiaplasiDermatosLabel = new javax.swing.JLabel();
        StenosiLeptouEnderouLabel = new javax.swing.JLabel();
        StenosiPaxeosEnderouLabel = new javax.swing.JLabel();
        DiamartiesEnderouLabel = new javax.swing.JLabel();
        DiamartiesTraxeiasVrohouTextField = new javax.swing.JTextField();
        DiaplasiDermatosTextField = new javax.swing.JTextField();
        FamilyHistoryRadioButtonYes1 = new javax.swing.JRadioButton();
        EgefalikoEpisodioLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes8 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo2 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes2 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes9 = new javax.swing.JRadioButton();
        DiamartiesDiaplasisPneumononLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo8 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo1 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo17 = new javax.swing.JRadioButton();
        KakoithiNeoplasmataLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes3 = new javax.swing.JRadioButton();
        KakoithiNeoplasmataTextField = new javax.swing.JTextField();
        DiamartiesDiaplasisKikloforikouSistimatosLabel = new javax.swing.JLabel();
        KataxrisiAlkoolLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes18 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo18 = new javax.swing.JRadioButton();
        KlironomikosDiavitisLabel = new javax.swing.JLabel();
        SigenisThiroeidismosTextField = new javax.swing.JTextField();
        SigenisThiroeidismosLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo14 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes14 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo6 = new javax.swing.JRadioButton();
        KlironomikiAnaimiaLabel = new javax.swing.JLabel();
        IstorikoAsthmatosLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes6 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes5 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo5 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo4 = new javax.swing.JRadioButton();
        KardiakiKoilotitaLabel = new javax.swing.JLabel();
        DiamartiesDiaplasisKardiakwnDiafragmatwnLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes4 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes7 = new javax.swing.JRadioButton();
        DiamartiesKardiasLabel = new javax.swing.JLabel();
        DisanexiaLaktozisTextField = new javax.swing.JTextField();
        PsixikesDiataraxesLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo15 = new javax.swing.JRadioButton();
        DisanexiaLaktozisLabel = new javax.swing.JLabel();
        EleipsiLaktasisLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonYes15 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo12 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes12 = new javax.swing.JRadioButton();
        DiaplasiNefrwnLabel = new javax.swing.JLabel();
        FamilyHistoryRadioButtonNo11 = new javax.swing.JRadioButton();
        DiataraxesNefrouOuritiraLabel = new javax.swing.JLabel();
        DiaplasiNefrwnTextField = new javax.swing.JTextField();
        FamilyHistoryRadioButtonNo3 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonYes13 = new javax.swing.JRadioButton();
        FamilyHistoryRadioButtonNo13 = new javax.swing.JRadioButton();
        DiaplasiOuroupoiitikouSistimatosLabel = new javax.swing.JLabel();
        DiaplasiOuropoiitikouSistimatosTextField = new javax.swing.JTextField();
        DiaplasiOuritiraLabel = new javax.swing.JLabel();


        IstorikoLeuxemiasLabel.setText("Istoriko Leuxemias :");

        FamilyHistoryRadioButtonNo19.setText("No");

        FamilyHistoryRadioButtonYes19.setText("Yes");

        DiaplasiPeptikouSistimatosLabel.setText("Diaplasi Peptikou Sistimatos :");

        FamilyHistoryRadioButtonNo9.setText("No");

        KistikiNososNefrwnLabel.setText("Kistiki Nosos Nefrwn :");

        NefrikiAgenesiaLabel.setText("Nefriki Agenesia :");

        FamilyHistoryRadioButtonYes11.setText("Yes");

        AnomaliesNefrikisPyelouLabel.setText("Anomalies Nefrikis Pyelou :");

        FamilyHistoryRadioButtonNo10.setText("No");

        FamilyHistoryRadioButtonYes10.setText("Yes");

        AllesMorfesOikogeniakouIstorikouLabel.setText("Alles Morfes Oikogeniakou Istorikou :");

        FamilyHistoryRadioButtonYes20.setText("Yes");

        FamilyHistoryRadioButtonNo20.setText("No");

        FamilyHistoryRadioButtonNo16.setText("No");

        FamilyHistoryRadioButtonYes16.setText("Yes");

        FamilyHistoryRadioButtonYes17.setText("Yes");

        IstorikoSarkomatwnLabel.setText("Istoriko Sarkomatwn :");

        FamilyHistoryRadioButtonNo7.setText("No");

        DiamartiesTraxeiasVrohouLabel.setText("Diamarties Traxeias Vrohou :");

        DiaplasiDermatosLabel.setText("Diaplasi Dermatos :");

        StenosiLeptouEnderouLabel.setText("Stenosi Leptou Enderou :");

        StenosiPaxeosEnderouLabel.setText("Stenosi Paxeos Enderou :");

        DiamartiesEnderouLabel.setText("Diamarties Enderou :");

        FamilyHistoryRadioButtonYes1.setText("Yes");

        EgefalikoEpisodioLabel.setText("Egefaliko Episodio :");

        FamilyHistoryRadioButtonYes8.setText("Yes");

        FamilyHistoryRadioButtonNo2.setText("No");

        FamilyHistoryRadioButtonYes2.setText("Yes");

        FamilyHistoryRadioButtonYes9.setText("Yes");

        DiamartiesDiaplasisPneumononLabel.setText("Diamarties Diaplasis Pneumonon :");

        FamilyHistoryRadioButtonNo8.setText("No");

        FamilyHistoryRadioButtonNo1.setText("No");

        FamilyHistoryRadioButtonNo17.setText("No");

        KakoithiNeoplasmataLabel.setText("Kakoithi Neoplasmata :");

        FamilyHistoryRadioButtonYes3.setText("Yes");

        DiamartiesDiaplasisKikloforikouSistimatosLabel.setText("Diamarties Diaplasis Kikloforikou Sistimatos :");

        KataxrisiAlkoolLabel.setText("Kataxrisi Alkool :");

        FamilyHistoryRadioButtonYes18.setText("Yes");

        FamilyHistoryRadioButtonNo18.setText("No");

        KlironomikosDiavitisLabel.setText("Klironomikos Diavitis :");

        SigenisThiroeidismosLabel.setText("Sigenis Thiroeidismos :");

        FamilyHistoryRadioButtonNo14.setText("No");

        FamilyHistoryRadioButtonYes14.setText("Yes");

        FamilyHistoryRadioButtonNo6.setText("No");

        KlironomikiAnaimiaLabel.setText("Klironomiki Anaimia :");

        IstorikoAsthmatosLabel.setText("Istoriko Asthmatos :");

        FamilyHistoryRadioButtonYes6.setText("Yes");

        FamilyHistoryRadioButtonYes5.setText("Yes");

        FamilyHistoryRadioButtonNo5.setText("No");

        FamilyHistoryRadioButtonNo4.setText("No");

        KardiakiKoilotitaLabel.setText("Kardiaki Koilotita :");

        DiamartiesDiaplasisKardiakwnDiafragmatwnLabel.setText("Diamarties Diaplasis Kardiakwn Diafragmatwn :");

        FamilyHistoryRadioButtonYes4.setText("Yes");

        FamilyHistoryRadioButtonYes7.setText("Yes");

        DiamartiesKardiasLabel.setText("Diamarties Kardias :");

        PsixikesDiataraxesLabel.setText("Psixikes Diataraxes :");

        FamilyHistoryRadioButtonNo15.setText("No");

        DisanexiaLaktozisLabel.setText("Disanexia Laktozis :");

        EleipsiLaktasisLabel.setText("Eleipsi Laktasis :");

        FamilyHistoryRadioButtonYes15.setText("Yes");

        FamilyHistoryRadioButtonNo12.setText("No");

        FamilyHistoryRadioButtonYes12.setText("Yes");

        DiaplasiNefrwnLabel.setText("Diaplasi Nefrwn :");

        FamilyHistoryRadioButtonNo11.setText("No");

        DiataraxesNefrouOuritiraLabel.setText("Diataraxes Nefrou Ouritira :");

        FamilyHistoryRadioButtonNo3.setText("No");

        FamilyHistoryRadioButtonYes13.setText("Yes");

        FamilyHistoryRadioButtonNo13.setText("No");

        DiaplasiOuroupoiitikouSistimatosLabel.setText("Diaplasi Ouroupoiitikou Sistimatos :");

        DiaplasiOuritiraLabel.setText("Diaplasi Ouritira :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EgefalikoEpisodioLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes1)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesKardiasLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes7)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesTraxeiasVrohouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiamartiesTraxeiasVrohouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaplasiDermatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiaplasiDermatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StenosiLeptouEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes8)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StenosiPaxeosEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes9)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiamartiesEnderouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaplasiPeptikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiaplasiPeptikouSistimatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NefrikiAgenesiaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NefrikiAgenesiaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KistikiNososNefrwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes10)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AnomaliesNefrikisPyelouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes11)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaplasiNefrwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiaplasiNefrwnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiataraxesNefrouOuritiraLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes12)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaplasiOuritiraLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes13)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaplasiOuroupoiitikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DiaplasiOuropoiitikouSistimatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KlironomikiAnaimiaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes14)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SigenisThiroeidismosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SigenisThiroeidismosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EleipsiLaktasisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes15)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DisanexiaLaktozisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DisanexiaLaktozisTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PsixikesDiataraxesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes16)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IstorikoSarkomatwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes17)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KakoithiNeoplasmataLabel)
                        .addGap(18, 18, 18)
                        .addComponent(KakoithiNeoplasmataTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KataxrisiAlkoolLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes18)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KlironomikosDiavitisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes19)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IstorikoLeuxemiasLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes20)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AllesMorfesOikogeniakouIstorikouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AllesMorfesOikogeniakouIstorikouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesDiaplasisPneumononLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes2)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesDiaplasisKikloforikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes3)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiamartiesDiaplasisKardiakwnDiafragmatwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes4)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(KardiakiKoilotitaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes5)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IstorikoAsthmatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonYes6)
                        .addGap(18, 18, 18)
                        .addComponent(FamilyHistoryRadioButtonNo6)))
                .addGap(5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EgefalikoEpisodioLabel)
                    .addComponent(FamilyHistoryRadioButtonYes1)
                    .addComponent(FamilyHistoryRadioButtonNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesDiaplasisPneumononLabel)
                    .addComponent(FamilyHistoryRadioButtonYes2)
                    .addComponent(FamilyHistoryRadioButtonNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesDiaplasisKikloforikouSistimatosLabel)
                    .addComponent(FamilyHistoryRadioButtonYes3)
                    .addComponent(FamilyHistoryRadioButtonNo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesDiaplasisKardiakwnDiafragmatwnLabel)
                    .addComponent(FamilyHistoryRadioButtonYes4)
                    .addComponent(FamilyHistoryRadioButtonNo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KardiakiKoilotitaLabel)
                    .addComponent(FamilyHistoryRadioButtonYes5)
                    .addComponent(FamilyHistoryRadioButtonNo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IstorikoAsthmatosLabel)
                    .addComponent(FamilyHistoryRadioButtonYes6)
                    .addComponent(FamilyHistoryRadioButtonNo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesKardiasLabel)
                    .addComponent(FamilyHistoryRadioButtonYes7)
                    .addComponent(FamilyHistoryRadioButtonNo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesTraxeiasVrohouLabel)
                    .addComponent(DiamartiesTraxeiasVrohouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaplasiDermatosLabel)
                    .addComponent(DiaplasiDermatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StenosiLeptouEnderouLabel)
                    .addComponent(FamilyHistoryRadioButtonYes8)
                    .addComponent(FamilyHistoryRadioButtonNo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StenosiPaxeosEnderouLabel)
                    .addComponent(FamilyHistoryRadioButtonYes9)
                    .addComponent(FamilyHistoryRadioButtonNo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiamartiesEnderouLabel)
                    .addComponent(DiamartiesEnderouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaplasiPeptikouSistimatosLabel)
                    .addComponent(DiaplasiPeptikouSistimatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NefrikiAgenesiaLabel)
                    .addComponent(NefrikiAgenesiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KistikiNososNefrwnLabel)
                    .addComponent(FamilyHistoryRadioButtonYes10)
                    .addComponent(FamilyHistoryRadioButtonNo10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnomaliesNefrikisPyelouLabel)
                    .addComponent(FamilyHistoryRadioButtonYes11)
                    .addComponent(FamilyHistoryRadioButtonNo11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaplasiNefrwnLabel)
                    .addComponent(DiaplasiNefrwnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiataraxesNefrouOuritiraLabel)
                    .addComponent(FamilyHistoryRadioButtonYes12)
                    .addComponent(FamilyHistoryRadioButtonNo12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaplasiOuritiraLabel)
                    .addComponent(FamilyHistoryRadioButtonYes13)
                    .addComponent(FamilyHistoryRadioButtonNo13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaplasiOuroupoiitikouSistimatosLabel)
                    .addComponent(DiaplasiOuropoiitikouSistimatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KlironomikiAnaimiaLabel)
                    .addComponent(FamilyHistoryRadioButtonYes14)
                    .addComponent(FamilyHistoryRadioButtonNo14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigenisThiroeidismosLabel)
                    .addComponent(SigenisThiroeidismosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EleipsiLaktasisLabel)
                    .addComponent(FamilyHistoryRadioButtonYes15)
                    .addComponent(FamilyHistoryRadioButtonNo15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisanexiaLaktozisLabel)
                    .addComponent(DisanexiaLaktozisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PsixikesDiataraxesLabel)
                    .addComponent(FamilyHistoryRadioButtonYes16)
                    .addComponent(FamilyHistoryRadioButtonNo16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IstorikoSarkomatwnLabel)
                    .addComponent(FamilyHistoryRadioButtonYes17)
                    .addComponent(FamilyHistoryRadioButtonNo17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KakoithiNeoplasmataLabel)
                    .addComponent(KakoithiNeoplasmataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KataxrisiAlkoolLabel)
                    .addComponent(FamilyHistoryRadioButtonYes18)
                    .addComponent(FamilyHistoryRadioButtonNo18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KlironomikosDiavitisLabel)
                    .addComponent(FamilyHistoryRadioButtonYes19)
                    .addComponent(FamilyHistoryRadioButtonNo19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IstorikoLeuxemiasLabel)
                    .addComponent(FamilyHistoryRadioButtonYes20)
                    .addComponent(FamilyHistoryRadioButtonNo20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllesMorfesOikogeniakouIstorikouLabel)
                    .addComponent(AllesMorfesOikogeniakouIstorikouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(familyHistoryPane);
        familyHistoryPane.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
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
                    break;
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
