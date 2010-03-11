
package vidavo.gui;

public class ManagerHolder {
    private AppointmentManager am;
    private PatientManager pm;
    private String origin;
    private String patientName;
    private int patientId;

    public ManagerHolder(AppointmentManager am, PatientManager pm) {
        this.am = am;
        this.pm = pm;
        this.origin = "";
        this.patientId = 0;
        this.patientName = "";
    }

    public AppointmentManager getAm() {
        return am;
    }

    public void setAm(AppointmentManager am) {
        this.am = am;
    }

    public PatientManager getPm() {
        return pm;
    }

    public void setPm(PatientManager pm) {
        this.pm = pm;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}