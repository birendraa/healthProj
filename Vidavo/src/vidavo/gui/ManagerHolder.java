
package vidavo.gui;

public class ManagerHolder {
    private AppointManager am;
    private PatientManager pm;

    public ManagerHolder(AppointManager am, PatientManager pm) {
        this.am = am;
        this.pm = pm;
    }

    public AppointManager getAm() {
        return am;
    }

    public void setAm(AppointManager am) {
        this.am = am;
    }

    public PatientManager getPm() {
        return pm;
    }

    public void setPm(PatientManager pm) {
        this.pm = pm;
    }
}