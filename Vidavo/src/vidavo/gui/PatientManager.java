/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import vidavo.PatientList;


/**
 *
 * @author Serban
 */
public class PatientManager {

    private PatientList pl;
    private Database db;
    private int patientID;
    private int patientNumber;


    public PatientManager(){
        db = new Database();
        pl = new PatientList();
    }

    public PatientList getPL() {
        return pl;
    }

    public void setPL(PatientList pl) {
        this.pl = pl;
    }

    void loadPatientsList(){
          try{
            ResultSet res = db.query("SELECT patientID, LastName, FirstName, Home_Number FROM personalInfo;");
            while(res.next()){
                model.insertRow(patientTable.getRowCount(), new Object[]{res.getString("patientID"),res.getString("LastName"),res.getString("FirstName"),res.getString("Home_Number")});
            }
          }
          catch (SQLException s){
            System.out.println("Error in loading patients.");
          }
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

    void searchPatient(){
        try {
            ResultSet res = db.query("SELECT patientID, LastName, FirstName, Home_Number FROM personalInfo WHERE LastName like '" + searchTextField.getText() + "%';");
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            while (res.next()) {
                model.insertRow(patientTable.getRowCount(), new Object[]{res.getString("patientID"), res.getString("LastName"), res.getString("FirstName"), res.getString("Home_Number")});
            }
        } catch (SQLException ex) {
            System.out.println("Error in searching patients");
        }
    }

    void dbConnect() {
        db.connect();
    }

    void dbDisconnect(){
        db.disconnect();
    }

    ResultSet dbQuery(String s){
        ResultSet rs = null;
        try {
            rs = db.query(s);
        } catch (SQLException ex) {
            System.out.println ("Query error");
        }
        return rs;
    }

    void dbUpdate(String s){
        try {
            db.update(s);
        } catch (SQLException ex) {
           System.out.println ("Update error");
        }
    }
}
class Database {

    private java.sql.Connection con = null;
    private String userName = "root";
    private String password = "root";
    private String url = "jdbc:mysql://127.0.0.1:3306/vidavo?zeroDateTimeBehavior=convertToNull";

    void connect(){

           con = null;
           try
           {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = java.sql.DriverManager.getConnection (url, userName, password);
               System.out.println ("Database connection established");
           }
           catch (Exception e)
           {
               System.out.println ("Cannot connect to database server");
           }

       }

    void disconnect(){

        if (con != null)
               {
                   try
                   {
                       con.close ();
                       System.out.println ("Database connection terminated");
                   }
                   catch (Exception e) { /* ignore close errors */ }
               }
    }

    ResultSet query(String q) throws SQLException{
        java.sql.Statement st = con.createStatement();
        return st.executeQuery(q);
    }

    void update(String q) throws SQLException{
        java.sql.Statement st = con.createStatement();
        st.executeUpdate(q);
    }
    
 }