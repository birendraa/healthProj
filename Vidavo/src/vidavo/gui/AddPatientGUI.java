
package vidavo.gui;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

/**
 *
 * @author Bosko
 */
public class AddPatientGUI extends JFrame implements ActionListener{

    private ManagerHolder mh;
    private java.util.ListResourceBundle resourceMap;

    private JTabbedPane addPatientTabbedPane;
    private JPanel chronicDiseasesPane;
    private JPanel chronicMedicationsPane;
    private JPanel contactsPane;
    private JPanel familyHistoryPane;
    private JPanel habitsPane;
    private JPanel photosPane;
    private JPanel immunizationHistoryPane;
    private JPanel surgeryHistoryPane;
    private JPanel personalInfoPane;
    private JPanel mainPanel;

    private JButton cancelButton;
    private JButton saveButton;

    /**
     *
     * @param pm
     * @param selectedID
     */
    public AddPatientGUI(ManagerHolder mh, int selectedID, java.util.ListResourceBundle rm)
    {
        super();
        this.mh = mh;
        this.resourceMap = rm;
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
        surgeryHistoryPane = new SurgicalHistoryPane(resourceMap);
        familyHistoryPane = new FamilyHistoryPane(resourceMap);
        immunizationHistoryPane = new JPanel();
        habitsPane = new JPanel();
        chronicMedicationsPane = new ChronicMedicationPane(resourceMap);
        chronicDiseasesPane = new ChronicDiseasesPane(resourceMap);
        contactsPane = new ContactsPane(resourceMap);
        photosPane = new PhotosPane(resourceMap);
        personalInfoPane = new PersonalInfoPane(mh);
        saveButton = new JButton();
        cancelButton = new JButton();

        saveButton.setText("Save");
        saveButton.addActionListener(this);
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(this);

        addPatientTabbedPane.addTab("Personal Info", personalInfoPane);
        addPatientTabbedPane.addTab("Surgery History", surgeryHistoryPane);
        addPatientTabbedPane.addTab("Family history", familyHistoryPane);
        addPatientTabbedPane.addTab("Contacts", contactsPane);
        addPatientTabbedPane.addTab("Photos", photosPane);
        addPatientTabbedPane.addTab("Chronic Medications", chronicMedicationsPane);
        addPatientTabbedPane.addTab("Chronic Diseases", chronicDiseasesPane);

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

//        javax.swing.GroupLayout chronicMedicationsPaneLayout = new javax.swing.GroupLayout(chronicMedicationsPane);
//        chronicMedicationsPane.setLayout(chronicMedicationsPaneLayout);
//        chronicMedicationsPaneLayout.setHorizontalGroup(
//            chronicMedicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 806, Short.MAX_VALUE)
//        );
//        chronicMedicationsPaneLayout.setVerticalGroup(
//            chronicMedicationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 576, Short.MAX_VALUE)
//        );
//
//        addPatientTabbedPane.addTab("Chronic Medications", chronicMedicationsPane);
//
//        javax.swing.GroupLayout chronicDiseasesPaneLayout = new javax.swing.GroupLayout(chronicDiseasesPane);
//        chronicDiseasesPane.setLayout(chronicDiseasesPaneLayout);
//        chronicDiseasesPaneLayout.setHorizontalGroup(
//            chronicDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 806, Short.MAX_VALUE)
//        );
//        chronicDiseasesPaneLayout.setVerticalGroup(
//            chronicDiseasesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 576, Short.MAX_VALUE)
//        );
//
//        addPatientTabbedPane.addTab("Chronic Diseases", chronicDiseasesPane);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPatientTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPatientTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        this.setContentPane(mainPanel);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("Cancel")){
            showCancelDialog ();
        }
    }
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
            new PatientListGUI(mh);
        }
    }
}
//        String action = e.getActionCommand();
//
//        if(action.equals("Save")){
//            try{
////                if (patientID < patientNumber)
////                    s.executeUpdate("DELETE FROM personalInfo WHERE patientID=" + patientID + ";");
////                else if(patientID == patientNumber)
////                    s.executeUpdate("INSERT INTO patients VALUES " + "("+ patientID +")" + ";");
//
//                Patient p = new Patient(patientID,firstNTextField.getText(),lastNTextField.getText(),insuranceTextField.getText(),Integer.parseInt(amkaTextField.getText()),tameioComboBox.getSelectedItem().toString());
//
//                if(!middleNTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setMName(middleNTextField.getText());
//                if(!addressTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setAddress(addressTextField.getText());
//                if(!addressNumTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setAddressNum(Integer.parseInt(addressNumTextField.getText()));
//                if(!cityTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setCity(cityTextField.getText());
//                if(!regionTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setState(regionTextField.getText());
//                if(!countryTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setCountry(countryTextField.getText());
//                if(!postalCTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setPostalCode(Integer.parseInt(postalCTextField.getText()));
//                if(!citizenshipTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setCitizenship(citizenshipTextField.getText());
//                if(!heightTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setHeight(Integer.parseInt(heightTextField.getText()));
//                if(!weightTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setWeight(Integer.parseInt(weightTextField.getText()));
//                if(maleRadioButton.isSelected() == true)
//                    (p.getPersonalInfo()).setSex(maleRadioButton.getText());
//                if(femaleRadioButton.isSelected() == true)
//                    (p.getPersonalInfo()).setSex(femaleRadioButton.getText());
//                if(marriedRadioButton.isSelected() == true)
//                    (p.getPersonalInfo()).setMaritalStatus(marriedRadioButton.getText());
//                if(singleRadioButton.isSelected() == true)
//                    (p.getPersonalInfo()).setMaritalStatus(singleRadioButton.getText());
//                if(!birthDateTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setBirthDate(birthDateTextField.getText());
//                if(!profTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setProfession(profTextField.getText());
//                if(!firstVisitTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setFirstVisit(firstVisitTextField.getText());
//                if(!childrenSpinner.getValue().equals(null))
//                    (p.getPersonalInfo()).setChildren(Integer.parseInt(childrenSpinner.getValue().toString()));
//                if(!homeTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setHomeNum(homeTextField.getText());
//                if(!workTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setWorkNum(workTextField.getText());
//                if(!cellTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setCellPhone(cellTextField.getText());
//                if(!faxTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setFax(faxTextField.getText());
//                if(!mailTextField.getText().equals(""))
//                    (p.getPersonalInfo()).setEmail(mailTextField.getText());
//
//                pm.dbUpdate("INSERT INTO personalInfo VALUES " + "(" + patientID + ", " +
//                       "\"" + p.getPersonalInfo().getFName() + "\", " +
//                       "\"" + p.getPersonalInfo().getMName() + "\", " +
//                       "\"" + p.getPersonalInfo().getLName() + "\", " +
//                       "\"" + p.getPersonalInfo().getAddress() + "\", " +
//                       p.getPersonalInfo().getAddressNum() + ", " +
//                       "\"" + p.getPersonalInfo().getCity() + "\", " +
//                       "\"" + p.getPersonalInfo().getState() + "\", " +
//                       "\"" + p.getPersonalInfo().getCountry() + "\", " +
//                       p.getPersonalInfo().getPostalCode() + ", " +
//                       "\"" + p.getPersonalInfo().getCitizenship() + "\", " +
//                       p.getPersonalInfo().getHeight() + ", " +
//                       p.getPersonalInfo().getWeight()+ ", " +
//                       "\"" + p.getPersonalInfo().getSex() + "\", " +
//                       "\"" + p.getPersonalInfo().getMaritalStatus() + "\", " +
//                       "\"" + p.getPersonalInfo().getBirthDate() + "\", " +
//                       "\"" + p.getPersonalInfo().getProfession() + "\", " +
//                       "\"" + p.getPersonalInfo().getInsurance() + "\", " +
//                       "\"" + p.getPersonalInfo().getTameio() + "\", " +
//                       p.getPersonalInfo().getAmka() + ", " +
//                       p.getPersonalInfo().getFirstVisit() + ", " +
//                       p.getPersonalInfo().getChildren() + ", " +
//                       p.getPersonalInfo().getHomeNum() + ", " +
//                       p.getPersonalInfo().getCellPhone()+ ", " +
//                       p.getPersonalInfo().getWorkNum() + ", " +
//                       p.getPersonalInfo().getFax() + ", " +
//                       "\"" + p.getPersonalInfo().getEmail() + "\");");
//
////pl.addNewPatient(p);
//
//                this.dispose();
//                PatientListGUI plg = new PatientListGUI(pm);
////                plg.loadPatientsList();
//            }
//            catch (NullPointerException ex){
//                JOptionPane.showMessageDialog(null,"Missing obligatory information", "Nothing entered", 2);
//            }
//
//            catch (NumberFormatException ex){
//                JOptionPane.showMessageDialog(null,"Enter only digits in the amka field", "Wrong input", 2 );
//            }
//
//        }
//        if (action.equals("Cancel")){
//            showCancelDialog ();
//        }
//

