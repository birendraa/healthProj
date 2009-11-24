/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Serban
 */
public class VidavoApp extends PatientListGUI{

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
                //new MainGUI();
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientListGUI().setVisible(true);
            }
        });
    }
}
