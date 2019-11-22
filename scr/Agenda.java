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
public class Agenda 
{
    //atributos (varables de clase)
    
    private String code;
    private String day;
    private String hi;
    private String hf;
   
  
    //metodos
    //constructores
    public Agenda()
    {
        this.code="";
        this.day="";
        this.hi="";
        this.hf="";
        
        
    }

    public Agenda(String code, String day,String hi,String hf) 
    {
        this.code = code;
        this.day = day;
        this.hi=hi;
        this.hf=hf;

        
    }

   

    public String getCode() {
        return code;
    }

    public String getDay() {
        return day;
    }

    public String getHi() {
        return hi;
    }

    public String getHf() {
        return hf;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    public void setHf(String hf) {
        this.hf = hf;
    }

    

    

    @Override
    public String toString() {
        return this.code + "," + this.day+","+this.hi+","+this.hf;
    }
    
}