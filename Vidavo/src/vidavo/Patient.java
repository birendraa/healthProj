/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package appointmentsandpatients;

/**
 *
 * @author sanja
 */
public class Patient {

   private PersonalInfo pInfo;
   private Photos photos;
   private Contacts contacts;
   private ParallelDiseases prlDiseases;
   private ChronicDiseases chrDiseases;
   private ChronicMedications chrMedications;
   private Medications meds;
   private Habits habits;
   private ImmunizationHistory immunHistory;
   private FamilyHistory famHistory;
   private SurgeryHistory surgHistory;
   private MedicalHistory medHistory;

   public Patient(int iD, String fn, String ln, String insur, int a, String tam)
   {
       pInfo = new PersonalInfo(iD,fn,ln,insur,a,tam);
       photos = new Photos();
       contacts = new Contacts();
       prlDiseases = new ParallelDiseases();
       chrDiseases = new ChronicDiseases();
       chrMedications = new ChronicMedications();
       meds = new Medications();
       habits = new Habits();
       immunHistory = new ImmunizationHistory();
       famHistory = new FamilyHistory();
       surgHistory = new SurgeryHistory();
       medHistory = new MedicalHistory();
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

   public void setParallelDiseases(ParallelDiseases pd)
   {
        prlDiseases = pd;
   }

   public ParallelDiseases getParallelDiseases()
   {
       return prlDiseases;
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

   public void setMedications(Medications m)
   {
        meds = m;
   }

   public Medications getMedications()
   {
       return meds;
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

   public void setMedicalHistory(MedicalHistory mh)
   {
        medHistory = mh;
   }

   public MedicalHistory getMedicalHistory()
   {
       return medHistory;
   }

}
