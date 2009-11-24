/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ListResourceBundle;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import vidavo.gui.AddPatientGUI;

/**
 *
 * @author Serban
 */
public class PatientListGUI extends javax.swing.JFrame implements ActionListener{

    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JPanel patientListPanel;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JScrollPane tableScrollPane;
    private Database db;
    private DefaultTableModel model;

    public PatientListGUI(){
        initComponents();
    }

    public void initComponents(){
        patientListPanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        patientLabel = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        this.db = new Database();

        ListResourceBundle resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.gui.ResourceMap", new Locale("en"));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(resourceMap.getString("patientList.title"));

        patientListPanel.setName("patientListPanel"); // NOI18N

        tableScrollPane.setName("tableScrollPane"); // NOI18N

        tableScrollPane.setName("tableScrollPane"); // NOI18N

        model = new DefaultTableModel(new Object [][] {}, new String [] {"", "", "", ""});
        
        patientTable = new javax.swing.JTable(model);

        patientTable.setName("patientTable"); // NOI18N
        tableScrollPane.setViewportView(patientTable);
        patientTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("patientTable.columnModel.title0")); // NOI18N
        patientTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("patientTable.columnModel.title1")); // NOI18N
        patientTable.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("patientTable.columnModel.title2")); // NOI18N
        patientTable.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("patientTable.columnModel.title3")); // NOI18N

        patientLabel.setText(resourceMap.getString("patientLabel.text")); // NOI18N
        patientLabel.setName("patientLabel"); // NOI18N

        patientNameLabel.setText(resourceMap.getString("patientNameLabel.text")); // NOI18N
        patientNameLabel.setName("patientNameLabel"); // NOI18N

        addButton.setText(resourceMap.getString("addButton.text")); // NOI18N
        addButton.setName("addButton"); // NOI18N
        addButton.setActionCommand("add");
        addButton.addActionListener(this);

        deleteButton.setText(resourceMap.getString("deleteButton.text")); // NOI18N
        deleteButton.setName("deleteButton"); // NOI18N
        deleteButton.setActionCommand("delete");
        deleteButton.addActionListener(this);

        editButton.setText(resourceMap.getString("editButton.text")); // NOI18N
        editButton.setName("editButton"); // NOI18N
        editButton.setActionCommand("edit");
        editButton.addActionListener(this);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);

        searchButton.setText(resourceMap.getString("searchButton.text")); // NOI18N
        searchButton.setName("searchButton"); // NOI18N
        searchButton.setActionCommand("search");
        searchButton.addActionListener(this);

        searchTextField.setText(resourceMap.getString("searchTextField.text")); // NOI18N
        searchTextField.setName("searchTextField"); // NOI18N        

        javax.swing.GroupLayout patientListPanelLayout = new javax.swing.GroupLayout(patientListPanel);
        patientListPanel.setLayout(patientListPanelLayout);
        patientListPanelLayout.setHorizontalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addGroup(patientListPanelLayout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientListPanelLayout.createSequentialGroup()
                        .addComponent(patientLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientNameLabel))
                    .addGroup(patientListPanelLayout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        patientListPanelLayout.setVerticalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLabel)
                    .addComponent(patientNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

         String c = e.getActionCommand();

         if(c.equals("add")){
                new AddPatientGUI(db);

         }

         if(c.equals("remove")){

         }

         if(c.equals("edit")){
                AddPatientGUI p = new AddPatientGUI(db);
                p.loadPatientInfo(1);
         }

         if(c.equals("close")){

         }

         if(c.equals("search")){

         }
    }

public void loadPatientsList(){

        try{
          db.connect();
          try{
            Statement st = db.create();
            ResultSet res = st.executeQuery("SELECT patientID, LastName, FirstName, Home_Number FROM personalInfo;");
            while(res.next()){
                model.insertRow(patientTable.getRowCount(), new Object[]{res.getString("patientID"),res.getString("LastName"),res.getString("FirstName"),res.getString("Home_Number")});
            }
            db.disconnect();
          }
          catch (SQLException s){
              s.printStackTrace();
            System.out.println("SQL code does not execute.");
          }
        }
        catch (Exception e){
          e.printStackTrace();
        }
    }

}
