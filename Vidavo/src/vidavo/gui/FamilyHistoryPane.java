
package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import vidavo.FamilyHistory;

public class FamilyHistoryPane extends JPanel{

    private javax.swing.JPanel familyHistoryMainPane;
    private javax.swing.JScrollPane familyHistoryScrollPane;
    
    private javax.swing.JScrollPane diamartiesTraxeiasVrohouScrollingArea;
    private javax.swing.JScrollPane diaplasiDermatosScrollingArea;
    private javax.swing.JScrollPane diaplasiPeptikouSistimatosScrollingArea;
    private javax.swing.JScrollPane diamartiesEnderouScrollingArea;
    private javax.swing.JScrollPane nefrikiAgenesiaScrollingArea;
    private javax.swing.JScrollPane diaplasiNefrwnScrollingArea;
    private javax.swing.JScrollPane diaplasiOuropoiitikouSistimatosScrollingArea;
    private javax.swing.JScrollPane sigenisThiroeidismosScrollingArea;
    private javax.swing.JScrollPane disanexiaLaktozisScrollingArea;
    private javax.swing.JScrollPane kakoithiNeoplasmataScrollingArea;
    private javax.swing.JScrollPane allesMorfesOikogeneiakouIstorikouScrollingArea;

    private javax.swing.JLabel allesMorfesOikogeneiakouIstorikouLabel;
    private javax.swing.JTextArea allesMorfesOikogeneiakouIstorikouTextArea;
    private javax.swing.JLabel anomaliesNefrikisPyelouLabel;
    private javax.swing.JLabel diamartiesDiaplasisKardiakwnDiafragmatwnLabel;
    private javax.swing.JLabel diamartiesDiaplasisKikloforikouSistimatosLabel;
    private javax.swing.JLabel diamartiesDiaplasisPneumononLabel;
    private javax.swing.JLabel diamartiesEnderouLabel;
    private javax.swing.JTextArea diamartiesEnderouTextArea;
    private javax.swing.JLabel diamartiesKardiasLabel;
    private javax.swing.JLabel diamartiesTraxeiasVrohouLabel;
    private javax.swing.JTextArea diamartiesTraxeiasVrohouTextArea;
    private javax.swing.JLabel diaplasiDermatosLabel;
    private javax.swing.JTextArea diaplasiDermatosTextArea;
    private javax.swing.JLabel diaplasiNefrwnLabel;
    private javax.swing.JTextArea diaplasiNefrwnTextArea;
    private javax.swing.JLabel diaplasiOuritiraLabel;
    private javax.swing.JTextArea diaplasiOuropoiitikouSistimatosTextArea;
    private javax.swing.JLabel diaplasiOuroupoiitikouSistimatosLabel;
    private javax.swing.JLabel diaplasiPeptikouSistimatosLabel;
    private javax.swing.JTextArea diaplasiPeptikouSistimatosTextArea;
    private javax.swing.JLabel diataraxesNefrouOuritiraLabel;
    private javax.swing.JLabel disanexiaLaktozisLabel;
    private javax.swing.JTextArea disanexiaLaktozisTextArea;
    private javax.swing.JLabel egefalikoEpeisodioLabel;
    private javax.swing.JLabel eleipsiLaktasisLabel;
    private javax.swing.JLabel istorikoAsthmatosLabel;
    private javax.swing.JLabel istorikoLeuxemiasLabel;
    private javax.swing.JLabel istorikoSarkomatwnLabel;
    private javax.swing.JLabel kakoithiNeoplasmataLabel;
    private javax.swing.JTextArea kakoithiNeoplasmataTextArea;
    private javax.swing.JLabel kardiakiKoilotitaLabel;
    private javax.swing.JLabel kataxrisiAlkoolLabel;
    private javax.swing.JLabel kistikiNososNefrwnLabel;
    private javax.swing.JLabel klironomikiAnaimiaLabel;
    private javax.swing.JLabel klironomikosDiavitisLabel;
    private javax.swing.JLabel nefrikiAgenesiaLabel;
    private javax.swing.JTextArea nefrikiAgenesiaTextArea;
    private javax.swing.JLabel psixikesDiataraxesLabel;
    private javax.swing.JLabel sigenisThiroeidismosLabel;
    private javax.swing.JTextArea sigenisThiroeidismosTextArea;
    private javax.swing.JLabel stenosiLeptouEnderouLabel;
    private javax.swing.JLabel stenosiPaxeosEnderouLabel;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo1;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo10;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo11;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo12;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo13;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo14;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo15;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo16;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo17;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo18;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo19;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo2;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo20;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo3;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo4;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo5;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo6;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo7;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo8;
    private javax.swing.JRadioButton familyHistoryRadioButtonNo9;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes1;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes10;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes11;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes12;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes13;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes14;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes15;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes16;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes17;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes18;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes19;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes2;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes20;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes3;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes4;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes5;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes6;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes7;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes8;
    private javax.swing.JRadioButton familyHistoryRadioButtonYes9;

    private java.util.ListResourceBundle resourceMap;

    public FamilyHistoryPane(java.util.ListResourceBundle rm){

        this.resourceMap = rm;
        
        familyHistoryScrollPane = new javax.swing.JScrollPane();
        familyHistoryMainPane = new javax.swing.JPanel();
        istorikoLeuxemiasLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo19 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes19 = new javax.swing.JRadioButton();
        diaplasiPeptikouSistimatosLabel = new javax.swing.JLabel();
        diaplasiPeptikouSistimatosTextArea = new javax.swing.JTextArea();
        familyHistoryRadioButtonNo9 = new javax.swing.JRadioButton();
        diamartiesEnderouTextArea = new javax.swing.JTextArea();
        kistikiNososNefrwnLabel = new javax.swing.JLabel();
        nefrikiAgenesiaLabel = new javax.swing.JLabel();
        nefrikiAgenesiaTextArea = new javax.swing.JTextArea();
        familyHistoryRadioButtonYes11 = new javax.swing.JRadioButton();
        anomaliesNefrikisPyelouLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo10 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes10 = new javax.swing.JRadioButton();
        allesMorfesOikogeneiakouIstorikouLabel = new javax.swing.JLabel();
        allesMorfesOikogeneiakouIstorikouTextArea = new javax.swing.JTextArea();
        familyHistoryRadioButtonYes20 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo20 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo16 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes16 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes17 = new javax.swing.JRadioButton();
        istorikoSarkomatwnLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo7 = new javax.swing.JRadioButton();
        diamartiesTraxeiasVrohouLabel = new javax.swing.JLabel();
        diaplasiDermatosLabel = new javax.swing.JLabel();
        stenosiLeptouEnderouLabel = new javax.swing.JLabel();
        stenosiPaxeosEnderouLabel = new javax.swing.JLabel();
        diamartiesEnderouLabel = new javax.swing.JLabel();
        diamartiesTraxeiasVrohouTextArea = new javax.swing.JTextArea();
        diaplasiDermatosTextArea = new javax.swing.JTextArea();
        familyHistoryRadioButtonYes1 = new javax.swing.JRadioButton();
        egefalikoEpeisodioLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes8 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo2 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes2 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes9 = new javax.swing.JRadioButton();
        diamartiesDiaplasisPneumononLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo8 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo1 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo17 = new javax.swing.JRadioButton();
        kakoithiNeoplasmataLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes3 = new javax.swing.JRadioButton();
        kakoithiNeoplasmataTextArea = new javax.swing.JTextArea();
        diamartiesDiaplasisKikloforikouSistimatosLabel = new javax.swing.JLabel();
        kataxrisiAlkoolLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes18 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo18 = new javax.swing.JRadioButton();
        klironomikosDiavitisLabel = new javax.swing.JLabel();
        sigenisThiroeidismosTextArea = new javax.swing.JTextArea();
        sigenisThiroeidismosLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo14 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes14 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo6 = new javax.swing.JRadioButton();
        klironomikiAnaimiaLabel = new javax.swing.JLabel();
        istorikoAsthmatosLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes6 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes5 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo5 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo4 = new javax.swing.JRadioButton();
        kardiakiKoilotitaLabel = new javax.swing.JLabel();
        diamartiesDiaplasisKardiakwnDiafragmatwnLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes4 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes7 = new javax.swing.JRadioButton();
        diamartiesKardiasLabel = new javax.swing.JLabel();
        disanexiaLaktozisTextArea = new javax.swing.JTextArea();
        psixikesDiataraxesLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo15 = new javax.swing.JRadioButton();
        disanexiaLaktozisLabel = new javax.swing.JLabel();
        eleipsiLaktasisLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes15 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo12 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes12 = new javax.swing.JRadioButton();
        diaplasiNefrwnLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo11 = new javax.swing.JRadioButton();
        diataraxesNefrouOuritiraLabel = new javax.swing.JLabel();
        diaplasiNefrwnTextArea = new javax.swing.JTextArea();
        familyHistoryRadioButtonNo3 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes13 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo13 = new javax.swing.JRadioButton();
        diaplasiOuroupoiitikouSistimatosLabel = new javax.swing.JLabel();
        diaplasiOuropoiitikouSistimatosTextArea = new javax.swing.JTextArea();
        diaplasiOuritiraLabel = new javax.swing.JLabel();

        ButtonGroup YesNoGroup1 =  new ButtonGroup();
        YesNoGroup1.add(familyHistoryRadioButtonYes1);
        YesNoGroup1.add(familyHistoryRadioButtonNo1);

        ButtonGroup YesNoGroup2 =  new ButtonGroup();
        YesNoGroup2.add(familyHistoryRadioButtonYes2);
        YesNoGroup2.add(familyHistoryRadioButtonNo2);

        ButtonGroup YesNoGroup3 =  new ButtonGroup();
        YesNoGroup3.add(familyHistoryRadioButtonYes3);
        YesNoGroup3.add(familyHistoryRadioButtonNo3);

        ButtonGroup YesNoGroup4 =  new ButtonGroup();
        YesNoGroup4.add(familyHistoryRadioButtonYes4);
        YesNoGroup4.add(familyHistoryRadioButtonNo4);

        ButtonGroup YesNoGroup5 =  new ButtonGroup();
        YesNoGroup5.add(familyHistoryRadioButtonYes5);
        YesNoGroup5.add(familyHistoryRadioButtonNo5);

        ButtonGroup YesNoGroup6 =  new ButtonGroup();
        YesNoGroup6.add(familyHistoryRadioButtonYes6);
        YesNoGroup6.add(familyHistoryRadioButtonNo6);

        ButtonGroup YesNoGroup7 =  new ButtonGroup();
        YesNoGroup7.add(familyHistoryRadioButtonYes7);
        YesNoGroup7.add(familyHistoryRadioButtonNo7);

        ButtonGroup YesNoGroup8 =  new ButtonGroup();
        YesNoGroup8.add(familyHistoryRadioButtonYes8);
        YesNoGroup8.add(familyHistoryRadioButtonNo8);

        ButtonGroup YesNoGroup9 =  new ButtonGroup();
        YesNoGroup9.add(familyHistoryRadioButtonYes9);
        YesNoGroup9.add(familyHistoryRadioButtonNo9);

        ButtonGroup YesNoGroup10 =  new ButtonGroup();
        YesNoGroup10.add(familyHistoryRadioButtonYes10);
        YesNoGroup10.add(familyHistoryRadioButtonNo10);

        ButtonGroup YesNoGroup11 =  new ButtonGroup();
        YesNoGroup11.add(familyHistoryRadioButtonYes11);
        YesNoGroup11.add(familyHistoryRadioButtonNo11);

        ButtonGroup YesNoGroup12 =  new ButtonGroup();
        YesNoGroup12.add(familyHistoryRadioButtonYes12);
        YesNoGroup12.add(familyHistoryRadioButtonNo12);

        ButtonGroup YesNoGroup13 =  new ButtonGroup();
        YesNoGroup13.add(familyHistoryRadioButtonYes13);
        YesNoGroup13.add(familyHistoryRadioButtonNo13);

        ButtonGroup YesNoGroup14 =  new ButtonGroup();
        YesNoGroup14.add(familyHistoryRadioButtonYes14);
        YesNoGroup14.add(familyHistoryRadioButtonNo14);

        ButtonGroup YesNoGroup15 =  new ButtonGroup();
        YesNoGroup15.add(familyHistoryRadioButtonYes15);
        YesNoGroup15.add(familyHistoryRadioButtonNo15);

        ButtonGroup YesNoGroup16 =  new ButtonGroup();
        YesNoGroup16.add(familyHistoryRadioButtonYes16);
        YesNoGroup16.add(familyHistoryRadioButtonNo16);

        ButtonGroup YesNoGroup17 =  new ButtonGroup();
        YesNoGroup17.add(familyHistoryRadioButtonYes17);
        YesNoGroup17.add(familyHistoryRadioButtonNo17);

        ButtonGroup YesNoGroup18 =  new ButtonGroup();
        YesNoGroup18.add(familyHistoryRadioButtonYes18);
        YesNoGroup18.add(familyHistoryRadioButtonNo18);

        ButtonGroup YesNoGroup19 =  new ButtonGroup();
        YesNoGroup19.add(familyHistoryRadioButtonYes19);
        YesNoGroup19.add(familyHistoryRadioButtonNo19);

        diamartiesTraxeiasVrohouScrollingArea = new JScrollPane(diamartiesTraxeiasVrohouTextArea);
        diaplasiDermatosScrollingArea = new JScrollPane(diaplasiDermatosTextArea);
        diaplasiPeptikouSistimatosScrollingArea = new JScrollPane(diaplasiPeptikouSistimatosTextArea);
        diamartiesEnderouScrollingArea = new JScrollPane(diamartiesEnderouTextArea);
        nefrikiAgenesiaScrollingArea = new JScrollPane(nefrikiAgenesiaTextArea);
        diaplasiNefrwnScrollingArea = new JScrollPane(diaplasiNefrwnTextArea);
        diaplasiOuropoiitikouSistimatosScrollingArea = new JScrollPane(diaplasiOuropoiitikouSistimatosTextArea);
        sigenisThiroeidismosScrollingArea = new JScrollPane(sigenisThiroeidismosTextArea);
        disanexiaLaktozisScrollingArea = new JScrollPane(disanexiaLaktozisTextArea);
        kakoithiNeoplasmataScrollingArea = new JScrollPane(kakoithiNeoplasmataTextArea);
        allesMorfesOikogeneiakouIstorikouScrollingArea = new JScrollPane(allesMorfesOikogeneiakouIstorikouTextArea);

        istorikoLeuxemiasLabel.setText(resourceMap.getString("istorikoLeuxemias.text"));
        familyHistoryRadioButtonNo19.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes19.setText(resourceMap.getString("yesRadioButton.text"));
        diaplasiPeptikouSistimatosLabel.setText(resourceMap.getString("diaplasiPeptikouSistimatos.text"));
        familyHistoryRadioButtonNo9.setText(resourceMap.getString("noRadioButton.text"));
        kistikiNososNefrwnLabel.setText(resourceMap.getString("kistikiNososNefrwn.text"));
        nefrikiAgenesiaLabel.setText(resourceMap.getString("nefrikiAgenesia.text"));
        familyHistoryRadioButtonYes11.setText(resourceMap.getString("yesRadioButton.text"));
        anomaliesNefrikisPyelouLabel.setText(resourceMap.getString("anomaliesNefrikisPyelou.text"));
        familyHistoryRadioButtonNo10.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes10.setText(resourceMap.getString("yesRadioButton.text"));
        allesMorfesOikogeneiakouIstorikouLabel.setText(resourceMap.getString("allesMorfesOikogeneiakouIstorikou.text"));
        familyHistoryRadioButtonYes20.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo20.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonNo16.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes16.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonYes17.setText(resourceMap.getString("yesRadioButton.text"));
        istorikoSarkomatwnLabel.setText(resourceMap.getString("istorikoSarkomatwn.text"));
        familyHistoryRadioButtonNo7.setText(resourceMap.getString("noRadioButton.text"));
        diamartiesTraxeiasVrohouLabel.setText(resourceMap.getString("diamartiesTraxeiasVrohou.text"));
        diaplasiDermatosLabel.setText(resourceMap.getString("diaplasiDermatos.text"));
        stenosiLeptouEnderouLabel.setText(resourceMap.getString("stenosiLeptouEnderou.text"));
        stenosiPaxeosEnderouLabel.setText(resourceMap.getString("stenosiPaxeosEnderou.text"));
        diamartiesEnderouLabel.setText(resourceMap.getString("diamartiesEnderou.text"));
        familyHistoryRadioButtonYes1.setText(resourceMap.getString("yesRadioButton.text"));
        egefalikoEpeisodioLabel.setText(resourceMap.getString("egefalikoEpeisodio.text"));
        familyHistoryRadioButtonYes8.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo2.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes2.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonYes9.setText(resourceMap.getString("yesRadioButton.text"));
        diamartiesDiaplasisPneumononLabel.setText(resourceMap.getString("diamartiesDiaplasisPneumonon.text"));
        familyHistoryRadioButtonNo8.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonNo1.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonNo17.setText(resourceMap.getString("noRadioButton.text"));
        kakoithiNeoplasmataLabel.setText(resourceMap.getString("kakoithiNeoplasmata.text"));
        familyHistoryRadioButtonYes3.setText(resourceMap.getString("yesRadioButton.text"));
        diamartiesDiaplasisKikloforikouSistimatosLabel.setText(resourceMap.getString("diamartiesDiaplasisKikloforikouSistimatos.text"));
        kataxrisiAlkoolLabel.setText(resourceMap.getString("kataxrisiAlkool.text"));
        familyHistoryRadioButtonYes18.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo18.setText(resourceMap.getString("noRadioButton.text"));
        klironomikosDiavitisLabel.setText(resourceMap.getString("klironomikosDiavitis.text"));
        sigenisThiroeidismosLabel.setText(resourceMap.getString("sigenisThiroeidismos.text"));
        familyHistoryRadioButtonNo14.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes14.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo6.setText(resourceMap.getString("noRadioButton.text"));
        klironomikiAnaimiaLabel.setText(resourceMap.getString("klironomikiAnaimia.text"));
        istorikoAsthmatosLabel.setText(resourceMap.getString("istorikoAsthmatos.text"));
        familyHistoryRadioButtonYes6.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonYes5.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo5.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonNo4.setText(resourceMap.getString("noRadioButton.text"));
        kardiakiKoilotitaLabel.setText(resourceMap.getString("kardiakiKoilotita.text"));
        diamartiesDiaplasisKardiakwnDiafragmatwnLabel.setText(resourceMap.getString("diamartiesDiaplasisKardiakwnDiafragmatwn.text"));
        familyHistoryRadioButtonYes4.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonYes7.setText(resourceMap.getString("yesRadioButton.text"));
        diamartiesKardiasLabel.setText(resourceMap.getString("diamartiesKardias.text"));
        psixikesDiataraxesLabel.setText(resourceMap.getString("psixikesDiataraxes.text"));
        familyHistoryRadioButtonNo15.setText(resourceMap.getString("noRadioButton.text"));
        disanexiaLaktozisLabel.setText(resourceMap.getString("disanexiaLaktozis.text"));
        eleipsiLaktasisLabel.setText(resourceMap.getString("eleipsiLaktasis.text"));
        familyHistoryRadioButtonYes15.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo12.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes12.setText(resourceMap.getString("yesRadioButton.text"));
        diaplasiNefrwnLabel.setText(resourceMap.getString("diaplasiNefrwn.text"));
        familyHistoryRadioButtonNo11.setText(resourceMap.getString("noRadioButton.text"));
        diataraxesNefrouOuritiraLabel.setText(resourceMap.getString("diataraxesNefrouOuritira.text"));
        familyHistoryRadioButtonNo3.setText(resourceMap.getString("noRadioButton.text"));
        familyHistoryRadioButtonYes13.setText(resourceMap.getString("yesRadioButton.text"));
        familyHistoryRadioButtonNo13.setText(resourceMap.getString("noRadioButton.text"));
        diaplasiOuroupoiitikouSistimatosLabel.setText(resourceMap.getString("diaplasiOuroupoiitikouSistimatos.text"));
        diaplasiOuritiraLabel.setText(resourceMap.getString("diaplasiOuritira.text"));

        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(familyHistoryMainPane);
        familyHistoryMainPane.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(allesMorfesOikogeneiakouIstorikouScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(kakoithiNeoplasmataScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(disanexiaLaktozisScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(sigenisThiroeidismosScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(diaplasiOuropoiitikouSistimatosScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(diaplasiNefrwnScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(nefrikiAgenesiaScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(diaplasiPeptikouSistimatosScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(diamartiesEnderouScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(allesMorfesOikogeneiakouIstorikouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes18)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes17)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo17))
                    .addComponent(diamartiesEnderouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaplasiPeptikouSistimatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nefrikiAgenesiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kistikiNososNefrwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes10)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo10))
                    .addComponent(anomaliesNefrikisPyelouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes11)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo11))
                    .addComponent(diaplasiNefrwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diataraxesNefrouOuritiraLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes12)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo12))
                    .addComponent(diaplasiOuritiraLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes13)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo13))
                    .addComponent(diaplasiOuroupoiitikouSistimatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klironomikiAnaimiaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes14)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo14))
                    .addComponent(sigenisThiroeidismosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes20)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo20))
                    .addComponent(eleipsiLaktasisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes15)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo15))
                    .addComponent(disanexiaLaktozisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(psixikesDiataraxesLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes16)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo16))
                    .addComponent(istorikoSarkomatwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kakoithiNeoplasmataLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes3)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes6)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo6))
                    .addComponent(egefalikoEpeisodioLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes1)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo1))
                    .addComponent(diamartiesDiaplasisPneumononLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes2)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo2))
                    .addComponent(diamartiesDiaplasisKikloforikouSistimatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diamartiesDiaplasisKardiakwnDiafragmatwnLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes4)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo4))
                    .addComponent(kardiakiKoilotitaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes5)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo5))
                    .addComponent(istorikoAsthmatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes9)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo9))
                    .addComponent(diamartiesKardiasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes7)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo7))
                    .addComponent(diamartiesTraxeiasVrohouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaplasiDermatosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stenosiLeptouEnderouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes8)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo8))
                    .addComponent(stenosiPaxeosEnderouLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kataxrisiAlkoolLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klironomikosDiavitisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(familyHistoryRadioButtonYes19)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo19))
                    .addComponent(istorikoLeuxemiasLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaplasiDermatosScrollingArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(diamartiesTraxeiasVrohouScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(egefalikoEpeisodioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes1)
                    .addComponent(familyHistoryRadioButtonNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesDiaplasisPneumononLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes2)
                    .addComponent(familyHistoryRadioButtonNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesDiaplasisKikloforikouSistimatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes3)
                    .addComponent(familyHistoryRadioButtonNo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesDiaplasisKardiakwnDiafragmatwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes4)
                    .addComponent(familyHistoryRadioButtonNo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kardiakiKoilotitaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes5)
                    .addComponent(familyHistoryRadioButtonNo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(istorikoAsthmatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes6)
                    .addComponent(familyHistoryRadioButtonNo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesKardiasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes7)
                    .addComponent(familyHistoryRadioButtonNo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesTraxeiasVrohouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamartiesTraxeiasVrohouScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaplasiDermatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaplasiDermatosScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stenosiLeptouEnderouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes8)
                    .addComponent(familyHistoryRadioButtonNo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stenosiPaxeosEnderouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes9)
                    .addComponent(familyHistoryRadioButtonNo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diamartiesEnderouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamartiesEnderouScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaplasiPeptikouSistimatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaplasiPeptikouSistimatosScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nefrikiAgenesiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nefrikiAgenesiaScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kistikiNososNefrwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes10)
                    .addComponent(familyHistoryRadioButtonNo10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anomaliesNefrikisPyelouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes11)
                    .addComponent(familyHistoryRadioButtonNo11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaplasiNefrwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaplasiNefrwnScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diataraxesNefrouOuritiraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes12)
                    .addComponent(familyHistoryRadioButtonNo12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaplasiOuritiraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes13)
                    .addComponent(familyHistoryRadioButtonNo13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaplasiOuroupoiitikouSistimatosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaplasiOuropoiitikouSistimatosScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(klironomikiAnaimiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes14)
                    .addComponent(familyHistoryRadioButtonNo14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sigenisThiroeidismosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sigenisThiroeidismosScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eleipsiLaktasisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes15)
                    .addComponent(familyHistoryRadioButtonNo15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disanexiaLaktozisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disanexiaLaktozisScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(psixikesDiataraxesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes16)
                    .addComponent(familyHistoryRadioButtonNo16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(istorikoSarkomatwnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes17)
                    .addComponent(familyHistoryRadioButtonNo17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kakoithiNeoplasmataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kakoithiNeoplasmataScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kataxrisiAlkoolLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes18)
                    .addComponent(familyHistoryRadioButtonNo18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(klironomikosDiavitisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes19)
                    .addComponent(familyHistoryRadioButtonNo19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(istorikoLeuxemiasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyHistoryRadioButtonYes20)
                    .addComponent(familyHistoryRadioButtonNo20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allesMorfesOikogeneiakouIstorikouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allesMorfesOikogeneiakouIstorikouScrollingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        familyHistoryScrollPane.setViewportView(familyHistoryMainPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(familyHistoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(familyHistoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
    }

    public FamilyHistory getSurgeryHistoryInformation(){
        return new FamilyHistory();
    }
}