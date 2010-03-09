
package vidavo;

import vidavo.util.*;

public class AppointmentList {

    private ListInterface appointmentList;

    public AppointmentList(){
        appointmentList = new ReferenceBasedList();
    }

    public void setAppointmentList(ListInterface pl){
        appointmentList = (ReferenceBasedList)pl;
    }

    public ListInterface getAppointmentList(){
        return appointmentList;
    }

    public void addNewAppointment(Appointment ap){
        appointmentList.append(ap);
    }

    public int size(){
        return appointmentList.size();
    }

    public Appointment getAppointmentAtIndex(int index){
        return (Appointment) appointmentList.get(index);
    }

    public void removeAppointment(Appointment ap){
        for(int i = 1; i <= appointmentList.size(); i ++){
            if((ap.getId() == ((Appointment)appointmentList.get(i)).getId()))
                appointmentList.remove(i);
        }
    }

//    public void removeAppointment(int patientID){
//        for(int i = 1; i <= appointmentList.size(); i ++){
//            if(patientID == ((Patient)appointmentList.get(i)).getPersonalInfo().getID())
//                appointmentList.remove(i);
//            break;
//        }
//    }

//    public Patient getAppointment(String lName){
//        for(int i = 1; i <= appointmentList.size(); i++){
//            if(lName.equals(((((Patient)appointmentList.get(i)).getPersonalInfo())).getLName()));
//            return (Patient)appointmentList.get(i);
//        }
//
//        return null;
//    }

    public Appointment getAppointment(int selectedID) {
        return (Appointment)appointmentList.get(selectedID);
    }
}