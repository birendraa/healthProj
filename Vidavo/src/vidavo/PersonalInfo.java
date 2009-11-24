/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidavo;

/**
 *
 * @author sanja
 */
public class PersonalInfo implements PersonalInfoInterface{

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

    public void setID(int iD)
    {
        id = iD;
    }

    public int getID()
    {
        return id;
    }

    public void setLName(String ln)
    {
        lName = ln;
    }

    public String getLName()
    {
        return lName;
    }

    public void setMName(String mn)
    {
        mName = mn;
    }

    public String getMName()
    {
        return mName;
    }

    public void setFName(String fn)
    {
        fName = fn;
    }

    public String getFName()
    {
        return fName;
    }

    public void setAddress(String add)
    {
        address = add;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddresNum(int addN)
    {
        addressNum = addN;
    }

    public int getAddressNum()
    {
        return addressNum;
    }

    public void setCity(String cit)
    {
        city = cit;
    }

    public String getCity()
    {
        return city;
    }

    public void setState(String st)
    {
        state = st;
    }

    public String getState()
    {
        return state;
    }

    public void setCountry(String ct)
    {
        country = ct;
    }

    public String getCountry()
    {
        return country;
    }

    public void setPostalCode(int pc)
    {
        postalCode = pc;
    }

    public int getPostalCode()
    {
        return postalCode;
    }

    public void setCitizenship(String cit)
    {
        citizenship = cit;
    }

    public String getCitizenship()
    {
        return citizenship;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWeight(int w)
    {
        weight = w;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setSex(String s)
    {
        sex = s;
    }

    public String getSex()
    {
        return sex;
    }

    public void setMaritalStatus(String ms)
    {
        maritalStatus = ms;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }

    public void setBirthDate(String bd)
    {
        birthDate = bd;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setProfession(String prof)
    {
        profession = prof;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setInsurance(String insur)
    {
        insurance = insur;
    }

    public String getInsurance()
    {
        return insurance;
    }

    public void setAmka(int a)
    {
        amka = a;
    }

    public int getAmka()
    {
        return amka;
    }

    public void setTameio(String tam)
    {
        tameio = tam;
    }

    public String getTameio()
    {
        return tameio;
    }

    public void setFirstVisit(String fv)
    {
        firstVisit = fv;
    }

    public String getFirstVisit()
    {
        return firstVisit;
    }

    public void setLChildren(int child)
    {
        children = child;
    }

    public int getChildren()
    {
        return children;
    }

    public void setHomeNum(String hn)
    {
        homePhNum = hn;
    }

    public String getHomeNum()
    {
        return homePhNum;
    }

     public void setWorkNum(String wn)
    {
        workPhNum = wn;
    }

    public String getWorkNum()
    {
        return workPhNum;
    }

     public void setCellPhone(String cp)
    {
        cellPhone = cp;
    }

    public String getCellPhone()
    {
        return cellPhone;
    }

     public void setFax(String f)
    {
        fax = f;
    }

    public String getFax()
    {
        return fax;
    }

     public void setEmail(String e)
    {
        email = e;
    }

    public String getEmail()
    {
        return email;
    }
}
