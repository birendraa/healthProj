/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

/**
 *
 * @author Serban
 */
public class AppointGUI {

        PatientManager pm;
        AppointManager am;

        public AppointGUI(){
            pm = new PatientManager();
            am = new AppointManager();
            new PatientListGUI(pm);
        }

}
