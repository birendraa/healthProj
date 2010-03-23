
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import vidavo.pojos.Habits;

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
    private Habits habits;
    private String mode;

    public HabitsPane (java.util.ListResourceBundle rm,String mode, Habits habits)
    {
        this.resourceMap = rm;
        this.mode = mode;
        initPane();
        if(mode.equals("edit"))
        {
            this.habits = habits;
            loadHabits(habits);
        }
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
        smokerLabel.setName("smokerLabel"); // NOI18N

        smokerYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        smokerYRadioButton.setName("smokerYRadioButton"); // NOI18N

        smokerNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        smokerNRadioButton.setName("smokerNRadioButton"); // NOI18N

        smokeLongLabel.setText(resourceMap.getString("smokeLongLabel.text")); // NOI18N
        smokeLongLabel.setName("smokeLongLabel"); // NOI18N

        //smokeLongTextField.setText(resourceMap.getString("smokeLongTextField.text")); // NOI18N
        smokeLongTextField.setName("smokeLongTextField"); // NOI18N

        teaLabel.setText(resourceMap.getString("teaLabel.text")); // NOI18N
        teaLabel.setName("teaLabel"); // NOI18N

        teaYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        teaYRadioButton.setName("teaYRadioButton"); // NOI18N

        teaNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        teaNRadioButton.setName("teaNRadioButton"); // NOI18N

        coffeeLabel.setText(resourceMap.getString("coffeeLabel.text")); // NOI18N
        coffeeLabel.setName("coffeeLabel"); // NOI18N

        coffeeYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        coffeeYRadioButton.setName("coffeeYRadioButton"); // NOI18N

        coffeeNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        coffeeNRadioButton.setName("coffeeNRadioButton"); // NOI18N

        softDrinksLabel.setText(resourceMap.getString("softDrinksLabel.text")); // NOI18N
        softDrinksLabel.setName("softDrinksLabel"); // NOI18N

        softDrinksYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        softDrinksYRadioButton.setName("softDrinksYRadioButton"); // NOI18N

        softDrinksNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        softDrinksNRadioButton.setName("softDrinksNRadioButton"); // NOI18N

        caffeinePDLabel.setText(resourceMap.getString("caffeinePDLabel.text")); // NOI18N
        caffeinePDLabel.setName("caffeinePDLabel"); // NOI18N

        //caffeinePDTextField.setText(resourceMap.getString("caffeinePDTextField.text")); // NOI18N
        caffeinePDTextField.setName("caffeinePDTextField"); // NOI18N

        saltUsageLabel.setText(resourceMap.getString("saltUsageLabel.text")); // NOI18N
        saltUsageLabel.setName("saltUsageLabel"); // NOI18N

        sugarUsageMRadioButton.setText(resourceMap.getString("muchRadioButton.text")); // NOI18N
        sugarUsageMRadioButton.setName("sugarUsageMRadioButton"); // NOI18N

        saltUsageLRadioButton.setText(resourceMap.getString("littleRadioButton.text")); // NOI18N
        saltUsageLRadioButton.setName("saltUsageLRadioButton"); // NOI18N

        saltUsageNRadioButton.setText(resourceMap.getString("noneRadioButton.text")); // NOI18N
        saltUsageNRadioButton.setName("saltUsageNRadioButton"); // NOI18N

        sugarUsageLabel.setText(resourceMap.getString("sugarUsageLabel.text")); // NOI18N
        sugarUsageLabel.setName("sugarUsageLabel"); // NOI18N

        saltUsageMRadioButton.setText(resourceMap.getString("muchRadioButton.text")); // NOI18N
        saltUsageMRadioButton.setName("saltUsageMRadioButton"); // NOI18N

        sugarUsageLRadioButton.setText(resourceMap.getString("littleRadioButton.text")); // NOI18N
        sugarUsageLRadioButton.setName("sugarUsageLRadioButton"); // NOI18N

        sugarUsageNRadioButton.setText(resourceMap.getString("noneRadioButton.text")); // NOI18N
        sugarUsageNRadioButton.setName("sugarUsageNRadioButton"); // NOI18N

        dietLabel.setText(resourceMap.getString("dietLabel.text")); // NOI18N
        dietLabel.setName("dietLabel"); // NOI18N

        dietYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        dietYRadioButton.setName("dietYRadioButton"); // NOI18N

        dietNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        dietNRadioButton.setName("dietNRadioButton"); // NOI18N

        foodHabitsLabel.setText(resourceMap.getString("foodHabitsLabel.text")); // NOI18N
        foodHabitsLabel.setName("foodHabitsLabel"); // NOI18N

        alcoholPDLabel.setText(resourceMap.getString("alcoholPDLabel.text")); // NOI18N
        alcoholPDLabel.setName("alcoholPDLabel"); // NOI18N

        //alcoholPDTextField.setText(resourceMap.getString("alcoholPDTextField.text")); // NOI18N
        alcoholPDTextField.setName("alcoholPDTextField"); // NOI18N

        alcoholPWLabel.setText(resourceMap.getString("alcoholPWLabel.text")); // NOI18N
        alcoholPWLabel.setName("alcoholPWLabel"); // NOI18N

        //alcoholPWTextField.setText(resourceMap.getString("alcoholPWTextField.text")); // NOI18N
        alcoholPWTextField.setName("alcoholPWTextField"); // NOI18N

        useDrugsNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        useDrugsNRadioButton.setName("useDrugsNRadioButton"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        foodHabitsTextArea.setColumns(20);
        foodHabitsTextArea.setRows(5);
        foodHabitsTextArea.setName("foodHabitsTextArea"); // NOI18N
        jScrollPane1.setViewportView(foodHabitsTextArea);

        useDrugsLabel.setText(resourceMap.getString("useDrugsLabel.text")); // NOI18N
        useDrugsLabel.setName("useDrugsLabel"); // NOI18N

        useDrugsYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        useDrugsYRadioButton.setName("useDrugsYRadioButton"); // NOI18N

        useMedicationLabel.setText(resourceMap.getString("useMedicationLabel.text")); // NOI18N
        useMedicationLabel.setName("useMedicationLabel"); // NOI18N

        useMedicationYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        useMedicationYRadioButton.setName("useMedicationYRadioButton"); // NOI18N

        useMedicationNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        useMedicationNRadioButton.setName("useMedicationNRadioButton"); // NOI18N

        excerciseLabel.setText(resourceMap.getString("excerciseLabel.text")); // NOI18N
        excerciseLabel.setName("excerciseLabel"); // NOI18N

        excerciseYRadioButton.setText(resourceMap.getString("yesRadioButton.text")); // NOI18N
        excerciseYRadioButton.setName("excerciseYRadioButton"); // NOI18N

        excerciseNRadioButton.setText(resourceMap.getString("noRadioButton.text")); // NOI18N
        excerciseNRadioButton.setName("excerciseNRadioButton"); // NOI18N

        excerciseHabitsLabel.setText(resourceMap.getString("excerciseHabitsLabel.text")); // NOI18N
        excerciseHabitsLabel.setName("excerciseHabitsLabel"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        excerciseHabitsTextArea.setColumns(20);
        excerciseHabitsTextArea.setRows(5);
        excerciseHabitsTextArea.setName("excerciseHabitsTextArea"); // NOI18N
        jScrollPane2.setViewportView(excerciseHabitsTextArea);

        howOftenLabel.setText(resourceMap.getString("howOftenLabel.text")); // NOI18N
        howOftenLabel.setName("howOftenLabel"); // NOI18N

        //howOftenTextField.setText(resourceMap.getString("howOftenTextField.text")); // NOI18N
        howOftenTextField.setName("howOftenTextField"); // NOI18N

        otherHabitsLabel.setText(resourceMap.getString("otherHabitsLabel.text")); // NOI18N
        otherHabitsLabel.setName("otherHabitsLabel"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        otherHabitsTextArea.setColumns(20);
        otherHabitsTextArea.setRows(5);
        otherHabitsTextArea.setName("otherHabitsTextArea"); // NOI18N
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

    private void loadHabits(Habits habits) {
        
        if(habits.getSmoker().equals("Yes") )
        smokerYRadioButton.setSelected(true);
        else
        smokerNRadioButton.setSelected(true);

        smokeLongTextField.setText(habits.getHowLongSmoke());

        if(habits.getTea().equals("Yes"))
                teaYRadioButton.setSelected(true);
        else
                teaNRadioButton.setSelected(true);

        if(habits.getCoffee().equals("Yes"))
                coffeeYRadioButton.setSelected(true);
        else
                coffeeNRadioButton.setSelected(true);

        if(habits.getSoftdrinks().equals("Yes"))
                softDrinksYRadioButton.setSelected(true);
        else
                softDrinksNRadioButton.setSelected(true);

                caffeinePDTextField.setText(habits.getCaffeinePerDay());


        if(habits.getSaltUsage().equals("Much"))
        saltUsageMRadioButton.setSelected(true);
        else if(habits.getSaltUsage().equals("Little"))
        saltUsageLRadioButton.setSelected(true);
        else
        saltUsageNRadioButton.setSelected(true);

        if(habits.getSugarUsage().equals("Much"))
        sugarUsageMRadioButton.setSelected(true);
        else if(habits.getSugarUsage().equals("Little"))
        sugarUsageLRadioButton.setSelected(true);
        else
        sugarUsageNRadioButton.setSelected(true);

        if(habits.getDiet().equals("Yes"))
        dietYRadioButton.setSelected(true);
        else
        dietNRadioButton.setSelected(true);

        foodHabitsTextArea.setText(habits.getFoodHabits());

        alcoholPDTextField.setText(habits.getAlcoholPerDay());

        alcoholPWTextField.setText(habits.getAlcoholPerWeek());

        if(habits.getUseOfDrugs().equals("Yes"))
        useDrugsYRadioButton.setSelected(true);
        else
        useDrugsNRadioButton.setSelected(true);

        if(habits.getUseOfMedication().equals("Yes"))
        useMedicationYRadioButton.setSelected(true);
        else
        useMedicationNRadioButton.setSelected(true);

        if(habits.getExercise().equals("Yes"))
        excerciseYRadioButton.setSelected(true);
        else
        excerciseNRadioButton.setSelected(true);

        excerciseHabitsTextArea.setText(habits.getExerciseType());

        howOftenTextField.setText(habits.getExerciseHowOften());

        otherHabitsTextArea.setText(habits.getOtherHabits());

    }

    public Habits getHabits()
    {

        String smoker;
        if(smokerYRadioButton.isSelected() == true )
        smoker = "Yes";
        else
        smoker = "No";

        //smokeLongTextField.setText(habits.getHowLongSmoke());

        String tea;
        if(teaYRadioButton.isSelected() == true )
        tea = "Yes";
        else
        tea = "No";

        String coffee;
        if(coffeeYRadioButton.isSelected() == true )
        coffee = "Yes";
        else
        coffee = "No";

        String softDrinks;
        if(softDrinksYRadioButton.isSelected() == true )
        softDrinks = "Yes";
        else
        softDrinks = "No";


        //caffeinePDTextField.setText(habits.getCaffeinePerDay());


        String saltUsage;
        if(saltUsageMRadioButton.isSelected() == true)
        saltUsage = "Much";
        else if(saltUsageLRadioButton.isSelected() == true)
        saltUsage = "Little";
        else
        saltUsage = "None";

        String sugarUsage;
        if(sugarUsageMRadioButton.isSelected() == true)
        sugarUsage = "Much";
        else if(sugarUsageLRadioButton.isSelected() == true)
        sugarUsage = "Little";
        else
        sugarUsage = "None";

        String diet;
        if(dietYRadioButton.isSelected() == true )
        diet = "Yes";
        else
        diet = "No";

        //foodHabitsTextArea.setText(habits.getFoodHabits());

        //alcoholPDTextField.setText(habits.getAlcoholPerDay());

        //alcoholPWTextField.setText(habits.getAlcoholPerWeek());

        String useOfDrugs;
        if(useDrugsYRadioButton.isSelected() == true )
        useOfDrugs = "Yes";
        else
        useOfDrugs = "No";

        String useOfMedication;
        if(useMedicationYRadioButton.isSelected() == true )
        useOfMedication = "Yes";
        else
        useOfMedication = "No";

        String exercise;
        if(excerciseYRadioButton.isSelected() == true )
        exercise = "Yes";
        else
        exercise = "No";

        //excerciseHabitsTextArea.setText(habits.getExerciseType());

        //howOftenTextField.setText(habits.getExerciseHowOften());

        //otherHabitsTextArea.setText(habits.getOtherHabits());

        return new Habits (smoker,smokeLongTextField.getText(),tea,
                coffee,softDrinks, caffeinePDTextField.getText(),
                 saltUsage,sugarUsage, diet,foodHabitsTextArea.getText(),
                alcoholPDTextField.getText(), alcoholPWTextField.getText(),
                useOfDrugs, useOfMedication, exercise,
                excerciseHabitsTextArea.getText(), howOftenTextField.getText(),
                otherHabitsTextArea.getText());
    }
}