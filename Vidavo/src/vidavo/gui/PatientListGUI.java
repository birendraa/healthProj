

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ListResourceBundle;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vidavo.Patient;

/**
 *
 * @author Serban
 */
public class PatientListGUI extends javax.swing.JFrame implements ActionListener{

    private PatientManager pm;
    private ListResourceBundle resourceMap;

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
    private javax.swing.table.DefaultTableModel model;

    /**
     *
     * @param pM
     */
    public PatientListGUI(PatientManager pM){
        super();
        this.pm = pM;
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCancelDialog();
            }
        });
        this.pm.retrievePatientData();
        this.displayPatientsList();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     *
     */
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

        resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("gr"));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(resourceMap.getString("patientList.title"));

        patientListPanel.setName("patientListPanel"); // NOI18N
        tableScrollPane.setName("tableScrollPane"); // NOI18N
        tableScrollPane.setName("tableScrollPane"); // NOI18N

        model = new javax.swing.table.DefaultTableModel(new Object [][] {}, new String [] {"", "", "", ""});

        patientTable = new javax.swing.JTable(model){

            @Override
              public boolean isCellEditable(int row,int column){
                return false;
              }
        };


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
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    }

    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

         String c = e.getActionCommand();

         if(c.equals("add")){
                new AddPatientGUI(pm,pm.getPL().size() + 1,resourceMap);
                this.dispose();
         }

         if(c.equals("delete")){
                pm.deletePatient(Integer.parseInt(model.getValueAt(patientTable.getSelectedRow(), 0).toString()));
                while(model.getRowCount() != 0)
                    model.removeRow(0);
 //               pm.loadPatientsList();
         }

         if(c.equals("edit")){
                if(patientTable.getSelectedRow() != -1){
                    int selectedID = (Integer.parseInt((String)patientTable.getValueAt(patientTable.getSelectedRow(), 0)));
                    AddPatientGUI p = new AddPatientGUI(pm, selectedID,resourceMap);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"No patient selected", "Nothing entered", 2);
         }

         if(c.equals("cancel")){
                showCancelDialog();
         }

         if(c.equals("search")){
             pm.searchPatient((String)patientTable.getValueAt(patientTable.getSelectedRow(), 1));
         }
    }

    /**
     *
     */
    public void displayPatientsList(){
            vidavo.PersonalInfo pi = new vidavo.PersonalInfo();
            vidavo.PatientList pl = this.pm.getPL();
            for(int i = 1; i <= pl.size(); i++){
                pi = ((Patient)pl.getPatientAtIndex(i)).getPersonalInfo();
                this.model.insertRow(this.patientTable.getRowCount(), new Object[]{pi.getID(),pi.getLName(),pi.getFName(),pi.getHomeNum()}); //addrow(pi.getID(),pi.getLName(),pi.getFName(),pi.getHomeNum())
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
        }
    }
//public void loadPersonalInfo(vidavo.gui.PatientManager pm){
//
//      try{
//        java.sql.ResultSet res = pm.dbQuery("SELECT * FROM personalInfo where patientId = " + patientID);
//
//        while(res.next()){
//          idLabel2.setText(Integer.toString(res.getInt("patientID")));
//          firstNTextField.setText(res.getString("FirstName"));
//          middleNTextField.setText(res.getString("MiddleName"));
//          lastNTextField.setText(res.getString("LastName"));
//          addressTextField.setText(res.getString("Address"));
//          addressNumTextField.setText(Integer.toString(res.getInt("AddressNum")));
//          cityTextField.setText(res.getString("City"));
//          regionTextField.setText(res.getString("State_Region"));
//          countryTextField.setText(res.getString("Country"));
//          postalCTextField.setText(Integer.toString(res.getInt("Postal_Code")));
//          citizenshipTextField.setText(res.getString("Citizenship"));
//          heightTextField.setText(Integer.toString(res.getInt("Height")));
//          weightTextField.setText(Integer.toString(res.getInt("Weight")));
//
//          if(res.getString("Gender").equals("Male"))
//              maleRadioButton.setSelected(true);
//          else
//              femaleRadioButton.setSelected(true);
//
//          if(res.getString("Status").equals("Married"))
//              marriedRadioButton.setSelected(true);
//          else
//              singleRadioButton.setSelected(true);
//          birthDateTextField.setText((res.getString("BirthDate")));
//          profTextField.setText(res.getString("Profession"));
//          insuranceTextField.setText(res.getString("Insurrance"));
//          amkaTextField.setText(Integer.toString(res.getInt("Insurance_Id_Number")));
//
//          int selectedItem;
//          for(selectedItem = 0; selectedItem <= tameioComboBox.getItemCount(); selectedItem++){
//              if(res.getString("Insurance_Type").equals(tameioComboBox.getItemAt(selectedItem)))
//                break;
//          }
//          tameioComboBox.setSelectedIndex(selectedItem);
//          firstVisitTextField.setText((res.getString("First_Visit")));
//          childrenSpinner.setValue(res.getInt("Children"));
//          homeTextField.setText(Integer.toString(res.getInt("Home_Number")));
//          workTextField.setText(Integer.toString(res.getInt("Work_Number")));
//          cellTextField.setText(Integer.toString(res.getInt("CellPhone_Number")));
//          faxTextField.setText(Integer.toString(res.getInt("Fax_Number")));
//          mailTextField.setText(res.getString("Email"));
//
//         // ageTextField.setText(calculateAge());
//        }
//      }
//      catch (SQLException s){
//          s.printStackTrace();
//        System.out.println("SQL code does not execute.");
//      }
//  }
}
