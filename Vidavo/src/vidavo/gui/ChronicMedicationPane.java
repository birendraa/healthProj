/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import vidavo.pojos.ChronicMedication;

/**
 *
 * @author thanosirodotou
 */
public class ChronicMedicationPane extends JPanel{

    private javax.swing.JLabel anapenustikoLabel;
    private javax.swing.JLabel androgonaLabel;
    private javax.swing.JLabel antiagxwlitikaFarmakaLabel;
    private javax.swing.JLabel antiallergicaFarmakaLabel;
    private javax.swing.JLabel antiarrythmicaFarmakaLabel;
    private javax.swing.JLabel antiasthmaticaLabel;
    private javax.swing.JLabel antidiabeticTabletsLabel;
    private javax.swing.JLabel antidiastaltikaTisStefaniaiasKikloforiasLabel;
    private javax.swing.JLabel antiepiliptikaFarmakaLabel;
    private javax.swing.JLabel antiikaFarmakaLabel;
    private javax.swing.JLabel antineoplasmatikaFarmakaLabel;
    private javax.swing.JLabel antipsychotikaFarmakaLabel;
    private javax.swing.JLabel antireumaticaFarmakaLabel;
    private javax.swing.JLabel antisilliptikaFarmakaLabel;
    private javax.swing.JLabel antithromvoticMedicationLabel;
    private javax.swing.JLabel antithyroidikaFarmakaLabel;
    private javax.swing.JLabel bloodSugarLabel;
    private javax.swing.JPanel chronicMedicationMainPane;
    private javax.swing.JRadioButton chronicMedicationRadioButton01;
    private javax.swing.JRadioButton chronicMedicationRadioButton02;
    private javax.swing.JRadioButton chronicMedicationRadioButton03;
    private javax.swing.JRadioButton chronicMedicationRadioButton04;
    private javax.swing.JRadioButton chronicMedicationRadioButton05;
    private javax.swing.JRadioButton chronicMedicationRadioButton06;
    private javax.swing.JRadioButton chronicMedicationRadioButton07;
    private javax.swing.JRadioButton chronicMedicationRadioButton08;
    private javax.swing.JRadioButton chronicMedicationRadioButton09;
    private javax.swing.JRadioButton chronicMedicationRadioButton10;
    private javax.swing.JRadioButton chronicMedicationRadioButton11;
    private javax.swing.JRadioButton chronicMedicationRadioButton12;
    private javax.swing.JRadioButton chronicMedicationRadioButton13;
    private javax.swing.JRadioButton chronicMedicationRadioButton14;
    private javax.swing.JRadioButton chronicMedicationRadioButton15;
    private javax.swing.JRadioButton chronicMedicationRadioButton16;
    private javax.swing.JRadioButton chronicMedicationRadioButton17;
    private javax.swing.JRadioButton chronicMedicationRadioButton18;
    private javax.swing.JRadioButton chronicMedicationRadioButton19;
    private javax.swing.JRadioButton chronicMedicationRadioButton20;
    private javax.swing.JRadioButton chronicMedicationRadioButton21;
    private javax.swing.JRadioButton chronicMedicationRadioButton22;
    private javax.swing.JRadioButton chronicMedicationRadioButton23;
    private javax.swing.JRadioButton chronicMedicationRadioButton24;
    private javax.swing.JRadioButton chronicMedicationRadioButton25;
    private javax.swing.JRadioButton chronicMedicationRadioButton26;
    private javax.swing.JRadioButton chronicMedicationRadioButton27;
    private javax.swing.JRadioButton chronicMedicationRadioButton28;
    private javax.swing.JRadioButton chronicMedicationRadioButton29;
    private javax.swing.JRadioButton chronicMedicationRadioButton30;
    private javax.swing.JRadioButton chronicMedicationRadioButton31;
    private javax.swing.JRadioButton chronicMedicationRadioButton32;
    private javax.swing.JRadioButton chronicMedicationRadioButton33;
    private javax.swing.JRadioButton chronicMedicationRadioButton34;
    private javax.swing.JRadioButton chronicMedicationRadioButton35;
    private javax.swing.JRadioButton chronicMedicationRadioButton36;
    private javax.swing.JRadioButton chronicMedicationRadioButton37;
    private javax.swing.JRadioButton chronicMedicationRadioButton38;
    private javax.swing.JRadioButton chronicMedicationRadioButton39;
    private javax.swing.JRadioButton chronicMedicationRadioButton40;
    private javax.swing.JScrollPane chronicMedicationScrollPane;
    private javax.swing.JLabel heartLabel;
    private javax.swing.JLabel insulinLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea chronicMedicationTextField01;
    private javax.swing.JTextArea chronicMedicationTextField02;
    private javax.swing.JTextArea chronicMedicationTextField03;
    private javax.swing.JTextArea chronicMedicationTextField04;
    private javax.swing.JTextArea chronicMedicationTextField05;
    private javax.swing.JLabel kardiodiegertikesGlikosidesLabel;
    private javax.swing.JLabel nameOfMedicationLabel;
    private javax.swing.JLabel oistrogonaLabel;
    private javax.swing.JLabel ormonesLabel;
    private javax.swing.JLabel otherChronicMedicationLabel;
    private javax.swing.JLabel sidirosLabel;
    private javax.swing.JLabel thromvoliticMedicationLabel;
    private javax.swing.JLabel thyroidikesOrmonesLabel;
    private javax.swing.JLabel vitaminesLabel;
    private java.util.ListResourceBundle resourceMap;
    private ChronicMedication cm;

    public ChronicMedicationPane(java.util.ListResourceBundle rm, String mode,ChronicMedication cm){

        this.resourceMap = rm;

        chronicMedicationScrollPane = new javax.swing.JScrollPane();
        chronicMedicationMainPane = new javax.swing.JPanel();
        heartLabel = new javax.swing.JLabel();
        antithromvoticMedicationLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton01 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton02 = new javax.swing.JRadioButton();
        thromvoliticMedicationLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton03 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton04 = new javax.swing.JRadioButton();
        antidiastaltikaTisStefaniaiasKikloforiasLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton05 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton06 = new javax.swing.JRadioButton();
        kardiodiegertikesGlikosidesLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton07 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton08 = new javax.swing.JRadioButton();
        antiikaFarmakaLabel = new javax.swing.JLabel();
        antiarrythmicaFarmakaLabel = new javax.swing.JLabel();
        antineoplasmatikaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton09 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton10 = new javax.swing.JRadioButton();
        antireumaticaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton11 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton12 = new javax.swing.JRadioButton();
        anapenustikoLabel = new javax.swing.JLabel();
        antiasthmaticaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton13 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton14 = new javax.swing.JRadioButton();
        antithyroidikaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton15 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton16 = new javax.swing.JRadioButton();
        thyroidikesOrmonesLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton17 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton18 = new javax.swing.JRadioButton();
        bloodSugarLabel = new javax.swing.JLabel();
        insulinLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton19 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton20 = new javax.swing.JRadioButton();
        antidiabeticTabletsLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton21 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton22 = new javax.swing.JRadioButton();
        antiagxwlitikaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton23 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton24 = new javax.swing.JRadioButton();
        antipsychotikaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton25 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton26 = new javax.swing.JRadioButton();
        antiepiliptikaFarmakaLabel = new javax.swing.JLabel();
        androgonaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton27 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton28 = new javax.swing.JRadioButton();
        oistrogonaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton29 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton30 = new javax.swing.JRadioButton();
        antisilliptikaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton31 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton32 = new javax.swing.JRadioButton();
        ormonesLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton33 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton34 = new javax.swing.JRadioButton();
        vitaminesLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton35 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton36 = new javax.swing.JRadioButton();
        sidirosLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton37 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton38 = new javax.swing.JRadioButton();
        antiallergicaFarmakaLabel = new javax.swing.JLabel();
        chronicMedicationRadioButton39 = new javax.swing.JRadioButton();
        chronicMedicationRadioButton40 = new javax.swing.JRadioButton();
        otherChronicMedicationLabel = new javax.swing.JLabel();
        nameOfMedicationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chronicMedicationTextField01 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chronicMedicationTextField02 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        chronicMedicationTextField03 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        chronicMedicationTextField04 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        chronicMedicationTextField05 = new javax.swing.JTextArea();

         ButtonGroup YesNoGroup1 = new ButtonGroup();
        YesNoGroup1.add(chronicMedicationRadioButton01);
        YesNoGroup1.add(chronicMedicationRadioButton02);

        ButtonGroup YesNoGroup2 = new ButtonGroup();
        YesNoGroup2.add(chronicMedicationRadioButton03);
        YesNoGroup2.add(chronicMedicationRadioButton04);

        ButtonGroup YesNoGroup3 = new ButtonGroup();
        YesNoGroup3.add(chronicMedicationRadioButton05);
        YesNoGroup3.add(chronicMedicationRadioButton06);

        ButtonGroup YesNoGroup4 = new ButtonGroup();
        YesNoGroup4.add(chronicMedicationRadioButton07);
        YesNoGroup4.add(chronicMedicationRadioButton08);

        ButtonGroup YesNoGroup5 = new ButtonGroup();
        YesNoGroup5.add(chronicMedicationRadioButton09);
        YesNoGroup5.add(chronicMedicationRadioButton10);

        ButtonGroup YesNoGroup6 = new ButtonGroup();
        YesNoGroup6.add(chronicMedicationRadioButton11);
        YesNoGroup6.add(chronicMedicationRadioButton12);

        ButtonGroup YesNoGroup7 = new ButtonGroup();
        YesNoGroup7.add(chronicMedicationRadioButton13);
        YesNoGroup7.add(chronicMedicationRadioButton14);

        ButtonGroup YesNoGroup8 = new ButtonGroup();
        YesNoGroup8.add(chronicMedicationRadioButton15);
        YesNoGroup8.add(chronicMedicationRadioButton16);

        ButtonGroup YesNoGroup9 = new ButtonGroup();
        YesNoGroup9.add(chronicMedicationRadioButton17);
        YesNoGroup9.add(chronicMedicationRadioButton18);

        ButtonGroup YesNoGroup10 = new ButtonGroup();
        YesNoGroup10.add(chronicMedicationRadioButton19);
        YesNoGroup10.add(chronicMedicationRadioButton20);

        ButtonGroup YesNoGroup11 = new ButtonGroup();
        YesNoGroup11.add(chronicMedicationRadioButton21);
        YesNoGroup11.add(chronicMedicationRadioButton22);

        ButtonGroup YesNoGroup12 = new ButtonGroup();
        YesNoGroup12.add(chronicMedicationRadioButton23);
        YesNoGroup12.add(chronicMedicationRadioButton24);

        ButtonGroup YesNoGroup13 = new ButtonGroup();
        YesNoGroup13.add(chronicMedicationRadioButton25);
        YesNoGroup13.add(chronicMedicationRadioButton26);

        ButtonGroup YesNoGroup14 = new ButtonGroup();
        YesNoGroup14.add(chronicMedicationRadioButton27);
        YesNoGroup14.add(chronicMedicationRadioButton28);

        ButtonGroup YesNoGroup15 = new ButtonGroup();
        YesNoGroup15.add(chronicMedicationRadioButton29);
        YesNoGroup15.add(chronicMedicationRadioButton30);

        ButtonGroup YesNoGroup16 = new ButtonGroup();
        YesNoGroup16.add(chronicMedicationRadioButton31);
        YesNoGroup16.add(chronicMedicationRadioButton32);

        ButtonGroup YesNoGroup17 = new ButtonGroup();
        YesNoGroup17.add(chronicMedicationRadioButton33);
        YesNoGroup17.add(chronicMedicationRadioButton34);

        ButtonGroup YesNoGroup18 = new ButtonGroup();
        YesNoGroup18.add(chronicMedicationRadioButton35);
        YesNoGroup18.add(chronicMedicationRadioButton36);

        ButtonGroup YesNoGroup19 = new ButtonGroup();
        YesNoGroup19.add(chronicMedicationRadioButton37);
        YesNoGroup19.add(chronicMedicationRadioButton38);

        ButtonGroup YesNoGroup20 = new ButtonGroup();
        YesNoGroup20.add(chronicMedicationRadioButton39);
        YesNoGroup20.add(chronicMedicationRadioButton40);

        heartLabel.setText(resourceMap.getString("heartLabel.text"));

        antithromvoticMedicationLabel.setText(resourceMap.getString("antithromvoticaFarmaka.text"));

        chronicMedicationRadioButton01.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton02.setText(resourceMap.getString("noRadioButton.text"));

        thromvoliticMedicationLabel.setText(resourceMap.getString("thromvolitikaFarmaka.text"));

        chronicMedicationRadioButton03.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton04.setText(resourceMap.getString("noRadioButton.text"));

        antidiastaltikaTisStefaniaiasKikloforiasLabel.setText(resourceMap.getString("antidiastaltikaFarmaka.text"));

        chronicMedicationRadioButton05.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton06.setText(resourceMap.getString("noRadioButton.text"));

        kardiodiegertikesGlikosidesLabel.setText(resourceMap.getString("kariodiegertikesGlikosides.text"));

        chronicMedicationRadioButton07.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton08.setText(resourceMap.getString("noRadioButton.text"));

        antiikaFarmakaLabel.setText(resourceMap.getString("antiikaFarmaka.text"));

        antiarrythmicaFarmakaLabel.setText(resourceMap.getString("antiarrythmicaFarmaka.text"));

        antineoplasmatikaFarmakaLabel.setText(resourceMap.getString("antineoplasmatikaFarmaka.text"));

        chronicMedicationRadioButton09.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton10.setText(resourceMap.getString("noRadioButton.text"));

        antireumaticaFarmakaLabel.setText(resourceMap.getString("antireumatikaFarmaka.text"));

        chronicMedicationRadioButton11.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton12.setText(resourceMap.getString("noRadioButton.text"));

        anapenustikoLabel.setText(resourceMap.getString("anapneustikoLabel.text"));

        antiasthmaticaLabel.setText(resourceMap.getString("antiasthmatica.text"));

        chronicMedicationRadioButton13.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton14.setText(resourceMap.getString("noRadioButton.text"));

        antithyroidikaFarmakaLabel.setText(resourceMap.getString("antithyroidikaFarmaka.text"));

        chronicMedicationRadioButton15.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton16.setText(resourceMap.getString("noRadioButton.text"));

        thyroidikesOrmonesLabel.setText(resourceMap.getString("thyroidikesOrmones.text"));

        chronicMedicationRadioButton17.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton18.setText(resourceMap.getString("noRadioButton.text"));

        bloodSugarLabel.setText(resourceMap.getString("bloodSugarLabel.text"));

        insulinLabel.setText(resourceMap.getString("insulini.text"));

        chronicMedicationRadioButton19.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton20.setText(resourceMap.getString("noRadioButton.text"));

        antidiabeticTabletsLabel.setText(resourceMap.getString("antidiabeticesTabletes.text"));

        chronicMedicationRadioButton21.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton22.setText(resourceMap.getString("noRadioButton.text"));

        antiagxwlitikaFarmakaLabel.setText(resourceMap.getString("anticoagxwlitikaFarmaka.text"));

        chronicMedicationRadioButton23.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton24.setText(resourceMap.getString("noRadioButton.text"));

        antipsychotikaFarmakaLabel.setText(resourceMap.getString("antipsychoticaFarmaka.text"));

        chronicMedicationRadioButton25.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton26.setText(resourceMap.getString("noRadioButton.text"));

        antiepiliptikaFarmakaLabel.setText(resourceMap.getString("antiepiliptikaFarmaka.text"));

        androgonaLabel.setText(resourceMap.getString("androgona.text"));

        chronicMedicationRadioButton27.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton28.setText(resourceMap.getString("noRadioButton.text"));

        oistrogonaLabel.setText(resourceMap.getString("oistrogona.text"));

        chronicMedicationRadioButton29.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton30.setText(resourceMap.getString("noRadioButton.text"));

        antisilliptikaFarmakaLabel.setText(resourceMap.getString("antisilliptikaFarmaka.text"));

        chronicMedicationRadioButton31.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton32.setText(resourceMap.getString("noRadioButton.text"));

        ormonesLabel.setText(resourceMap.getString("ormones.text"));

        chronicMedicationRadioButton33.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton34.setText(resourceMap.getString("noRadioButton.text"));

        vitaminesLabel.setText(resourceMap.getString("vitamines.text"));

        chronicMedicationRadioButton35.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton36.setText(resourceMap.getString("noRadioButton.text"));

        sidirosLabel.setText(resourceMap.getString("sidiros.text"));

        chronicMedicationRadioButton37.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton38.setText(resourceMap.getString("noRadioButton.text"));

        antiallergicaFarmakaLabel.setText(resourceMap.getString("antiallergikaFarmaka.text"));

        chronicMedicationRadioButton39.setText(resourceMap.getString("yesRadioButton.text"));

        chronicMedicationRadioButton40.setText(resourceMap.getString("noRadioButton.text"));

        otherChronicMedicationLabel.setText(resourceMap.getString("otherChronicMedication.text"));

        nameOfMedicationLabel.setText(resourceMap.getString("nameOfMedication.text"));

        chronicMedicationTextField01.setColumns(20);
        chronicMedicationTextField01.setRows(5);
        jScrollPane1.setViewportView(chronicMedicationTextField01);

        chronicMedicationTextField02.setColumns(20);
        chronicMedicationTextField02.setRows(5);
        jScrollPane2.setViewportView(chronicMedicationTextField02);

        chronicMedicationTextField03.setColumns(20);
        chronicMedicationTextField03.setRows(5);
        jScrollPane3.setViewportView(chronicMedicationTextField03);

        chronicMedicationTextField04.setColumns(20);
        chronicMedicationTextField04.setRows(5);
        jScrollPane4.setViewportView(chronicMedicationTextField04);

        chronicMedicationTextField05.setColumns(20);
        chronicMedicationTextField05.setRows(5);
        jScrollPane5.setViewportView(chronicMedicationTextField05);

        javax.swing.GroupLayout chronicMedicationMainPaneLayout = new javax.swing.GroupLayout(chronicMedicationMainPane);
        chronicMedicationMainPane.setLayout(chronicMedicationMainPaneLayout);
        chronicMedicationMainPaneLayout.setHorizontalGroup(
            chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(antithromvoticMedicationLabel)
                    .addComponent(thromvoliticMedicationLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(chronicMedicationRadioButton01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chronicMedicationRadioButton02))
                    .addComponent(heartLabel)
                    .addComponent(bloodSugarLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton05)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chronicMedicationRadioButton06))
                                .addComponent(kardiodiegertikesGlikosidesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(antidiastaltikaTisStefaniaiasKikloforiasLabel)
                                .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton03)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chronicMedicationRadioButton04)))
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addComponent(chronicMedicationRadioButton23)
                                .addGap(6, 6, 6)
                                .addComponent(chronicMedicationRadioButton24))
                            .addComponent(antipsychotikaFarmakaLabel)
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addComponent(chronicMedicationRadioButton25)
                                .addGap(6, 6, 6)
                                .addComponent(chronicMedicationRadioButton26))
                            .addComponent(insulinLabel)
                            .addComponent(antiagxwlitikaFarmakaLabel)
                            .addComponent(antidiabeticTabletsLabel)
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addComponent(chronicMedicationRadioButton19)
                                .addGap(6, 6, 6)
                                .addComponent(chronicMedicationRadioButton20))
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addComponent(chronicMedicationRadioButton21)
                                .addGap(6, 6, 6)
                                .addComponent(chronicMedicationRadioButton22))
                            .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(androgonaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton27)
                                    .addGap(6, 6, 6)
                                    .addComponent(chronicMedicationRadioButton28))
                                .addComponent(oistrogonaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton29)
                                    .addGap(6, 6, 6)
                                    .addComponent(chronicMedicationRadioButton30)))
                            .addComponent(antiepiliptikaFarmakaLabel)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ormonesLabel)
                                    .addComponent(antisilliptikaFarmakaLabel)
                                    .addComponent(vitaminesLabel)
                                    .addComponent(sidirosLabel)
                                    .addComponent(antiallergicaFarmakaLabel)
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addComponent(chronicMedicationRadioButton35)
                                        .addGap(6, 6, 6)
                                        .addComponent(chronicMedicationRadioButton36))
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addComponent(chronicMedicationRadioButton37)
                                        .addGap(6, 6, 6)
                                        .addComponent(chronicMedicationRadioButton38))
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addComponent(chronicMedicationRadioButton39)
                                        .addGap(6, 6, 6)
                                        .addComponent(chronicMedicationRadioButton40))
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addComponent(chronicMedicationRadioButton33)
                                        .addGap(6, 6, 6)
                                        .addComponent(chronicMedicationRadioButton34))
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addComponent(chronicMedicationRadioButton31)
                                        .addGap(6, 6, 6)
                                        .addComponent(chronicMedicationRadioButton32))
                                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(otherChronicMedicationLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(antiarrythmicaFarmakaLabel)
                            .addComponent(antiikaFarmakaLabel)
                            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                                .addComponent(chronicMedicationRadioButton07)
                                .addGap(6, 6, 6)
                                .addComponent(chronicMedicationRadioButton08))
                            .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(antireumaticaFarmakaLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton11)
                                    .addGap(6, 6, 6)
                                    .addComponent(chronicMedicationRadioButton12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(antineoplasmatikaFarmakaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chronicMedicationMainPaneLayout.createSequentialGroup()
                                    .addComponent(chronicMedicationRadioButton09)
                                    .addGap(6, 6, 6)
                                    .addComponent(chronicMedicationRadioButton10))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(antiasthmaticaLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(chronicMedicationRadioButton13)
                        .addGap(6, 6, 6)
                        .addComponent(chronicMedicationRadioButton14))
                    .addComponent(antithyroidikaFarmakaLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(chronicMedicationRadioButton15)
                        .addGap(6, 6, 6)
                        .addComponent(chronicMedicationRadioButton16))
                    .addComponent(thyroidikesOrmonesLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(chronicMedicationRadioButton17)
                        .addGap(6, 6, 6)
                        .addComponent(chronicMedicationRadioButton18))
                    .addComponent(anapenustikoLabel)
                    .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4)
                        .addComponent(nameOfMedicationLabel)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        chronicMedicationMainPaneLayout.setVerticalGroup(
            chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(heartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(antithromvoticMedicationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton01)
                            .addComponent(chronicMedicationRadioButton02))
                        .addGap(12, 12, 12)
                        .addComponent(thromvoliticMedicationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton03)
                            .addComponent(chronicMedicationRadioButton04))
                        .addGap(12, 12, 12)
                        .addComponent(antidiastaltikaTisStefaniaiasKikloforiasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton05)
                            .addComponent(chronicMedicationRadioButton06))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kardiodiegertikesGlikosidesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(antiikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton07)
                            .addComponent(chronicMedicationRadioButton08))
                        .addGap(18, 18, 18)
                        .addComponent(antiarrythmicaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(antineoplasmatikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton09)
                            .addComponent(chronicMedicationRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antireumaticaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton11)
                            .addComponent(chronicMedicationRadioButton12))))
                .addGap(42, 42, 42)
                .addComponent(bloodSugarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(insulinLabel)
                        .addGap(3, 3, 3)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton19)
                            .addComponent(chronicMedicationRadioButton20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antidiabeticTabletsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton21)
                            .addComponent(chronicMedicationRadioButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antiagxwlitikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton23)
                            .addComponent(chronicMedicationRadioButton24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antipsychotikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton25)
                            .addComponent(chronicMedicationRadioButton26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antiepiliptikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(antisilliptikaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton31)
                            .addComponent(chronicMedicationRadioButton32))
                        .addGap(9, 9, 9)
                        .addComponent(ormonesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton33)
                            .addComponent(chronicMedicationRadioButton34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vitaminesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton35)
                            .addComponent(chronicMedicationRadioButton36))
                        .addGap(12, 12, 12)
                        .addComponent(sidirosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton37)
                            .addComponent(chronicMedicationRadioButton38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antiallergicaFarmakaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton39)
                            .addComponent(chronicMedicationRadioButton40))))
                .addGap(24, 24, 24)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(androgonaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton27)
                            .addComponent(chronicMedicationRadioButton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oistrogonaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicMedicationRadioButton29)
                            .addComponent(chronicMedicationRadioButton30)))
                    .addGroup(chronicMedicationMainPaneLayout.createSequentialGroup()
                        .addComponent(otherChronicMedicationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(nameOfMedicationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anapenustikoLabel)
                .addGap(10, 10, 10)
                .addComponent(antiasthmaticaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicMedicationRadioButton13)
                    .addComponent(chronicMedicationRadioButton14))
                .addGap(10, 10, 10)
                .addComponent(antithyroidikaFarmakaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicMedicationRadioButton15)
                    .addComponent(chronicMedicationRadioButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thyroidikesOrmonesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chronicMedicationMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicMedicationRadioButton17)
                    .addComponent(chronicMedicationRadioButton18))
                .addGap(10, 10, 10))
        );

        chronicMedicationScrollPane.setViewportView(chronicMedicationMainPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chronicMedicationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chronicMedicationScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        if(mode.equals("edit"))
        {
            this.cm = cm;
            loadChronicMedications(cm);
        }

    }

    private void loadChronicMedications(ChronicMedication cm) {

                if(cm.getAntithromvotikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton01.setSelected(true);
                else
                chronicMedicationRadioButton02.setSelected(true);

                if(cm.getThromvolitikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton03.setSelected(true);
                else
                chronicMedicationRadioButton04.setSelected(true);

                if (cm.getAntidiastaltikaTisStefaniaiasKikloforias().equals("Yes"))
                chronicMedicationRadioButton05.setSelected(true);
                else
                chronicMedicationRadioButton06.setSelected(true);

                //String kardiodiegertikesGlikosides,
                chronicMedicationTextField01.setText(cm.getKardiodiegertikesGlikosides());

                if (cm.getAntiikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton07.setSelected(true);
                else
                chronicMedicationRadioButton08.setSelected(true);

                //String antiarrythmikaFarmaka,
                chronicMedicationTextField02.setText(cm.getAntiarrythmikaFarmaka());

                if (cm.getAntineoplasmatikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton09.setSelected(true);
                else
                chronicMedicationRadioButton10.setSelected(true);

                if (cm.getAntireumatikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton11.setSelected(true);
                else
                chronicMedicationRadioButton12.setSelected(true);

                if(cm.getAntiasthmatikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton13.setSelected(true);
                else
                chronicMedicationRadioButton14.setSelected(true);

                if(cm.getAntithyroidikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton15.setSelected(true);
                else
                chronicMedicationRadioButton16.setSelected(true);

                if(cm.getThyroidikesOrmones().equals("Yes"))
                chronicMedicationRadioButton17.setSelected(true);
                else
                chronicMedicationRadioButton18.setSelected(true);

                if(cm.getInsulin().equals("Yes"))
                chronicMedicationRadioButton19.setSelected(true);
                else
                chronicMedicationRadioButton20.setSelected(true);

                if(cm.getAntidiabeticTablets().equals("Yes"))
                chronicMedicationRadioButton21.setSelected(true);
                else
                chronicMedicationRadioButton22.setSelected(true);

                if(cm.getAnticoagulantMedication().equals("Yes"))
                chronicMedicationRadioButton23.setSelected(true);
                else
                chronicMedicationRadioButton24.setSelected(true);

                if(cm.getAntipsychoticMedication().equals("Yes"))
                chronicMedicationRadioButton25.setSelected(true);
                else
                chronicMedicationRadioButton26.setSelected(true);

                //String antiepilipticMedication,
                chronicMedicationTextField03.setText(cm.getAntiepilipticMedication());

                if(cm.getAndrogona().equals("Yes"))
                chronicMedicationRadioButton27.setSelected(true);
                else
                chronicMedicationRadioButton28.setSelected(true);

                if(cm.getOistrogona().equals("Yes"))
                chronicMedicationRadioButton29.setSelected(true);
                else
                chronicMedicationRadioButton30.setSelected(true);

                if(cm.getAntisilliptikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton31.setSelected(true);
                else
                chronicMedicationRadioButton32.setSelected(true);

                if(cm.getOrmones().equals("Yes"))
                chronicMedicationRadioButton33.setSelected(true);
                else
                chronicMedicationRadioButton34.setSelected(true);

                if (cm.getVitamines().equals("Yes"))
                chronicMedicationRadioButton35.setSelected(true);
                else
                chronicMedicationRadioButton36.setSelected(true);

                if(cm.getSidiros().equals("Yes"))
                chronicMedicationRadioButton37.setSelected(true);
                else
                chronicMedicationRadioButton38.setSelected(true);

                if(cm.getAntiallergikaFarmaka().equals("Yes"))
                chronicMedicationRadioButton39.setSelected(true);
                else
                chronicMedicationRadioButton40.setSelected(true);

                //String otherChronicMedication,
                chronicMedicationTextField04.setText(cm.getOtherChronicMedication());

                //String nameOfMedication
                chronicMedicationTextField05.setText(cm.getNameOfMedication());
    }

    public ChronicMedication getChronicMedications()
    {
        String antithromvotikaFarmaka;
                if(chronicMedicationRadioButton01.isSelected() == true)
                antithromvotikaFarmaka = "Yes";
                else
                antithromvotikaFarmaka = "No";

        String thromvolitikaFarmaka;
                if(chronicMedicationRadioButton03.isSelected() == true)
                thromvolitikaFarmaka = "Yes";
                else
                thromvolitikaFarmaka = "No";

        String antidiastaltikaTisStefaniaiasKikloforias;
                if (chronicMedicationRadioButton05.isSelected() == true)
                antidiastaltikaTisStefaniaiasKikloforias = "Yes";
                else
                antidiastaltikaTisStefaniaiasKikloforias = "No";

                //String kardiodiegertikesGlikosides,
                //chronicMedicationTextField01.setText(cm.getKardiodiegertikesGlikosides());

                String antiikaFarmaka;
                if (chronicMedicationRadioButton07.isSelected() == true)
                antiikaFarmaka="Yes";
                else
                antiikaFarmaka="No";

                //String antiarrythmikaFarmaka,
                //chronicMedicationTextField02.setText(cm.getAntiarrythmikaFarmaka());

                String antineoplasmatikaFarmaka;
                if (chronicMedicationRadioButton09.isSelected() == true)
                antineoplasmatikaFarmaka="Yes";
                else
                antineoplasmatikaFarmaka="No";

                String antireumatikaFarmaka;
                if (chronicMedicationRadioButton11.isSelected() == true)
                antireumatikaFarmaka = "Yes";
                else
                antireumatikaFarmaka = "No";

                String antiasthmatikaFarmaka;
                if(chronicMedicationRadioButton13.isSelected() == true)
                antiasthmatikaFarmaka = "Yes";
                else
                antiasthmatikaFarmaka = "No";

                String antithyroidikaFarmaka;
                if(chronicMedicationRadioButton15.isSelected() == true)
                antithyroidikaFarmaka = "Yes";
                else
                antithyroidikaFarmaka = "No";

                String thyroidikesOrmones;
                if(chronicMedicationRadioButton17.isSelected() == true)
                thyroidikesOrmones = "Yes";
                else
                thyroidikesOrmones = "No";

                String insulin;
                if(chronicMedicationRadioButton19.isSelected() == true)
                insulin = "Yes";
                else
                insulin = "No";

                String antidiabeticTablets;
                if(chronicMedicationRadioButton21.isSelected() == true)
                antidiabeticTablets = "Yes";
                else
                antidiabeticTablets = "No";

                String anticoagulantMedication;
                if(chronicMedicationRadioButton23.isSelected() == true)
                anticoagulantMedication = "Yes";
                else
                anticoagulantMedication = "No";

                String antipsychoticMedication;
                if(chronicMedicationRadioButton25.isSelected() == true)
                antipsychoticMedication = "Yes";
                else
                antipsychoticMedication = "No";

                //String antiepilipticMedication,
                //chronicMedicationTextField03.setText(cm.getAntiepilipticMedication());

                String androgona;
                if(chronicMedicationRadioButton27.isSelected() == true)
                androgona = "Yes";
                else
                androgona = "No";

                String oistrogona;
                if(chronicMedicationRadioButton29.isSelected() == true)
                oistrogona = "Yes";
                else
                oistrogona = "No";

                String antisilliptikaFarmaka;
                if(chronicMedicationRadioButton31.isSelected() == true)
                antisilliptikaFarmaka = "Yes";
                else
                antisilliptikaFarmaka = "No";

                String ormones;
                if(chronicMedicationRadioButton33.isSelected() == true)
                ormones = "Yes";
                else
                ormones = "No";

                String vitamines;
                if (chronicMedicationRadioButton35.isSelected() == true)
                vitamines = "Yes";
                else
                vitamines = "No";

                String sidiros;
                if(chronicMedicationRadioButton37.isSelected() == true)
                sidiros = "Yes";
                else
                sidiros = "No";

                String antiallergikaFarmaka;
                if(chronicMedicationRadioButton39.isSelected() == true)
                antiallergikaFarmaka = "Yes";
                else
                antiallergikaFarmaka = "No";

                //String otherChronicMedication,
                //chronicMedicationTextField04.setText(cm.getOtherChronicMedication());

                //String nameOfMedication
                //chronicMedicationTextField05.setText(cm.getNameOfMedication());

                return new ChronicMedication (antithromvotikaFarmaka,thromvolitikaFarmaka,
                        antidiastaltikaTisStefaniaiasKikloforias,
                        chronicMedicationTextField01.getText(),
                        antiikaFarmaka,chronicMedicationTextField02.getText(),
                        antineoplasmatikaFarmaka,antireumatikaFarmaka,
                        antiasthmatikaFarmaka,antithyroidikaFarmaka,
                        thyroidikesOrmones,insulin, antidiabeticTablets,
                        anticoagulantMedication,antipsychoticMedication,
                        chronicMedicationTextField03.getText(),
                        androgona,oistrogona,antisilliptikaFarmaka,
                        ormones,vitamines,sidiros,antiallergikaFarmaka,
                        chronicMedicationTextField04.getText(),
                        chronicMedicationTextField05.getText()
                        );
    }

}
