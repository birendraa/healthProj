
package vidavo;

import java.sql.Date;
import java.sql.Time;

public class Appointment {

    private int id;
    private int patientLName;
    private int patientFName;
    private Time time;
    private Date date;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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