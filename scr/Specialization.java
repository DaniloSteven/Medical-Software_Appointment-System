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
public class Specialization 
{
    //atributos (varables de clase)
    
    private String name;
    private String code;
   
  
    //metodos
    //constructores
    public Specialization()
    {
        this.name="";
        this.code="";
        
        
    }

    public Specialization(String name, String code) {
        this.name = name;
        this.code = code;
        
    }

    public String getCodigo() {
        return code;
    }

    public String getNombre() {
        return name;
    }

    
    

    public void setCodigo(String codigo) {
        this.code = codigo;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

 

    @Override
    public String toString() {
        return this.name + "," + this.code;
    }
    
}