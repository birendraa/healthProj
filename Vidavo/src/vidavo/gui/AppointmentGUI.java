
package vidavo.gui;

import java.util.ListResourceBundle;

public class AppointmentGUI extends javax.swing.JFrame{

    private AppointManager am;
    private PatientManager pm;
    private ListResourceBundle resourceMap;

    private javax.swing.JButton addAppointmentButton;
    private javax.swing.JTable appointmentTable;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton goButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JScrollPane patientNoteScrollPane;
    private javax.swing.JLabel patientNotesLabel;
    private javax.swing.JTextArea patientNotesTextArea;
    private javax.swing.JButton patientsButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton removeAppointmentButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    
    public AppointmentGUI(AppointManager am, PatientManager pm){
        initComponents();
        this.am = am;
        this.pm = pm;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {
        
        dateChooser = new com.toedter.calendar.JDateChooser();
        goButton = new javax.swing.JButton();
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
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:00", null},
                {"09:00", null},
                {"10:00", null},
                {"11:00", null},
                {"12:00", null},
                {"13:00", null},
                {"14:00", null},
                {"15:00", null},
                {"16:00", null},
                {"17:00", null},
                {"18:00", null},
                {"19:00", null},
                {"20:00", null},
                {"21:00", null},
                {null, null}
            },
            new String [] {
                "Hour", "Description"
            }
        ));
        appointmentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        tableScrollPane.setViewportView(appointmentTable);

        patientNotesLabel.setText("Patient Notes :");

        patientNotesTextArea.setColumns(20);
        patientNotesTextArea.setRows(5);

        patientNoteScrollPane.setViewportView(patientNotesTextArea);

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
        
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        addAppointmentButton.setText("Add Appointment");
        addAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        patientsButton.setText("My Patients");
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        removeAppointmentButton.setText("Remove Appointment");
        removeAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientNoteScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addComponent(patientNotesLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(goButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(patientsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientNotesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientNoteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeAppointmentButton)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }

    private void addAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new AddAppointmentGUI();
        this.setEnabled(false);
    }

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new PatientListGUI(this.pm);
        this.dispose();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void removePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}