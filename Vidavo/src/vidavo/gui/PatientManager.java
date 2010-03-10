/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vidavo.pojos.*;
import vidavo.util.HibernateUtil;


/**
 *
 * @author Serban
 */
public class PatientManager {

    private int patientID;
    private int patientNumber;
    private Patients p;
    private PersonalInfo pi;
    private SurgicalHistory sh;
    private FamilyHistory fh;
    private Contacts contacts;
    private ChronicMedication cm;
    private ChronicDiseases cd;
    private Habits habits;
    private Immunizations immun;
    private Session s;
    private Transaction tx;
    final static Logger logger = LoggerFactory.getLogger(PatientManager.class);


    public PatientManager(){

    }

    public void createPatient(PersonalInfo pi,SurgicalHistory sh,FamilyHistory fh,Contacts contacts,ChronicMedication cm,ChronicDiseases cd,Habits habits,Immunizations immun){
        tx = null;
        s = HibernateUtil.getSessionFactory().openSession();
    try {
        tx = s.beginTransaction();
        Patients p = new Patients();
        s.save(p);
        s.flush();
        
        p.setPersonalInfos(new HashSet());
        pi.setPiId(p.getPatientId());
        p.getPersonalInfos().add(pi);

        p.setSurgicalHistories(new HashSet());
        sh.setShId(p.getPatientId());
        p.getSurgicalHistories().add(sh);

        p.setFamilyHistories(new HashSet());
        fh.setFhId(p.getPatientId());
        p.getFamilyHistories().add(fh);

        p.setContactses(new HashSet());
        contacts.setContactId(p.getPatientId());
        p.getContactses().add(contacts);

        p.setChronicMedications(new HashSet());
        cm.setCmId(p.getPatientId());
        p.getChronicMedications().add(cm);

        p.setChronicDiseaseses(new HashSet());
        cd.setChId(p.getPatientId());
        p.getChronicDiseaseses().add(cd);

        p.setHabitses(new HashSet());
        habits.setHabitsId(p.getPatientId());
        p.getHabitses().add(habits);

        p.setImmunizationses(new HashSet());
        immun.setImmunId(p.getPatientId());
        p.getImmunizationses().add(immun);

        s.save(p);
        s.flush();

      tx.commit();
        s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }

    }

   public void deletePatient(int id)
   {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from Patients p where p.patientId = " + id).list();
        p = (Patients) person.get(0);
        try {
      s.delete(p);
      tx.commit();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
   }

    Vector displayPatients() {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List patients =
            s.createQuery("from PersonalInfo as personalinfo order by personalinfo.piId").list();
        tx.commit();
        s.close();
        return displayResult(patients);
    }

    private Vector displayResult(List patients) {
        Vector <Object> oneRow = new Vector<Object>();
        for(int i = 0; i < patients.size(); i++) {
        pi = (PersonalInfo)patients.get(i);
        oneRow.add(pi.getPiId());
        oneRow.add(pi.getLastName());
        oneRow.add(pi.getFirstName());
        oneRow.add(pi.getHomeNumber());
    }
        return oneRow;
    }

    PersonalInfo getSelectedPatient(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from PersonalInfo p where p.piId = " + id).list();
        pi = (PersonalInfo) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return pi;
    }

    public void editPatient(Patients p,PersonalInfo pi,SurgicalHistory sh,FamilyHistory fh,Contacts contacts,ChronicMedication cm,ChronicDiseases cd,Habits habits,Immunizations immun)
    {
            tx = null;
            s = HibernateUtil.getSessionFactory().openSession();
    try {
      tx = s.beginTransaction();
      p = (Patients) s.load(Patients.class, p.getPatientId());

      p.getPersonalInfos().add(pi);
      p.getSurgicalHistories().add(sh);
      p.getFamilyHistories().add(fh);
      p.getContactses().add(contacts);
      p.getChronicMedications().add(cm);
      p.getChronicDiseaseses().add(cd);
      p.getHabitses().add(habits);
      p.getImmunizationses().add(immun);

      s.merge(p);
      s.update(p);
      tx.commit();
        s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
    }

    public Vector searchPatient(String string) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List patients = s.createQuery("from PersonalInfo p where p.lastName like '" + string+ "%' order by p.piId").list();
        tx.commit();
        s.close();
        return displayResult(patients);
    }

    SurgicalHistory getSelectedPatientSH(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from SurgicalHistory sh where sh.shId = " + id).list();
        sh = (SurgicalHistory) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return sh;
    }

    public Patients getPatient(int piId) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
      try{
        List person = s.createQuery("from Patients p where p.patientId = " + piId).list();
        p = (Patients) person.get(0);
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return p;

    }

    FamilyHistory getSelectedPatientFH(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from FamilyHistory fh where fh.fhId = " + id).list();
        fh = (FamilyHistory) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return fh;
    }

    Contacts getSelectedContacts(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from Contacts c where c.contactId = " + id).list();
        contacts = (Contacts) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return contacts;
    }

    ChronicMedication getSelectedCM(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from ChronicMedication cm where cm.cmId = " + id).list();
        cm = (ChronicMedication) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return cm;
    }

    ChronicDiseases getSelectedCD(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from ChronicDiseases cd where cd.chId = " + id).list();
        cd = (ChronicDiseases) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return cd;
    }

    Habits getSelectedHabits(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from Habits h where h.habitsId = " + id).list();
        habits = (Habits) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return habits;
    }

    Immunizations getSelectedImmun(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();

        List person = s.createQuery("from Immunizations i where i.immunId = " + id).list();
        immun = (Immunizations) person.get(0);
        try {
      tx.commit();
      s.close();
    } catch (RuntimeException e) {
      if (tx != null && tx.isActive()) {
        try {
          tx.rollback();
        } catch (HibernateException e1) {
          logger.debug("Error rolling back transaction");
        }
        throw e;
      }
    }
        return immun;
    }

}