/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.resource;

/**
 *
 * @author Serban
 */
public class ResourceMap_en extends java.util.ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object [][] {

                //Radio Buttons
                {"yesRadioButton.text", "Yes"},
                {"noRadioButton.text", "No"},

                //Save/Cancel Buttons
                {"cancelButton.text", "Cancel"},
                {"saveButton.text", "Save"},

                //Personal Info Window
                {"idLabel.text", "ID*"},
                {"firstNLabel.text", "Όνομα*"},
                {"middleNLabel.text", "Μεσαίο Όνομα"},
                {"lastNLabel.text", "Επίθετο*"},
                {"addressLabel.text", "Διεύθυνση"},
                {"addressNumLabel.text", "Αριθμός Διεύθυνσης"},
                {"cityLabel.text", "Πόλη"},
                {"regionLabel.text", "Περιοχή"},
                {"countryLabel.text", "Χώρα"},
                {"postalCLabel.text", "Ταχυδρομικός Κώδικας"},
                {"citizenshipLabel.text", "Υπηκοότητα"},
                {"heightLabel.text", "Ύψος (cm)"},
                {"weightLabel.text", "Βάρος (kg)"},
                {"maleRadioButton.text", "Άρρεν"},
                {"femaleRadioButton.text", "Θήλυ"},
                {"marriedRadioButton.text", "Έγγαμος"},
                {"singleRadioButton.text", "Άγαμος"},
                {"birthDateLabel.text", "Ημ/νια Γέννησης"},
                {"profLabel.text", "Επάγγελμα"},
                {"insuranceLabel.text", "Ασφάλιση"},
                {"amkaLabel.text", "Α.Μ.Κ.Α"},
                {"tameioLabel.text", "Ασφ/κο Ταμείο"},
                {"firstVisitLabel.text", "Πρώτη Επίσκεψη"},
                {"childrenLabel.text", "Αρθ/μος Παιδιών"},
                {"ageLabel.text", "Ηλικία"},
                {"patientPhotoLabel.text", "Φωτο/φία Ασθενή"},
                {"pictureButton.text", "Λήψη Φωτο/φίας"},
                {"communicationNumPane.title", "Τηλέφωνα Επικοινωνίας"},
                {"homeLabel.text", "Τηλ. Οικίας"},
                {"workLabel.text", "Τηλ. Εργασίας"},
                {"cellLabel.text", "Κινητό Τηλ."},

                //PatientList Window
                {"patientList.title", "Patient List"},
                {"addButton.text", "Add..."},
                {"deleteButton.text", "Delete"},
                {"editButton.text", "Edit..."},
                {"searchButton.text", "Search"},
                {"searchTextField.text", "Search by last name..."},
                {"patientNameLabel.text", "John Smith"},
                {"patientLabel.text", "Patient Name: "},
                {"patientTable.columnModel.title3", "Telephone"},
                {"patientTable.columnModel.title2", "First Name"},
                {"patientTable.columnModel.title1", "Last Name"},
                {"patientTable.columnModel.title0", "Patient ID"},

                //Menu
                {"fileMenu.text", "File Menu"},
                {"quitMenuItem.text", "Quit"},
                {"helpMenu.text", "Help Menu"},
                {"aboutMenuItem.text", "About"},

                //Family History Window
                {"egefalikoEpeisodio.text", "Egefaliko Epeisodio :"},
                {"diamartiesDiaplasisPneumonon.text", "Diamarties Diaplasis Pneumonon :"},
                {"diamartiesDiaplasisKikloforikouSistimatos.text", "Diamarties Diaplasis Kikloforikou Sistimatos :"},
                {"diamartiesDiaplasisKardiakwnDiafragmatwn.text", "Diamarties Diaplasis Kardiakwn Diafragmatwn :"},
                {"kardiakiKoilotita.text", "Kardiaki Koilotita :"},
                {"istorikoAsthmatos.text", "Istoriko Asthmatos :"},
                {"diamartiesKardias.text", "Diamarties Kardias :"},
                {"diamartiesTraxeiasVrohou.text", "Diamarties Traxeias Vrohou :"},
                {"diaplasiDermatos.text", "Diaplasi Dermatos :"},
                {"stenosiLeptouEnderou.text", "Stenosi Leptou Enderou :"},
                {"stenosiPaxeosEnderou.text", "Stenosi Paxeos Enderou :"},
                {"diamartiesEnderou.text", "Diamarties Enderou :"},
                {"diaplasiPeptikouSistimatos.text", "Diaplasi Peptikou Sistimatos :"},
                {"nefrikiAgenesia.text", "Nefriki Agenesia :"},
                {"kistikiNososNefrwn.text", "Kistiki Nosos Nefrwn :"},
                {"anomaliesNefrikisPyelou.text", "Anomalies Nefrikis Pyelou :"},
                {"diaplasiNefrwn.text", "Diaplasi Nefrwn :"},
                {"diataraxesNefrouOuritira.text", "Diataraxes Nefrou Ouritira :"},
                {"diaplasiOuritira.text", "Diaplasi Ouritira :"},
                {"diaplasiOuroupoiitikouSistimatos.text", "Diaplasi Ouroupoiitikou Sistimatos :"},
                {"klironomikiAnaimia.text", "Klironomiki Anaimia :"},
                {"sigenisThiroeidismos.text", "Sigenis Thiroeidismos :"},
                {"eleipsiLaktasis.text", "Eleipsi Laktasis :"},
                {"disanexiaLaktozis.text", "Disanexia Laktozis :"},
                {"psixikesDiataraxes.text", "Psixikes Diataraxes :"},
                {"istorikoSarkomatwn.text", "Istoriko Sarkomatwn :"},
                {"kakoithiNeoplasmata.text", "Kakoithi Neoplasmata :"},
                {"kataxrisiAlkool.text", "Kataxrisi Alkool :"},
                {"klironomikosDiavitis.text", "Klironomikos Diavitis :"},
                {"istorikoLeuxemias.text", "Istoriko Leuxemias :"},
                {"allesMorfesOikogeneiakouIstorikou.text", "Alles Morfes Oikogeniakou Istorikou :"},

                //Surgery History Window
                {"descriptionOfSurgery.text", "Description Of Surgery :"},
                {"hospitalName.text", "Hospital Name :"},
                {"reasonOfHospitalization.text", "Hospitalization Reason :"},
                {"finalDiagnosis.text", "Final Diagnosis :"},
                {"doctorsName.text", "Doctors Name :"},

                //Photos Window
                {"selectPhotoTextField.text","Select a photo..."},
                {"browseButton.text","Browse..."},
                {"savePhotoButton.text","Save photo"},
                {"listLabel.text","List of current photos: "},
                {"openButton.text","Open..."},
                {"removeButton.text","Remove"},
                {"renameLabel.text","Rename photo:"},

                //Contacts
                {"firstNameLabel.text","First name:"},
                {"lastNameLabel.text","Last name:"},
                {"relationshipLabel.text","Relationship:"},
                {"phoneLabel.text","Phone:"},
                {"emailLabel.text","Email: "},
                {"contactLabel.text","Contact 1"},
                {"contact1Label.text","Contact 2"},
                {"contact2Label.text","Contact 3"},

                //Chronic Medication Window
                {"heartLabel.text", "ΚΑΡΔΙΑ"},
                {"anapneustikoLabel.text", "ΑΝΑΠΝΕΥΣΤΙΚΟ"},
                {"bloodSugarLabel.text", "ΓΛΥΚΟΖΗ ΑΙΜΑΤΟΣ"},
                {"antithromvoticaFarmaka.text", "Αντιθρομβωτικά φάρμακα"},
                {"thromvolitikaFarmaka.text", "Θρομβολυτικά φάρμακα"},
                {"antidiastaltikaFarmaka.text", "Αγγειοδιασταλτικά της στεφανιαίας κυκλοφορίας}"},
                {"kariodiegertikesGlikosides.text", "Καρδιοδιεγερτικές γλυκοσίδες και φάρμακα με παρόμοια δράση"},
                {"antiikaFarmaka.text", "Αντιϊκά φάρμακα"},
                {"antiarrythmicaFarmaka.text", "Άλλα αντιαρρυθμικά φάρμακα"},
                {"antineoplasmatikaFarmaka.text", "Αντινεοπλασματικά και ανοσοκατασταλτικά φάρμακα"},
                {"antireumatikaFarmaka.text", "Αντιρευματικά φάρμακα"},
                {"antiasthmatica.text", "Αντιασθματικά"},
                {"antithyroidikaFarmaka.text", "Αντιθυρεοειδικά φάρμακα"},
                {"thyroidikesOrmones.text", "Θυρεοειδικές ορμόνες και υποκατάστατα"},
                {"insulini.text", "Ινσουλίνη"},
                {"antidiabeticesTabletes.text", "Αντιδιαβητικά φάρμακα"},
                {"anticoagxwlitikaFarmaka.text", "Αντιαγχολυτικά φάρμακα"},
                {"antipsychoticaFarmaka.text", "Αντιψυχωτικά φάρμακα"},
                {"antiepiliptikaFarmaka.text", "Διάφορα αντιεπηληπτικά και κατασταλτικά - υπνωτικά φάρμακα"},
                {"androgona.text", "Ανδρογόνα και άλλοι αναβολικοί παράγοντες"},
                {"oistrogona.text", "Οιστρογόνα και προγεσταγόνα"},
                {"antisilliptikaFarmaka.text", "Αντισυλληπτικά"},
                {"ormones.text", "Ορμόνες και τα συνθετικά παράγωγά τους"},
                {"vitamines.text", "Βιταμίνες"},
                {"sidiros.text", "Σίδηρος και ενώσεις του"},
                {"antiallergikaFarmaka.text", "Αντιαλλεργικά και αντιεμετικά φάρμακα"},
                {"otherChronicMedication.text", "Άλλα χρόνια φάρμακα"},
                {"nameOfMedication.text", "Συμπληρώστε τα ονόματα των φαρμάκων που χρησιμοποιεί ο ασθενής"},

                //Chronic Diseases
                {"pathiseisPneumonwnLabel.text","Pathiseis Pneumonwn :"},
                {"chronicVroxitidaLabel.text","Chronic Vroxitida :"},
                {"aneurismaPneumonikisArtiriasLabel.text","Aneurisma Pneumonikis Artirias :"},
                {"vactiriakesPneumoniesLabel.text","Vactiriakes Pneumonies :"},
                {"diataraxesArtiriwnLabel.text","Diataraxes Artiriwn :"},
                {"allergikoAsthmaLabel.text","Allergiko Asthma :"},
                {"anapneustikiAneparkeiaLabel.text","Anapneustiki Aneparkeia :"},
                {"anapneustirasLabel.text","Anapneustiras :"},
                {"kardiopatheiaLabel.text","Kardiopatheia :"},
                {"aneurismaKardiasLabel.text","Aneurisma Kardias :"},
                {"kardiakiArythmiaLabel.text","Kardiaki Arythmia :"},
                {"vimatodotisLabel.text","Vimatodotis :"},
                {"emfragmaLabel.text","Emfragma :"},
                {"egefalikoLabel.text","Egefaliko :"},
                {"thromvosiAgeiwnLabel.text","Thromvosi Ageiwn :"},
                {"stenosiAortikisValvidasLabel.text","Stenosi Aortikis Valvidas :"},
                {"aneparkeiaAortikisValvidasLabel.text","Aneparkeia Aortikis Valvidas :"},
                {"ageiakesPathiseisLabel.text","Ageiakes Pathiseis :"},
                {"ypotasiLabel.text","Ypotasi :"},
                {"ypertasiLabel.text","Ypertasi :"},
                {"allesMorfesYpotaseisLabel.text","Alles Morfes Ypotaseis :"},
                {"hpatikiAneparkeiaLabel.text","Hpatiki Aneparkeia :"},
                {"nefrikiAneparkeiaLabel.text","Nefriki Aneparkeia :"},
                {"mixanimaAimokatharsisLabel.text","Mixanima Aimokatharsis :"},
                {"elkosLabel.text","Elkos :"},
                {"diataraxesEderouLabel.text","Diataraxes Ederou :"},
                {"diataraxesNeurikouSistimatosLabel.text","Diataraxes Neurikou Sistimatos :"},
                {"diavitisLabel.text","Diavitis :"},
                {"nososYpatosLabel.text","Nosos Ypatos :"},
                {"leuxaimiaLabel.text","Leuxaimia :"},
                {"eleipsiSidirouLabel.text","Eleipsi Sidirou :"},
                {"poliomelitidaLabel.text","Poliomelitida :"},
                {"thiroeidismosLabel.text","Thiroeidismos :"},
                {"morfiThiroeidiLabel.text","Morfi Thiroeidi :"},
                {"erpikoEkzemaLabel.text","Erpiko Ekzema :"},
                {"ipatitidaLabel.text","Ipatitida :"},
                {"allesChroniesAstheneiesLabel.text","Alles Chronies Astheneies :"},

                //Contacts


                //Immunization History
                

                //Habits
                

                //Add Appointment Window
                

                //Appointments Window
                {"patientNotesLabel.text","Patient Notes :"},
                {"selectButton.text","Select"},
                {"addAppointmentButton.text","Add Appointment"},
                {"searchButton.text","Search"},
                {"patientsButton.text","My Patients"},
                {"removeAppointmentButton.text","Remove Appointment"},
                {"printButton.text","Print"},
            };
    };

}