/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.resource;

/**
 *
 * @author Serban
 */
public class ResourceMap_gr extends java.util.ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object [][] {
                {"patientList.title", "Λίστα Ασθενών"},
                {"addButton.text", "Προσθήκη"},
                {"deleteButton.text", "Διαγραφή"},
                {"editButton.text", "Επεξεργασία"},
                {"cancelButton.text", "Ακύρωση"},
                {"searchButton.text", "Εύρεση"},
                {"searchTextField.text", "Εύρεση με βάση το επίθετο"},
                {"patientNameLabel.text", "John Smith"},
                {"patientLabel.text", "Όνομα Ασθενή: "},
                {"patientTable.columnModel.title3", "Τηλέφωνο"},
                {"patientTable.columnModel.title2", "Όνομα"},
                {"patientTable.columnModel.title1", "Επίθετο"},
                {"patientTable.columnModel.title0", "ID Ασθενή"}
            };
    };

}