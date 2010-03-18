
package vidavo.gui;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vidavo.pojos.*;
import vidavo.util.HibernateUtil;

public class AppointmentManager {
    
    private Transaction tx;
    private Session s;
    final static Logger logger = LoggerFactory.getLogger(PatientManager.class);
    private Appointments app;
    private List list;

    public AppointmentManager(){
        app = new Appointments();
    }

    public void addAppointment(Appointments app)
    {
        tx = null;
        s = HibernateUtil.getSessionFactory().openSession();
    try {
        tx = s.beginTransaction();
        s.save(app);
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

    public void removeAppointment(Appointments app)
    {
        tx = null;
        s = HibernateUtil.getSessionFactory().openSession();
    try {
        tx = s.beginTransaction();
        s.delete(app);
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

    Vector getAppointments(Date date) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        List appointments =
            s.createQuery("from Appointments as app where app.date = '" + (date.getYear()+1900) + "-" + (date.getMonth()+1) + "-" + (date.getDate()) + "' order by app.time").list();
        tx.commit();
        s.close();
        return displayResult(appointments);
    }

    List getAppointmentsDuration(Date date) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        List appointments =
            s.createQuery("from Appointments as app where app.date = '" + (date.getYear()+1900) + "-" + (date.getMonth()+1) + "-" + (date.getDate()) + "' order by app.time").list();
        tx.commit();
        s.close();
        return appointments;
    }

    private Vector displayResult(List appointments) {
        Vector <Object> oneRow = new Vector<Object>();
        int id = 0;
        for(int i = 0; i < appointments.size(); i++) {
            app = (Appointments)appointments.get(i);
            oneRow.add(app.getAppointmentId());
            oneRow.add(app.getTime());
            oneRow.add(app.getDuration());
            id = app.getPatients().getPatientId();
            getPI(id,oneRow);
            oneRow.add(app.getCategory());
            oneRow.add(app.getTitle());
            oneRow.add(app.getComments());
        }
        return oneRow;
    }

    public void getPI(int patientID,Vector oneRow)
    {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        PersonalInfo pi= new PersonalInfo();
        pi = (PersonalInfo) s.load(PersonalInfo.class,patientID);
        oneRow.add(pi.getFirstName());
        oneRow.add(pi.getLastName());
        tx.commit();
        s.close();
    }

    Appointments getAppointment(int id) {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        Appointments app= new Appointments();
        app = (Appointments) s.load(Appointments.class,id);
        tx.commit();
        s.close();

        return app;
    }

    Vector searchAppointment(String lastName) {
       // Appointments app = new Appointments();
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        
        List patients = s.createQuery("from PersonalInfo p where p.lastName like '" + lastName + "%'").list();
        List appointments = s.createQuery("from Appointments a").list();
        Vector result = new Vector<Appointments>();
        for(int i = 0; i < appointments.size(); i++)
        {
            for(int j = 0; j < patients.size(); j++)
            {
            if((((Patients)((Appointments)appointments.get(i)).getPatients()).getPatientId()) == ((PersonalInfo)patients.get(j)).getPiId())
            {
                result.add(appointments.get(i));
            }
            }
        }
        tx.commit();
        s.close();
        return result;
    }

    public String getFLName(Appointments apps)
    {
        s = HibernateUtil.getSessionFactory().openSession();
        tx = s.beginTransaction();
        String str = "";
        PersonalInfo pi;
        pi = (PersonalInfo) s.load(PersonalInfo.class,apps.getPatients().getPatientId());
        str = pi.getFirstName() + " " + pi.getLastName();
        tx.commit();
        s.close();
        return str;
    }

    void setTempInfo(List list) {
        this.list = list;
    }

    public List getTempInfo ()
    {
        return list;
    }

        boolean compareWithNextAppointment(Appointments app,Appointments app1) {
        
        s = HibernateUtil.getSessionFactory().openSession();
        //tx = s.beginTransaction();
        boolean b = true;

        System.out.println(app.getDate() + "muuuuuuuu");
        List appointments = s.createQuery("from Appointments a where date = '"  + (app.getDate().getYear()+1900) + "-" + (app.getDate().getMonth()+1) + "-" + (app.getDate().getDate()) + "' order by a.time").list();
        //tx.commit();
        s.close();

        for(int i = 0; i < appointments.size(); i++)
        {
            Appointments apps = new Appointments ();
            apps =(Appointments)appointments.get(i);
            Appointments temp = new Appointments ();
            temp.setTime(new Date ((apps.getDate().getYear()), (apps.getDate().getMonth()), (apps.getDate().getDate()), apps.getTime().getHours(), (apps.getTime().getMinutes() + apps.getDuration()) ));

            if(((compareTo((Date)app1.getTime(),(Date)apps.getTime()) < 0 && compareTo(((Date)app.getTime()),(Date)apps.getTime()) < 0))|| (compareTo((Date)app.getTime(),(Date)temp.getTime()) > 0 && compareTo(((Date)app1.getTime()),(Date)temp.getTime()) > 0))
            {
                continue;
            }
            else
                return false;   
    }
        return b;
        }
        public int compareTo(Date d1,Date d2)
        {
            
            int result = 0;
            if(d1.getHours() < d2.getHours())
            {
                result = -1;
            }

            else if(d1.getHours() == d2.getHours())
            {
                if(d1.getMinutes() > d2.getMinutes())
                    result = 1;
                else if(d1.getMinutes() == d2.getMinutes())
                result = 0;
                else
                    result = -1;
            }

            else if(d1.getHours() > d2.getHours())
                result = 1;
            return result;
        }
}