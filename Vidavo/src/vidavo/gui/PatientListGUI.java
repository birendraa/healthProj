

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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vidavo.pojos.*;

/**
 *
 * @author Serban
 */
public class PatientListGUI extends javax.swing.JFrame implements ActionListener{

    private ManagerHolder mh;
    private PatientManager pm;
    private ListResourceBundle resourceMap;
    private boolean isFromApp;

    private javax.swing.JButton addButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu fileMenu, quitMenu, helpMenu, languageMenu;
    private javax.swing.JMenuItem aboutMenuItem, quitMenuItem, englishMenuItem, greekMenuItem;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton okButton;
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
        isFromApp = false;
        this.resourceMap = mh.getResourceMap();
        initComponents();
        if(!mh.getOrigin().equals("AddAppointmentGUI"))
            okButton.setEnabled(false);
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
        okButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        englishMenuItem = new javax.swing.JMenuItem();
        greekMenuItem= new javax.swing.JMenuItem();
        languageMenu = new javax.swing.JMenu();
        fileMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(resourceMap.getString("patientList.title"));
        
        // MENU
        
        englishMenuItem.setText((resourceMap.getString("englishMenuItem.text")));
        greekMenuItem.setText((resourceMap.getString("greekMenuItem.text")));
        languageMenu.setText((resourceMap.getString("languageMenu.text")));

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
        
//        fileMenu.add(new JSeparator());

        quitMenuItem = new JMenuItem(resourceMap.getString("quitMenuItem.text"),KeyEvent.VK_E);
        quitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        quitMenuItem.setActionCommand("quit");
        quitMenuItem.addActionListener(this);

        helpMenu = new JMenu(resourceMap.getString("helpMenu.text"));
        
        aboutMenuItem = new JMenuItem(resourceMap.getString("aboutMenuItem.text"));
        aboutMenuItem.setActionCommand("about");
        aboutMenuItem.addActionListener(this);        

        languageMenu.add(englishMenuItem);
        languageMenu.add(greekMenuItem);
        fileMenu.add(quitMenuItem);
        helpMenu.add(aboutMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(languageMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        fileMenu.setText((resourceMap.getString("fileMenu.text")));
        
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

        ListSelectionModel listSelectionModel = patientTable.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                if (!lsm.isSelectionEmpty()){
                    int position = lsm.getAnchorSelectionIndex();
                    String fname = (String)model.getValueAt(position, 2);
                    String lname = (String)model.getValueAt(position, 1);
                    patientNameLabel.setText(lname + " " + fname);
                }
            }
        });
	patientTable.setSelectionModel(listSelectionModel);

        patientLabel.setText(resourceMap.getString("patientLabel.text")); // NOI18N
        patientLabel.setName("patientLabel"); // NOI18N

        patientNameLabel.setText(resourceMap.getString("patientNameLabel.text")); // NOI18N
        patientNameLabel.setName("patientNameLabel"); // NOI18N

        addButton.setText(resourceMap.getString("addButton.text")); // NOI18N
        addButton.setName("addButton"); // NOI18N
        addButton.setActionCommand("add");
        addButton.addActionListener(this);

        refreshButton.setName("refreshButton"); // NOI18N
        refreshButton.setActionCommand("refresh");
        refreshButton.setToolTipText("Reload table");
        refreshButton.setIcon(new ImageIcon(getClass().getResource("images/clear.png")));
        refreshButton.addActionListener(this);

        okButton.setText(resourceMap.getString("okButton.text")); // NOI18N
        okButton.setName("okButton"); // NOI18N
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);

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
                        .addGap(4, 4, 4)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        patientListPanelLayout.setVerticalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton)
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
                    .addComponent(okButton)
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
            this.showAboutDialog();
         }

         if(c.equals("add")){
                new AddPatientGUI(mh,c,-1);
                this.dispose();
         }

         if(c.equals("delete")){
            if(patientTable.getSelectedRow() != -1){
             pm.deletePatient(Integer.parseInt(model.getValueAt(patientTable.getSelectedRow(), 0).toString()));
             reloadTable();
             displayPatientsList();
             patientNameLabel.setText(resourceMap.getString("patientNameLabel.text"));
            }
            else
                    JOptionPane.showMessageDialog(null,resourceMap.getString("patientNotSelected.text"), "Error Message", 2);

         }

         if(c.equals("edit")){
                if(patientTable.getSelectedRow() != -1){
                    int selectedID = (Integer.parseInt((String)patientTable.getValueAt(patientTable.getSelectedRow(), 0)));
                    this.dispose();
                    AddPatientGUI p = new AddPatientGUI(mh,c, selectedID);
                }
                else
                    JOptionPane.showMessageDialog(null,resourceMap.getString("patientNotSelected.text"), "Nothing entered", 2);
         }

         if(c.equals("ok")){
            if(patientTable.getSelectedRow() != -1){
                    int selectedID = (Integer.parseInt((String)patientTable.getValueAt(patientTable.getSelectedRow(), 0)));
                    Patients p = pm.getPatient(selectedID);
                    mh.getAm().getTempInfo().set(7, p);
                    new AddAppointmentGUI (mh);
                    this.dispose();
             }
                else
                    JOptionPane.showMessageDialog(null,resourceMap.getString("patientNotSelected.text"), "Nothing entered", 2);
         }

         if(c.equals("cancel")){
                showCancelDialog();   
         }

         if(c.equals("refresh")){
                reloadTable();
                displayPatientsList();
         }

         if(c.equals("search")){
             Vector v = pm.searchPatient(searchTextField.getText());
             if(v.size() == 0)
                JOptionPane.showMessageDialog(null, resourceMap.getString("noPatientWith.text") + searchTextField.getText() + resourceMap.getString("lastNameFound.text"),"Error message", 2);
             else{
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
            if(!mh.getOrigin().equals("AddAppointmentGUI")){
                this.dispose();
                new AppointmentGUI(mh);
            }
            else{
                this.dispose();
                Patients p = null;
                mh.getAm().getTempInfo().set(7, p);
                new AddAppointmentGUI(mh);
            }
        }
    }

    private void redrawGUI(){
        new PatientListGUI(this.mh);
        this.dispose();
    }

    private void showAboutDialog() {
        JLabel boskoLabel = new JLabel();
        JLabel copyLabel = new JLabel();
        JLabel designLabel = new JLabel();
        JLabel logoLabel = new JLabel();
        JLabel nameLabel = new JLabel();
        JButton okButton = new JButton();
        JLabel sanjaLabel = new JLabel();
        JLabel serbanLabel = new JLabel();
        JLabel minasLabel = new JLabel();
        JLabel thanosLabel = new JLabel();
        final JDialog dialog = new JDialog(this,"About",true);

        boskoLabel.setText("Bosko Zerajik");
        sanjaLabel.setText("Sanja Jankolovska");
        serbanLabel.setText("Serban Mogos");
        minasLabel.setText("Minas Akepsimas");
        thanosLabel.setText("Thanos Irodotou");
        copyLabel.setText("© ModernBit");
        designLabel.setText("Design and code by:");
        nameLabel.setText("Appointments Manager v0.1 rev.200");
        okButton.setText("Close");
        okButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        okButton.setHorizontalTextPosition(SwingConstants.CENTER);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog.dispose();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(designLabel)
                    .addComponent(boskoLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logoLabel)
                        .addComponent(nameLabel)
                        .addComponent(copyLabel)
                        .addComponent(serbanLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sanjaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(thanosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(minasLabel, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyLabel)
                .addGap(31, 31, 31)
                .addComponent(designLabel)
                .addGap(18, 18, 18)
                .addComponent(minasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sanjaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serbanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boskoLabel)
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }
}
