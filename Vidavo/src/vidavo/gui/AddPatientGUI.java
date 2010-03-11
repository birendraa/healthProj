
package vidavo.gui;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import vidavo.pojos.*;

/**
 *
 * @author Bosko
 */
public class AddPatientGUI extends JFrame implements ActionListener{

    private ManagerHolder mh;
    private PatientManager pm;
    private PersonalInfo pi;
    private SurgicalHistory sh;
    private FamilyHistory fh;
    private Contacts contacts;
    private ChronicMedication cm;
    private ChronicDiseases cd;
    private Habits habits;
    private Immunizations immun;
    private int patientId = 0;
    private String mode;
    private java.util.ListResourceBundle resourceMap;

    private JTabbedPane addPatientTabbedPane;
    private JPanel chronicDiseasesPane;
    private JPanel chronicMedicationsPane;
    private JPanel contactsPane;
    private JPanel familyHistoryPane;
    private JLabel faxLabel;
    private JTextField faxTextField;
    private JRadioButton femaleRadioButton;
    private ButtonGroup maleFemaleGroup;
    private JLabel firstNLabel;
    private JTextField firstNTextField;
    private JPanel habitsPane;
    private PhotosPane photosPane;
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
    public AddPatientGUI(ManagerHolder mh, String mode,int id, java.util.ListResourceBundle rm){

        super();
        this.mh = mh;
        this.pm = mh.getPm();
        this.resourceMap = rm;
        this.mode = mode;
        patientId = id;
        if(mode.equals("edit"))
        {
            pi = (this.pm).getSelectedPatient(id);
            sh = (this.pm).getSelectedPatientSH(id);
            fh = (this.pm).getSelectedPatientFH(id);
            contacts = (this.pm).getSelectedContacts(id);
            cm = (this.pm).getSelectedCM(id);
            cd = (this.pm).getSelectedCD(id);
            habits = (this.pm).getSelectedHabits(id);
            immun = (this.pm).getSelectedImmun(id);
        }
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
        if(mode.equals("add"))
        this.setTitle("Add Patient");
        else
        this.setTitle("Edit Patient");
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
        surgeryHistoryPane = new SurgicalHistoryPane(resourceMap,mode,sh);
        familyHistoryPane = new FamilyHistoryPane(resourceMap,mode,fh);
        immunizationHistoryPane = new JPanel();
        habitsPane = new HabitsPane(resourceMap,mode,habits);
        chronicMedicationsPane = new JPanel();
        chronicDiseasesPane = new JPanel();
        contactsPane = new JPanel();
        personalInfoPane = new JPanel();
        firstNLabel = new JLabel();
        firstNTextField = new JTextField();
        femaleRadioButton = new JRadioButton();
        maleFemaleGroup =  new ButtonGroup();
        faxLabel = new JLabel();
        faxTextField = new JTextField();
        chronicMedicationsPane = new ChronicMedicationPane(resourceMap,mode,cm);
        chronicDiseasesPane = new ChronicDiseasesPane(resourceMap,mode,cd);
        contactsPane = new ContactPane(resourceMap,mode,contacts);
        photosPane = new PhotosPane(resourceMap);

        immunizationHistoryPane = new ImmunizationsPane(resourceMap,mode,immun);
        personalInfoPane = new PersonalInfoPane(mode,pi);
        saveButton = new JButton();
        cancelButton = new JButton();

        firstNLabel.setText("First Name* :");
        firstNTextField.setText("");
        femaleRadioButton.setText("Female");
        maleFemaleGroup.add(femaleRadioButton);

        saveButton.setText("Save");
        saveButton.addActionListener(this);
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(this);

        addPatientTabbedPane.addTab("Personal Info", personalInfoPane);
        addPatientTabbedPane.addTab("Surgery History", surgeryHistoryPane);
        addPatientTabbedPane.addTab("Family history", familyHistoryPane);
        addPatientTabbedPane.addTab("Immunization History", immunizationHistoryPane);
        addPatientTabbedPane.addTab("Chronic Medications", chronicMedicationsPane);
        addPatientTabbedPane.addTab("Chronic Diseases", chronicDiseasesPane);
        addPatientTabbedPane.addTab("Habits", habitsPane);
        addPatientTabbedPane.addTab("Photos", photosPane);
        addPatientTabbedPane.addTab("Contact", contactsPane);

        addPatientTabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (addPatientTabbedPane.getSelectedIndex()==7){
                    PersonalInfoPane pi1 = (PersonalInfoPane) personalInfoPane;
                    pi = pi1.getPersonalinfo();
                    if (!pi.getLastName().isEmpty() && !pi.getFirstName().isEmpty() && !Integer.toString(pi.getInsuranceIdNumber()).equals("0"))
                        photosPane.setPatientDirectoryName(pi.getLastName() + " " + pi.getFirstName() + " " + pi.getInsuranceIdNumber());
                    else
                        photosPane.setPatientDirectoryName("");
                    photosPane.populateList();
                }
            }
        });

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
        if(action.equals("Save")){
            PersonalInfoPane pi1 = (PersonalInfoPane) personalInfoPane;
            SurgicalHistoryPane sh1 = (SurgicalHistoryPane) surgeryHistoryPane;
            FamilyHistoryPane fh1 = (FamilyHistoryPane) familyHistoryPane;
            ContactPane contacts1 = (ContactPane) contactsPane;
            ChronicMedicationPane cm1 = (ChronicMedicationPane) chronicMedicationsPane;
            ChronicDiseasesPane cd1 = (ChronicDiseasesPane) chronicDiseasesPane;
            HabitsPane habits1 = (HabitsPane) habitsPane;
            ImmunizationsPane immun1 = (ImmunizationsPane) immunizationHistoryPane;
        try
        {
            pi = pi1.getPersonalinfo();
            sh = sh1.getSurgeryHistoryInformation();
            fh = fh1.getFamilyHistory();
            contacts = contacts1.getContacts();
            cm = cm1.getChronicMedications();
            cd = cd1.getChronicDiseases();
            habits = habits1.getHabits();
            immun = immun1.getImmunizations();

        if(pi.getFirstName().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Missing mandatory information! Please Enter patient's first name!","Error message", 2);
        }

        else if(pi.getLastName().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Missing mandatory information! Please Enter patient's last name!","Error message", 2);
        }

        else if(pi.getInsuranceIdNumber() == 0)
        {
            JOptionPane.showMessageDialog(null, "Missing mandatory information! Please Enter patient's AMKA!","Error message", 2);
        }

        else if(pi.getInsurrance().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Missing mandatory information! Please Enter patient's insurance!","Error message", 2);
        }

        else if(pi.getInsuranceType().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Missing mandatory information! Please Enter patient's Tameio!","Error message", 2);
        }

        else{
        if(mode.equals("add"))
        {
            pm.createPatient(pi,sh,fh,contacts,cm,cd,habits,immun);
            this.dispose();
            new PatientListGUI(mh);
        }
        else
        {
            Patients p = pm.getPatient(patientId);
            pi.setPiId(p.getPatientId());
            sh.setShId(p.getPatientId());
            fh.setFhId(p.getPatientId());
            contacts.setContactId(p.getPatientId());
            cm.setCmId(p.getPatientId());
            cd.setChId(p.getPatientId());
            habits.setHabitsId(p.getPatientId());
            immun.setImmunId(p.getPatientId());
            pm.editPatient(p,pi,sh,fh,contacts,cm,cd,habits,immun);
            this.dispose();
            new PatientListGUI(mh);
        }
        }
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Enter only digits!","Error message", 2);
        }}

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