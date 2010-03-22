
package vidavo.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.ListResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vidavo.pojos.Appointments;
import vidavo.pojos.Patients;
import vidavo.pojos.PersonalInfo;

public class AppointmentGUI extends javax.swing.JFrame{

    private ManagerHolder mh;
    private ListResourceBundle resourceMap;

    private javax.swing.JButton addAppointmentButton;
    private javax.swing.JTable appointmentTable;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton selectButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu languageMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem englishMenuItem;
    private javax.swing.JMenuItem greekMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JScrollPane patientNoteScrollPane;
    private javax.swing.JLabel patientNotesLabel;
    private javax.swing.JTextArea patientNotesTextArea;
    private javax.swing.JButton patientsButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton removeAppointmentButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private DefaultTableModel model;

    private AppointmentManager am;
    private Date date;
    private Vector appointments;
    
    public AppointmentGUI(ManagerHolder mh){      
        this.mh = mh;
        am = mh.getAm();
        date = new Date();
        appointments = new Vector();
        this.resourceMap = mh.getResourceMap();
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCloseDialog();
            }
        });
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {
        
        dateChooser = new com.toedter.calendar.JDateChooser();
        dateChooser.setDateFormatString("yyyy-MM-dd");
        dateChooser.setDate(date);
        selectButton = new javax.swing.JButton();
        addAppointmentButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        patientsButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        patientNotesLabel = new javax.swing.JLabel();
        patientNoteScrollPane = new javax.swing.JScrollPane();
        patientNotesTextArea = new javax.swing.JTextArea();
        removeAppointmentButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        quitMenuItem = new javax.swing.JMenuItem();
        englishMenuItem = new javax.swing.JMenuItem();
        greekMenuItem= new javax.swing.JMenuItem();
        languageMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("en"));

        
        model = new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Hour", "Duration" ,"Description","Category","Title","Comments"
            }
        );
        appointmentTable = new javax.swing.JTable(model){
            @Override
              public boolean isCellEditable(int row,int column){
                return false;
              }
        };
        appointmentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableScrollPane.setViewportView(appointmentTable);
                ListSelectionModel listSelectionModel = appointmentTable.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                if (!lsm.isSelectionEmpty()){
                    int position = lsm.getAnchorSelectionIndex();
                    String category = (String)model.getValueAt(position, 3);
                    String title = (String)model.getValueAt(position, 4);
                    String comments = (String)model.getValueAt(position, 5);
                    patientNotesTextArea.setText("Category: " +category + "\nTitle: " + title +"\nComments: " + comments);

                }
            }
        });
        appointmentTable.setSelectionModel(listSelectionModel);


        patientNotesTextArea.setColumns(20);
        patientNotesTextArea.setRows(5);
        patientNotesTextArea.setEditable(false);
        

        patientNoteScrollPane.setViewportView(patientNotesTextArea);

        languageMenu.add(englishMenuItem);
        languageMenu.add(greekMenuItem);
        fileMenu.add(quitMenuItem);
        helpMenu.add(aboutMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(languageMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        this.setTitle(resourceMap.getString("appointments.title"));

        patientNotesLabel.setText((resourceMap.getString("patientNotesLabel.text")));
        fileMenu.setText((resourceMap.getString("fileMenu.text")));
        englishMenuItem.setText((resourceMap.getString("englishMenuItem.text")));
        greekMenuItem.setText((resourceMap.getString("greekMenuItem.text")));
        quitMenuItem.setText((resourceMap.getString("quitMenuItem.text")));
        languageMenu.setText((resourceMap.getString("languageMenu.text")));
        helpMenu.setText((resourceMap.getString("helpMenu.text")));
        selectButton.setText((resourceMap.getString("selectButton.text")));
        addAppointmentButton.setText((resourceMap.getString("addAppointmentButton.text")));
        searchButton.setText((resourceMap.getString("searchButton.text")));
        patientsButton.setText((resourceMap.getString("patientsButton.text")));
        removeAppointmentButton.setText((resourceMap.getString("removeAppointmentButton.text")));
        printButton.setText((resourceMap.getString("printButton.text")));
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text"));

        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });

        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        
        englishMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mh.changeLanguage("English");
                redrawGUI();
            }
        });
        
        greekMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mh.changeLanguage("Greek");
                redrawGUI();
            }
        });
        
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        addAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentButtonActionPerformed(evt);
            }
        });

        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        removeAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAppointmentButtonActionPerformed(evt);
            }
        });

        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(patientNoteScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addComponent(patientNotesLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(removeAppointmentButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAppointmentButton)
                        .addComponent(selectButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(patientsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientNotesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientNoteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeAppointmentButton)
                    .addComponent(printButton))
                .addGap(6, 6, 6))
        );

        pack();
        this.displayAppointments(false);

	
    }

    private void addAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setEnabled(false);
        mh.setPatientId(0);
        mh.setPatientName("");
        new AddAppointmentGUI(mh);
        this.dispose();
    }

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {
        displayAppointments(true);
    }

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        mh.setOrigin("AppointmentGUI");
        new PatientListGUI(this.mh);
        this.dispose();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Vector v = am.searchAppointment(searchTextField.getText());
        refreshTable();
        for(int i = 0; i < v.size(); i++){
                this.model.insertRow(i,new Object[]{((Appointments)v.get(i)).getTime(),((Appointments)v.get(i)).getDuration(),am.getFLName((Appointments)v.get(i)),((Appointments)v.get(i)).getCategory(),((Appointments)v.get(i)).getTitle(),((Appointments)v.get(i)).getComments()});}
    }

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            appointmentTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(appointmentTable.getSelectedRow() != -1){
            Appointments app = new Appointments();
            int id = Integer.parseInt(appointments.get(appointmentTable.getSelectedRow()*8).toString());
            app = am.getAppointment(id);
            am.removeAppointment(app);
            displayAppointments(true);
        }
        else
            JOptionPane.showMessageDialog(null, resourceMap.getString("appointmentNotSelected.text"), "Error message", 2);
        
    }

    public void displayAppointments(Boolean b){
        refreshTable();
        if(b == true){
            appointments = am.getAppointments(dateChooser.getDate());
        }
        else{
            appointments = am.getAppointments(date);
        }
     for(int i = 0; i < appointments.size()/8; i++){
                this.model.insertRow(i,new Object[]{appointments.get(i * 8 + 1).toString(),appointments.get(i*8+2).toString(),appointments.get(i * 8 + 3).toString() + " " + appointments.get(i * 8 + 4).toString(),appointments.get(i * 8 + 5).toString(),appointments.get(i * 8 + 6).toString(),appointments.get(i * 8 + 7).toString()});}
    }

    public void refreshTable(){
        while(model.getRowCount() != 0)
            model.removeRow(0);
    }

    private void showCloseDialog(){
        final JDialog dialog = new JDialog(this, "Exit", true);
        final JOptionPane op = new JOptionPane(resourceMap.getString("closeWindow.text"), JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
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
            //Save data
            this.dispose();
        }
    }

    private void redrawGUI(){
        new AppointmentGUI(this.mh);
        this.dispose();
    }
}