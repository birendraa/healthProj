
package vidavo.gui;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.util.ListResourceBundle;

public class FamilyHistoryPane extends JPanel{

    private javax.swing.JPanel familyHistoryMainPane;
    private javax.swing.JScrollPane familyHistoryScrollPane;

    private javax.swing.JLabel allesMorfesOikogeneiakouIstorikouLabel;
    private javax.swing.JTextField allesMorfesOikogeniakouIstorikouTextField;
    private javax.swing.JLabel anomaliesNefrikisPyelouLabel;
    private javax.swing.JLabel diamartiesDiaplasisKardiakwnDiafragmatwnLabel;
    private javax.swing.JLabel diamartiesDiaplasisKikloforikouSistimatosLabel;
    private javax.swing.JLabel diamartiesDiaplasisPneumononLabel;
    private javax.swing.JLabel diamartiesEnderouLabel;
    private javax.swing.JTextField diamartiesEnderouTextField;
    private javax.swing.JLabel diamartiesKardiasLabel;
    private javax.swing.JLabel diamartiesTraxeiasVrohouLabel;
    private javax.swing.JTextField diamartiesTraxeiasVrohouTextField;
    private javax.swing.JLabel diaplasiDermatosLabel;
    private javax.swing.JTextField diaplasiDermatosTextField;
    private javax.swing.JLabel diaplasiNefrwnLabel;
    private javax.swing.JTextField diaplasiNefrwnTextField;
    private javax.swing.JLabel diaplasiOuritiraLabel;
    private javax.swing.JTextField diaplasiOuropoiitikouSistimatosTextField;
    private javax.swing.JLabel diaplasiOuroupoiitikouSistimatosLabel;
    private javax.swing.JLabel diaplasiPeptikouSistimatosLabel;
    private javax.swing.JTextField diaplasiPeptikouSistimatosTextField;
    private javax.swing.JLabel diataraxesNefrouOuritiraLabel;
    private javax.swing.JLabel disanexiaLaktozisLabel;
    private javax.swing.JTextField disanexiaLaktozisTextField;
    private javax.swing.JLabel egefalikoEpeisodioLabel;
    private javax.swing.JLabel eleipsiLaktasisLabel;
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
    private javax.swing.JLabel istorikoAsthmatosLabel;
    private javax.swing.JLabel istorikoLeuxemiasLabel;
    private javax.swing.JLabel istorikoSarkomatwnLabel;
    private javax.swing.JLabel kakoithiNeoplasmataLabel;
    private javax.swing.JTextField kakoithiNeoplasmataTextField;
    private javax.swing.JLabel kardiakiKoilotitaLabel;
    private javax.swing.JLabel kataxrisiAlkoolLabel;
    private javax.swing.JLabel kistikiNososNefrwnLabel;
    private javax.swing.JLabel klironomikiAnaimiaLabel;
    private javax.swing.JLabel klironomikosDiavitisLabel;
    private javax.swing.JLabel nefrikiAgenesiaLabel;
    private javax.swing.JTextField nefrikiAgenesiaTextField;
    private javax.swing.JLabel psixikesDiataraxesLabel;
    private javax.swing.JLabel sigenisThiroeidismosLabel;
    private javax.swing.JTextField sigenisThiroeidismosTextField;
    private javax.swing.JLabel stenosiLeptouEnderouLabel;
    private javax.swing.JLabel stenosiPaxeosEnderouLabel;

    public FamilyHistoryPane(){
        ListResourceBundle resourceMap = (ListResourceBundle) java.util.ResourceBundle.getBundle("vidavo.resource.ResourceMap", new java.util.Locale("gr"));

        familyHistoryScrollPane = new javax.swing.JScrollPane();
        familyHistoryMainPane = new javax.swing.JPanel();
        istorikoLeuxemiasLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo19 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes19 = new javax.swing.JRadioButton();
        diaplasiPeptikouSistimatosLabel = new javax.swing.JLabel();
        diaplasiPeptikouSistimatosTextField = new javax.swing.JTextField();
        familyHistoryRadioButtonNo9 = new javax.swing.JRadioButton();
        diamartiesEnderouTextField = new javax.swing.JTextField();
        kistikiNososNefrwnLabel = new javax.swing.JLabel();
        nefrikiAgenesiaLabel = new javax.swing.JLabel();
        nefrikiAgenesiaTextField = new javax.swing.JTextField();
        familyHistoryRadioButtonYes11 = new javax.swing.JRadioButton();
        anomaliesNefrikisPyelouLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonNo10 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes10 = new javax.swing.JRadioButton();
        allesMorfesOikogeneiakouIstorikouLabel = new javax.swing.JLabel();
        allesMorfesOikogeniakouIstorikouTextField = new javax.swing.JTextField();
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
        diamartiesTraxeiasVrohouTextField = new javax.swing.JTextField();
        diaplasiDermatosTextField = new javax.swing.JTextField();
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
        kakoithiNeoplasmataTextField = new javax.swing.JTextField();
        diamartiesDiaplasisKikloforikouSistimatosLabel = new javax.swing.JLabel();
        kataxrisiAlkoolLabel = new javax.swing.JLabel();
        familyHistoryRadioButtonYes18 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo18 = new javax.swing.JRadioButton();
        klironomikosDiavitisLabel = new javax.swing.JLabel();
        sigenisThiroeidismosTextField = new javax.swing.JTextField();
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
        disanexiaLaktozisTextField = new javax.swing.JTextField();
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
        diaplasiNefrwnTextField = new javax.swing.JTextField();
        familyHistoryRadioButtonNo3 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonYes13 = new javax.swing.JRadioButton();
        familyHistoryRadioButtonNo13 = new javax.swing.JRadioButton();
        diaplasiOuroupoiitikouSistimatosLabel = new javax.swing.JLabel();
        diaplasiOuropoiitikouSistimatosTextField = new javax.swing.JTextField();
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(egefalikoEpeisodioLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes1)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesKardiasLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes7)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesTraxeiasVrohouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diamartiesTraxeiasVrohouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diaplasiDermatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diaplasiDermatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stenosiLeptouEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes8)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stenosiPaxeosEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes9)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesEnderouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diamartiesEnderouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diaplasiPeptikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diaplasiPeptikouSistimatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nefrikiAgenesiaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nefrikiAgenesiaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kistikiNososNefrwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes10)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anomaliesNefrikisPyelouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes11)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diaplasiNefrwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diaplasiNefrwnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diataraxesNefrouOuritiraLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes12)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diaplasiOuritiraLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes13)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diaplasiOuroupoiitikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(diaplasiOuropoiitikouSistimatosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(klironomikiAnaimiaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes14)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sigenisThiroeidismosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(sigenisThiroeidismosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eleipsiLaktasisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes15)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disanexiaLaktozisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(disanexiaLaktozisTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(psixikesDiataraxesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes16)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(istorikoSarkomatwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes17)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kakoithiNeoplasmataLabel)
                        .addGap(18, 18, 18)
                        .addComponent(kakoithiNeoplasmataTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kataxrisiAlkoolLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes18)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(klironomikosDiavitisLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes19)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(istorikoLeuxemiasLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes20)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(allesMorfesOikogeneiakouIstorikouLabel)
                        .addGap(18, 18, 18)
                        .addComponent(allesMorfesOikogeniakouIstorikouTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesDiaplasisPneumononLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes2)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesDiaplasisKikloforikouSistimatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes3)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diamartiesDiaplasisKardiakwnDiafragmatwnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes4)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kardiakiKoilotitaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes5)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(istorikoAsthmatosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonYes6)
                        .addGap(18, 18, 18)
                        .addComponent(familyHistoryRadioButtonNo6)))
                .addGap(5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(egefalikoEpeisodioLabel)
                    .addComponent(familyHistoryRadioButtonYes1)
                    .addComponent(familyHistoryRadioButtonNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesDiaplasisPneumononLabel)
                    .addComponent(familyHistoryRadioButtonYes2)
                    .addComponent(familyHistoryRadioButtonNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesDiaplasisKikloforikouSistimatosLabel)
                    .addComponent(familyHistoryRadioButtonYes3)
                    .addComponent(familyHistoryRadioButtonNo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesDiaplasisKardiakwnDiafragmatwnLabel)
                    .addComponent(familyHistoryRadioButtonYes4)
                    .addComponent(familyHistoryRadioButtonNo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kardiakiKoilotitaLabel)
                    .addComponent(familyHistoryRadioButtonYes5)
                    .addComponent(familyHistoryRadioButtonNo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(istorikoAsthmatosLabel)
                    .addComponent(familyHistoryRadioButtonYes6)
                    .addComponent(familyHistoryRadioButtonNo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesKardiasLabel)
                    .addComponent(familyHistoryRadioButtonYes7)
                    .addComponent(familyHistoryRadioButtonNo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesTraxeiasVrohouLabel)
                    .addComponent(diamartiesTraxeiasVrohouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaplasiDermatosLabel)
                    .addComponent(diaplasiDermatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stenosiLeptouEnderouLabel)
                    .addComponent(familyHistoryRadioButtonYes8)
                    .addComponent(familyHistoryRadioButtonNo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stenosiPaxeosEnderouLabel)
                    .addComponent(familyHistoryRadioButtonYes9)
                    .addComponent(familyHistoryRadioButtonNo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamartiesEnderouLabel)
                    .addComponent(diamartiesEnderouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaplasiPeptikouSistimatosLabel)
                    .addComponent(diaplasiPeptikouSistimatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nefrikiAgenesiaLabel)
                    .addComponent(nefrikiAgenesiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kistikiNososNefrwnLabel)
                    .addComponent(familyHistoryRadioButtonYes10)
                    .addComponent(familyHistoryRadioButtonNo10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anomaliesNefrikisPyelouLabel)
                    .addComponent(familyHistoryRadioButtonYes11)
                    .addComponent(familyHistoryRadioButtonNo11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaplasiNefrwnLabel)
                    .addComponent(diaplasiNefrwnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diataraxesNefrouOuritiraLabel)
                    .addComponent(familyHistoryRadioButtonYes12)
                    .addComponent(familyHistoryRadioButtonNo12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaplasiOuritiraLabel)
                    .addComponent(familyHistoryRadioButtonYes13)
                    .addComponent(familyHistoryRadioButtonNo13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaplasiOuroupoiitikouSistimatosLabel)
                    .addComponent(diaplasiOuropoiitikouSistimatosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klironomikiAnaimiaLabel)
                    .addComponent(familyHistoryRadioButtonYes14)
                    .addComponent(familyHistoryRadioButtonNo14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigenisThiroeidismosLabel)
                    .addComponent(sigenisThiroeidismosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eleipsiLaktasisLabel)
                    .addComponent(familyHistoryRadioButtonYes15)
                    .addComponent(familyHistoryRadioButtonNo15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disanexiaLaktozisLabel)
                    .addComponent(disanexiaLaktozisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psixikesDiataraxesLabel)
                    .addComponent(familyHistoryRadioButtonYes16)
                    .addComponent(familyHistoryRadioButtonNo16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(istorikoSarkomatwnLabel)
                    .addComponent(familyHistoryRadioButtonYes17)
                    .addComponent(familyHistoryRadioButtonNo17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kakoithiNeoplasmataLabel)
                    .addComponent(kakoithiNeoplasmataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kataxrisiAlkoolLabel)
                    .addComponent(familyHistoryRadioButtonYes18)
                    .addComponent(familyHistoryRadioButtonNo18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klironomikosDiavitisLabel)
                    .addComponent(familyHistoryRadioButtonYes19)
                    .addComponent(familyHistoryRadioButtonNo19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(istorikoLeuxemiasLabel)
                    .addComponent(familyHistoryRadioButtonYes20)
                    .addComponent(familyHistoryRadioButtonNo20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allesMorfesOikogeneiakouIstorikouLabel)
                    .addComponent(allesMorfesOikogeniakouIstorikouTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
}