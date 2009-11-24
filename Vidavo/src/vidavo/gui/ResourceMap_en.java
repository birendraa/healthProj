/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

/**
 *
 * @author Serban
 */
public class ResourceMap_en extends java.util.ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object [][] {
                {"patientList.title", "Patient List"},
                {"addButton.text", "Add..."},
                {"deleteButton.text", "Delete"},
                {"editButton.text", "Edit..."},
                {"cancelButton.text", "Cancel"},
                {"searchButton.text", "Search"},
                {"searchTextField.text", "Search by last name..."},
                {"patientNameLabel.text", "John Smith"},
                {"patientLabel.text", "Patient Name: "},
                {"patientTable.columnModel.title3", "Telephone"},
                {"patientTable.columnModel.title2", "First Name"},
                {"patientTable.columnModel.title1", "Last Name"},
                {"patientTable.columnModel.title0", "Patient ID"}
            };
    };

}