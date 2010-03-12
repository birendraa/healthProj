package vidavo.pojos;
// Generated 11.3.2010 18:33: by Hibernate Tools 3.2.1.GA



/**
 * ChronicMedication generated by hbm2java
 */
public class ChronicMedication  implements java.io.Serializable {


     private int cmId;
     private Patients patients;
     private String antithromvotikaFarmaka;
     private String thromvolitikaFarmaka;
     private String antidiastaltikaTisStefaniaiasKikloforias;
     private String kardiodiegertikesGlikosides;
     private String antiikaFarmaka;
     private String antiarrythmikaFarmaka;
     private String antineoplasmatikaFarmaka;
     private String antireumatikaFarmaka;
     private String antiasthmatikaFarmaka;
     private String antithyroidikaFarmaka;
     private String thyroidikesOrmones;
     private String insulin;
     private String antidiabeticTablets;
     private String anticoagulantMedication;
     private String antipsychoticMedication;
     private String antiepilipticMedication;
     private String androgona;
     private String oistrogona;
     private String antisilliptikaFarmaka;
     private String ormones;
     private String vitamines;
     private String sidiros;
     private String antiallergikaFarmaka;
     private String otherChronicMedication;
     private String nameOfMedication;

    public ChronicMedication() {
    }

	
    public ChronicMedication(int cmId, Patients patients) {
        this.cmId = cmId;
        this.patients = patients;
    }
    public ChronicMedication(String antithromvotikaFarmaka, String thromvolitikaFarmaka, String antidiastaltikaTisStefaniaiasKikloforias, String kardiodiegertikesGlikosides, String antiikaFarmaka, String antiarrythmikaFarmaka, String antineoplasmatikaFarmaka, String antireumatikaFarmaka, String antiasthmatikaFarmaka, String antithyroidikaFarmaka, String thyroidikesOrmones, String insulin, String antidiabeticTablets, String anticoagulantMedication, String antipsychoticMedication, String antiepilipticMedication, String androgona, String oistrogona, String antisilliptikaFarmaka, String ormones, String vitamines, String sidiros, String antiallergikaFarmaka, String otherChronicMedication, String nameOfMedication) {
       this.cmId = cmId;
       this.patients = patients;
       this.antithromvotikaFarmaka = antithromvotikaFarmaka;
       this.thromvolitikaFarmaka = thromvolitikaFarmaka;
       this.antidiastaltikaTisStefaniaiasKikloforias = antidiastaltikaTisStefaniaiasKikloforias;
       this.kardiodiegertikesGlikosides = kardiodiegertikesGlikosides;
       this.antiikaFarmaka = antiikaFarmaka;
       this.antiarrythmikaFarmaka = antiarrythmikaFarmaka;
       this.antineoplasmatikaFarmaka = antineoplasmatikaFarmaka;
       this.antireumatikaFarmaka = antireumatikaFarmaka;
       this.antiasthmatikaFarmaka = antiasthmatikaFarmaka;
       this.antithyroidikaFarmaka = antithyroidikaFarmaka;
       this.thyroidikesOrmones = thyroidikesOrmones;
       this.insulin = insulin;
       this.antidiabeticTablets = antidiabeticTablets;
       this.anticoagulantMedication = anticoagulantMedication;
       this.antipsychoticMedication = antipsychoticMedication;
       this.antiepilipticMedication = antiepilipticMedication;
       this.androgona = androgona;
       this.oistrogona = oistrogona;
       this.antisilliptikaFarmaka = antisilliptikaFarmaka;
       this.ormones = ormones;
       this.vitamines = vitamines;
       this.sidiros = sidiros;
       this.antiallergikaFarmaka = antiallergikaFarmaka;
       this.otherChronicMedication = otherChronicMedication;
       this.nameOfMedication = nameOfMedication;
    }
   
    public int getCmId() {
        return this.cmId;
    }
    
    public void setCmId(int cmId) {
        this.cmId = cmId;
    }
    public Patients getPatients() {
        return this.patients;
    }
    
    public void setPatients(Patients patients) {
        this.patients = patients;
    }
    public String getAntithromvotikaFarmaka() {
        return this.antithromvotikaFarmaka;
    }
    
    public void setAntithromvotikaFarmaka(String antithromvotikaFarmaka) {
        this.antithromvotikaFarmaka = antithromvotikaFarmaka;
    }
    public String getThromvolitikaFarmaka() {
        return this.thromvolitikaFarmaka;
    }
    
    public void setThromvolitikaFarmaka(String thromvolitikaFarmaka) {
        this.thromvolitikaFarmaka = thromvolitikaFarmaka;
    }
    public String getAntidiastaltikaTisStefaniaiasKikloforias() {
        return this.antidiastaltikaTisStefaniaiasKikloforias;
    }
    
    public void setAntidiastaltikaTisStefaniaiasKikloforias(String antidiastaltikaTisStefaniaiasKikloforias) {
        this.antidiastaltikaTisStefaniaiasKikloforias = antidiastaltikaTisStefaniaiasKikloforias;
    }
    public String getKardiodiegertikesGlikosides() {
        return this.kardiodiegertikesGlikosides;
    }
    
    public void setKardiodiegertikesGlikosides(String kardiodiegertikesGlikosides) {
        this.kardiodiegertikesGlikosides = kardiodiegertikesGlikosides;
    }
    public String getAntiikaFarmaka() {
        return this.antiikaFarmaka;
    }
    
    public void setAntiikaFarmaka(String antiikaFarmaka) {
        this.antiikaFarmaka = antiikaFarmaka;
    }
    public String getAntiarrythmikaFarmaka() {
        return this.antiarrythmikaFarmaka;
    }
    
    public void setAntiarrythmikaFarmaka(String antiarrythmikaFarmaka) {
        this.antiarrythmikaFarmaka = antiarrythmikaFarmaka;
    }
    public String getAntineoplasmatikaFarmaka() {
        return this.antineoplasmatikaFarmaka;
    }
    
    public void setAntineoplasmatikaFarmaka(String antineoplasmatikaFarmaka) {
        this.antineoplasmatikaFarmaka = antineoplasmatikaFarmaka;
    }
    public String getAntireumatikaFarmaka() {
        return this.antireumatikaFarmaka;
    }
    
    public void setAntireumatikaFarmaka(String antireumatikaFarmaka) {
        this.antireumatikaFarmaka = antireumatikaFarmaka;
    }
    public String getAntiasthmatikaFarmaka() {
        return this.antiasthmatikaFarmaka;
    }
    
    public void setAntiasthmatikaFarmaka(String antiasthmatikaFarmaka) {
        this.antiasthmatikaFarmaka = antiasthmatikaFarmaka;
    }
    public String getAntithyroidikaFarmaka() {
        return this.antithyroidikaFarmaka;
    }
    
    public void setAntithyroidikaFarmaka(String antithyroidikaFarmaka) {
        this.antithyroidikaFarmaka = antithyroidikaFarmaka;
    }
    public String getThyroidikesOrmones() {
        return this.thyroidikesOrmones;
    }
    
    public void setThyroidikesOrmones(String thyroidikesOrmones) {
        this.thyroidikesOrmones = thyroidikesOrmones;
    }
    public String getInsulin() {
        return this.insulin;
    }
    
    public void setInsulin(String insulin) {
        this.insulin = insulin;
    }
    public String getAntidiabeticTablets() {
        return this.antidiabeticTablets;
    }
    
    public void setAntidiabeticTablets(String antidiabeticTablets) {
        this.antidiabeticTablets = antidiabeticTablets;
    }
    public String getAnticoagulantMedication() {
        return this.anticoagulantMedication;
    }
    
    public void setAnticoagulantMedication(String anticoagulantMedication) {
        this.anticoagulantMedication = anticoagulantMedication;
    }
    public String getAntipsychoticMedication() {
        return this.antipsychoticMedication;
    }
    
    public void setAntipsychoticMedication(String antipsychoticMedication) {
        this.antipsychoticMedication = antipsychoticMedication;
    }
    public String getAntiepilipticMedication() {
        return this.antiepilipticMedication;
    }
    
    public void setAntiepilipticMedication(String antiepilipticMedication) {
        this.antiepilipticMedication = antiepilipticMedication;
    }
    public String getAndrogona() {
        return this.androgona;
    }
    
    public void setAndrogona(String androgona) {
        this.androgona = androgona;
    }
    public String getOistrogona() {
        return this.oistrogona;
    }
    
    public void setOistrogona(String oistrogona) {
        this.oistrogona = oistrogona;
    }
    public String getAntisilliptikaFarmaka() {
        return this.antisilliptikaFarmaka;
    }
    
    public void setAntisilliptikaFarmaka(String antisilliptikaFarmaka) {
        this.antisilliptikaFarmaka = antisilliptikaFarmaka;
    }
    public String getOrmones() {
        return this.ormones;
    }
    
    public void setOrmones(String ormones) {
        this.ormones = ormones;
    }
    public String getVitamines() {
        return this.vitamines;
    }
    
    public void setVitamines(String vitamines) {
        this.vitamines = vitamines;
    }
    public String getSidiros() {
        return this.sidiros;
    }
    
    public void setSidiros(String sidiros) {
        this.sidiros = sidiros;
    }
    public String getAntiallergikaFarmaka() {
        return this.antiallergikaFarmaka;
    }
    
    public void setAntiallergikaFarmaka(String antiallergikaFarmaka) {
        this.antiallergikaFarmaka = antiallergikaFarmaka;
    }
    public String getOtherChronicMedication() {
        return this.otherChronicMedication;
    }
    
    public void setOtherChronicMedication(String otherChronicMedication) {
        this.otherChronicMedication = otherChronicMedication;
    }
    public String getNameOfMedication() {
        return this.nameOfMedication;
    }
    
    public void setNameOfMedication(String nameOfMedication) {
        this.nameOfMedication = nameOfMedication;
    }




}


