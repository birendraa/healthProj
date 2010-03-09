
package vidavo.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

    private java.sql.Connection con = null;
    private String userName = "root";
    private String password = "root";
    private String url = "jdbc:mysql://5.247.162.220:3306/vidavo";

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
               e.printStackTrace();
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
        java.sql.Statement st = null;
        try {
            this.connect();
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st.executeQuery(q);
    }

    void update(String q) throws SQLException{
        java.sql.Statement st = con.createStatement();
        st.executeUpdate(q);
    }

 }