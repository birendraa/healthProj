

package vidavo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ListResourceBundle;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JOptionPane;
import vidavo.pojos.*;

/**
 *
 * @author Serban
 */
public class PatientListGUI extends javax.swing.JFrame implements ActionListener{

    private ManagerHolder mh;
    private PatientManager pm;
    private ListResourceBundle resourceMap;

    private javax.swing.JButton addButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu fileMenu, quitMenu, helpMenu;
    private javax.swing.JMenuItem aboutMenuItem, quitMenuItem;
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


    public PatientListGUI(ManagerHolder mh){
        super();
        this.mh = mh;
        this.pm = mh.getPm();
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCancelDialog();
            }
        });
        this.displayPatientsList();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    public void initComponents(){
        menuBar = new javax.swing.JMenuBar();
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

        resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("en"));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(resourceMap.getString("patientList.title"));
        
        
        // MENU
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu(resourceMap.getString("fileMenu.text"));
        fileMenu.add(new JSeparator());


        quitMenuItem = new JMenuItem(resourceMap.getString("quitMenuItem.text"),KeyEvent.VK_E);
        quitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        quitMenuItem.setActionCommand("quit");
        quitMenuItem.addActionListener(this);
        fileMenu.add(quitMenuItem);

        helpMenu = new JMenu(resourceMap.getString("helpMenu.text"));
        
        aboutMenuItem = new JMenuItem(resourceMap.getString("aboutMenuItem.text"));
        aboutMenuItem.setActionCommand("about");
        aboutMenuItem.addActionListener(this);        
        helpMenu.add(aboutMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        
        
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
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

         if (e.getActionCommand().equals("quit")) {
            this.dispose();
         }

         if (e.getActionCommand().equals("about")) {
            //this.showAboutDialog();
         }

         if(c.equals("add")){
                new AddPatientGUI(mh,c,-1,resourceMap);

                this.dispose();
         }

         if(c.equals("delete")){
            if(patientTable.getSelectedRow() != -1){
             pm.deletePatient(Integer.parseInt(model.getValueAt(patientTable.getSelectedRow(), 0).toString()));
             reloadTable();
               displayPatientsList();
            }
            else
                    JOptionPane.showMessageDialog(null,"No patient was selected!", "Error Message", 2);

         }

         if(c.equals("edit")){
                if(patientTable.getSelectedRow() != -1){
                    int selectedID = (Integer.parseInt((String)patientTable.getValueAt(patientTable.getSelectedRow(), 0)));
                    AddPatientGUI p = new AddPatientGUI(mh,c, selectedID,resourceMap);

                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"No patient selected", "Nothing entered", 2);
         }

         if(c.equals("close")){
             this.dispose();
         }

         if(c.equals("cancel")){
                showCancelDialog();
         }

         if(c.equals("search")){
             Vector v = pm.searchPatient(searchTextField.getText());
             if(v.size() == 0)
                JOptionPane.showMessageDialog(null, "No patient with " + searchTextField.getText() + " last name found!","Error message", 2);
             else
             {
                 reloadTable();
                printResults(v);
             }
         }
    }

    public void displayPatientsList()
    {
            Vector v = pm.displayPatients();
            printResults(v);

            }
    public void printResults(Vector v)
    {
        for(int i = 0; i < v.size()/4; i++)
                this.model.insertRow(i,new Object[]{v.get(i * 4).toString(),v.get(i * 4 +1).toString(),v.get(i * 4 +2).toString(),v.get(i * 4 +3).toString()});
    }

    private void reloadTable() {
        while(model.getRowCount() != 0)
                    model.removeRow(0);
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
            new AppointmentGUI(mh);
            this.dispose();
        }
    }
}
