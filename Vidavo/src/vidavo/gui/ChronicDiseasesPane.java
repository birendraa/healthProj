
package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import vidavo.pojos.ChronicDiseases;

public class ChronicDiseasesPane extends JPanel{
    
    private javax.swing.JLabel ageiakesPathiseisLabel;
    private javax.swing.JTextArea ageiakesPathiseisTextArea;
    private javax.swing.JLabel allergikoAsthmaLabel;
    private javax.swing.JLabel allesChroniesAstheneiesLabel;
    private javax.swing.JTextArea allesChroniesAstheneiesTextArea;
    private javax.swing.JLabel allesMorfesYpotaseisLabel;
    private javax.swing.JTextArea allesMorfesYpotaseisTextArea;
    private javax.swing.JLabel anapneustikiAneparkeiaLabel;
    private javax.swing.JLabel anapneustirasLabel;
    private javax.swing.JLabel aneparkeiaAortikisValvidasLabel;
    private javax.swing.JLabel aneurismaKardiasLabel;
    private javax.swing.JLabel aneurismaPneumonikisArtiriasLabel;
    private javax.swing.JTextArea aneurismaPneumonikisArtiriasTextArea;
    private javax.swing.JLabel chronicVroxitidaLabel;
    private javax.swing.JLabel diataraxesArtiriwnLabel;
    private javax.swing.JTextArea diataraxesArtiriwnTextArea;
    private javax.swing.JLabel diataraxesEderouLabel;
    private javax.swing.JLabel diataraxesNeurikouSistimatosLabel;
    private javax.swing.JTextArea diataraxesNeurikouSistimatosTextArea;
    private javax.swing.JLabel diavitisLabel;
    private javax.swing.JLabel egefalikoLabel;
    private javax.swing.JLabel eleipsiSidirouLabel;
    private javax.swing.JLabel elkosLabel;
    private javax.swing.JLabel emfragmaLabel;
    private javax.swing.JLabel erpikoEkzemaLabel;
    private javax.swing.JLabel hpatikiAneparkeiaLabel;
    private javax.swing.JLabel ipatitidaLabel;
    private javax.swing.JTextArea ipatitidaTextArea;
    private javax.swing.JPanel jPanel1;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel kardiakiArythmiaLabel;
    private javax.swing.JTextArea kardiakiArythmiaTextArea;
    private javax.swing.JLabel kardiopatheiaLabel;
    private javax.swing.JLabel leuxaimiaLabel;
    private javax.swing.JLabel mixanimaAimokatharsisLabel;
    private javax.swing.JLabel morfiThiroeidiLabel;
    private javax.swing.JTextArea morfiThiroeidiTextArea;
    private javax.swing.JLabel nefrikiAneparkeiaLabel;
    private javax.swing.JLabel nososYpatosLabel;
    private javax.swing.JTextArea nososYpatosTextArea;
    private javax.swing.JLabel pathiseisPneumonwnLabel;
    private javax.swing.JTextArea pathiseisPneumonwnTextArea;
    private javax.swing.JLabel poliomelitidaLabel;
    private javax.swing.JLabel stenosiAortikisValvidasLabel;
    private javax.swing.JLabel thiroeidismosLabel;
    private javax.swing.JLabel thromvosiAgeiwnLabel;
    private javax.swing.JLabel vactiriakesPneumoniesLabel;
    private javax.swing.JTextArea vactiriakesPneumoniesTextArea;
    private javax.swing.JLabel vimatodotisLabel;
    private javax.swing.JLabel ypertasiLabel;
    private javax.swing.JLabel ypotasiLabel;

    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo1;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo10;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo11;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo12;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo13;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo14;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo15;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo16;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo17;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo18;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo19;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo2;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo20;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo21;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo22;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo23;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo24;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo25;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo3;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo4;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo5;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo6;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo7;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo8;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonNo9;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes1;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes10;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes11;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes12;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes13;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes14;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes15;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes16;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes17;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes18;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes19;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes2;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes20;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes21;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes22;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes23;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes24;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes25;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes3;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes4;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes5;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes6;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes7;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes8;
    private javax.swing.JRadioButton chronicDiseasesRadioButtonYes9;

    private java.util.ListResourceBundle resourceMap;
    private ChronicDiseases cd;

    public ChronicDiseasesPane(java.util.ListResourceBundle rm,String mode,ChronicDiseases cd){
        this.resourceMap = rm;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        vactiriakesPneumoniesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vactiriakesPneumoniesTextArea = new javax.swing.JTextArea();
        pathiseisPneumonwnLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pathiseisPneumonwnTextArea = new javax.swing.JTextArea();
        chronicVroxitidaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes1 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo1 = new javax.swing.JRadioButton();
        aneurismaPneumonikisArtiriasLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        aneurismaPneumonikisArtiriasTextArea = new javax.swing.JTextArea();
        diataraxesArtiriwnLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        diataraxesArtiriwnTextArea = new javax.swing.JTextArea();
        allergikoAsthmaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes2 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo2 = new javax.swing.JRadioButton();
        anapneustikiAneparkeiaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes3 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo3 = new javax.swing.JRadioButton();
        anapneustirasLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes4 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo4 = new javax.swing.JRadioButton();
        kardiopatheiaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes5 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo5 = new javax.swing.JRadioButton();
        aneurismaKardiasLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes6 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo6 = new javax.swing.JRadioButton();
        kardiakiArythmiaLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        kardiakiArythmiaTextArea = new javax.swing.JTextArea();
        vimatodotisLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes7 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo7 = new javax.swing.JRadioButton();
        emfragmaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes8 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo8 = new javax.swing.JRadioButton();
        egefalikoLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes9 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo9 = new javax.swing.JRadioButton();
        thromvosiAgeiwnLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes10 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo10 = new javax.swing.JRadioButton();
        stenosiAortikisValvidasLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes11 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo11 = new javax.swing.JRadioButton();
        aneparkeiaAortikisValvidasLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes12 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo12 = new javax.swing.JRadioButton();
        ageiakesPathiseisLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ageiakesPathiseisTextArea = new javax.swing.JTextArea();
        ypotasiLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes13 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo13 = new javax.swing.JRadioButton();
        ypertasiLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes14 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo14 = new javax.swing.JRadioButton();
        allesMorfesYpotaseisLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        allesMorfesYpotaseisTextArea = new javax.swing.JTextArea();
        diavitisLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes15 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo15 = new javax.swing.JRadioButton();
        nososYpatosLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        nososYpatosTextArea = new javax.swing.JTextArea();
        hpatikiAneparkeiaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes16 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo16 = new javax.swing.JRadioButton();
        nefrikiAneparkeiaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes17 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo17 = new javax.swing.JRadioButton();
        mixanimaAimokatharsisLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes18 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo18 = new javax.swing.JRadioButton();
        elkosLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes19 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo19 = new javax.swing.JRadioButton();
        diataraxesEderouLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes20 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo20 = new javax.swing.JRadioButton();
        diataraxesNeurikouSistimatosLabel = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        diataraxesNeurikouSistimatosTextArea = new javax.swing.JTextArea();
        erpikoEkzemaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes21 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo21 = new javax.swing.JRadioButton();
        ipatitidaLabel = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ipatitidaTextArea = new javax.swing.JTextArea();
        leuxaimiaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes22 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo22 = new javax.swing.JRadioButton();
        eleipsiSidirouLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes23 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo23 = new javax.swing.JRadioButton();
        poliomelitidaLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes24 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo24 = new javax.swing.JRadioButton();
        thiroeidismosLabel = new javax.swing.JLabel();
        chronicDiseasesRadioButtonYes25 = new javax.swing.JRadioButton();
        chronicDiseasesRadioButtonNo25 = new javax.swing.JRadioButton();
        morfiThiroeidiLabel = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        morfiThiroeidiTextArea = new javax.swing.JTextArea();
        allesChroniesAstheneiesLabel = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        allesChroniesAstheneiesTextArea = new javax.swing.JTextArea();

        vactiriakesPneumoniesTextArea.setColumns(20);
        vactiriakesPneumoniesTextArea.setRows(5);
        jScrollPane2.setViewportView(vactiriakesPneumoniesTextArea);

        pathiseisPneumonwnLabel.setText(resourceMap.getString("pathiseisPneumonwnLabel.text"));
        chronicVroxitidaLabel.setText(resourceMap.getString("chronicVroxitidaLabel.text"));
        aneurismaPneumonikisArtiriasLabel.setText(resourceMap.getString("aneurismaPneumonikisArtiriasLabel.text"));
        vactiriakesPneumoniesLabel.setText(resourceMap.getString("vactiriakesPneumoniesLabel.text"));
        diataraxesArtiriwnLabel.setText(resourceMap.getString("diataraxesArtiriwnLabel.text"));
        allergikoAsthmaLabel.setText(resourceMap.getString("allergikoAsthmaLabel.text"));
        anapneustikiAneparkeiaLabel.setText(resourceMap.getString("anapneustikiAneparkeiaLabel.text"));
        anapneustirasLabel.setText(resourceMap.getString("anapneustirasLabel.text"));
        kardiopatheiaLabel.setText(resourceMap.getString("kardiopatheiaLabel.text"));
        aneurismaKardiasLabel.setText(resourceMap.getString("aneurismaKardiasLabel.text"));
        kardiakiArythmiaLabel.setText(resourceMap.getString("kardiakiArythmiaLabel.text"));
        vimatodotisLabel.setText(resourceMap.getString("vimatodotisLabel.text"));
        emfragmaLabel.setText(resourceMap.getString("emfragmaLabel.text"));
        egefalikoLabel.setText(resourceMap.getString("egefalikoLabel.text"));
        thromvosiAgeiwnLabel.setText(resourceMap.getString("thromvosiAgeiwnLabel.text"));
        stenosiAortikisValvidasLabel.setText(resourceMap.getString("stenosiAortikisValvidasLabel.text"));
        aneparkeiaAortikisValvidasLabel.setText(resourceMap.getString("aneparkeiaAortikisValvidasLabel.text"));
        ageiakesPathiseisLabel.setText(resourceMap.getString("ageiakesPathiseisLabel.text"));
        ypotasiLabel.setText(resourceMap.getString("ypotasiLabel.text"));
        ypertasiLabel.setText(resourceMap.getString("ypertasiLabel.text"));
        allesMorfesYpotaseisLabel.setText(resourceMap.getString("allesMorfesYpotaseisLabel.text"));
        hpatikiAneparkeiaLabel.setText(resourceMap.getString("hpatikiAneparkeiaLabel.text"));
        nefrikiAneparkeiaLabel.setText(resourceMap.getString("nefrikiAneparkeiaLabel.text"));
        mixanimaAimokatharsisLabel.setText(resourceMap.getString("mixanimaAimokatharsisLabel.text"));
        elkosLabel.setText(resourceMap.getString("elkosLabel.text"));
        diataraxesEderouLabel.setText(resourceMap.getString("diataraxesEderouLabel.text"));
        diataraxesNeurikouSistimatosLabel.setText(resourceMap.getString("diataraxesNeurikouSistimatosLabel.text"));
        diavitisLabel.setText(resourceMap.getString("diavitisLabel.text"));
        leuxaimiaLabel.setText(resourceMap.getString("leuxaimiaLabel.text"));
        eleipsiSidirouLabel.setText(resourceMap.getString("eleipsiSidirouLabel.text"));
        poliomelitidaLabel.setText(resourceMap.getString("poliomelitidaLabel.text"));
        thiroeidismosLabel.setText(resourceMap.getString("thiroeidismosLabel.text"));
        morfiThiroeidiLabel.setText(resourceMap.getString("morfiThiroeidiLabel.text"));
        erpikoEkzemaLabel.setText(resourceMap.getString("erpikoEkzemaLabel.text"));
        erpikoEkzemaLabel.setText(resourceMap.getString("erpikoEkzemaLabel.text"));
        ipatitidaLabel.setText(resourceMap.getString("ipatitidaLabel.text"));
        allesChroniesAstheneiesLabel.setText(resourceMap.getString("allesChroniesAstheneiesLabel.text"));

        pathiseisPneumonwnTextArea.setColumns(20);
        pathiseisPneumonwnTextArea.setRows(5);
        jScrollPane3.setViewportView(pathiseisPneumonwnTextArea);

        aneurismaPneumonikisArtiriasTextArea.setColumns(20);
        aneurismaPneumonikisArtiriasTextArea.setRows(5);
        jScrollPane4.setViewportView(aneurismaPneumonikisArtiriasTextArea);

        diataraxesArtiriwnTextArea.setColumns(20);
        diataraxesArtiriwnTextArea.setRows(5);
        jScrollPane5.setViewportView(diataraxesArtiriwnTextArea);

        kardiakiArythmiaTextArea.setColumns(20);
        kardiakiArythmiaTextArea.setRows(5);
        jScrollPane6.setViewportView(kardiakiArythmiaTextArea);

        ageiakesPathiseisTextArea.setColumns(20);
        ageiakesPathiseisTextArea.setRows(5);
        jScrollPane7.setViewportView(ageiakesPathiseisTextArea);

        allesMorfesYpotaseisTextArea.setColumns(20);
        allesMorfesYpotaseisTextArea.setRows(5);
        jScrollPane8.setViewportView(allesMorfesYpotaseisTextArea);

        nososYpatosTextArea.setColumns(20);
        nososYpatosTextArea.setRows(5);
        jScrollPane9.setViewportView(nososYpatosTextArea);

        diataraxesNeurikouSistimatosTextArea.setColumns(20);
        diataraxesNeurikouSistimatosTextArea.setRows(5);
        jScrollPane10.setViewportView(diataraxesNeurikouSistimatosTextArea);

        ipatitidaTextArea.setColumns(20);
        ipatitidaTextArea.setRows(5);
        jScrollPane11.setViewportView(ipatitidaTextArea);

        morfiThiroeidiTextArea.setColumns(20);
        morfiThiroeidiTextArea.setRows(5);
        jScrollPane12.setViewportView(morfiThiroeidiTextArea);

        allesChroniesAstheneiesTextArea.setColumns(20);
        allesChroniesAstheneiesTextArea.setRows(5);
        jScrollPane13.setViewportView(allesChroniesAstheneiesTextArea);

    chronicDiseasesRadioButtonNo1.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo10.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo11.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo12.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo13.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo14.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo15.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo16.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo17.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo18.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo19.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo2.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo20.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo21.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo22.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo23.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo24.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo25.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo3.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo4.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo5.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo6.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo7.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo8.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonNo9.setText(resourceMap.getString("noRadioButton.text"));
    chronicDiseasesRadioButtonYes1.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes10.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes11.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes12.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes13.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes14.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes15.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes16.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes17.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes18.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes19.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes2.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes20.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes21.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes22.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes23.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes24.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes25.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes3.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes4.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes5.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes6.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes7.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes8.setText(resourceMap.getString("yesRadioButton.text"));
    chronicDiseasesRadioButtonYes9.setText(resourceMap.getString("yesRadioButton.text"));

        ButtonGroup YesNoGroup1 =  new ButtonGroup();
        YesNoGroup1.add(chronicDiseasesRadioButtonYes1);
        YesNoGroup1.add(chronicDiseasesRadioButtonNo1);

        ButtonGroup YesNoGroup2 =  new ButtonGroup();
        YesNoGroup2.add(chronicDiseasesRadioButtonYes2);
        YesNoGroup2.add(chronicDiseasesRadioButtonNo2);

        ButtonGroup YesNoGroup3 =  new ButtonGroup();
        YesNoGroup3.add(chronicDiseasesRadioButtonYes3);
        YesNoGroup3.add(chronicDiseasesRadioButtonNo3);

        ButtonGroup YesNoGroup4 =  new ButtonGroup();
        YesNoGroup4.add(chronicDiseasesRadioButtonYes4);
        YesNoGroup4.add(chronicDiseasesRadioButtonNo4);

        ButtonGroup YesNoGroup5 =  new ButtonGroup();
        YesNoGroup5.add(chronicDiseasesRadioButtonYes5);
        YesNoGroup5.add(chronicDiseasesRadioButtonNo5);

        ButtonGroup YesNoGroup6 =  new ButtonGroup();
        YesNoGroup6.add(chronicDiseasesRadioButtonYes6);
        YesNoGroup6.add(chronicDiseasesRadioButtonNo6);

        ButtonGroup YesNoGroup7 =  new ButtonGroup();
        YesNoGroup7.add(chronicDiseasesRadioButtonYes7);
        YesNoGroup7.add(chronicDiseasesRadioButtonNo7);

        ButtonGroup YesNoGroup8 =  new ButtonGroup();
        YesNoGroup8.add(chronicDiseasesRadioButtonYes8);
        YesNoGroup8.add(chronicDiseasesRadioButtonNo8);

        ButtonGroup YesNoGroup9 =  new ButtonGroup();
        YesNoGroup9.add(chronicDiseasesRadioButtonYes9);
        YesNoGroup9.add(chronicDiseasesRadioButtonNo9);

        ButtonGroup YesNoGroup10 =  new ButtonGroup();
        YesNoGroup10.add(chronicDiseasesRadioButtonYes10);
        YesNoGroup10.add(chronicDiseasesRadioButtonNo10);

        ButtonGroup YesNoGroup11 =  new ButtonGroup();
        YesNoGroup11.add(chronicDiseasesRadioButtonYes11);
        YesNoGroup11.add(chronicDiseasesRadioButtonNo11);

        ButtonGroup YesNoGroup12 =  new ButtonGroup();
        YesNoGroup12.add(chronicDiseasesRadioButtonYes12);
        YesNoGroup12.add(chronicDiseasesRadioButtonNo12);

        ButtonGroup YesNoGroup13 =  new ButtonGroup();
        YesNoGroup13.add(chronicDiseasesRadioButtonYes13);
        YesNoGroup13.add(chronicDiseasesRadioButtonNo13);

        ButtonGroup YesNoGroup14 =  new ButtonGroup();
        YesNoGroup14.add(chronicDiseasesRadioButtonYes14);
        YesNoGroup14.add(chronicDiseasesRadioButtonNo14);

        ButtonGroup YesNoGroup15 =  new ButtonGroup();
        YesNoGroup15.add(chronicDiseasesRadioButtonYes15);
        YesNoGroup15.add(chronicDiseasesRadioButtonNo15);

        ButtonGroup YesNoGroup16 =  new ButtonGroup();
        YesNoGroup16.add(chronicDiseasesRadioButtonYes16);
        YesNoGroup16.add(chronicDiseasesRadioButtonNo16);

        ButtonGroup YesNoGroup17 =  new ButtonGroup();
        YesNoGroup17.add(chronicDiseasesRadioButtonYes17);
        YesNoGroup17.add(chronicDiseasesRadioButtonNo17);

        ButtonGroup YesNoGroup18 =  new ButtonGroup();
        YesNoGroup18.add(chronicDiseasesRadioButtonYes18);
        YesNoGroup18.add(chronicDiseasesRadioButtonNo18);

        ButtonGroup YesNoGroup19 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes19);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo19);

        ButtonGroup YesNoGroup20 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes20);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo20);

        ButtonGroup YesNoGroup21 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes21);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo21);

        ButtonGroup YesNoGroup22 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes22);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo22);

        ButtonGroup YesNoGroup23 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes23);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo23);

        ButtonGroup YesNoGroup24 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes24);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo24);

        ButtonGroup YesNoGroup25 =  new ButtonGroup();
        YesNoGroup19.add(chronicDiseasesRadioButtonYes25);
        YesNoGroup19.add(chronicDiseasesRadioButtonNo25);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes25)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes24)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes23)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes22)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo22))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes21)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo21))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes20)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes19)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes18)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes16)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo16))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes15)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo15))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes11)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes10)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes9)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes8)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo8))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes6)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes5)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes4)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes3)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo3))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes1)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(vactiriakesPneumoniesLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pathiseisPneumonwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chronicVroxitidaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aneurismaPneumonikisArtiriasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diataraxesArtiriwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allergikoAsthmaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes2)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo2))
                    .addComponent(anapneustikiAneparkeiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anapneustirasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kardiopatheiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aneurismaKardiasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kardiakiArythmiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vimatodotisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes7)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo7))
                    .addComponent(emfragmaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(egefalikoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thromvosiAgeiwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stenosiAortikisValvidasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aneparkeiaAortikisValvidasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes12)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo12))
                    .addComponent(ageiakesPathiseisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ypotasiLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes13)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo13))
                    .addComponent(ypertasiLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes14)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo14))
                    .addComponent(allesMorfesYpotaseisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diavitisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nososYpatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hpatikiAneparkeiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nefrikiAneparkeiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chronicDiseasesRadioButtonYes17)
                        .addGap(18, 18, 18)
                        .addComponent(chronicDiseasesRadioButtonNo17))
                    .addComponent(mixanimaAimokatharsisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elkosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diataraxesEderouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diataraxesNeurikouSistimatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erpikoEkzemaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipatitidaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leuxaimiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eleipsiSidirouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poliomelitidaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thiroeidismosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(morfiThiroeidiLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allesChroniesAstheneiesLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vactiriakesPneumoniesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pathiseisPneumonwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chronicVroxitidaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes1)
                    .addComponent(chronicDiseasesRadioButtonNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aneurismaPneumonikisArtiriasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diataraxesArtiriwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(allergikoAsthmaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes2)
                    .addComponent(chronicDiseasesRadioButtonNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anapneustikiAneparkeiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes3)
                    .addComponent(chronicDiseasesRadioButtonNo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anapneustirasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes4)
                    .addComponent(chronicDiseasesRadioButtonNo4))
                .addGap(18, 18, 18)
                .addComponent(kardiopatheiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes5)
                    .addComponent(chronicDiseasesRadioButtonNo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aneurismaKardiasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes6)
                    .addComponent(chronicDiseasesRadioButtonNo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kardiakiArythmiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vimatodotisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes7)
                    .addComponent(chronicDiseasesRadioButtonNo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emfragmaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes8)
                    .addComponent(chronicDiseasesRadioButtonNo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(egefalikoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes9)
                    .addComponent(chronicDiseasesRadioButtonNo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thromvosiAgeiwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes10)
                    .addComponent(chronicDiseasesRadioButtonNo10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stenosiAortikisValvidasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes11)
                    .addComponent(chronicDiseasesRadioButtonNo11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aneparkeiaAortikisValvidasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes12)
                    .addComponent(chronicDiseasesRadioButtonNo12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageiakesPathiseisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ypotasiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes13)
                    .addComponent(chronicDiseasesRadioButtonNo13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ypertasiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes14)
                    .addComponent(chronicDiseasesRadioButtonNo14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allesMorfesYpotaseisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diavitisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes15)
                    .addComponent(chronicDiseasesRadioButtonNo15))
                .addGap(18, 18, 18)
                .addComponent(nososYpatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hpatikiAneparkeiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes16)
                    .addComponent(chronicDiseasesRadioButtonNo16))
                .addGap(18, 18, 18)
                .addComponent(nefrikiAneparkeiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes17)
                    .addComponent(chronicDiseasesRadioButtonNo17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mixanimaAimokatharsisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes18)
                    .addComponent(chronicDiseasesRadioButtonNo18))
                .addGap(18, 18, 18)
                .addComponent(elkosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes19)
                    .addComponent(chronicDiseasesRadioButtonNo19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diataraxesEderouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes20)
                    .addComponent(chronicDiseasesRadioButtonNo20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diataraxesNeurikouSistimatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(erpikoEkzemaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes21)
                    .addComponent(chronicDiseasesRadioButtonNo21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ipatitidaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leuxaimiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes22)
                    .addComponent(chronicDiseasesRadioButtonNo22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eleipsiSidirouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes23)
                    .addComponent(chronicDiseasesRadioButtonNo23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poliomelitidaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes24)
                    .addComponent(chronicDiseasesRadioButtonNo24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thiroeidismosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chronicDiseasesRadioButtonYes25)
                    .addComponent(chronicDiseasesRadioButtonNo25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(morfiThiroeidiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allesChroniesAstheneiesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2401, Short.MAX_VALUE)
        );

        if(mode.equals("edit"))
        {
            this.cd = cd;
            loadChronicDiseases(cd);
        }
    }

    public void loadChronicDiseases(ChronicDiseases cd)
    {

            vactiriakesPneumoniesTextArea.setText(cd.getVactiriakesPneumonies());

            pathiseisPneumonwnTextArea.setText(cd.getPathiseisPneumonwn());

            if(cd.getChroniaVroxitida().equals("Yes"))
            chronicDiseasesRadioButtonYes1.setSelected(true);
            else
            chronicDiseasesRadioButtonNo1.setSelected(true);

            aneurismaPneumonikisArtiriasTextArea.setText(cd.getAneurismaPneumonikisArtirias());

            diataraxesArtiriwnTextArea.setText(cd.getDiataraxesArtiriwn());

            if(cd.getAllergikoAsthma().equals("Yes"))
            chronicDiseasesRadioButtonYes2.setSelected(true);
            else
            chronicDiseasesRadioButtonNo2.setSelected(true);

            if(cd.getAnapneustikiAneparkeia().equals("Yes"))
            chronicDiseasesRadioButtonYes3.setSelected(true);
            else
            chronicDiseasesRadioButtonNo3.setSelected(true);

            if(cd.getAnapneustiras().equals("Yes"))
            chronicDiseasesRadioButtonYes4.setSelected(true);
            else
            chronicDiseasesRadioButtonNo4.setSelected(true);

            if(cd.getKardiopatheia().equals("Yes"))
            chronicDiseasesRadioButtonYes5.setSelected(true);
            else
            chronicDiseasesRadioButtonNo5.setSelected(true);

            if(cd.getAneurismaKardias().equals("Yes"))
            chronicDiseasesRadioButtonYes6.setSelected(true);
            else
            chronicDiseasesRadioButtonNo6.setSelected(true);

            kardiakiArythmiaTextArea.setText(cd.getKardiakiArithmia());

            if(cd.getVimatodotis().equals("Yes"))
            chronicDiseasesRadioButtonYes7.setSelected(true);
            else
            chronicDiseasesRadioButtonNo7.setSelected(true);

            if(cd.getEmfragma().equals("Yes"))
            chronicDiseasesRadioButtonYes8.setSelected(true);
            else
            chronicDiseasesRadioButtonNo8.setSelected(true);

            if(cd.getEgefaliko().equals("Yes"))
            chronicDiseasesRadioButtonYes9.setSelected(true);
            else
            chronicDiseasesRadioButtonNo9.setSelected(true);

            if(cd.getThromvosiAgeiwn().equals("Yes"))
            chronicDiseasesRadioButtonYes10.setSelected(true);
            else
            chronicDiseasesRadioButtonNo10.setSelected(true);

            if(cd.getStenosiAortikisValvidas().equals("Yes"))
            chronicDiseasesRadioButtonYes11.setSelected(true);
            else
            chronicDiseasesRadioButtonNo11.setSelected(true);

            if(cd.getAneparkeiaAortikisValvidas().equals("Yes"))
            chronicDiseasesRadioButtonYes12.setSelected(true);
            else
            chronicDiseasesRadioButtonNo12.setSelected(true);

            ageiakesPathiseisTextArea.setText(cd.getAgeiakesPathiseis());

            if(cd.getYpotasi().equals("Yes"))
            chronicDiseasesRadioButtonYes13.setSelected(true);
            else
            chronicDiseasesRadioButtonNo13.setSelected(true);

            if(cd.getYpertasi().equals("Yes"))
            chronicDiseasesRadioButtonYes14.setSelected(true);
            else
            chronicDiseasesRadioButtonNo14.setSelected(true);

            allesMorfesYpotaseisTextArea.setText(cd.getAllesMorfesYpotasis());

            if(cd.getDiavitis().equals("Yes"))
            chronicDiseasesRadioButtonYes15.setSelected(true);
            else
            chronicDiseasesRadioButtonNo15.setSelected(true);

            nososYpatosTextArea.setText(cd.getNososYpatos());

            if(cd.getIpatikiAneparkeia().equals("Yes"))
            chronicDiseasesRadioButtonYes16.setSelected(true);
            else
            chronicDiseasesRadioButtonNo16.setSelected(true);

            if(cd.getNefrikiAneparkeia().equals("Yes"))
            chronicDiseasesRadioButtonYes17.setSelected(true);
            else
            chronicDiseasesRadioButtonNo17.setSelected(true);

            if(cd.getMixanimaAimokatharsis().equals("Yes"))
            chronicDiseasesRadioButtonYes18.setSelected(true);
            else
            chronicDiseasesRadioButtonNo18.setSelected(true);

            if(cd.getElkos().equals("Yes"))
            chronicDiseasesRadioButtonYes19.setSelected(true);
            else
            chronicDiseasesRadioButtonNo19.setSelected(true);

            if(cd.getDiataraxesEderou().equals("Yes"))
            chronicDiseasesRadioButtonYes20.setSelected(true);
            else
            chronicDiseasesRadioButtonNo20.setSelected(true);

            diataraxesNeurikouSistimatosTextArea.setText(cd.getDiataraxesNeurikouSistimatos());

            if(cd.getErpitikoEkzema().equals("Yes"))
            chronicDiseasesRadioButtonYes21.setSelected(true);
            else
            chronicDiseasesRadioButtonNo21.setSelected(true);

            ipatitidaTextArea.setText(cd.getIpatitida());

            if(cd.getLeuxaimia().equals("Yes"))
            chronicDiseasesRadioButtonYes22.setSelected(true);
            else
            chronicDiseasesRadioButtonNo22.setSelected(true);

            if(cd.getEleipsiSidirou().equals("Yes"))
            chronicDiseasesRadioButtonYes23.setSelected(true);
            else
            chronicDiseasesRadioButtonNo23.setSelected(true);

            if(cd.getPoliomuelitida().equals("Yes"))
            chronicDiseasesRadioButtonYes24.setSelected(true);
            else
            chronicDiseasesRadioButtonNo24.setSelected(true);

            if(cd.getThiroeidismos().equals("Yes"))
            chronicDiseasesRadioButtonYes25.setSelected(true);
            else
            chronicDiseasesRadioButtonNo25.setSelected(true);

            morfiThiroeidiTextArea.setText(cd.getMorfiThiroeidi());

            allesChroniesAstheneiesTextArea.setText(cd.getAllesChroniesAstheneies());

    }
    public ChronicDiseases getChronicDiseases ()
    {
        //vactiriakesPneumoniesTextArea.setText(cd.getVactiriakesPneumonies());

        //pathiseisPneumonwnTextArea.setText(cd.getPathiseisPneumonwn());

        String chroniaVroxitida;
        if(chronicDiseasesRadioButtonYes1.isSelected() == true )
        chroniaVroxitida = "Yes";
        else
        chroniaVroxitida = "No";

        //aneurismaPneumonikisArtiriasTextArea.setText(cd.getAneurismaPneumonikisArtirias());

        //diataraxesArtiriwnTextArea.setText(cd.getDiataraxesArtiriwn());

        String allergikoAsthma;
        if(chronicDiseasesRadioButtonYes2.isSelected() == true )
        allergikoAsthma = "Yes";
        else
        allergikoAsthma = "No";

        String anapneustikiAneparkeia;
        if(chronicDiseasesRadioButtonYes3.isSelected() == true )
        anapneustikiAneparkeia = "Yes";
        else
        anapneustikiAneparkeia = "No";

        String anapneustiras;
        if(chronicDiseasesRadioButtonYes4.isSelected() == true )
        anapneustiras = "Yes";
        else
        anapneustiras = "No";

        String kardiopatheia;
        if(chronicDiseasesRadioButtonYes5.isSelected() == true )
        kardiopatheia = "Yes";
        else
        kardiopatheia = "No";

        String aneurismaKardias;
        if(chronicDiseasesRadioButtonYes6.isSelected() == true )
        aneurismaKardias = "Yes";
        else
        aneurismaKardias = "No";

        //kardiakiArythmiaTextArea.setText(cd.getKardiakiArithmia());

        String vimatodotis;
        if(chronicDiseasesRadioButtonYes7.isSelected() == true)
        vimatodotis = "Yes";
        else
        vimatodotis = "No";

        String emfragma;
        if( chronicDiseasesRadioButtonYes8.isSelected() == true)
        emfragma = "Yes";
        else
        emfragma = "No";

        String egefaliko;
        if(chronicDiseasesRadioButtonYes9.isSelected() == true)
        egefaliko = "Yes";
        else
        egefaliko = "No";

        String thromvosiAgeiwn;
        if(chronicDiseasesRadioButtonYes10.isSelected() == true)
        thromvosiAgeiwn = "Yes";
        else
        thromvosiAgeiwn = "No";

        String stenosiAortikisValvidas;
        if(chronicDiseasesRadioButtonYes11.isSelected() == true)
        stenosiAortikisValvidas = "Yes";
        else
        stenosiAortikisValvidas = "No";

        String aneparkeiaAortikisValvidas;
        if(chronicDiseasesRadioButtonYes12.isSelected() == true)
        aneparkeiaAortikisValvidas = "Yes";
        else
        aneparkeiaAortikisValvidas = "No";

        //ageiakesPathiseisTextArea.setText(cd.getAgeiakesPathiseis());

        String ypotasi;
        if(chronicDiseasesRadioButtonYes13.isSelected() == true)
        ypotasi = "Yes";
        else
        ypotasi = "No";

        String ypertasi;
        if(chronicDiseasesRadioButtonYes14.isSelected() == true)
        ypertasi = "Yes";
        else
        ypertasi = "No";

        //allesMorfesYpotaseisTextArea.setText(cd.getAllesMorfesYpotasis());

        String diavitis;
        if(chronicDiseasesRadioButtonYes15.isSelected() == true)
        diavitis = "Yes";
        else
        diavitis = "No";

        //nososYpatosTextArea.setText(cd.getNososYpatos());

        String ipatikiAneparkeia;
        if(chronicDiseasesRadioButtonYes16.isSelected() == true)
        ipatikiAneparkeia = "Yes";
        else
        ipatikiAneparkeia = "No";

        String nefrikiAneparkeia;
        if(chronicDiseasesRadioButtonYes17.isSelected() == true)
        nefrikiAneparkeia = "Yes";
        else
        nefrikiAneparkeia = "No";

        String mixanimaAimokatharsis;
        if(chronicDiseasesRadioButtonYes18.isSelected() == true)
        mixanimaAimokatharsis = "Yes";
        else
        mixanimaAimokatharsis = "No";

        String elkos;
        if(chronicDiseasesRadioButtonYes19.isSelected() == true)
        elkos = "Yes";
        else
        elkos = "No";

        String diataraxesEderou;
        if(chronicDiseasesRadioButtonYes20.isSelected() == true)
        diataraxesEderou = "Yes";
        else
        diataraxesEderou = "No";

        //diataraxesNeurikouSistimatosTextArea.setText(cd.getDiataraxesNeurikouSistimatos());

        String erpitikoEkzema;
        if(chronicDiseasesRadioButtonYes21.isSelected() == true)
        erpitikoEkzema = "Yes";
        else
        erpitikoEkzema = "No";

        //ipatitidaTextArea.setText(cd.getIpatitida());

        String leuxaimia;
        if(chronicDiseasesRadioButtonYes22.isSelected() == true)
        leuxaimia = "Yes";
        else
        leuxaimia = "No";

        String eleipsiSidirou;
        if(chronicDiseasesRadioButtonYes23.isSelected() == true)
        eleipsiSidirou = "Yes";
        else
        eleipsiSidirou = "No";

        String poliomuelitida;
        if(chronicDiseasesRadioButtonYes24.isSelected() == true)
        poliomuelitida = "Yes";
        else
        poliomuelitida = "No";

        String thiroeidismos;
        if(chronicDiseasesRadioButtonYes25.isSelected() == true)
        thiroeidismos = "Yes";
        else
        thiroeidismos = "No";

        //morfiThiroeidiTextArea.setText(cd.getMorfiThiroeidi());

        //allesChroniesAstheneiesTextArea.setText(cd.getAllesChroniesAstheneies());

        return new ChronicDiseases (chroniaVroxitida, vactiriakesPneumoniesTextArea.getText(),
                pathiseisPneumonwnTextArea.getText(),
                aneurismaPneumonikisArtiriasTextArea.getText(),
                diataraxesArtiriwnTextArea.getText(), allergikoAsthma,
                anapneustikiAneparkeia,anapneustiras,kardiopatheia,
                aneurismaKardias, kardiakiArythmiaTextArea.getText(),
                vimatodotis,emfragma,egefaliko,thromvosiAgeiwn,
                stenosiAortikisValvidas,aneparkeiaAortikisValvidas,
                ageiakesPathiseisTextArea.getText(),ypotasi,ypertasi,
                allesMorfesYpotaseisTextArea.getText(), diavitis,
                nososYpatosTextArea.getText(),ipatikiAneparkeia,
                nefrikiAneparkeia,mixanimaAimokatharsis,elkos,
                diataraxesEderou,diataraxesNeurikouSistimatosTextArea.getText(),
                erpitikoEkzema,ipatitidaTextArea.getText(),leuxaimia,eleipsiSidirou,
                poliomuelitida, thiroeidismos, morfiThiroeidiTextArea.getText(),
                allesChroniesAstheneiesTextArea.getText()
                );
    }
}