
package vidavo.gui;

import java.util.ListResourceBundle;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import vidavo.pojos.*;

public class SurgicalHistoryPane extends JPanel{

    private SurgicalHistory sh;

    private javax.swing.JScrollPane finalDiagnosisScrollingArea;
    private javax.swing.JScrollPane reasonOfHospitalizationScrollingArea;
    private javax.swing.JLabel reasonOfHospitalizationLabel;
    private javax.swing.JLabel descriptionOfSurgeryLabel;
    private javax.swing.JTextField descriptionOfSurgeryTextField;
    private javax.swing.JLabel doctorsNameLabel;
    private javax.swing.JTextField doctorsNameTextField;
    private javax.swing.JLabel finalDiagnosisLabel;
    private javax.swing.JTextArea finalDiagnosisTextArea;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JTextArea reasonOfHospitalizationTextArea;

    private java.util.ListResourceBundle resourceMap;

    public SurgicalHistoryPane(java.util.ListResourceBundle rm,String mode,SurgicalHistory sh){

        this.resourceMap = rm;
        
        descriptionOfSurgeryLabel = new javax.swing.JLabel();
        hospitalNameLabel = new javax.swing.JLabel();
        reasonOfHospitalizationLabel = new javax.swing.JLabel();
        finalDiagnosisLabel = new javax.swing.JLabel();
        doctorsNameLabel = new javax.swing.JLabel();
        descriptionOfSurgeryTextField = new javax.swing.JTextField();
        hospitalNameTextField = new javax.swing.JTextField();
        reasonOfHospitalizationTextArea = new javax.swing.JTextArea();
        finalDiagnosisTextArea = new javax.swing.JTextArea();
        doctorsNameTextField = new javax.swing.JTextField();

        reasonOfHospitalizationScrollingArea = new JScrollPane(reasonOfHospitalizationTextArea);
        finalDiagnosisScrollingArea = new JScrollPane(finalDiagnosisTextArea);

        descriptionOfSurgeryLabel.setText(resourceMap.getString("descriptionOfSurgery.text"));
        hospitalNameLabel.setText(resourceMap.getString("hospitalName.text"));
        reasonOfHospitalizationLabel.setText(resourceMap.getString("reasonOfHospitalization.text"));
        finalDiagnosisLabel.setText(resourceMap.getString("finalDiagnosis.text"));
        doctorsNameLabel.setText(resourceMap.getString("doctorsName.text"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionOfSurgeryLabel)
                            .addComponent(hospitalNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospitalNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(descriptionOfSurgeryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonOfHospitalizationLabel)
                            .addComponent(finalDiagnosisLabel)
                            .addComponent(doctorsNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalDiagnosisScrollingArea, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(reasonOfHospitalizationScrollingArea, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(doctorsNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionOfSurgeryLabel)
                    .addComponent(descriptionOfSurgeryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalNameLabel)
                    .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reasonOfHospitalizationLabel)
                    .addComponent(reasonOfHospitalizationScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalDiagnosisLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalDiagnosisScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorsNameLabel))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        if(mode.equals("edit"))
        {
            this.sh = sh;
            loadSurgicalHistory(sh);
        }
    }

    public SurgicalHistory getSurgeryHistoryInformation(){
        return new SurgicalHistory(descriptionOfSurgeryTextField.getText(), hospitalNameTextField.getText(),
                reasonOfHospitalizationTextArea.getText(), finalDiagnosisTextArea.getText(), doctorsNameTextField.getText());
    }

    public void loadSurgicalHistory(SurgicalHistory sh)
    {
        descriptionOfSurgeryTextField.setText(sh.getDescriptionOfSurgery());
        hospitalNameTextField.setText(sh.getHospitalName());
        reasonOfHospitalizationTextArea.setText(sh.getReasonOfHospitalization());
        finalDiagnosisTextArea.setText(sh.getFinalDiagnosis());
        doctorsNameTextField.setText(sh.getDoctorsName());

//        descriptionOfSurgeryTextField.setText("aaa");
//        hospitalNameTextField.setText("bbb");
//        reasonOfHospitalizationTextArea.setText("ccc");
//        finalDiagnosisTextArea.setText("ddd");
//        doctorsNameTextField.setText("eee");
    }
}