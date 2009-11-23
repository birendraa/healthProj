/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo;

/**
 *
 * @author sanja
 */
public class PersonalInfo {

    private int id;
    private String fName;
    private String mName;
    private String lName;
    private String address;
    private int addressNum;
    private String city;
    private String state;
    private String country;
    private int postalCode;
    private String citizenship;
    private int height;
    private int weight;
    private String sex;
    private String maritalStatus;
    private String birthDate;
    private String profession;
    private String insurance;
    private int amka;
    private String tameio;
    private String firstVisit;
    private int children;
    private String homePhNum;
    private String workPhNum;
    private String cellPhone;
    private String fax;
    private String email;

    public PersonalInfo(int iD, String fn, String ln, String insur, int a, String tam)
    {
        id = iD;
        fName = fn;
        lName = ln;
        insurance = insur;
        amka = a;
        tameio = tam;
    }

    public PersonalInfo(int iD, String fn, String mn, String ln, String adrs, int adrsN, String cty, String stat, String cntry, int pc, String ctzship, int h, int w, String sx, String ms, String bd, String prof, String insur, int a, String tam, String fVisit, int child, String homeNum, String workNum, String cellPh, String fx, String em)
    {
        id = iD;
        fName = fn;
        mName = mn;
        lName = ln;
        address = adrs;
        addressNum = adrsN;
        city = cty;
        state = stat;
        country = cntry;
        postalCode = pc;
        citizenship = ctzship;
        height = h;
        weight = w;
        sex = sx;
        maritalStatus = ms;
        birthDate = bd;
        profession = prof;
        insurance = insur;
        amka = a;
        tameio = tam;
        firstVisit = fVisit;
        children = child;
        homePhNum = homeNum;
        workPhNum = workNum;
        cellPhone = cellPh;
        fax = fx;
        email = em;
    }

    public String getLName()
    {
        return lName;
    }

    public int getID()
    {
        return id;
    }
}
