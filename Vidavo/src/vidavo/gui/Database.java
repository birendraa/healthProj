/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Serban
 */
public class Database {

    private Connection con = null;
    private String userName = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/vidavo?zeroDateTimeBehavior=convertToNull";

    public void connect(){

           con = null;
           try
           {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection (url, userName, password);
               System.out.println ("Database connection established");
           }
           catch (Exception e)
           {
               System.out.println ("Cannot connect to database server");
           }

       }

    public void disconnect(){

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

    public Statement create() throws SQLException{
        return con.createStatement();
    }
 }


