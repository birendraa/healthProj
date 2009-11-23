/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package appointmentsandpatients;

import util.ListInterface;

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
