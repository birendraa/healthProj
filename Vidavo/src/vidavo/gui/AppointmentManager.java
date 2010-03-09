
package vidavo.gui;

import vidavo.AppointmentList;

public class AppointmentManager {
    
    private AppointmentList al;
    private DatabaseManager db;

    public AppointmentManager(){
        db = new DatabaseManager();
        al = new AppointmentList();
    }

    public AppointmentList getAl() {
        return al;
    }

    public void setAl(AppointmentList al) {
        this.al = al;
    }

    public DatabaseManager getDb() {
        return db;
    }

    public void setDb(DatabaseManager db) {
        this.db = db;
    }
}