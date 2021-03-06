/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.resource;

/**
 *
 * @author Serban
 */
public class ResourceMap_gr extends java.util.ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object [][] {

                //Window Titles / Tab Titles
                {"addPatientTab.title", "Προσθήκη Ασθενή"},
                {"personalInfoTab.title", "Προσωπικά Στοιχεία"},
                {"surgeryHistoryTab.title", "Ιστορικό Εγχειρήσεων"},
                {"familyHistoryTab.title", "Οικογενειακό Ιστορικό"},
                {"contactsTab.title", "Επαφές Ασθενή"},
                {"photosTab.title", "Φώτογραφίες Ασθενή"},
                {"chronicMedicationTab.title", "Χρόνια Φαρμακευτική Αγωγή"},
                {"chronicDiseasesTab.title", "Χρόνιες Παθήσεις"},
                {"habitsTab.title", "Καθημερινές Συνήθειες"},
                {"immunizationHistoryTab.title", "Ιστορικό Ανοσοποιητικού"},


                //Save/Cancel Buttons
                {"saveButton.text", "Αποθύκευση"},
                {"cancelButton.text", "Ακύρωση"},
                {"okButton.text", "OK"},
                

                //Radio Buttons
                {"yesRadioButton.text", "Ναι"},
                {"noRadioButton.text", "Όχι"},
                {"muchRadioButton.text" , "Πολύ"},
                {"littleRadioButton.text", "Λίγο"},
                {"noneRadioButton.text", "Καθόλου"},


                //Save/Cancel Buttons
                {"saveButton.text", "Αποθήκευση"},
                {"cancelButton.text", "Ακύρωση"},


                //PatientList Window
                {"patientList.title", "Λίστα Ασθενών"},
                {"fileMenu.text", "Αρχείο"},
                {"quitMenuItem.text", "Έξοδος"},
                {"helpMenu.text", "Βοήθεια"},
                {"aboutMenuItem.text", "Σχετικά"},
                {"addButton.text", "Προσθήκη"},
                {"deleteButton.text", "Διαγραφή"},
                {"editButton.text", "Επεξεργασία"},
                {"cancelButton.text", "Ακύρωση"},
                {"searchButton.text", "Εύρεση"},
                {"searchTextField.text", "Εύρεση με βάση το επίθετο"},
                {"patientNameLabel.text", "John Smith"},
                {"patientLabel.text", "Όνομα Ασθενή: "},
                {"patientTable.columnModel.title3", "Τηλέφωνο"},
                {"patientTable.columnModel.title2", "Όνομα"},
                {"patientTable.columnModel.title1", "Επίθετο"},
                {"patientTable.columnModel.title0", "ID Ασθενή"},
                

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


                //Surgery History Window
                {"descriptionOfSurgery.text", "Περιγραφή επέμβασης :"},
                {"hospitalName.text", "Όνομα κλινικής/νοσoκομείου :"},
                {"reasonOfHospitalization.text", "Αιτία νοσηλείας :"},
                {"finalDiagnosis.text", "Τελική διάγνωση :"},
                {"doctorsName.text", "Όνομα ιατρού :"},


                //Family History Window
                {"egefalikoEpeisodio.text", "Οικογενειακό ιστορικό εγκεφαλικού επεισοδίου (εγκεφαλικής αποπληξίας) :"},
                {"diamartiesDiaplasisPneumonon.text", "Συγγενείς διαμαρτίες της διάπλασης των πνευμόνων :"},
                {"diamartiesDiaplasisKikloforikouSistimatos.text", "Συγγενείς διαμαρτίες διάπλασης του κυκλοφορικού συστήματος  :"},
                {"diamartiesDiaplasisKardiakwnDiafragmatwn.text", "Συγγενείς διαμαρτίες διάπλασης των καρδιακών διαφραγμάτων :"},
                {"kardiakiKoilotita.text", "Συγγενείς διαμαρτίες διάπλασης των καρδιακών κοιλοτήτων και των μεταξύ τους συνδέσεων :"},
                {"istorikoAsthmatos.text", "Οικογενειακό ιστορικό άσθματος και άλλων χρόνιων παθήσεων του κατώτερου αναπνευστικού συστήματος :"},
                {"diamartiesKardias.text", "Άλλες συγγενείς διαμαρτίες της καρδιάς :"},
                {"diamartiesTraxeiasVrohou.text", "Συγγενείς διαμαρτίες της διάπλασης της τραχείας και των βρόγχων :"},
                {"diaplasiDermatos.text", "Άλλες συγγενείς διαμαρτίες διάπλασης του δέρματος :"},
                {"stenosiLeptouEnderou.text", "Συγγενής απουσία, ατρησία και στένωση του λεπτού εντέρου :"},
                {"stenosiPaxeosEnderou.text", "Συγγενής απουσία, ατρησία και στένωση του παχέος εντέρου :"},
                {"diamartiesEnderou.text", "Άλλες συγγενείς διαμαρτίες της διάπλασης του εντέρου :"},
                {"diaplasiPeptikouSistimatos.text", "Άλλες συγγενείς διαμαρτίες της διάπλασης του πεπτικού συστήματος :"},
                {"nefrikiAgenesia.text", "Νεφρική αγενεσία και άλλες διαμαρτίες από έλλειψη των νεφρών :"},
                {"kistikiNososNefrwn.text", "Κυστική νόσος των νεφρών :"},
                {"anomaliesNefrikisPyelou.text", "Συγγενείς αποφρακτικές ανωμαλίες της νεφρικής πυέλου :"},
                {"diaplasiNefrwn.text", "Άλλες συγγενείς διαμαρτίες διαπλασης των νεφρών :"},
                {"diataraxesNefrouOuritira.text", "Οικογενειακό ιστορικό διαταραχών του νεφρού και του ουρητήρα :"},
                {"diaplasiOuritira.text", "Συγγενείς διαμαρτίες διάπλασης του ουρητήρα :"},
                {"diaplasiOuroupoiitikouSistimatos.text", "Άλλες συγγενείς διαμαρτίες διάπλασης του ουροποιητικού συστήματος :"},
                {"klironomikiAnaimia.text", "Κληρονομική αναιμία :"},
                {"sigenisThiroeidismos.text", "Συγγενής θυρεοειδυσμός  :"},
                {"eleipsiLaktasis.text", "Συγγενής έλλειψη λακτάσης :"},
                {"disanexiaLaktozis.text", "Άλλες μορφές δυσανεξίας της λακτόζης :"},
                {"psixikesDiataraxes.text", "Οικογενειακό ιστορικό ψυχικών διαταραχών και διαταραχών συμπεριφοράς :"},
                {"istorikoSarkomatwn.text", "Οικογενειακό ιστορικό σαρκωμάτων :"},
                {"kakoithiNeoplasmata.text", "Οικογενειακό ιστορικό διαφόρων κακοήθων νεοπλασμάτων :"},
                {"kataxrisiAlkool.text", "Οικογενειακό ιστορικό κατάχρησης αλκοόλ :"},
                {"klironomikosDiavitis.text", "Οικογενειακό ιστορικό σακχαρώδους διαβήτη :"},
                {"istorikoLeuxemias.text", "Οικογενειακό ιστορικό λευχαιμίας :"},
                {"allesMorfesOikogeneiakouIstorikou.text", "Άλλες μορφές οικογενειακού ιστορικού :"},


                //Photos Window
                {"selectPhotoTextField.text", "Επιλέξτε Φωτογραφία"},
                {"browseButton.text", "Επιλογή Φωτο/φίας"},
                {"savePhotoButton.text", "Αποθήκευση Φωτο/φίας"},
                {"listLabel.text", "Λίστα Φωτογραφιών Ασθενών"},
                {"openButton.text", "Άνοιγμα"},
                {"removeButton.text", "Αφαίρεση Φωτο/φίας"},
                {"renameLabel.text", "Μετονομασία Φωτο/φίας"},
                
                                
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
                {"pathiseisPneumonwnLabel.text","Παθήσεις των πνευμόνων :"},
                {"chronicVroxitidaLabel.text","Χρόνια Βρογχίτιδα :"},
                {"aneurismaPneumonikisArtiriasLabel.text","Ανεύρυσμα της πνευμονικής αρτηρίας :"},
                {"vactiriakesPneumoniesLabel.text","Διάφορες βακτηριακές πνευμονίες :"},
                {"diataraxesArtiriwnLabel.text","Διαταραχές Αρτηριών :"},
                {"allergikoAsthmaLabel.text","Αλλεργικό άσθμα :"},
                {"anapneustikiAneparkeiaLabel.text","Χρόνια αναπνευστική ανεπάρκεια :"},
                {"anapneustirasLabel.text","Εξάρτηση από αναπνευστήρα :"},
                {"kardiopatheiaLabel.text","Καρδιοπάθεια :"},
                {"aneurismaKardiasLabel.text","Ανευρύσματα της καρδιάς :"},
                {"kardiakiArythmiaLabel.text","Καρδιακή αρρυθμία, διάφορες περιπτώσεις :"},
                {"vimatodotisLabel.text","Παρουσία καρδιακού βηματοδότη :"},
                {"emfragmaLabel.text","Έμφραγμα του μυοκαρδίου :"},
                {"egefalikoLabel.text","Εγκεφαλικό :"},
                {"thromvosiAgeiwnLabel.text","Θρόμβωση των στεφανιαίων αγγείων :"},
                {"stenosiAortikisValvidasLabel.text","Στένωση της αορτικής βαλβίδας :"},
                {"aneparkeiaAortikisValvidasLabel.text","Ανεπάρκεια της αορτικής βαλβίδας :"},
                {"ageiakesPathiseisLabel.text","Διάφορες περιφερικές αγγειακές παθήσεις :"},
                {"ypotasiLabel.text","Υπόταση :"},
                {"ypertasiLabel.text","Υπέρταση :"},
                {"allesMorfesYpotaseisLabel.text","Άλλες μορφές υπότασης :"},
                {"hpatikiAneparkeiaLabel.text","Χρόνια ηπατική ανεπάρκεια :"},
                {"nefrikiAneparkeiaLabel.text","Χρόνια νεφρική ανεπάρκεια :"},
                {"mixanimaAimokatharsisLabel.text","Εξάρτηση από μηχάνημα αιμοκάθαρσης (τεχνητού νεφρού) :"},
                {"elkosLabel.text","Έλκος :"},
                {"diataraxesEderouLabel.text","Χρόνιες, αγγειακές διαταραχές του εντέρου :"},
                {"diataraxesNeurikouSistimatosLabel.text","Διάφορες διαταραχές του κεντρικού νευρικού συστήματος :"},
                {"diavitisLabel.text","Σακχαρώδης διαβήτης :"},
                {"nososYpatosLabel.text","Νόσος του ήπατος :"},
                {"leuxaimiaLabel.text","Χρόνια λευχαιμία :"},
                {"eleipsiSidirouLabel.text","Αναιμία από έλλειψη σιδήρου :"},
                {"poliomelitidaLabel.text","Πολιομυελίτιδα :"},
                {"thiroeidismosLabel.text","θυρεοειδισμός :"},
                {"morfiThiroeidiLabel.text","Μορφή Θυροειδή :"},
                {"erpikoEkzemaLabel.text","Ερπητικό έκζεμα :"},
                {"ipatitidaLabel.text","Χρόνια ηπατίτιδα :"},
                {"allesChroniesAstheneiesLabel.text","Άλλες χρόνιες ασθένειες :"},

                //Contacts
                {"contactLabel.text","Επαφή 1"},
                {"contact1Label.text","Επαφή 2"},
                {"contact2Label.text","Επαφή 3"},
                {"firstNameLabel.text", "Όνομα"},
                {"lastNameLabel.text", "Επίθετο"},
                {"relationshipLabel.text", "Σχέση"},
                {"phoneLabel.text", "Τηλέφωνο"},
                {"emailLabel.text", "E-mail"},
                {"firstNameLabel1.text", "Όνομα"},
                {"lastNameLabel1.text", "Επίθετο"},
                {"relationshipLabel1.text", "Σχέση"},
                {"phoneLabel1.text", "Τηλέφωνο"},
                {"emailLabel1.text", "E-mail"},
                {"firstNameLabel2.text", "Όνομα"},
                {"lastNameLabel2.text", "Επίθετο"},
                {"relationshipLabel2.text", "Σχέση"},
                {"phoneLabel2.text", "Τηλέφωνο"},
                {"emailLabel2.text", "E-mail"},


                //Immunization History
                {"bloodTypeLabel.text", "Ομάδα Αίματος"},
                {"bloodDonorLabel.text", "Αιμοδότης"},
                {"bloodBankLabel.text", "Τράπεζα Αίματος"},
                {"bloodCDLabel.text", "Μεταδιδόμενες Ασθένειες Αίματος"},
                {"bleedingProblemsLabel.text", "Προβλήματα Αιμορραγίας"},
                {"doritisMOLabel.text", "Δωρητής Μυελού των Οστών"},
                {"kidneyDonorLabel.text", "Δότης Νεφρού"},
                {"doritisAOLabel.text", "Δωρητής άλλων Οργάνων"},
                {"allergiesLabel.text", "Αλλεργίες"},
                {"allergiesToDrugsLabel.text", "Αλλεργίες σε Φάρμακα"},
                {"circulationLabel.text", "Κυκλοφοριακή Ανεπάρκεια"},
                {"stigmaLabel.text", "Στίγμα"},

                //Habits
                {"smokerLabel.text", "Καπνιστής"},
                {"smokeLongLabel.text", "Διάστημα που Καπνίζει"},
                {"teaLabel.text", "Τσάι"},
                {"coffeeLabel.text", "Καφές"},
                {"softDrinksLabel.text", "Αναψυκτικά"},
                {"caffeinePDLabel.text", "Καφεϊνη ανα μέρα"},
                {"saltUsageLabel.text", "Χρήση Αλατιού"},
                {"sugarUsageLabel.text", "Χρήση Ζάχαρης"},
                {"dietLabel.text", "Δίαιτα"},
                {"foodHabitsLabel.text", "Διατροφικές Συνήθειες"},
                {"alcoholPDLabel.text", "Αλκοόλ ανα μέρα"},
                {"alcoholPWLabel.text", "Αλκοόλ ανα εβδομάδα"},
                {"useDrugsLabel.text", "Χρήση Ναρκωτικών"},
                {"useMedicationLabel.text", "Χρήση Φαρμάκων"},
                {"excerciseLabel.text", "Γυμναστική"},
                {"excerciseHabitsLabel.text", "Είδος Γυμναστικής"},
                {"howOftenLabel.text", "Συχνότητα Γυμναστικής"},
                {"otherHabitsLabel.text", "Άλλες Συνήθειες"},
                
                //Add Appointment Window
                {"addAppointment.title","Προσθήκη Ραντεβού"},
                {"categoryLabel.text","Κατηγορία :"},
                {"dateLabel.text","Ημερομηνία :"},
                {"titleLabel.text","Τίτλος :"},
                {"patientLabel.text","Ασθενής :"},
                {"timeLabel.text","Ώρα :"},
                {"timeSeperatorLabel.text",":"},
                {"durationLabel.text","Διάρκεια :"},
                {"minutesLabel.text","λεπτά"},
                {"repeatsCheckBox.text","Επαναλαμβάνετε"},
                {"untilLabel.text","Μέχρι :"},
                {"facilityLabel.text","Υποδομή :"},
                {"selectPatientButton.text","Επιλογή Ασθενή"},
                {"commentsLabel.text","Σχόλια :"},
                {"findAvailableButton.text","Ελεύθερες Ώρες"},
                
                //Appointments Window
                {"appointments.title","΄Ραντεβού"},
                {"patientNotesLabel.text","Σημειώσεις Ραντεβού :"},
                {"selectButton.text","Επιλογή"},
                {"addAppointmentButton.text","Προσθήκη Ραντεβού"},
                {"searchButton.text","Εύρεση"},
                {"patientsButton.text","Ασθενείς"},
                {"removeAppointmentButton.text","Αφαίρεση Ραντεβού"},
                {"printButton.text","Εκτύπωση"},

                //Language Menu
                {"languageMenu.text","Language"},
                {"greekMenuItem.text","Greek"},
                {"englishMenuItem.text","English"},

                //Find Available
                {"findAvailable.title","Διαθέσιμα Ραντεβού"},
                {"startDateLabel.text","Αρχική Ημερομηνία :"},
                {"forLabel.text","για"},
                {"daysLabel.text","μερες"},
                {"searchButton.text","Εύρεση"},
                {"availableTimesLabel.text","Διαθέσιμες Ώρες"},
                {"pmLabel.text","ΜΜ"},
                {"amLabel.text","ΠΜ"},

                //JOptionPane Messages
                {"closeWindow.text","Θέλετε να κλείσετε το παράθυρο?"},
                {"appointmentNotSelected.text","Επιλέξτε ραντεβού για διαγραφή."},
                {"patientNotSelected.text","Επιλέξτε Ασθενή."},
                {"noPatientWith.text","Κανένας Ασθενής με "},
                {"lastNameFound.text"," επίθετο"},
                //
                {"dateNotSet.text","Επιλέξτε ημερομηνία ραντεβού."},
                {"longAppDuration.text","Μεγάλη διάρκεια ραντεβού."},
                {"hourEmpty.text","Επιλέξτε ώρα ραντεβού."},
                {"emptyDuration.text","Επιλέξτε διάρκεια ραντεβού."},
                {"durationNotDigits.text","Η διάρκεια πρέπει να είναι αριθμός!"},
                {"timeNotDigits.text","Η ώρα πρέπει να είναι αριθμός!"},
                {"invalidDuration.text","Η διάρκεια πρέπει να είναι αριθμός!"},
                //
                {"noFirstName.text","Ελειπές πληροφορίες! Παρακαλώ πληκτολογίστε το Όνομα του ασθενή!"},
                {"noLastName.text","Ελειπές πληροφορίες! Παρακαλώ πληκτολογίστε το Επίθετο του ασθενή!"},
                {"noAMKA.text","Ελειπές πληροφορίες! Παρακαλώ πληκτολογίστε το ΑΜΚΑ του ασθενή!"},
                {"invalidAMKA.text","Το ΑΜΚΑ πρέπει να είναι ακριβώς 11 ψηφία."},
                {"noInsurance.text","Ελειπές πληροφορίες! Παρακαλώ πληκτολογίστε την Ασφάλεια του ασθενή!"},
                {"noTameio.text","Ελειπές πληροφορίες! Παρακαλώ επιλέξτε το ταμείο του ασθενή!"},
                {"notUniqueAMKA.text","AMKA is not unique! Ο ΑΜΚΑ δεν είναι μοναδικός αριθμός!"},
                {"notDigits.text","Πληκτολογίστε μόνο ψηφία."},
                //
                {"savePhotoError.text","Παρακαλώ ελέξτε τις πληροφορίες του ασθενή και την τοποθεσία που θα αποθηκευτεί η εικόνα."},
            };
    };

}
