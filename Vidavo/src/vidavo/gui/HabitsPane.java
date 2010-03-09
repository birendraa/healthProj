/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author Bosko
 */
public class HabitsPane extends JPanel {
    //private javax.swing.JPanel habitsPane;
    private javax.swing.JLabel alcoholPDLabel;
    private javax.swing.JTextField alcoholPDTextField;
    private javax.swing.JLabel alcoholPWLabel;
    private javax.swing.JTextField alcoholPWTextField;
    private javax.swing.JLabel caffeinePDLabel;
    private javax.swing.JTextField caffeinePDTextField;
    private javax.swing.JLabel coffeeLabel;
    private javax.swing.JRadioButton coffeeNRadioButton;
    private javax.swing.JRadioButton coffeeYRadioButton;
    private javax.swing.JLabel dietLabel;
    private javax.swing.JRadioButton dietNRadioButton;
    private javax.swing.JRadioButton dietYRadioButton;
    private javax.swing.JLabel excerciseHabitsLabel;
    private javax.swing.JTextArea excerciseHabitsTextArea;
    private javax.swing.JLabel excerciseLabel;
    private javax.swing.JRadioButton excerciseNRadioButton;
    private javax.swing.JRadioButton excerciseYRadioButton;
    private javax.swing.JLabel foodHabitsLabel;
    private javax.swing.JTextArea foodHabitsTextArea;
    private javax.swing.JLabel howOftenLabel;
    private javax.swing.JTextField howOftenTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel otherHabitsLabel;
    private javax.swing.JTextArea otherHabitsTextArea;
    private javax.swing.JRadioButton saltUsageLRadioButton;
    private javax.swing.JLabel saltUsageLabel;
    private javax.swing.JRadioButton saltUsageMRadioButton;
    private javax.swing.JRadioButton saltUsageNRadioButton;
    private javax.swing.JLabel smokeLongLabel;
    private javax.swing.JTextField smokeLongTextField;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JRadioButton smokerNRadioButton;
    private javax.swing.JRadioButton smokerYRadioButton;
    private javax.swing.JLabel softDrinksLabel;
    private javax.swing.JRadioButton softDrinksNRadioButton;
    private javax.swing.JRadioButton softDrinksYRadioButton;
    private javax.swing.JRadioButton sugarUsageLRadioButton;
    private javax.swing.JLabel sugarUsageLabel;
    private javax.swing.JRadioButton sugarUsageMRadioButton;
    private javax.swing.JRadioButton sugarUsageNRadioButton;
    private javax.swing.JLabel teaLabel;
    private javax.swing.JRadioButton teaNRadioButton;
    private javax.swing.JRadioButton teaYRadioButton;
    private javax.swing.JLabel useDrugsLabel;
    private javax.swing.JRadioButton useDrugsNRadioButton;
    private javax.swing.JRadioButton useDrugsYRadioButton;
    private javax.swing.JLabel useMedicationLabel;
    private javax.swing.JRadioButton useMedicationNRadioButton;
    private javax.swing.JRadioButton useMedicationYRadioButton;

    private java.util.ListResourceBundle resourceMap;

    public HabitsPane (java.util.ListResourceBundle rm)
    {
        this.resourceMap = rm;
        initPane();
    }
    private void initPane(){
        
        smokerLabel = new javax.swing.JLabel();
        smokerYRadioButton = new javax.swing.JRadioButton();
        smokerNRadioButton = new javax.swing.JRadioButton();
        smokeLongLabel = new javax.swing.JLabel();
        smokeLongTextField = new javax.swing.JTextField();
        teaLabel = new javax.swing.JLabel();
        teaYRadioButton = new javax.swing.JRadioButton();
        teaNRadioButton = new javax.swing.JRadioButton();
        coffeeLabel = new javax.swing.JLabel();
        coffeeYRadioButton = new javax.swing.JRadioButton();
        coffeeNRadioButton = new javax.swing.JRadioButton();
        softDrinksLabel = new javax.swing.JLabel();
        softDrinksYRadioButton = new javax.swing.JRadioButton();
        softDrinksNRadioButton = new javax.swing.JRadioButton();
        caffeinePDLabel = new javax.swing.JLabel();
        caffeinePDTextField = new javax.swing.JTextField();
        saltUsageLabel = new javax.swing.JLabel();
        sugarUsageMRadioButton = new javax.swing.JRadioButton();
        saltUsageLRadioButton = new javax.swing.JRadioButton();
        saltUsageNRadioButton = new javax.swing.JRadioButton();
        sugarUsageLabel = new javax.swing.JLabel();
        saltUsageMRadioButton = new javax.swing.JRadioButton();
        sugarUsageLRadioButton = new javax.swing.JRadioButton();
        sugarUsageNRadioButton = new javax.swing.JRadioButton();
        dietLabel = new javax.swing.JLabel();
        dietYRadioButton = new javax.swing.JRadioButton();
        dietNRadioButton = new javax.swing.JRadioButton();
        foodHabitsLabel = new javax.swing.JLabel();
        alcoholPDLabel = new javax.swing.JLabel();
        alcoholPDTextField = new javax.swing.JTextField();
        alcoholPWLabel = new javax.swing.JLabel();
        alcoholPWTextField = new javax.swing.JTextField();
        useDrugsNRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodHabitsTextArea = new javax.swing.JTextArea();
        useDrugsLabel = new javax.swing.JLabel();
        useDrugsYRadioButton = new javax.swing.JRadioButton();
        useMedicationLabel = new javax.swing.JLabel();
        useMedicationYRadioButton = new javax.swing.JRadioButton();
        useMedicationNRadioButton = new javax.swing.JRadioButton();
        excerciseLabel = new javax.swing.JLabel();
        excerciseYRadioButton = new javax.swing.JRadioButton();
        excerciseNRadioButton = new javax.swing.JRadioButton();
        excerciseHabitsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        excerciseHabitsTextArea = new javax.swing.JTextArea();
        howOftenLabel = new javax.swing.JLabel();
        howOftenTextField = new javax.swing.JTextField();
        otherHabitsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        otherHabitsTextArea = new javax.swing.JTextArea();

        ButtonGroup smokerGroup = new ButtonGroup ();
        smokerGroup.add(smokerYRadioButton);
        smokerGroup.add(smokerNRadioButton);

        ButtonGroup teaGroup = new ButtonGroup ();
        teaGroup.add(teaYRadioButton);
        teaGroup.add(teaNRadioButton);

        ButtonGroup coffeeGroup = new ButtonGroup ();
        coffeeGroup.add(coffeeYRadioButton);
        coffeeGroup.add(coffeeNRadioButton);

        ButtonGroup softDGroup = new ButtonGroup ();
        softDGroup.add(softDrinksYRadioButton);
        softDGroup.add(softDrinksNRadioButton);

        ButtonGroup saltGroup = new ButtonGroup ();
        saltGroup.add(saltUsageMRadioButton);
        saltGroup.add(saltUsageLRadioButton);
        saltGroup.add(saltUsageNRadioButton);

        ButtonGroup sugarGroup = new ButtonGroup ();
        sugarGroup.add(sugarUsageMRadioButton);
        sugarGroup.add(sugarUsageLRadioButton);
        sugarGroup.add(sugarUsageNRadioButton);

        ButtonGroup dietGroup = new ButtonGroup ();
        dietGroup.add(dietYRadioButton);
        dietGroup.add(dietNRadioButton);

        ButtonGroup drugsGroup = new ButtonGroup ();
        drugsGroup.add(useDrugsYRadioButton);
        drugsGroup.add(useDrugsNRadioButton);

        ButtonGroup medicationGroup = new ButtonGroup ();
        medicationGroup.add(useMedicationYRadioButton);
        medicationGroup.add(useMedicationNRadioButton);

        ButtonGroup excerciseGroup = new ButtonGroup ();
        excerciseGroup.add(excerciseYRadioButton);
        excerciseGroup.add(excerciseNRadioButton);

        smokerLabel.setText(resourceMap.getString("smokerLabel.text")); // NOI18N
        smokerYRadioButton.setText(resourceMap.getString("smokerYRadioButton.text")); // NOI18N
        smokerNRadioButton.setText(resourceMap.getString("smokerNRadioButton.text")); // NOI18N
        smokeLongLabel.setText(resourceMap.getString("smokeLongLabel.text")); // NOI18N
        //smokeLongTextField.setText(resourceMap.getString("smokeLongTextField.text")); // NOI18N
        teaLabel.setText(resourceMap.getString("teaLabel.text")); // NOI18N
        teaYRadioButton.setText(resourceMap.getString("teaYRadioButton.text")); // NOI18N
        teaNRadioButton.setText(resourceMap.getString("teaNRadioButton.text")); // NOI18N
        coffeeLabel.setText(resourceMap.getString("coffeeLabel.text")); // NOI18N
        coffeeYRadioButton.setText(resourceMap.getString("coffeeYRadioButton.text")); // NOI18N
        coffeeNRadioButton.setText(resourceMap.getString("coffeeNRadioButton.text")); // NOI18N
        softDrinksLabel.setText(resourceMap.getString("softDrinksLabel.text")); // NOI18N
        softDrinksYRadioButton.setText(resourceMap.getString("softDrinksYRadioButton.text")); // NOI18N
        softDrinksNRadioButton.setText(resourceMap.getString("softDrinksNRadioButton.text")); // NOI18N
        caffeinePDLabel.setText(resourceMap.getString("caffeinePDLabel.text")); // NOI18N
        //caffeinePDTextField.setText(resourceMap.getString("caffeinePDTextField.text")); // NOI18N
        saltUsageLabel.setText(resourceMap.getString("saltUsageLabel.text")); // NOI18N
        sugarUsageMRadioButton.setText(resourceMap.getString("sugarUsageMRadioButton.text")); // NOI18N
        saltUsageLRadioButton.setText(resourceMap.getString("saltUsageLRadioButton.text")); // NOI18N
        saltUsageNRadioButton.setText(resourceMap.getString("saltUsageNRadioButton.text")); // NOI18N
        sugarUsageLabel.setText(resourceMap.getString("sugarUsageLabel.text")); // NOI18N
        saltUsageMRadioButton.setText(resourceMap.getString("saltUsageMRadioButton.text")); // NOI18N
        sugarUsageLRadioButton.setText(resourceMap.getString("sugarUsageLRadioButton.text")); // NOI18N
        sugarUsageNRadioButton.setText(resourceMap.getString("sugarUsageNRadioButton.text")); // NOI18N
        dietLabel.setText(resourceMap.getString("dietLabel.text")); // NOI18N
        dietYRadioButton.setText(resourceMap.getString("dietYRadioButton.text")); // NOI18N
        dietNRadioButton.setText(resourceMap.getString("dietNRadioButton.text")); // NOI18N
        foodHabitsLabel.setText(resourceMap.getString("foodHabitsLabel.text")); // NOI18N
        alcoholPDLabel.setText(resourceMap.getString("alcoholPDLabel.text")); // NOI18N
        //alcoholPDTextField.setText(resourceMap.getString("alcoholPDTextField.text")); // NOI18N
        alcoholPDTextField.setName("alcoholPDTextField"); // NOI18N
        alcoholPWLabel.setText(resourceMap.getString("alcoholPWLabel.text")); // NOI18N
        //alcoholPWTextField.setText(resourceMap.getString("alcoholPWTextField.text")); // NOI18N

        useDrugsNRadioButton.setText(resourceMap.getString("useDrugsNRadioButton.text")); // NOI18N

        foodHabitsTextArea.setColumns(20);
        foodHabitsTextArea.setRows(5);
        foodHabitsTextArea.setName("foodHabitsTextArea"); // NOI18N
        jScrollPane1.setViewportView(foodHabitsTextArea);

        useDrugsLabel.setText(resourceMap.getString("useDrugsLabel.text")); // NOI18N
        useDrugsYRadioButton.setText(resourceMap.getString("useDrugsYRadioButton.text")); // NOI18N
        useMedicationLabel.setText(resourceMap.getString("useMedicationLabel.text")); // NOI18N
        useMedicationYRadioButton.setText(resourceMap.getString("useMedicationYRadioButton.text")); // NOI18N
        useMedicationNRadioButton.setText(resourceMap.getString("useMedicationNRadioButton.text")); // NOI18N
        excerciseLabel.setText(resourceMap.getString("excerciseLabel.text")); // NOI18N
        excerciseYRadioButton.setText(resourceMap.getString("excerciseYRadioButton.text")); // NOI18N
        excerciseNRadioButton.setText(resourceMap.getString("excerciseNRadioButton.text")); // NOI18N
        excerciseHabitsLabel.setText(resourceMap.getString("excerciseHabitsLabel.text")); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        excerciseHabitsTextArea.setColumns(20);
        excerciseHabitsTextArea.setRows(5);
        excerciseHabitsTextArea.setName("excerciseHabitsTextArea"); // NOI18N
        jScrollPane2.setViewportView(excerciseHabitsTextArea);

        howOftenLabel.setText(resourceMap.getString("howOftenLabel.text")); // NOI18N

        //howOftenTextField.setText(resourceMap.getString("howOftenTextField.text")); // NOI18N

        otherHabitsLabel.setText(resourceMap.getString("otherHabitsLabel.text")); // NOI18N

        otherHabitsTextArea.setColumns(20);
        otherHabitsTextArea.setRows(5);
        jScrollPane3.setViewportView(otherHabitsTextArea);

        javax.swing.GroupLayout habitsPaneLayout = new javax.swing.GroupLayout(this);
        this.setLayout(habitsPaneLayout);
        habitsPaneLayout.setHorizontalGroup(
            habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habitsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caffeinePDLabel)
                    .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(caffeinePDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coffeeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(smokerLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(smokeLongLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitsPaneLayout.createSequentialGroup()
                            .addComponent(softDrinksYRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(softDrinksNRadioButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitsPaneLayout.createSequentialGroup()
                            .addComponent(coffeeYRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coffeeNRadioButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitsPaneLayout.createSequentialGroup()
                            .addComponent(teaYRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teaNRadioButton))
                        .addComponent(smokeLongTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitsPaneLayout.createSequentialGroup()
                            .addComponent(smokerYRadioButton)
                            .addGap(47, 47, 47)
                            .addComponent(smokerNRadioButton))
                        .addComponent(teaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(softDrinksLabel, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(142, 142, 142)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saltUsageLabel)
                    .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(habitsPaneLayout.createSequentialGroup()
                            .addComponent(saltUsageMRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saltUsageLRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saltUsageNRadioButton))
                        .addGroup(habitsPaneLayout.createSequentialGroup()
                            .addComponent(sugarUsageMRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sugarUsageLRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sugarUsageNRadioButton))
                        .addGroup(habitsPaneLayout.createSequentialGroup()
                            .addComponent(dietYRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dietNRadioButton)))
                    .addComponent(sugarUsageLabel)
                    .addComponent(dietLabel)
                    .addComponent(foodHabitsLabel)
                    .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(alcoholPWTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alcoholPDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addComponent(alcoholPDLabel)
                    .addComponent(alcoholPWLabel))
                .addGap(170, 170, 170)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(otherHabitsLabel)
                    .addComponent(howOftenLabel)
                    .addComponent(jScrollPane2)
                    .addComponent(excerciseHabitsLabel)
                    .addComponent(excerciseLabel)
                    .addComponent(useDrugsLabel)
                    .addComponent(useMedicationLabel)
                    .addGroup(habitsPaneLayout.createSequentialGroup()
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useDrugsYRadioButton)
                            .addComponent(useMedicationYRadioButton)
                            .addComponent(excerciseYRadioButton))
                        .addGap(51, 51, 51)
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excerciseNRadioButton)
                            .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(useDrugsNRadioButton)
                                .addComponent(useMedicationNRadioButton))))
                    .addComponent(howOftenTextField))
                .addGap(69, 69, 69))
        );
        habitsPaneLayout.setVerticalGroup(
            habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habitsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokerLabel)
                    .addComponent(saltUsageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useDrugsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokerYRadioButton)
                    .addComponent(smokerNRadioButton)
                    .addComponent(saltUsageMRadioButton)
                    .addComponent(saltUsageLRadioButton)
                    .addComponent(saltUsageNRadioButton)
                    .addComponent(useDrugsYRadioButton)
                    .addComponent(useDrugsNRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokeLongLabel)
                    .addComponent(sugarUsageLabel)
                    .addComponent(useMedicationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokeLongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sugarUsageMRadioButton)
                    .addComponent(sugarUsageLRadioButton)
                    .addComponent(sugarUsageNRadioButton)
                    .addComponent(useMedicationYRadioButton)
                    .addComponent(useMedicationNRadioButton))
                .addGap(18, 18, 18)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teaLabel)
                    .addComponent(dietLabel)
                    .addComponent(excerciseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teaYRadioButton)
                    .addComponent(teaNRadioButton)
                    .addComponent(dietYRadioButton)
                    .addComponent(dietNRadioButton)
                    .addComponent(excerciseYRadioButton)
                    .addComponent(excerciseNRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffeeLabel)
                    .addComponent(foodHabitsLabel)
                    .addComponent(excerciseHabitsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(habitsPaneLayout.createSequentialGroup()
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coffeeYRadioButton)
                            .addComponent(coffeeNRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(softDrinksLabel)
                        .addGap(4, 4, 4)
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(softDrinksYRadioButton)
                            .addComponent(softDrinksNRadioButton))
                        .addGap(31, 31, 31)
                        .addComponent(caffeinePDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caffeinePDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(habitsPaneLayout.createSequentialGroup()
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alcoholPDLabel)
                            .addComponent(howOftenLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alcoholPDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(howOftenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(habitsPaneLayout.createSequentialGroup()
                        .addComponent(alcoholPWLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alcoholPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(habitsPaneLayout.createSequentialGroup()
                        .addComponent(otherHabitsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );


    }
}
