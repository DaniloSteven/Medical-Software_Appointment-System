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
public class Patient 
{
    //atributos (varables de clase)
    
    private String name;
    private String surname;
    private String code;
    private String birth;
    private String age;
    private String phone;
    private String sex;
    private String country;
    private String city;
   
  
    //metodos
    //constructores
    public Patient()
    {
        this.name="";
        this.surname="";
        this.code="";
        this.birth="";
        this.age="";
        this.phone="";
        this.sex="";
        this.country="";
        this.city="";
        
        
        
        
        
    }

    public Patient(String name,String surname,String code,String birth,String age,String phone,String sex,String country,String city) 
    {
        this.name = name;
        this.surname=surname;
        this.code = code;
        this.birth=birth;
        this.age=age;
        this.phone=phone;
        this.sex=sex;
        this.country=country;
        this.city=city;
        
    }

    public String getCodigo() {
        return code;
    }

    public String getNombre() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }

    public String getBirth() {
        return birth;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    
    

    public void setCodigo(String codigo) {
        this.code = codigo;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

 

    @Override
    public String toString() {
        return this.name + "," + this.surname+","+this.code+","+this.birth+","+this.age+","+this.phone+","+this.sex+","+this.country+","+this.city;
    }
    
}