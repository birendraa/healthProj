/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vidavo.Patient;
import vidavo.PatientList;
import vidavo.PersonalInfo;


/**
 *
 * @author Serban
 */
public class PatientManager {

    private PatientList pl;
    private DatabaseManager db;
    private int patientID;
    private int patientNumber;


    public PatientManager(){
        db = new DatabaseManager();
        pl = new PatientList();
    }

    public PatientList getPL() {
        return pl;
    }

    public void setPL(PatientList pl) {
        this.pl = pl;
    }

    void deletePatient(int patientID){
          try{
            db.update("DELETE FROM personalInfo where patientId = " + patientID);
          }
          catch (SQLException s){
              s.printStackTrace();
            System.out.println("Error in deleting patient");
          }
    }

    int countPatients(){
        int count = 0;
        try {
            ResultSet r = db.query("SELECT COUNT(*) AS rowcount FROM patients");
            r.next();
            count = r.getInt("rowcount");
            r.close();
            System.out.println("Patients has " + count + " row(s).");
        } catch (SQLException ex) {
            System.out.println("Error in counting patients");
        }
        return count + 1;
    }

   public PatientList searchPatient(String lName){
            //ResultSet res = db.query("SELECT patientID, LastName, FirstName, Home_Number FROM personalInfo WHERE LastName like '" + text + "%';");
            PatientList searchList = new PatientList();
            Patient patient = new Patient();
            for(int i = 1; i < pl.size(); i++){
                patient = ((Patient)pl.getPatientAtIndex(i));
                if(patient.getPersonalInfo().getLName().equals(lName)){
                    searchList.addNewPatient(patient);
                }
            }
        return searchList;
    }

    void dbConnect() {
        db.connect();
    }

    void dbDisconnect(){
        db.disconnect();
    }

    ResultSet dbQuery(String s) throws SQLException{
        return this.db.query(s);
    }

    void dbUpdate(String s){
        try {
            db.update(s);
        } catch (SQLException ex) {
           System.out.println ("Update error");
        }
    }
/*
 * addPatient(pi)
 * {
 *    Patient p = new Patient(pi);
 *   // checkRequiredFields();
 *   // PersnoalInfo pi = new PersonalInfo(reg attributes);
 *   // pi.setAttributes(optional)
 *    pl.add(p);
    }
 *
 *
 *
 */
    public void retrievePatientData(){

      try{
        java.sql.ResultSet res = this.dbQuery("SELECT * FROM personal_info");

        while(res.next()){
          PersonalInfo pInfo = new PersonalInfo();

          pInfo.setID(res.getInt("patientID"));
          pInfo.setFName(res.getString("FirstName"));
          pInfo.setMName(res.getString("MiddleName"));
          pInfo.setLName(res.getString("LastName"));
          pInfo.setAddress(res.getString("Address"));
          pInfo.setAddressNum(res.getInt("AddressNum"));
          pInfo.setCity(res.getString("City"));
          pInfo.setState(res.getString("State_Region"));
          pInfo.setCountry(res.getString("Country"));
          pInfo.setPostalCode(res.getInt("Postal_Code"));
          pInfo.setCitizenship(res.getString("Citizenship"));
          pInfo.setHeight(res.getInt("Height"));
          pInfo.setWeight(res.getInt("Weight"));
          pInfo.setSex(res.getString("Gender"));
          pInfo.setMaritalStatus(res.getString("Status"));
//Date gives error - Incompatible data types. It tries to save a Date object to a string.
//          pInfo.setBirthDate((res.getString("BirthDate")));
          pInfo.setProfession(res.getString("Profession"));
          pInfo.setInsurance(res.getString("Insurrance"));
          pInfo.setAmka(res.getInt("Insurance_Id_Number"));

          pInfo.setTameio(res.getString("Insurance_Type"));
//Date error here as well.
//          pInfo.setFirstVisit((res.getString("First_Visit")));
          pInfo.setChildren(res.getInt("Children"));
          pInfo.setHomeNum(Integer.toString(res.getInt("Home_Number")));
          pInfo.setWorkNum(Integer.toString(res.getInt("Work_Number")));
          pInfo.setCellPhone(Integer.toString(res.getInt("CellPhone_Number")));
          pInfo.setFax(Integer.toString(res.getInt("Fax_Number")));
          pInfo.setEmail(res.getString("Email"));

          Patient p = new Patient(pInfo.getID());
          p.setPersonalInfo(pInfo);
          pl.addNewPatient(p);
         // ageTextField.setText(calculateAge());
        }
      }
      catch (SQLException s){
          s.printStackTrace();
        System.out.println("SQL code does not execute.");
      }
  }
}