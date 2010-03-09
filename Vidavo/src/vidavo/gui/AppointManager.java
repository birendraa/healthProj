
package vidavo.gui;

import vidavo.AppointmentList;

public class AppointManager {
    private AppointmentList al;
    private DatabaseManager db;

    public AppointManager(){
        db = new DatabaseManager();
        al = new AppointmentList();
    }
}