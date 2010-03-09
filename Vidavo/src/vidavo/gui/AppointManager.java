
package vidavo.gui;

import vidavo.AppointmentList;

public class AppointManager {
    private AppointmentList pl;
    private DatabaseManager db;

    public AppointManager(){
        db = new DatabaseManager();
        pl = new AppointmentList();
    }
}