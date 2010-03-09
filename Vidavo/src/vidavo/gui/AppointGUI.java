
package vidavo.gui;

public class AppointGUI {

        ManagerHolder mh;

        public AppointGUI(){
            mh = new ManagerHolder(new AppointmentManager(), new PatientManager());
            new AppointmentGUI(mh);
        }

}
