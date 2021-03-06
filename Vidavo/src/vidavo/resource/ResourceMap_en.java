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
                {"muchRadioButton.text" , "Much"},
                {"littleRadioButton.text", "Little"},
                {"noneRadioButton.text", "None"},

                //Save/Cancel Buttons
                {"cancelButton.text", "Cancel"},
                {"saveButton.text", "Save"},
                {"okButton.text", "OK"},

                //Personal Info Window
                {"idLabel.text", "ID*"},
                {"firstNLabel.text", "First Name* :"},
                {"middleNLabel.text", "Middle Name:"},
                {"lastNLabel.text", "Last Name* :"},
                {"addressLabel.text", "Address:"},
                {"addressNumLabel.text", "Address Number:"},
                {"cityLabel.text", "City:"},
                {"regionLabel.text", "State/Region:"},
                {"countryLabel.text", "Country:"},
                {"postalCLabel.text", "Postal Code:"},
                {"citizenshipLabel.text", "Citizenship:"},
                {"heightLabel.text", "Height (cm)"},
                {"weightLabel.text", "Weight (kg)"},
                {"maleRadioButton.text", "Male"},
                {"femaleRadioButton.text", "Female"},
                {"marriedRadioButton.text", "Married"},
                {"singleRadioButton.text", "Single"},
                {"birthDateLabel.text", "Birth Date:"},
                {"profLabel.text", "Profession:"},
                {"insuranceLabel.text", "Insurance* :"},
                {"amkaLabel.text", "AMKA* :"},
                {"tameioLabel.text", "Tameio* :"},
                {"firstVisitLabel.text", "First Visit:"},
                {"childrenLabel.text", "Children:"},
                {"patientPhotoLabel.text", "Patient Photo:"},
                {"pictureButton.text", "Browse for Photo"},
                {"communicationNumPane.title", "Communication Numbers"},
                {"emailLabel.text", "Email:"},
                {"faxLabel.text", "Fax:"},
                {"homeLabel.text", "Home:"},
                {"workLabel.text", "Work:"},
                {"cellLabel.text", "Cell Phone:"},

                //PatientList Window
                {"patientList.title", "Patient List"},
                {"addButton.text", "Add..."},
                {"deleteButton.text", "Delete"},
                {"editButton.text", "Edit..."},
                {"searchButton.text", "Search"},
                {"searchTextField.text", "Search by last name..."},
                {"patientNameLabel.text", "Select a patient from the table..."},
                {"patientLabel.text.in.list", "Selected Patient: "},
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
                {"heartLabel.text", "HEART"},
                {"anapneustikoLabel.text", "Anapneustiko"},
                {"bloodSugarLabel.text", "BLOOD SUGAR"},
                {"antithromvoticaFarmaka.text", "Antithromvotic Medication"},
                {"thromvolitikaFarmaka.text", "Thromvolitic Medication"},
                {"antidiastaltikaFarmaka.text", "Aggeiodiastaltika tis Stefaniaias Kikloforias"},
                {"kariodiegertikesGlikosides.text", "Kardiodiegertikes glikosides kai farmaka me paromoia drasi"},
                {"antiikaFarmaka.text", "Antiika Farmaka"},
                {"antiarrythmicaFarmaka.text", "Alla antiarithmika Farmaka"},
                {"antineoplasmatikaFarmaka.text", "Antineoplasmatika kai anosokatastaltika Farmaka"},
                {"antireumatikaFarmaka.text", "Antireumatic Medication"},
                {"antiasthmatica.text", "Antiasthmatic Medication"},
                {"antithyroidikaFarmaka.text", "Antithyroidica Farmaka"},
                {"thyroidikesOrmones.text", "Thiroeidikes ormones kai ipokatastata"},
                {"insulini.text", "Insoulin"},
                {"antidiabeticesTabletes.text", "Antidiabetic Medication"},
                {"anticoagxwlitikaFarmaka.text", "Antiagxolitika Farmaka"},
                {"antipsychoticaFarmaka.text", "Antipsychotic Medication"},
                {"antiepiliptikaFarmaka.text", "Diafora antiepilhptika kai katastaltika - ipnotika farmaka"},
                {"androgona.text", "Androgona kai alloi anavolikoi paragontes"},
                {"oistrogona.text", "Oistrogona kai proestagona"},
                {"antisilliptikaFarmaka.text", "Antisulliptika"},
                {"ormones.text", "Ormones kai ta sunthetika paragoga tous"},
                {"vitamines.text", "Vitamins"},
                {"sidiros.text", "Sidiros kai enoseis tou"},
                {"antiallergikaFarmaka.text", "Antiallergika kai antiemetika farmaka"},
                {"otherChronicMedication.text", "Other Chronic Medication"},
                {"nameOfMedication.text", "Fill in the drug names that the patient uses"},

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

                {"bloodTypeLabel.text","Blood Type:"},
                {"bloodDonorLabel.text","Blood Donor:"},
                {"bloodBankLabel.text","Blood Bank:"},
                {"bloodCDLabel.text","Blood Contageous Diseases:"},
                {"bleedingProblemsLabel.text","Bleeding Problems:"},
                {"doritisMOLabel.text","Doritis Mielou Oston:"},
                {"kidneyDonorLabel.text","Kidney Donor:"},
                {"doritisAOLabel.text","Doritis Allon Organon:"},
                {"allergiesLabel.text","Allergies"},
                {"allergiesToDrugsLabel.text","Allergies To Drugs:"},
                {"circulationLabel.text","Poor Circulation:"},
                {"stigmaLabel.text","Stigma:"},
                {"yesBloodDonorRadioButton.text","Yes"},
                {"noBloodDonorRadioButton.text","No"},
                {"yesBleedingRadioButton.text","Yes"},
                {"noBleedingRadioButton.text","No"},
                {"yesDoritisMORadioButton.text","Yes"},
                {"noDoritisMORadioButton.text","No"},
                {"yesKidneyDonorRadioButton.text","Yes"},
                {"noKidneyDonorRadioButton.text","No"},
                {"yesCirculationRadioButton.text","Yes"},
                {"noCirculationRadioButton.text","No"},
                {"yesStigmaRadioButton.text","Yes"},
                {"noStigmaRadioButton.text","No"},

                {"smokerLabel.text","Smoker :"},
                {"smokerYRadioButton.text", "Yes"},
                {"smokerNRadioButton.text", "No"},
                {"smokeLongLabel.text","How Long Smoke :"},
                {"teaLabel.text","Tea :"},
                {"teaYRadioButton.text","Yes"},
                {"teaNRadioButton.text","No"},
                {"coffeeLabel.text","Coffee :"},
                {"coffeeYRadioButton.text","Yes"},
                {"coffeeNRadioButton.text","No"},
                {"softDrinksLabel.text","Soft Drinks :"},
                {"softDrinksYRadioButton.text", "Yes"},
                {"softDrinksNRadioButton.text","No"},
                {"caffeinePDLabel.text","Caffeine per Day :"},
                {"saltUsageLabel.text","Salt Usage :"},
                {"sugarUsageLabel.text","Sugar Usage :"},
                {"dietLabel.text","Diet"},
                {"dietYRadioButton.text","Yes"},
                {"dietNRadioButton.text","No"},
                {"foodHabitsLabel.text","Food Habits :"},
                {"alcoholPDLabel.text","Alcohol per Day :"},
                {"alcoholPWLabel.text","Alcohol per Week :"},
                {"useDrugsNRadioButton.text","No"},
                {"useDrugsLabel.text","Use of Drugs :"},
                {"useDrugsYRadioButton.text","Yes"},
                {"useMedicationLabel.text","Use of Medication :"},
                {"useMedicationYRadioButton.text","Yes"},
                {"useMedicationNRadioButton.text","No"},
                {"excerciseLabel.text","Excercise :"},
                {"excerciseYRadioButton.text","Yes"},
                {"excerciseNRadioButton.text","No"},
                {"excerciseHabitsLabel.text","Excercise Habits :"},
                {"howOftenLabel.text","How Often :"},
                {"otherHabitsLabel.text","Other Habits :"},

                //Contacts


                //Immunization History
                {"bloodTypeLabel.text","Blood Type:"},
                {"bloodDonorLabel.text","Blood Donor:"},
                {"bloodBankLabel.text","Blood Bank:"},
                {"bloodCDLabel.text","Blood Contageous Diseases:"},
                {"bleedingProblemsLabel.text","Bleeding Problems:"},
                {"doritisMOLabel.text","Doritis Mielou Oston:"},
                {"kidneyDonorLabel.text","Kidney Donor:"},
                {"doritisAOLabel.text","Doritis Allon Organon:"},
                {"allergiesLabel.text","Allergies"},
                {"allergiesToDrugsLabel.text","Allergies To Drugs:"},
                {"circulationLabel.text","Poor Circulation:"},
                {"stigmaLabel.text","Stigma:"},
                {"yesBloodDonorRadioButton.text","Yes"},
                {"noBloodDonorRadioButton.text","No"},
                {"yesBleedingRadioButton.text","Yes"},
                {"noBleedingRadioButton.text","No"},
                {"yesDoritisMORadioButton.text","Yes"},
                {"noDoritisMORadioButton.text","No"},
                {"yesKidneyDonorRadioButton.text","Yes"},
                {"noKidneyDonorRadioButton.text","No"},
                {"yesCirculationRadioButton.text","Yes"},
                {"noCirculationRadioButton.text","No"},
                {"yesStigmaRadioButton.text","Yes"},
                {"noStigmaRadioButton.text","No"},

                //Habits
                {"smokerLabel.text","Smoker :"},
                {"smokerYRadioButton.text", "Yes"},
                {"smokerNRadioButton.text", "No"},
                {"smokeLongLabel.text","How Long Smoke :"},
                {"teaLabel.text","Tea :"},
                {"teaYRadioButton.text","Yes"},
                {"teaNRadioButton.text","No"},
                {"coffeeLabel.text","Coffee :"},
                {"coffeeYRadioButton.text","Yes"},
                {"coffeeNRadioButton.text","No"},
                {"softDrinksLabel.text","Soft Drinks :"},
                {"softDrinksYRadioButton.text", "Yes"},
                {"softDrinksNRadioButton.text","No"},
                {"caffeinePDLabel.text","Caffeine per Day :"},
                {"saltUsageLabel.text","Salt Usage :"},
                {"dietLabel.text","Diet"},
                {"dietYRadioButton.text","Yes"},
                {"dietNRadioButton.text","No"},
                {"foodHabitsLabel.text","Food Habits :"},
                {"alcoholPDLabel.text","Alcohol per Day :"},
                {"alcoholPWLabel.text","Alcohol per Week :"},
                {"useDrugsNRadioButton.text","No"},
                {"useDrugsLabel.text","Use of Drugs :"},
                {"useDrugsYRadioButton.text","Yes"},
                {"useMedicationLabel.text","Use of Medication :"},
                {"useMedicationYRadioButton.text","Yes"},
                {"useMedicationNRadioButton.text","No"},
                {"excerciseLabel.text","Excercise :"},
                {"excerciseYRadioButton.text","Yes"},
                {"excerciseNRadioButton.text","No"},
                {"excerciseHabitsLabel.text","Excercise Habits :"},
                {"howOftenLabel.text","How Often :"},
                {"otherHabitsLabel.text","Other Habits :"},

                //Add Appointment Window
                {"addAppointment.title","Add Appointment"},
                {"categoryLabel.text","Category :"},
                {"dateLabel.text","Date :"},
                {"titleLabel.text","Title :"},
                {"patientLabel.text","Patient :"},
                {"timeLabel.text","Time :"},
                {"timeSeperatorLabel.text",":"},
                {"durationLabel.text","Duration :"},
                {"minutesLabel.text","minutes"},
                {"repeatsCheckBox.text","Repeats"},
                {"untilLabel.text","Until :"},
                {"facilityLabel.text","Facility :"},
                {"selectPatientButton.text","Select Patient"},
                {"commentsLabel.text","Comments :"},
                {"saveButton.text","Save"},
                {"findAvailableButton.text","Find Available"},
                {"cancelButton.text","Cancel"},

                //Appointments Window
                {"appointments.title","Appointments"},
                {"patientNotesLabel.text","Appointment Notes :"},
                {"selectButton.text","Select"},
                {"addAppointmentButton.text","Add Appointment"},
                {"searchButton.text","Search"},
                {"patientsButton.text","My Patients"},
                {"removeAppointmentButton.text","Remove Appointment"},
                {"printButton.text","Print"},

                //Language Menu
                {"languageMenu.text","Language"},
                {"greekMenuItem.text","Greek"},
                {"englishMenuItem.text","English"},

                //Find Available
                {"findAvailable.title","Find Available"},
                {"startDateLabel.text","Start Date :"},
                {"forLabel.text","for"},
                {"daysLabel.text","days"},
                {"searchButton.text","Search"},
                {"availableTimesLabel.text","Available Times"},
                {"pmLabel.text","PM"},
                {"amLabel.text","AM"},

                //JOptionPane Messages
                {"closeWindow.text","Are you sure you want to close the window? "},
                {"appointmentNotSelected.text","Please select an appointment to be deleted"},
                {"patientNotSelected.text","No patient is selected!"},
                {"noPatientWith.text","No patient with "},
                {"lastNameFound.text"," last name found!"},
                //
                {"dateNotSet.text","Date has not been set for the appointment"},
                {"longAppDuration.text","Appointment duration is too long"},
                {"hourEmpty.text","Enter hour for the appointment"},
                {"emptyDuration.text","Enter the duration of the appointment"},
                {"durationNotDigits.text","Enter only digits in the duration field"},
                {"timeNotDigits.text","Enter only digits in the time field"},
                {"invalidDuration.text","Please enter a valid appointment duration."},
                //
                {"noFirstName.text","Missing mandatory information! Please Enter patient's first name!"},
                {"noLastName.text","Missing mandatory information! Please Enter patient's last name!"},
                {"noAMKA.text","Missing mandatory information! Please Enter patient's AMKA!"},
                {"invalidAMKA.text","AMKA number has to be 11 digits exactly"},
                {"noInsurance.text","Missing mandatory information! Please Enter patient's insurance!"},
                {"noTameio.text","Missing mandatory information! Please Enter patient's Tameio!"},
                {"notUniqueAMKA.text","AMKA is not unique! Enter unique AMKA number"},
                {"notDigits.text","Enter only digits!"},
                //
                {"savePhotoError.text","You need to enter the first name, last name, AMKA and photo location before the file can be saved."},
            };
    };

}
