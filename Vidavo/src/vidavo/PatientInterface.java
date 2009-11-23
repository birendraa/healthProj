/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo;

/**
 *
 * @author sanja
 */
public interface PatientInterface {

   public void setPersonalInfo(PersonalInfo pi);
   public PersonalInfo getPersonalInfo();
   public void setPhotos(Photos ph);
   public Photos getPhotos();
   public void setContacts(Contacts c);
   public Contacts getContacts();
   public void setParallelDiseases(ParallelDiseases pd);
   public ParallelDiseases getParallelDiseases();
   public void setChronicDiseases(ChronicDiseases cd);
   public ChronicDiseases getChronicDiseases();
   public void setChronicMedications(ChronicMedications cm);
   public ChronicMedications getChronicMedications();
   public void setMedications(Medications m);
   public Medications getMedications();
   public void setHabits(Habits h);
   public Habits getHabits();
   public void setImmunizationHistory(ImmunizationHistory ih);
   public ImmunizationHistory getImmunizationHistory();
   public void setFamilyHistory(FamilyHistory fh);
   public FamilyHistory getFamilyHistory();
   public void setSurgeryHistory(SurgeryHistory sh);
   public SurgeryHistory getSurgeryHistory();
   public void setMedicalHistory(MedicalHistory mh);
   public MedicalHistory getMedicalHistory();
}
