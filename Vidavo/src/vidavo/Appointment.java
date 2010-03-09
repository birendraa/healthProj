
package vidavo;

import java.sql.Time;

public class Appointment {

    private int id;
    private int patientLName;
    private int patientFName;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientFName() {
        return patientFName;
    }

    public void setPatientFName(int patientFName) {
        this.patientFName = patientFName;
    }

    public int getPatientLName() {
        return patientLName;
    }

    public void setPatientLName(int patientLName) {
        this.patientLName = patientLName;
    }

}