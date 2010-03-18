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
import vidavo.util.ListInterface;
import vidavo.util.ReferenceBasedList;

public class AddAppointmentGUI extends javax.swing.JFrame{

    private ManagerHolder mh;
    private java.util.ListResourceBundle resourceMap;

    private javax.swing.JButton selectPatientButton;
    private com.toedter.calendar.JDateChooser appointmentDateChooser;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JButton findAvailableButton;
    private javax.swing.JTextField hourTextField;
    private javax.swing.JLabel timeSeperatorLabel;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JTextField minutesTextField;
    private javax.swing.JLabel patientLabel;
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
        durationLabel = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        minutesLabel = new javax.swing.JLabel();
        untilLabel = new javax.swing.JLabel();
        untilDateChooser = new com.toedter.calendar.JDateChooser();
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
        untilLabel.setText(resourceMap.getString("untilLabel.text"));
        selectPatientButton.setText(resourceMap.getString("selectPatientButton.text"));
        commentsLabel.setText(resourceMap.getString("commentsLabel.text"));
        saveButton.setText(resourceMap.getString("saveButton.text"));
        findAvailableButton.setText(resourceMap.getString("findAvailableButton.text"));
        cancelButton.setText(resourceMap.getString("cancelButton.text"));

        patientNameLabel.setText(mh.getPatientName());

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Office", "Out of Office", "Visit Out of Office" }));

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
                                    .addComponent(patientLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(appointmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
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
                                    .addComponent(minutesLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        new PatientListGUI(mh);
        this.dispose();
    }
    
    public Appointments getAppointment() throws NullPointerException,NumberFormatException{
        SimpleDateFormat tm = new SimpleDateFormat("hh:mm");
        appTime = new Date();
        date = appointmentDateChooser.getDate();

        if(hourTextField.getText().equals("") || minutesTextField.getText().equals("")){
            appTime = null;
        }
        else{
           appTime.setHours(Integer.parseInt(hourTextField.getText()));
           appTime.setMinutes(Integer.parseInt(minutesTextField.getText()));
        }

        Patients patient = new Patients();
        if(pat != null)
            patient.setPatientId(pat.getPatientId());
        //dayTimeComboBox.getSelectedItem().toString(),
        return new Appointments(patient,categoryComboBox.getSelectedItem().toString(),date,titleTextField.getText(),
                appTime,Integer.parseInt(durationTextField.getText()),commentsTextField.getText());
    }

    public void saveInfo() {
       // new PatientListGUI(this.mh,true);
        tempList = new LinkedList();
        tempList.add(categoryComboBox.getSelectedItem());
        date = appointmentDateChooser.getDate();
        tempList.add((Date)date);
        tempList.add(titleTextField.getText());
        tempList.add(hourTextField.getText());
        tempList.add(minutesTextField.getText());

        tempList.add(durationTextField.getText());
        
        tempList.add(commentsTextField.getText());
//        if(ManagerHolder.isInteger(hourTextField.getText()))
//            am.setHour(hourTextField.getText());
//        if(ManagerHolder.isInteger(minutesTextField.getText()))
//            am.setMinutes(minutesTextField.getText());
//        if(ManagerHolder.isInteger(durationTextField.getText()))
//            am.setAppDuration(durationTextField.getText());
        am.setTempInfo(tempList);

       // this.dispose();
    }

    private void loadInfo(List tempList) {
        categoryComboBox.setSelectedItem(tempList.get(0).toString());
        date = (Date)tempList.get(1);
        appointmentDateChooser.setDate(date);
        titleTextField.setText(tempList.get(2).toString());

        try{
            hourTextField.setText(Integer.toString(appTime.getHours()));
            minutesTextField.setText(Integer.toString(appTime.getMinutes()));
        }
        catch(NullPointerException n){
            hourTextField.setText("");
            minutesTextField.setText("");
        }
        hourTextField.setText(tempList.get(3).toString());
        minutesTextField.setText(tempList.get(4).toString());

        durationTextField.setText(tempList.get(5).toString());
        commentsTextField.setText(tempList.get(6).toString());
        PersonalInfo pi = new PersonalInfo();
        if(pat != null){
            pi= mh.getPm().getSelectedPatient(pat.getPatientId());
            patientNameLabel.setText(pi.getFirstName() + " " + pi.getLastName());
        }
//        hourTextField.setText(this.mh.getAm().getHour());
//        minutesTextField.setText(this.mh.getAm().getMinutes());
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
                else if(isAvailable(app) != true)
                {
                    JOptionPane.showMessageDialog(null, "Appointment duration is too long", "Error Message", 2);
                }
                else
                {
                am.addAppointment(app);
                this.dispose();
                new AppointmentGUI(mh);
                }
            }
            catch (NumberFormatException nfe)
            {
                try
                {
                    if(!hourTextField.getText().equals("") && !minutesTextField.getText().equals(""))
                    {
                    Integer.parseInt(hourTextField.getText());
                    Integer.parseInt(minutesTextField.getText());
                    }
                    else if(hourTextField.getText().equals("") && minutesTextField.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Enter hour for the appointment", "Error Message", 2);
                    }
                    else{
                        try
                {   if(!durationTextField.getText().equals(""))
                    Integer.parseInt(durationTextField.getText());
                    else
                        JOptionPane.showMessageDialog(null, "Enter the duration of the appointment", "Error Message", 2);
                }
                catch(NumberFormatException nf){
                JOptionPane.showMessageDialog(null, "Enter only digits in the duration field", "Error Message", 2);}
                    }
                }
                catch(NumberFormatException nf){
                JOptionPane.showMessageDialog(null, "Enter only digits in the time field", "Error Message", 2);}
            }
    }

    private void findAvailableButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(!durationTextField.getText().equals("") && ManagerHolder.isInteger(durationTextField.getText()) &&
                Integer.parseInt(durationTextField.getText()) > 0){
            saveInfo();
            new FindAvailableGUI(mh);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Please enter a valid appointment duration.", "Find Available Error", JOptionPane.ERROR_MESSAGE);
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

    private boolean isAvailable(Appointments app) {

        Appointments temp = new Appointments();
        //temp.setTime(new Date (app.getTime().getTime()));
        //temp.setDate(new Date(app.getDate().getDate()));
        //temp.setDate((Date)app.getDate().clone());
        temp.setTime(new Date ((app.getDate().getYear()), (app.getDate().getMonth()), (app.getDate().getDate()), app.getTime().getHours(), (app.getTime().getMinutes() + app.getDuration()) ));
                //temp.getTime().setMinutes(app.getDuration() +app.getTime().getMinutes());
        //System.out.println(temp.getDate());
        return am.compareWithNextAppointment(app,temp);
    }
}
