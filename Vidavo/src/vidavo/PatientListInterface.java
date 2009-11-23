/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo;

import vidavo.util.*;

/**
 *
 * @author sanja
 */
public interface PatientListInterface {

    public void setPatientList(ListInterface pl);
    public ListInterface getPatientList();
    public void addNewPatient(Patient p);
    public void removePatient(Patient p);
    public Patient getPatient(String lName);

}
