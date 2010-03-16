
package vidavo.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import vidavo.pojos.Appointments;
import vidavo.util.ListInterface;
import vidavo.util.ReferenceBasedList;

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

    private final int amStartTime = 830;
    private final int amFinishTime = 1200;
    private final int pmStartTime = 1300;
    private final int pmFinishTime = 2000;

    public FindAvailableGUI(ManagerHolder mh, int appDuration) {
        this.resourceMap = mh.getResourceMap();
        this.mh = mh;
        this.appDuration = appDuration;
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        startDateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        forLabel = new javax.swing.JLabel();
        daysLabel = new javax.swing.JLabel();
        daysTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        availableTimesLabel = new javax.swing.JLabel();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        createPanels();
    }

    private void createPanels(){
        int width = 100;
        int x = 0;
        if(ManagerHolder.isInteger(daysTextField.getText())){
            ReferenceBasedList [] appsTimeArray = getAppointmentsTimeArray();
            ReferenceBasedList [] appsDurationArray = getAppointmentsDurationArray();
//                 System.out.println("=======appsTimeArray.length========");
//                 System.out.println(appsTimeArray.length);
//                 System.out.println("==================");
//                 System.out.println("=======appsDurationArray.length========");
//                 System.out.println(appsDurationArray.length);
//                 System.out.println("==================");
            mainScrollPane.getViewport().add(mainPanel);
            mainScrollPane.setBounds(0, 60, 455, mainPanel.getHeight());

            for(int i = 0; i < appsTimeArray.length; i++){
                javax.swing.JPanel jPanel = new javax.swing.JPanel();
                populatePanel(jPanel, appsTimeArray[i], appsDurationArray[i]);
//                System.out.println((ReferenceBasedList)appsTimeArray[i].get(i));
//                System.out.println(appsDurationArray[i]);
//            mainScrollPane.setBounds(mainPanel.getX(), mainPanel.getY(), mainPanel.getWidth(), mainPanel.getHeight());
//            mainScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                mainPanel.add(jPanel);
                jPanel.setBounds(x, 0, width, Short.MAX_VALUE);
                x += width;
            }
        }
    }

    private void populatePanel(javax.swing.JPanel panel, ReferenceBasedList unavailableTimes, ReferenceBasedList durations){
        panel.setLayout(null);

        javax.swing.JLabel amLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDayLabel = new javax.swing.JLabel();
        javax.swing.JLabel dayDateLabel = new javax.swing.JLabel();
        javax.swing.JList amList = new javax.swing.JList();
        javax.swing.JList pmList = new javax.swing.JList();
        javax.swing.JScrollPane amScrollPane = new javax.swing.JScrollPane();
        javax.swing.JScrollPane pmScrollPane = new javax.swing.JScrollPane();
        javax.swing.JSeparator separator = new javax.swing.JSeparator();
        javax.swing.JLabel pmLabel = new javax.swing.JLabel();

        appDayLabel.setText("A");
        panel.add(appDayLabel);
        appDayLabel.setBounds(10, 0, 57, 14);

        dayDateLabel.setText("B");
        panel.add(dayDateLabel);
        dayDateLabel.setBounds(10, 20, 57, 14);

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
        
        while(tempTime < pmFinishTime){
            if(counter <= unavailableTimes.size()){
                unavailableTime = getTimeInInt(unavailableTimes.get(counter).toString());
                System.out.println(unavailableTimes.get(counter).toString());
                unavailableAppDuration = Integer.parseInt(durations.get(counter).toString());
                counter++;
            }
            if(tempTime + appDuration <= amFinishTime){
                if(tempTime + appDuration <= unavailableTime || counter == unavailableTimes.size() + 1){
                    if(tempTime + appDuration == amFinishTime){
                        amRefList.append(Integer.toString(tempTime + appDuration));
                        tempTime = pmStartTime;
                    }
                    else{
                        if(tempTime + appDuration == unavailableTime){
                            amRefList.append(Integer.toString(tempTime));
                            tempTime += appDuration + unavailableAppDuration;
                        }
                        else{
                            amRefList.append(Integer.toString(tempTime));
                            tempTime += appDuration;
                            if(tempTime + appDuration >= amFinishTime){
                                amRefList.append(Integer.toString(tempTime));
                            }
                        }
                    }
                }
                else if (tempTime + appDuration > unavailableTime){
                    if(tempTime + appDuration < amFinishTime){
                        tempTime = unavailableTime + unavailableAppDuration;
                        amRefList.append(Integer.toString(tempTime));
                    }
                    else if(tempTime + appDuration >= amFinishTime){
                        amRefList.append(Integer.toString(tempTime));
                        tempTime = pmStartTime;
                    }
                }
            }
            else{
                if(tempTime + appDuration <= unavailableTime || counter == unavailableTimes.size() + 1){
                    if(tempTime + appDuration == pmFinishTime){
                        pmRefList.append(Integer.toString(tempTime + appDuration));
                        tempTime = pmFinishTime;
                    }
                    else{
                        if(tempTime + appDuration == unavailableTime){
                            pmRefList.append(Integer.toString(tempTime));
                            tempTime += appDuration + unavailableAppDuration;
                        }
                        else{
                            pmRefList.append(Integer.toString(tempTime));
                            tempTime += appDuration;
                            if(tempTime + appDuration >= pmFinishTime){
                                pmRefList.append(Integer.toString(tempTime));
                            }
                        }
                    }
                }
                else if (tempTime + appDuration > unavailableTime){
                    if(tempTime + appDuration < pmFinishTime){
                        tempTime = unavailableTime + unavailableAppDuration;
                        amRefList.append(Integer.toString(tempTime));
                    }
                    else if(tempTime + appDuration >= pmFinishTime){
                        tempTime = pmStartTime;
                    }
                }
            }
        }
        amList = new JList(refBasedListToStringArray(amRefList));
        pmList = new JList(refBasedListToStringArray(pmRefList));

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
        final int Day_IN_MILLIS = 1000 * 60 * 60 * 24;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date tempDate = dateChooser.getDate();
        
        while(counter <= appsArray.length){
            Vector appointments = mh.getAm().getAppointments(tempDate);
            ReferenceBasedList list = new ReferenceBasedList();
            
            for(int i = 0; i < appointments.size()/4; i++){
                 list.append(appointments.get(i * 4 + 1).toString());
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
        int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
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
            String s = df.format(tempDate.getTime() + (MILLIS_IN_DAY));
            try {
                tempDate = df.parse(s);
            }
            catch (ParseException ex) {
                Logger.getLogger(FindAvailableGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return appsArray;
    }

    private int getTimeInInt(String s){
        String str = "";
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ':')
                counter++;
            if(s.charAt(i) != '0' && i == 0)
                str += s.charAt(i);
            else if(s.charAt(i) != ':' && counter <= 1)
                str += s.charAt(i);
            if(counter == 2)
                break;
        }
        return Integer.parseInt(str);
    }

    public String [] refBasedListToStringArray(ReferenceBasedList rfbl){
        String [] s = new String [rfbl.size()];
        for(int i = 1; i < rfbl.size(); i++){
            s[i] = (String) rfbl.get(i);
        }
        return s;
    }

    private void timeButtonClicked(java.awt.event.ActionEvent evt) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}