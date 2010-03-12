
package vidavo.gui;

import java.util.ListResourceBundle;

public class ManagerHolder {
    private AppointmentManager am;
    private PatientManager pm;
    private String origin;
    private String patientName;
    private int patientId;
    private ListResourceBundle resourceMap;

    public ManagerHolder(AppointmentManager am, PatientManager pm) {
        this.am = am;
        this.pm = pm;
        this.origin = "";
        this.patientId = 0;
        this.patientName = "";
        this.resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("en"));
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

    public ListResourceBundle getResourceMap() {
        return resourceMap;
    }

    public void changeLanguage(String lang){
        if(lang.equals("English"))
            this.resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("en"));
        else if(lang.equals("Greek"))
            this.resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("gr"));
    }
}