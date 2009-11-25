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
public class PatientList implements PatientListInterface{

    private ListInterface patientList;

    public PatientList()
    {
        patientList = new ReferenceBasedList();
    }

    public void setPatientList(ListInterface pl)
    {
        patientList = (ReferenceBasedList)pl;
    }

    public ListInterface getPatientList()
    {
        return patientList;
    }
    
    public void addNewPatient(Patient p)
    {
        patientList.append(p);
    }

    public int size(){
        return patientList.size();
    }

    public Object getObjectAtIndex(int index){
        return patientList.get(index);
    }

    public void removePatient(Patient p)
    {
        for(int i = 1; i <= patientList.size(); i ++)
        {
        if((p.getPersonalInfo()).getID() == ((Patient)patientList.get(i)).getPersonalInfo().getID())
            patientList.remove(i);
        }
    }

    public Patient getPatient(String lName)
    {
        for(int i = 1; i <= patientList.size(); i++)
        {
            if(lName.equals(((((Patient)patientList.get(i)).getPersonalInfo())).getLName()));
            return (Patient)patientList.get(i);
        }

        return null;
    }

    public Patient getPatient(int selectedID) {
        return (Patient)patientList.get(selectedID);
    }

}
