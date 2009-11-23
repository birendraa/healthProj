/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.guis;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Serban,Bosko,Sanja
 */
public class Main {

    public static void main(String[] args){
         try {
	    // Set System L&F
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }

        new AddPatientGUI();
    }

}
