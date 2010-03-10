
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import vidavo.pojos.Immunizations;

/**
 *
 * @author sanja
 */
public class ImmunizationsPane extends JPanel{

    private javax.swing.JLabel allergiesLabel;
    private javax.swing.JTextField allergiesTextField;
    private javax.swing.JLabel allergiesToDrugsLabel;
    private javax.swing.JTextField allergiesToDrugsTextField;
    private javax.swing.JLabel bleedingProblemsLabel;
    private javax.swing.JLabel bloodBankLabel;
    private javax.swing.JTextField bloodBankTextField;
    private javax.swing.JLabel bloodCDLabel;
    private javax.swing.JTextField bloodCDTextField;
    private javax.swing.JLabel bloodDonorLabel;
    private javax.swing.JLabel bloodTypeLabel;
    private javax.swing.JTextField bloodTypeTextField;
    private javax.swing.JLabel circulationLabel;
    private javax.swing.JLabel doritisAOLabel;
    private javax.swing.JTextField doritisAOTextField;
    private javax.swing.JLabel doritisMOLabel;
    private javax.swing.JLabel kidneyDonorLabel;
    private javax.swing.JRadioButton noBleedingRadioButton;
    private javax.swing.JRadioButton noBloodDonorRadioButton;
    private javax.swing.JRadioButton noCirculationRadioButton;
    private javax.swing.JRadioButton noDoritisMORadioButton;
    private javax.swing.JRadioButton noKidneyDonorRadioButton;
    private javax.swing.JRadioButton noStigmaRadioButton;
    private javax.swing.JLabel stigmaLabel;
    private javax.swing.JRadioButton yesBleedingRadioButton;
    private javax.swing.JRadioButton yesBloodDonorRadioButton;
    private javax.swing.JRadioButton yesCirculationRadioButton;
    private javax.swing.JRadioButton yesDoritisMORadioButton;
    private javax.swing.JRadioButton yesKidneyDonorRadioButton;
    private javax.swing.JRadioButton yesStigmaRadioButton;

    private java.util.ListResourceBundle resourceMap;
    private Immunizations immun;
    private String mode;

    public ImmunizationsPane(java.util.ListResourceBundle rm,String mode,Immunizations immun)
    {
        this.resourceMap = rm;
        this.mode = mode;
        initComponents();
        if(mode.equals("edit"))
        {
            this.immun = immun;
            loadImmunizations(immun);
        }
    }
    private void initComponents()
    {
        bloodTypeLabel = new javax.swing.JLabel();
        bloodDonorLabel = new javax.swing.JLabel();
        bloodBankLabel = new javax.swing.JLabel();
        bloodCDLabel = new javax.swing.JLabel();
        bleedingProblemsLabel = new javax.swing.JLabel();
        doritisMOLabel = new javax.swing.JLabel();
        kidneyDonorLabel = new javax.swing.JLabel();
        doritisAOLabel = new javax.swing.JLabel();
        allergiesLabel = new javax.swing.JLabel();
        allergiesToDrugsLabel = new javax.swing.JLabel();
        circulationLabel = new javax.swing.JLabel();
        stigmaLabel = new javax.swing.JLabel();
        bloodTypeTextField = new javax.swing.JTextField();
        yesBloodDonorRadioButton = new javax.swing.JRadioButton();
        noBloodDonorRadioButton = new javax.swing.JRadioButton();
        bloodBankTextField = new javax.swing.JTextField();
        bloodCDTextField = new javax.swing.JTextField();
        yesBleedingRadioButton = new javax.swing.JRadioButton();
        noBleedingRadioButton = new javax.swing.JRadioButton();
        yesDoritisMORadioButton = new javax.swing.JRadioButton();
        noDoritisMORadioButton = new javax.swing.JRadioButton();
        yesKidneyDonorRadioButton = new javax.swing.JRadioButton();
        noKidneyDonorRadioButton = new javax.swing.JRadioButton();
        doritisAOTextField = new javax.swing.JTextField();
        allergiesTextField = new javax.swing.JTextField();
        allergiesToDrugsTextField = new javax.swing.JTextField();
        yesCirculationRadioButton = new javax.swing.JRadioButton();
        noCirculationRadioButton = new javax.swing.JRadioButton();
        yesStigmaRadioButton = new javax.swing.JRadioButton();
        noStigmaRadioButton = new javax.swing.JRadioButton();

        ButtonGroup bloodD = new ButtonGroup();
        bloodD.add(yesBloodDonorRadioButton);
        bloodD.add(noBloodDonorRadioButton);

        ButtonGroup bleedingP = new ButtonGroup();
        bleedingP.add(yesBleedingRadioButton);
        bleedingP.add(noBleedingRadioButton);

        ButtonGroup doritisMO = new ButtonGroup();
        doritisMO.add(yesDoritisMORadioButton);
        doritisMO.add(noDoritisMORadioButton);
        
        ButtonGroup kidneyD = new ButtonGroup();
        kidneyD.add(yesKidneyDonorRadioButton);
        kidneyD.add(noKidneyDonorRadioButton);

        ButtonGroup circulation = new ButtonGroup();
        circulation.add(yesCirculationRadioButton);
        circulation.add(noCirculationRadioButton);

        ButtonGroup stigma = new ButtonGroup();
        stigma.add(yesStigmaRadioButton);
        stigma.add(noStigmaRadioButton);


        bloodTypeLabel.setText(resourceMap.getString("bloodTypeLabel.text")); // NOI18N
        bloodTypeLabel.setName("bloodTypeLabel"); // NOI18N

        bloodDonorLabel.setText(resourceMap.getString("bloodDonorLabel.text")); // NOI18N
        bloodDonorLabel.setName("bloodDonorLabel"); // NOI18N

        bloodBankLabel.setText(resourceMap.getString("bloodBankLabel.text")); // NOI18N
        bloodBankLabel.setName("bloodBankLabel"); // NOI18N

        bloodCDLabel.setText(resourceMap.getString("bloodCDLabel.text")); // NOI18N
        bloodCDLabel.setName("bloodCDLabel"); // NOI18N

        bleedingProblemsLabel.setText(resourceMap.getString("bleedingProblemsLabel.text")); // NOI18N
        bleedingProblemsLabel.setName("bleedingProblemsLabel"); // NOI18N

        doritisMOLabel.setText(resourceMap.getString("doritisMOLabel.text")); // NOI18N
        doritisMOLabel.setName("doritisMOLabel"); // NOI18N

        kidneyDonorLabel.setText(resourceMap.getString("kidneyDonorLabel.text")); // NOI18N
        kidneyDonorLabel.setName("kidneyDonorLabel"); // NOI18N

        doritisAOLabel.setText(resourceMap.getString("doritisAOLabel.text")); // NOI18N
        doritisAOLabel.setName("doritisAOLabel"); // NOI18N

        allergiesLabel.setText(resourceMap.getString("allergiesLabel.text")); // NOI18N
        allergiesLabel.setName("allergiesLabel"); // NOI18N

        allergiesToDrugsLabel.setText(resourceMap.getString("allergiesToDrugsLabel.text")); // NOI18N
        allergiesToDrugsLabel.setName("allergiesToDrugsLabel"); // NOI18N

        circulationLabel.setText(resourceMap.getString("circulationLabel.text")); // NOI18N
        circulationLabel.setName("circulationLabel"); // NOI18N

        stigmaLabel.setText(resourceMap.getString("stigmaLabel.text")); // NOI18N
        stigmaLabel.setName("stigmaLabel"); // NOI18N

//        bloodTypeTextField.setText(resourceMap.getString("bloodTypeTextField.text")); // NOI18N
        bloodTypeTextField.setName("bloodTypeTextField"); // NOI18N
        
        yesBloodDonorRadioButton.setText(resourceMap.getString("yesBloodDonorRadioButton.text")); // NOI18N
        yesBloodDonorRadioButton.setName("yesBloodDonorRadioButton"); // NOI18N

        noBloodDonorRadioButton.setText(resourceMap.getString("noBloodDonorRadioButton.text")); // NOI18N
        noBloodDonorRadioButton.setName("noBloodDonorRadioButton"); // NOI18N

//        bloodBankTextField.setText(resourceMap.getString("bloodBankTextField.text")); // NOI18N
        bloodBankTextField.setName("bloodBankTextField"); // NOI18N

//        bloodCDTextField.setText(resourceMap.getString("bloodCDTextField.text")); // NOI18N
        bloodCDTextField.setName("bloodCDTextField"); // NOI18N

        yesBleedingRadioButton.setText(resourceMap.getString("yesBleedingRadioButton.text")); // NOI18N
        yesBleedingRadioButton.setName("yesBleedingRadioButton"); // NOI18N

        noBleedingRadioButton.setText(resourceMap.getString("noBleedingRadioButton.text")); // NOI18N
        noBleedingRadioButton.setName("noBleedingRadioButton"); // NOI18N

        yesDoritisMORadioButton.setText(resourceMap.getString("yesDoritisMORadioButton.text")); // NOI18N
        yesDoritisMORadioButton.setName("yesDoritisMORadioButton"); // NOI18N

        noDoritisMORadioButton.setText(resourceMap.getString("noDoritisMORadioButton.text")); // NOI18N
        noDoritisMORadioButton.setName("noDoritisMORadioButton"); // NOI18N

        yesKidneyDonorRadioButton.setText(resourceMap.getString("yesKidneyDonorRadioButton.text")); // NOI18N
        yesKidneyDonorRadioButton.setName("yesKidneyDonorRadioButton"); // NOI18N

        noKidneyDonorRadioButton.setText(resourceMap.getString("noKidneyDonorRadioButton.text")); // NOI18N
        noKidneyDonorRadioButton.setName("noKidneyDonorRadioButton"); // NOI18N

//        doritisAOTextField.setText(resourceMap.getString("doritisAOTextField.text")); // NOI18N
        doritisAOTextField.setName("doritisAOTextField"); // NOI18N

//        allergiesTextField.setText(resourceMap.getString("allergiesTextField.text")); // NOI18N
        allergiesTextField.setName("allergiesTextField"); // NOI18N

//        allergiesToDrugsTextField.setText(resourceMap.getString("allergiesToDrugsTextField.text")); // NOI18N
        allergiesToDrugsTextField.setName("allergiesToDrugsTextField"); // NOI18N

        yesCirculationRadioButton.setText(resourceMap.getString("yesCirculationRadioButton.text")); // NOI18N
        yesCirculationRadioButton.setName("yesCirculationRadioButton"); // NOI18N

        noCirculationRadioButton.setText(resourceMap.getString("noCirculationRadioButton.text")); // NOI18N
        noCirculationRadioButton.setName("noCirculationRadioButton"); // NOI18N

        yesStigmaRadioButton.setText(resourceMap.getString("yesStigmaRadioButton.text")); // NOI18N
        yesStigmaRadioButton.setName("yesStigmaRadioButton"); // NOI18N

        noStigmaRadioButton.setText(resourceMap.getString("noStigmaRadioButton.text")); // NOI18N
        noStigmaRadioButton.setName("noStigmaRadioButton"); // NOI18N

javax.swing.GroupLayout immunizationsPaneLayout = new javax.swing.GroupLayout(this);
        this.setLayout(immunizationsPaneLayout);
        immunizationsPaneLayout.setHorizontalGroup(
            immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(immunizationsPaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodCDLabel)
                    .addComponent(bloodBankLabel)
                    .addComponent(bloodTypeLabel)
                    .addComponent(bloodDonorLabel)
                    .addComponent(bleedingProblemsLabel)
                    .addComponent(doritisMOLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(immunizationsPaneLayout.createSequentialGroup()
                        .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yesBloodDonorRadioButton)
                            .addComponent(yesBleedingRadioButton)
                            .addComponent(yesDoritisMORadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noBloodDonorRadioButton)
                            .addComponent(noDoritisMORadioButton)
                            .addComponent(noBleedingRadioButton)))
                    .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloodBankTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bloodCDTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(bloodTypeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doritisAOLabel)
                    .addComponent(kidneyDonorLabel)
                    .addComponent(allergiesLabel)
                    .addComponent(allergiesToDrugsLabel)
                    .addComponent(circulationLabel)
                    .addComponent(stigmaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(immunizationsPaneLayout.createSequentialGroup()
                        .addComponent(yesStigmaRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(noStigmaRadioButton))
                    .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(immunizationsPaneLayout.createSequentialGroup()
                            .addComponent(yesCirculationRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(noCirculationRadioButton))
                        .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allergiesToDrugsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(allergiesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addGroup(immunizationsPaneLayout.createSequentialGroup()
                                .addComponent(yesKidneyDonorRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(noKidneyDonorRadioButton))
                            .addComponent(doritisAOTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        immunizationsPaneLayout.setVerticalGroup(
            immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(immunizationsPaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodTypeLabel)
                    .addComponent(kidneyDonorLabel)
                    .addComponent(yesKidneyDonorRadioButton)
                    .addComponent(noKidneyDonorRadioButton)
                    .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodDonorLabel)
                    .addComponent(doritisAOLabel)
                    .addComponent(doritisAOTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesBloodDonorRadioButton)
                    .addComponent(noBloodDonorRadioButton))
                .addGap(28, 28, 28)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodBankLabel)
                    .addComponent(bloodBankTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergiesLabel)
                    .addComponent(allergiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodCDLabel)
                    .addComponent(allergiesToDrugsLabel)
                    .addComponent(allergiesToDrugsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodCDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bleedingProblemsLabel)
                    .addComponent(circulationLabel)
                    .addComponent(yesCirculationRadioButton)
                    .addComponent(noCirculationRadioButton)
                    .addComponent(yesBleedingRadioButton)
                    .addComponent(noBleedingRadioButton))
                .addGap(30, 30, 30)
                .addGroup(immunizationsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doritisMOLabel)
                    .addComponent(stigmaLabel)
                    .addComponent(yesStigmaRadioButton)
                    .addComponent(yesDoritisMORadioButton)
                    .addComponent(noDoritisMORadioButton)
                    .addComponent(noStigmaRadioButton))
                .addContainerGap(261, Short.MAX_VALUE))
        );

       // jTabbedPane1.addTab(resourceMap.getString("immunizationsPane.TabConstraints.tabTitle"), immunizationsPane); // NOI18N

    }

    public void loadImmunizations(Immunizations immun)
    {
        bloodTypeTextField.setText(immun.getBloodType());

        if(immun.getBloodDonor().equals("Yes"))
        yesBloodDonorRadioButton.setSelected(true);
        else
        noBloodDonorRadioButton.setSelected(true);

        bloodBankTextField.setText(immun.getBloodBank());

        bloodCDTextField.setText(immun.getBloodContageousDiseases());

        if(immun.getBleedingProlems().equals("Yes"))
        yesBleedingRadioButton.setSelected(true);
        else
        noBleedingRadioButton.setSelected(true);

        if(immun.getDoritisMielouOston().equals("Yes"))
        yesDoritisMORadioButton.setSelected(true);
        else
        noDoritisMORadioButton.setSelected(true);

        if(immun.getKidneyDonor().equals("Yes"))
        yesKidneyDonorRadioButton.setSelected(true);
        else
        noKidneyDonorRadioButton.setSelected(true);

        doritisAOTextField.setText(immun.getDoritisAllonOrganon());

        allergiesTextField.setText(immun.getAllergies());

        allergiesToDrugsTextField.setText(immun.getAllergiesToDrugs());

        if(immun.getPoorCirculation().equals("Yes"))
        yesCirculationRadioButton.setSelected(true);
        else
        noCirculationRadioButton.setSelected(true);

        if(immun.getStigma().equals("Yes"))
        yesStigmaRadioButton.setSelected(true);
        else
        noStigmaRadioButton.setSelected(true);
    }

    public Immunizations getImmunizations ()
    {
        //bloodTypeTextField.setText(immun.getBloodType());

        String bloodDonor;
        if(yesBloodDonorRadioButton.isSelected() == true)
        bloodDonor = "Yes";
        else
        bloodDonor = "No";

        //bloodBankTextField.setText(immun.getBloodBank());

        //bloodCDTextField.setText(immun.getBloodContageousDiseases());

        String bleedingProblems;
        if(yesBleedingRadioButton.isSelected() == true)
        bleedingProblems = "Yes";
        else
        bleedingProblems = "No";

        String doritisMO;
        if(yesDoritisMORadioButton.isSelected() == true)
        doritisMO = "Yes";
        else
        doritisMO = "No";

        String kidneyDonor;
        if(yesKidneyDonorRadioButton.isSelected() == true)
        kidneyDonor = "Yes";
        else
        kidneyDonor = "No";

        //doritisAOTextField.setText(immun.getDoritisAllonOrganon());

        //allergiesTextField.setText(immun.getAllergies());

//        allergiesToDrugsTextField.setText(immun.getAllergiesToDrugs());

        String poorCirculation;
        if(yesCirculationRadioButton.isSelected() == true)
        poorCirculation = "Yes";
        else
        poorCirculation = "No";

        String stigma;
        if(yesStigmaRadioButton.isSelected() == true)
        stigma = "Yes";
        else
        stigma = "No";

        return new Immunizations (bloodTypeTextField.getText(), bloodDonor,
                bloodBankTextField.getText(), bloodCDTextField.getText(),
                bleedingProblems, doritisMO, kidneyDonor,
                doritisAOTextField.getText(), allergiesTextField.getText(),
                allergiesToDrugsTextField.getText(), poorCirculation,stigma);
    }
}