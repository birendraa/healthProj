
package vidavo;

public class SurgeryHistory {

    private String descriptionOfSurgery;
    private String hospitalName;
    private String reasonOfHospitalization;
    private String finalDiagnosis;
    private String doctorsName;

    public SurgeryHistory(String descriptionOfSurgery, String hospitalName, String reasonOfHospitalization, String finalDiagnosis, String doctorsName) {
        this.descriptionOfSurgery = descriptionOfSurgery;
        this.hospitalName = hospitalName;
        this.reasonOfHospitalization = reasonOfHospitalization;
        this.finalDiagnosis = finalDiagnosis;
        this.doctorsName = doctorsName;
    }

    public SurgeryHistory() {
        this.descriptionOfSurgery = "";
        this.hospitalName = "";
        this.reasonOfHospitalization = "";
        this.finalDiagnosis = "";
        this.doctorsName = "";
    }

    public String getDescriptionOfSurgery() {
        return descriptionOfSurgery;
    }

    public void setDescriptionOfSurgery(String descriptionOfSurgery) {
        this.descriptionOfSurgery = descriptionOfSurgery;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getReasonOfHospitalization() {
        return reasonOfHospitalization;
    }

    public void setReasonOfHospitalization(String reasonOfHospitalization) {
        this.reasonOfHospitalization = reasonOfHospitalization;
    }

}
