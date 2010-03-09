
package vidavo.gui;

public class ManagerHolder {
    private AppointmentManager am;
    private PatientManager pm;

    public ManagerHolder(AppointmentManager am, PatientManager pm) {
        this.am = am;
        this.pm = pm;
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
}