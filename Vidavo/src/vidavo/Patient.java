/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo;

/**
 *
 * @author sanja
 */
public class Patient{

   private int patientID;
   private PersonalInfo pInfo;
   private Photos photos;
   private Contacts contacts;
   private ChronicDiseases chrDiseases;
   private ChronicMedications chrMedications;
   private Habits habits;
   private ImmunizationHistory immunHistory;
   private FamilyHistory famHistory;
   private SurgeryHistory surgHistory;

   public Patient(){

   }
   public Patient(int iD)
   {
       patientID = iD;
       pInfo = new PersonalInfo();
       photos = new Photos();
       contacts = new Contacts();
       chrDiseases = new ChronicDiseases();
       chrMedications = new ChronicMedications();
       habits = new Habits();
       immunHistory = new ImmunizationHistory();
       famHistory = new FamilyHistory();
       surgHistory = new SurgeryHistory();
   }

   public Patient(int iD, String fn, String ln, String insur, int a, String tam) throws NullPointerException
   {
       if(!fn.equals("") && !ln.equals("") && !insur.equals(""))
        {
       patientID = iD;
       pInfo = new PersonalInfo(iD,fn,ln,insur,a,tam);
       photos = new Photos();
       contacts = new Contacts();
       chrDiseases = new ChronicDiseases();
       chrMedications = new ChronicMedications();
       habits = new Habits();
       immunHistory = new ImmunizationHistory();
       famHistory = new FamilyHistory();
       surgHistory = new SurgeryHistory();
         }

        else
            throw new NullPointerException();
   }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

   public void setPersonalInfo(PersonalInfo pi)
   {
        pInfo = pi;
   }

   public PersonalInfo getPersonalInfo()
   {
       return pInfo;
   }

   public void setPhotos(Photos ph)
   {
        photos = ph;
   }

   public Photos getPhotos()
   {
       return photos;
   }

   public void setContacts(Contacts c)
   {
        contacts = c;
   }

   public Contacts getContacts()
   {
       return contacts;
   }

   public void setChronicDiseases(ChronicDiseases cd)
   {
        chrDiseases = cd;
   }

   public ChronicDiseases getChronicDiseases()
   {
       return chrDiseases;
   }

   public void setChronicMedications(ChronicMedications cm)
   {
        chrMedications = cm;
   }

   public ChronicMedications getChronicMedications()
   {
       return chrMedications;
   }

   public void setHabits(Habits h)
   {
        habits = h;
   }

   public Habits getHabits()
   {
       return habits;
   }

   public void setImmunizationHistory(ImmunizationHistory ih)
   {
        immunHistory = ih;
   }

   public ImmunizationHistory getImmunizationHistory()
   {
       return immunHistory;
   }

   public void setFamilyHistory(FamilyHistory fh)
   {
        famHistory = fh;
   }

   public FamilyHistory getFamilyHistory()
   {
       return famHistory;
   }

   public void setSurgeryHistory(SurgeryHistory sh)
   {
        surgHistory = sh;
   }

   public SurgeryHistory getSurgeryHistory()
   {
       return surgHistory;
   }

}