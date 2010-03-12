package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.NullPointerException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import vidavo.pojos.Appointments;
import vidavo.pojos.Patients;
import vidavo.pojos.PersonalInfo;
import vidavo.util.HibernateUtil;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ListResourceBundle;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AddAppointmentGUI extends javax.swing.JFrame implements ActionListener{
        // Variables declaration - do not modify
//    private javax.swing.JButton saveButton;
//    private javax.swing.JButton findAvailableButton;
//    private javax.swing.JButton cancelButton;
//    private javax.swing.JCheckBox repeatsCheckBox;
//    private javax.swing.JComboBox categoryComboBox;
//    private javax.swing.JComboBox dayTimeComboBox;
//    private javax.swing.JComboBox repeatsComboBox1;
//    private javax.swing.JComboBox repeatsComboBox2;
//    private com.toedter.calendar.JDateChooser appointmentDateChooser;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel5;
//    private javax.swing.JLabel jLabel6;
//    private javax.swing.JLabel jLabel7;
//    private javax.swing.JLabel jLabel8;
//    private javax.swing.JLabel jLabel9;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JTextField titleTextField;
//    private javax.swing.JTextField jTextField3;
//    private javax.swing.JTextField hourTextField;
//    private javax.swing.JTextField minutesTextField;
//    private javax.swing.JTextField durationTextField;
//    private javax.swing.JTextField jTextField7;
//    private javax.swing.JTextField commentsTextField;

    private ManagerHolder mh;
    private java.util.ListResourceBundle resourceMap;

    private javax.swing.JButton selectPatientButton;
    private com.toedter.calendar.JDateChooser appointmentDateChooser;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JTextField commentsTextField;
   // private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox dayTimeComboBox;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JLabel facilityLabel;
    private javax.swing.JTextField facilityTextField;
    private javax.swing.JButton findAvailableButton;
    private javax.swing.JTextField hourTextField;
    private javax.swing.JLabel timeSeperatorLabel;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JTextField minutesTextField;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JCheckBox repeatsCheckBox;
    private javax.swing.JComboBox repeatsComboBox1;
    private javax.swing.JComboBox repeatsComboBox2;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private com.toedter.calendar.JDateChooser untilDateChooser;
    private javax.swing.JLabel untilLabel;
    private JLabel patientNameLabel;
    private AppointmentManager am;
    private String str;
    private Date appTime;
    private Date date;
    private String repeats;
    private Patients pat;
    private List tempList;
    private Session s;
    private Transaction tx;

    public AddAppointmentGUI(ManagerHolder mh) {

        am = mh.getAm();
        pat = null;
        this.mh = mh;
        this.resourceMap = mh.getResourceMap();
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public AddAppointmentGUI(ManagerHolder mh, Patients p) {

        this.mh = mh;
        am = mh.getAm();
        this.pat = p;
        tempList= am.getTempInfo();
        this.resourceMap = mh.getResourceMap();
        initComponents();
        loadInfo(tempList);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
//<<<<<<< .mine
//        jPanel1 = new javax.swing.JPanel();
//        jLabel1 = new javax.swing.JLabel();
//        categoryComboBox = new javax.swing.JComboBox();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        titleTextField = new javax.swing.JTextField();
//        jLabel4 = new javax.swing.JLabel();
//        jTextField3 = new javax.swing.JTextField();
//        jTextField3.addFocusListener(this);
//        jLabel5 = new javax.swing.JLabel();
//        hourTextField = new javax.swing.JTextField();
//        minutesTextField = new javax.swing.JTextField();
//        jLabel6 = new javax.swing.JLabel();
//        dayTimeComboBox = new javax.swing.JComboBox();
//        jLabel7 = new javax.swing.JLabel();
//        durationTextField = new javax.swing.JTextField();
//        jLabel8 = new javax.swing.JLabel();
//        repeatsCheckBox = new javax.swing.JCheckBox();
//        repeatsComboBox1 = new javax.swing.JComboBox();
//        repeatsComboBox2 = new javax.swing.JComboBox();
//        jTextField7 = new javax.swing.JTextField();
//        jLabel9 = new javax.swing.JLabel();
//        commentsTextField = new javax.swing.JTextField();
//        saveButton = new javax.swing.JButton();
//        findAvailableButton = new javax.swing.JButton();
//        cancelButton = new javax.swing.JButton();
//        appointmentDateChooser = new com.toedter.calendar.JDateChooser();
//=======
        categoryLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox();
        dateLabel = new javax.swing.JLabel();
        appointmentDateChooser = new com.toedter.calendar.JDateChooser();
        titleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        patientLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        hourTextField = new javax.swing.JTextField();
        timeSeperatorLabel = new javax.swing.JLabel();
        minutesTextField = new javax.swing.JTextField();
        dayTimeComboBox = new javax.swing.JComboBox();
        durationLabel = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        minutesLabel = new javax.swing.JLabel();
        repeatsCheckBox = new javax.swing.JCheckBox();
        repeatsComboBox1 = new javax.swing.JComboBox();
        repeatsComboBox2 = new javax.swing.JComboBox();
        untilLabel = new javax.swing.JLabel();
        untilDateChooser = new com.toedter.calendar.JDateChooser();
        facilityLabel = new javax.swing.JLabel();
        facilityTextField = new javax.swing.JTextField();
        selectPatientButton = new javax.swing.JButton();
        commentsLabel = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        findAvailableButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JToggleButton();
        patientNameLabel = new javax.swing.JLabel();
        appointmentDateChooser.setDateFormatString("yyyy-MM-dd");
        //appointmentDateChooser.getCalendarButton();

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCancelDialog();
            }
        });
        
        this.setTitle(resourceMap.getString("addAppointment.title"));

        categoryLabel.setText(resourceMap.getString("categoryLabel.text"));
        dateLabel.setText(resourceMap.getString("dateLabel.text"));
        titleLabel.setText(resourceMap.getString("titleLabel.text"));
        patientLabel.setText(resourceMap.getString("patientLabel.text"));
        timeLabel.setText(resourceMap.getString("timeLabel.text"));
        timeSeperatorLabel.setText(resourceMap.getString("timeSeperatorLabel.text"));
        durationLabel.setText(resourceMap.getString("durationLabel.text"));
        minutesLabel.setText(resourceMap.getString("minutesLabel.text"));
        repeatsCheckBox.setText(resourceMap.getString("repeatsCheckBox.text"));
        untilLabel.setText(resourceMap.getString("untilLabel.text"));
        facilityLabel.setText(resourceMap.getString("facilityLabel.text"));
        selectPatientButton.setText(resourceMap.getString("selectPatientButton.text"));
        commentsLabel.setText(resourceMap.getString("commentsLabel.text"));
        saveButton.setText(resourceMap.getString("saveButton.text"));
        findAvailableButton.setText(resourceMap.getString("findAvailableButton.text"));
        cancelButton.setText(resourceMap.getString("cancelButton.text"));

        patientNameLabel.setText(mh.getPatientName());

//<<<<<<< .mine
//        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Office","Home"}));
//        categoryComboBox.setName("categoryComboBox"); // NOI18N
//=======
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Office", "Out of Office", "Visit Out of Office" }));
        dayTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        repeatsComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Every", "Once Per", }));
        repeatsComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weekday", "Weekend", "Month", "Other Day" }));

        selectPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientButtonActionPerformed(evt);
            }
        });
        
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        findAvailableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAvailableButtonActionPerformed(evt);
            }
        });

        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCancelDialog();
            }
        });

//<<<<<<< .mine
////        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
//        jLabel4.setName("jLabel4"); // NOI18N
//
////        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
//        jTextField3.setName("jTextField3"); // NOI18N
//
////        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
//        jLabel5.setName("jLabel5"); // NOI18N
//
////        hourTextField.setText(resourceMap.getString("hourTextField.text")); // NOI18N
//        hourTextField.setName("hourTextField"); // NOI18N
//
////        minutesTextField.setText(resourceMap.getString("minutesTextField.text")); // NOI18N
//        minutesTextField.setName("minutesTextField"); // NOI18N
//
////        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
//        jLabel6.setName("jLabel6"); // NOI18N
//
//        dayTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM","PM" }));
//        dayTimeComboBox.setName("dayTimeComboBox"); // NOI18N
//
////        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
//        jLabel7.setName("jLabel7"); // NOI18N
//
////        durationTextField.setText(resourceMap.getString("durationTextField.text")); // NOI18N
//        durationTextField.setName("durationTextField"); // NOI18N
//
////        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
//        jLabel8.setName("jLabel8"); // NOI18N
//
//        repeatsCheckBox.setSelected(true);
////        repeatsCheckBox.setText(resourceMap.getString("repeatsCheckBox.text")); // NOI18N
//        repeatsCheckBox.setName("repeatsCheckBox"); // NOI18N
//
//        repeatsComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "every","every other" }));
//        repeatsComboBox1.setName("repeatsComboBox1"); // NOI18N
//
//        repeatsComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "workday","week" }));
//        repeatsComboBox2.setName("repeatsComboBox2"); // NOI18N
//
////        jTextField7.setText(resourceMap.getString("jTextField7.text")); // NOI18N
//        jTextField7.setName("jTextField7"); // NOI18N
//
////        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
//        jLabel9.setName("jLabel9"); // NOI18N
//
////        commentsTextField.setText(resourceMap.getString("commentsTextField.text")); // NOI18N
//        commentsTextField.setName("commentsTextField"); // NOI18N
//
//        saveButton.setText(resourceMap.getString("saveButton.text")); // NOI18N
        saveButton.setName("saveButton"); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(this);

//        findAvailableButton.setText(resourceMap.getString("findAvailableButton.text")); // NOI18N
        findAvailableButton.setName("findAvailableButton"); // NOI18N
        findAvailableButton.setText("Find Available Appointments");
        findAvailableButton.addActionListener(this);
//        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
//
//        appointmentDateChooser.setName("appointmentDateChooser"); // NOI18N
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//=======
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectPatientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoryLabel)
                                    .addComponent(dateLabel)
                                    .addComponent(facilityLabel)
                                    .addComponent(patientLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(appointmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(facilityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(categoryComboBox, 0, 126, Short.MAX_VALUE)
                                    .addComponent(titleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(durationLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(timeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(timeSeperatorLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(minutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minutesLabel)
                                    .addComponent(dayTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(repeatsCheckBox)
                                    .addComponent(untilLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(untilDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(repeatsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(repeatsComboBox2, 0, 78, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(commentsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findAvailableButton, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(commentsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryLabel)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateLabel)
                            .addComponent(appointmentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facilityLabel)
                            .addComponent(facilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeatsComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeatsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeatsCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel)
                            .addComponent(hourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeSeperatorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minutesLabel)
                            .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durationLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientLabel)
                        .addComponent(untilLabel)
                        .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(untilDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectPatientButton)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentsLabel)
                    .addComponent(commentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(findAvailableButton)
                    .addComponent(cancelButton)))
        );
        pack();
    }

    private void addNewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        mh.setOrigin("AddAppointmentGUI");
        saveInfo();
        new PatientListGUI(mh,true);
        this.dispose();
    }
public Appointments getAppointment() throws NullPointerException,NumberFormatException
{
    SimpleDateFormat tm = new SimpleDateFormat("hh:mm");
    appTime = new Date();
    date = appointmentDateChooser.getDate();

        if(hourTextField.getText().equals("") || minutesTextField.getText().equals(""))
        {
             appTime = null;
        }
        else
        {
           appTime.setHours(Integer.parseInt(hourTextField.getText()));
           appTime.setMinutes(Integer.parseInt(minutesTextField.getText()));
        }

    
    if(repeatsCheckBox.isSelected() == true)
        repeats = "true";
    else
        repeats = "false";
    Patients patient = new Patients();
    if(pat != null)
    patient.setPatientId(pat.getPatientId());
    //dayTimeComboBox.getSelectedItem().toString(),
    return new Appointments(patient,categoryComboBox.getSelectedItem().toString(),date,titleTextField.getText(),
            appTime,dayTimeComboBox.getSelectedItem().toString(),Integer.parseInt(durationTextField.getText()),repeats,
            repeatsComboBox1.getSelectedItem().toString(),repeatsComboBox2.getSelectedItem().toString(),commentsTextField.getText());
}

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Save"))
        {
            Appointments app = new Appointments();
            try
            {
                app = getAppointment();
                if(app.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Date has not been set for the appointment", "Error Message", 2);
                else if(app.getTime() == null)
                    JOptionPane.showMessageDialog(null, "Time has not been set for the appointment", "Error Message", 2);
                else if(pat == null)
                    JOptionPane.showMessageDialog(null, "Patient has not been selected", "Error Message", 2);
                else
                {
                am.addAppointment(app);
                }

            }
            catch (NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Enter only digits in the duration field", "Error Message", 2);
            }
        }

        if(e.getActionCommand().equals("Find Available Appointments"))
        {
            Vector apps = am.getAppointments(appointmentDateChooser.getDate());
            Vector freeTimes = new Vector();
            Appointments a = new Appointments();
            Appointments a1 = new Appointments();

            s = HibernateUtil.getSessionFactory().openSession();
       // tx = s.beginTransaction();
            for(int i = 0; i < apps.size() / 4; i++)
            {
                if(i>0 && i != apps.size() / 4 - 1)
                {
                a = (Appointments) s.load(Appointments.class, Integer.parseInt(apps.get((i - 1)*4).toString()));
                if(i < apps.size()/4 - 1)
                a1 = (Appointments) s.load(Appointments.class, Integer.parseInt(apps.get((i-1)*4 + 4).toString()));
                }

                else if(i==0 || i == (apps.size() / 4 - 1))
                {
                    a = (Appointments) s.load(Appointments.class, Integer.parseInt(apps.get((i)*4).toString()));
//                if(i < apps.size()/4 - 1)
//                a1 = (Appointments) s.load(Appointments.class, Integer.parseInt(apps.get((i)*4 + 4).toString()));

                }

                if(i == 0)
                freeTimes.add("00:00:00 - " + a.getTime().toString());

                else if(i < apps.size()/4 - 1)
                {
                   int bla = a.getTime().getMinutes();
                   int bla1 = a.getDuration();
                   a.getTime().setMinutes(bla + bla1);
                   //freeTimes.add("Hours: " + Integer.toString(a.getTime().getHours()) +"   Minutes:  " +(a.getTime().getMinutes() + a.getDuration() )+ " - " + a1.getTime().toString());
                    freeTimes.add( a.getTime().toString() + " - " + a1.getTime().toString());
                }
                
                else if(i == apps.size()/4 - 1)
                {
                     freeTimes.add(a.getTime().toString() +" -00:00:00");
                }
                    
               
            }
        // tx.commit();
        s.close();
        
             for(int i = 0; i < freeTimes.size(); i++)
            {
              System.out.println(freeTimes.get(i).toString() + "\n");
             }
             

        }
    }

//    public void focusGained(FocusEvent e) {
//
//            jTextField3.setFocusable(false);
//
//    }

    public void saveInfo() {
       // new PatientListGUI(this.mh,true);
       // jTextField3.setFocusable(true);
        tempList = new LinkedList();
        tempList.add(categoryComboBox.getSelectedIndex());
        date = appointmentDateChooser.getDate();
        tempList.add((Date)date);
        System.out.println(date);
        tempList.add(titleTextField.getText());
        appTime = new Date();
        if(hourTextField.getText().equals("") || minutesTextField.getText().equals(""))
        {
             appTime = null;
        }
        else
        {
           appTime.setHours(Integer.parseInt(hourTextField.getText()));
           appTime.setMinutes(Integer.parseInt(minutesTextField.getText()));
        }
        tempList.add((Date)appTime);
        tempList.add(dayTimeComboBox.getSelectedIndex());
        tempList.add(durationTextField.getText());
        if(repeatsCheckBox.isSelected() == true)
            repeats = "true";
        else
            repeats = "false";
        tempList.add(repeats);
        tempList.add(repeatsComboBox1.getSelectedIndex());
        tempList.add(repeatsComboBox2.getSelectedIndex());
        tempList.add(commentsTextField.getText());
        am.setTempInfo(tempList);
       // this.dispose();

    }

    private void loadInfo(List tempList) {
        categoryComboBox.setSelectedIndex(Integer.parseInt(tempList.get(0).toString()));
        date = (Date)tempList.get(1);
        appointmentDateChooser.setDate(date);
        titleTextField.setText(tempList.get(2).toString());
        appTime = (Date) tempList.get(3);

        try{
            hourTextField.setText(Integer.toString(appTime.getHours()));
            minutesTextField.setText(Integer.toString(appTime.getMinutes()));
        }
        catch(NullPointerException n)
        {
            hourTextField.setText("");
            minutesTextField.setText("");
        }
            

        dayTimeComboBox.setSelectedIndex(Integer.parseInt(tempList.get(4).toString()));
        durationTextField.setText(tempList.get(5).toString());
        System.out.println(tempList.get(6).toString());
        if (tempList.get(6).toString().equals("true"))
        {
            repeatsCheckBox.setSelected(true);
        }
        else
            repeatsCheckBox.setSelected(false);
        repeatsComboBox1.setSelectedIndex(Integer.parseInt(tempList.get(7).toString()));
        repeatsComboBox2.setSelectedIndex(Integer.parseInt(tempList.get(8).toString()));
        commentsTextField.setText(tempList.get(9).toString());
        PersonalInfo pi = mh.getPm().getSelectedPatient(pat.getPatientId());

        patientNameLabel.setText(pi.getFirstName() + " " + pi.getLastName());
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void findAvailableButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void showCancelDialog() {
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
        if (value == JOptionPane.NO_OPTION){
            dialog.dispose();
        }
        else if (value == JOptionPane.YES_OPTION){
            this.dispose();
            new AppointmentGUI(mh);
        }
    }
}
