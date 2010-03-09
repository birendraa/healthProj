
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
            new AppointmentGUI(am, pm);
        }

}
