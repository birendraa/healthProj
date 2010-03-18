
package vidavo.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Time;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vidavo.pojos.Appointments;
import vidavo.util.ListInterface;
import vidavo.util.ReferenceBasedList;
//import vidavo.util.ScrollablePanel;

public class FindAvailableGUI extends javax.swing.JFrame {

    private java.util.ListResourceBundle resourceMap;
    
    private javax.swing.JLabel availableTimesLabel;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JTextField daysTextField;
    private javax.swing.JLabel forLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel startDateLabel;

    private ManagerHolder mh;
    private int appDuration;

    // 8:30
    private final int amStartTime = 30600;
    // 12:00
    private final int amFinishTime = 43200;
    // 13:00
    private final int pmStartTime = 46800;
    // 20:00
    private final int pmFinishTime = 72000;
    // + 2 hours gmt for greek time
    private final int greekGmtTimeInSeconds = 7200;

    private final int Day_IN_MILLIS = 1000 * 60 * 60 * 24;

    public FindAvailableGUI(ManagerHolder mh) {
        this.resourceMap = mh.getResourceMap();
        this.mh = mh;
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        this.appDuration = Integer.parseInt((String)this.mh.getAm().getTempInfo().get(5));
        this.appDuration *= 60;

        startDateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        forLabel = new javax.swing.JLabel();
        daysLabel = new javax.swing.JLabel();
        daysTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        availableTimesLabel = new javax.swing.JLabel();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCancelDialog();
            }
        });

        startDateLabel.setText(resourceMap.getString("startDateLabel.text"));
        forLabel.setText(resourceMap.getString("forLabel.text"));
        daysLabel.setText(resourceMap.getString("daysLabel.text"));
        searchButton.setText(resourceMap.getString("searchButton.text"));
        availableTimesLabel.setText(resourceMap.getString("availableTimesLabel.text"));

        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        mainScrollPane.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(availableTimesLabel))
                .addContainerGap())
            .addComponent(mainScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(daysLabel)
                        .addComponent(daysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(forLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startDateLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableTimesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
        );

        pack();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(ManagerHolder.isInteger(daysTextField.getText()) && !daysTextField.getText().equals("0") &&
                !dateChooser.getDate().toString().isEmpty() && dateChooser.getDate().toString().length() > 6){
            mainPanel.removeAll();
            createPanels();
        }
        else
            JOptionPane.showMessageDialog(null, "Please enter a valid date and number of days to search.", "Invalid parameters", JOptionPane.ERROR_MESSAGE);
    }

    private void createPanels(){
        int width = 100;
        int x = 0;
        if(ManagerHolder.isInteger(daysTextField.getText())){
            ReferenceBasedList [] appsTimeArray = getAppointmentsTimeArray();
            ReferenceBasedList [] appsDurationArray = getAppointmentsDurationArray();
            
//            mainScrollPane.getViewport().add(mainPanel);
            mainScrollPane.setBounds(0, 60, mainPanel.getWidth(), mainPanel.getHeight());

            for(int i = 0; i < appsTimeArray.length; i++){
                javax.swing.JPanel jPanel = new javax.swing.JPanel();
                Date d = new Date(dateChooser.getDate().getTime() + (Day_IN_MILLIS * i + 1));
                populatePanel(jPanel, i, d,appsTimeArray[i], appsDurationArray[i]);

//            mainScrollPane.setBounds(mainPanel.getX(), mainPanel.getY(), mainPanel.getWidth(), mainPanel.getHeight());
//            mainScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            mainScrollPane.setHorizontalScrollBar(new JScrollBar());
                mainPanel.add(jPanel);
                jPanel.setBounds(x, 0, width, Short.MAX_VALUE);
                x += width;
            }
        }
    }

    private void populatePanel(javax.swing.JPanel panel, int panelId, Date date, ReferenceBasedList unavailableTimes, ReferenceBasedList durations){
        panel.setLayout(null);
        panel.setName(Integer.toString(panelId));

        javax.swing.JLabel amLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDayLabel = new javax.swing.JLabel();
        javax.swing.JLabel dayDateLabel = new javax.swing.JLabel();
        javax.swing.JList amList = new javax.swing.JList();
        javax.swing.JList pmList = new javax.swing.JList();
        javax.swing.JScrollPane amScrollPane = new javax.swing.JScrollPane();
        javax.swing.JScrollPane pmScrollPane = new javax.swing.JScrollPane();
        javax.swing.JSeparator separator = new javax.swing.JSeparator();
        javax.swing.JLabel pmLabel = new javax.swing.JLabel();

        String[] weekdays = new DateFormatSymbols().getWeekdays();
        GregorianCalendar calDate = new GregorianCalendar(Integer.parseInt(new SimpleDateFormat("yyyy").format(date)),
                Integer.parseInt(new SimpleDateFormat("MM").format(date)),
                Integer.parseInt(new SimpleDateFormat("dd").format(date)));

        appDayLabel.setText(weekdays[date.getDay() + 1]);
        panel.add(appDayLabel);
        appDayLabel.setBounds(10, 0, 80, 14);

        dayDateLabel.setText(new SimpleDateFormat("yyyy").format(date) + "-" + new SimpleDateFormat("MM").format(date) +
                "-" + new SimpleDateFormat("dd").format(date));
        panel.add(dayDateLabel);
        dayDateLabel.setBounds(10, 20, 80, 14);

        pmLabel.setText(resourceMap.getString("pmLabel.text"));
        panel.add(pmLabel);
        pmLabel.setBounds(50, 40, 15, 14);

        amLabel.setText(resourceMap.getString("amLabel.text"));
        panel.add(amLabel);
        amLabel.setBounds(10, 40, 15, 14);

        panel.add(separator);
        separator.setBounds(0, 40, 80, 10);

        ReferenceBasedList amRefList = new ReferenceBasedList();
        ReferenceBasedList pmRefList = new ReferenceBasedList();
        
        int tempTime = amStartTime;
        int unavailableTime = 0;
        int unavailableAppDuration = 0;
        int counter = 1;
        boolean overlapsUnavailable = true;

        while(tempTime < pmFinishTime){
            // No appointments exist - unavailableTime set to unreachable number
            if(counter > unavailableTimes.size() && overlapsUnavailable == true){
                unavailableTime = 60 * 60 * 24;
                overlapsUnavailable = false;
            }
            // Appointments exist
            else if(counter <= unavailableTimes.size() && overlapsUnavailable == true){
                unavailableTime = Integer.parseInt(unavailableTimes.get(counter).toString()) / 100;
                unavailableTime = unavailableTime * 100;
                unavailableAppDuration = Integer.parseInt(durations.get(counter).toString()) * 60;
                counter++;
                overlapsUnavailable = false;
            }

            if(tempTime + appDuration <= amFinishTime){
                if(tempTime + appDuration <= unavailableTime){
                    if(tempTime + appDuration == amFinishTime){
                        amRefList.append(new JButton(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds + appDuration) * 1000).toString())));
                        tempTime = pmStartTime;
                    }
                    else if(tempTime + appDuration < amFinishTime){
                        if(tempTime + appDuration == unavailableTime){
                            //
                            amRefList.append(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString()));
                            tempTime += appDuration + unavailableAppDuration;
                            if(tempTime == amFinishTime)
                                tempTime = pmStartTime;
                        }
                        else if(tempTime + appDuration < unavailableTime){
                            amRefList.append(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString()));
                            //bug
                            tempTime += appDuration;
                            if(tempTime + appDuration > amFinishTime){
                                tempTime = pmStartTime;
                            }
                            if(tempTime + appDuration == unavailableTime){
                                //
                                amRefList.append(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString()));
                                tempTime += appDuration + unavailableAppDuration;
                                if(tempTime == amFinishTime)
                                    tempTime = pmStartTime;
                            }
                            else if(tempTime + appDuration > unavailableTime){
                                overlapsUnavailable = true;
                                tempTime += appDuration + unavailableAppDuration;
                                if(tempTime == amFinishTime)
                                    tempTime = pmStartTime;
                            }
                        }
                    }
                    else if(tempTime + appDuration > amFinishTime)
                        tempTime = pmStartTime;
                }
                else if (tempTime + appDuration > unavailableTime){
                    overlapsUnavailable = true;
                    if(tempTime + appDuration < amFinishTime){
                        tempTime = unavailableTime + unavailableAppDuration;
                    }
                    else if(tempTime + appDuration == amFinishTime){
                        tempTime = pmStartTime;
                    }
                    else if(tempTime + appDuration > amFinishTime){
                        tempTime = pmStartTime;
                    }
                }
            }
            else if(tempTime + appDuration <= pmFinishTime){
                if(tempTime + appDuration <= unavailableTime){
                    if(tempTime + appDuration == pmFinishTime){
                        pmRefList.append(new JButton(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds + appDuration) * 1000).toString())));
                        break;
                    }
                    else if(tempTime + appDuration < pmFinishTime){
                        if(tempTime + appDuration == unavailableTime){
                            //
                            pmRefList.append(new JButton(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString())));
                            tempTime += appDuration + unavailableAppDuration;
                            if(tempTime == pmFinishTime)
                                break;
                        }
                        else if(tempTime + appDuration < unavailableTime){
                            pmRefList.append(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString()));
                            //bug
                            tempTime += appDuration;
                            if(tempTime + appDuration > pmFinishTime){
                                break;
                            }
                            if(tempTime + appDuration == unavailableTime){
                                //
                                pmRefList.append(getHoursANDMinutes(new Time((tempTime - greekGmtTimeInSeconds) * 1000).toString()));
                                tempTime += appDuration + unavailableAppDuration;
                                if(tempTime == pmFinishTime)
                                    break;
                            }
                            else if(tempTime + appDuration > unavailableTime){
                                overlapsUnavailable = true;
                                tempTime += appDuration + unavailableAppDuration;
                                if(tempTime == pmFinishTime)
                                    break;
                            }
                        }
                    }
                    else if(tempTime + appDuration > pmFinishTime)
                        break;
                }
                else if (tempTime + appDuration > unavailableTime){
                    overlapsUnavailable = true;
                    if(tempTime + appDuration < pmFinishTime){
                        tempTime = unavailableTime + unavailableAppDuration;
                    }
                    else if(tempTime + appDuration == pmFinishTime){
                        break;
                    }
                    else if(tempTime + appDuration > pmFinishTime){
                        break;
                    }
                }
            }
        }
        amList = new JList(refBasedListToStringArray(amRefList));
        pmList = new JList(refBasedListToStringArray(pmRefList));

        amList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        pmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        amList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                listItemClicked(e);
            }
        });

        pmList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                listItemClicked(e);
            }
        });

        pmLabel.setText(resourceMap.getString("pmLabel.text"));
        panel.add(pmLabel);
        pmLabel.setBounds(50, 40, 14, 14);

        amLabel.setText(resourceMap.getString("amLabel.text"));
        panel.add(amLabel);
        amLabel.setBounds(10, 40, 14, 14);
        
        amScrollPane.getViewport().add(amList);
        amScrollPane.setBounds(0, 60, 50, 265);
        amScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(amScrollPane);

        pmScrollPane.getViewport().add(pmList);
        pmScrollPane.setBounds(50, 60, 50, 265);
        pmScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(pmScrollPane);
    }
    
    private ReferenceBasedList [] getAppointmentsTimeArray(){
        ReferenceBasedList [] appsArray = new ReferenceBasedList [Integer.parseInt(daysTextField.getText())];
        int counter = 1;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date tempDate = dateChooser.getDate();
        
        while(counter <= appsArray.length){
            List appointments = mh.getAm().getAppointmentsDuration(tempDate);
            ReferenceBasedList list = new ReferenceBasedList();

            for(int i = 0; i < appointments.size(); i++){
                list.append(((Appointments)appointments.get(i)).getTime().getTime()/1000 + greekGmtTimeInSeconds);
            }
            appsArray[counter-1] = list;
            
            counter++;
            String s = df.format(tempDate.getTime() + (Day_IN_MILLIS));
            try {
                tempDate = df.parse(s);
            }
            catch (ParseException ex) {
                Logger.getLogger(FindAvailableGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return appsArray;
    }

    private ReferenceBasedList [] getAppointmentsDurationArray(){
        ReferenceBasedList [] appsArray = new ReferenceBasedList [Integer.parseInt(daysTextField.getText())];
        int counter = 1;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date tempDate = dateChooser.getDate();

        while(counter <= appsArray.length){
            List appointments = mh.getAm().getAppointmentsDuration(tempDate);
            ReferenceBasedList list = new ReferenceBasedList();

            for(int i = 0; i < appointments.size(); i++){
                 list.append(((Appointments)appointments.get(i)).getDuration());
            }
            appsArray[counter-1] = list;

            counter++;
            String s = df.format(tempDate.getTime() + (Day_IN_MILLIS));
            try {
                tempDate = df.parse(s);
            }
            catch (ParseException ex) {
                Logger.getLogger(FindAvailableGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return appsArray;
    }

    private String getHoursANDMinutes(String s){
        String str = "";
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ':' && counter == 0){
                str += s.charAt(i);
                counter++;
            }
            else if(s.charAt(i) == ':' && counter != 0)
                counter++;
            if(s.charAt(i) != ':' && counter <= 1)
                str += s.charAt(i);
            if(counter == 2)
                break;
        }
        return str;
    }

    public String [] refBasedListToStringArray(ReferenceBasedList rfbl){
        String [] s = new String [rfbl.size()];
        for(int i = 1; i < rfbl.size(); i++){
            s[i] = (String) rfbl.get(i);
        }
        return s;
    }

    private void listItemClicked(ListSelectionEvent e) {
        String temp = ((String) ((JList)e.getSource()).getSelectedValue());
        String hour = temp.substring(0, 2);
        String minutes = temp.substring(3);
        int daysForward = Integer.parseInt(((JList)e.getSource()).getParent().getParent().getParent().getName());
        this.mh.getAm().getTempInfo().set(1, new Date(dateChooser.getDate().getTime() + Day_IN_MILLIS * daysForward));
        this.mh.getAm().getTempInfo().set(3, hour);
        this.mh.getAm().getTempInfo().set(4, minutes);
        new AddAppointmentGUI(mh, null);
        this.dispose();
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
            new AddAppointmentGUI(mh, null);
            this.dispose();
        }
    }
}