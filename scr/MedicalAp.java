/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;



/**
 *
 * @author DANILO
 */
public class MedicalAp 
{
    //atributos (varables de clase)
    
    private String name;
    private String code;
    private String espec;
    private String doc;
   private String codedoc;
    private String day;
    private String hour;
    private String conf;
  
    //metodos
    //constructores
    public MedicalAp()
    {
        this.name="";
        this.code="";
        this.espec="";
        this.doc="";
        this.codedoc="";
        this.day="";
        this.hour="";
        this.conf="";
        
    }

    public MedicalAp(String name,String code,String espec,String doc,String codedoc,String day,String hour,String conf) 
    {
         this.name=name;
        this.code=code;
        this.espec=espec;
        this.doc=doc;
        this.codedoc=codedoc;
        this.day=day;
        this.hour=hour;
        this.conf=conf;

        
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getEspec() {
        return espec;
    }

    public String getDoc() {
        return doc;
    }

    public String getCodedoc() {
        return codedoc;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public String getConf() {
        return conf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setCodedoc(String codedoc) {
        this.codedoc = codedoc;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

   

   
    

    

    @Override
    public String toString() {
        return this.name + "," + this.code+","+this.espec+","+this.doc+"," + this.codedoc+","+ this.day+","+ this.hour+"," + this.conf;
    }
    
}