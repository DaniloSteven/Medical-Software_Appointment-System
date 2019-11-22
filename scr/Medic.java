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
public class Medic 
{
    //atributos (varables de clase)
    private int conta;
    private String codigo;
    private String nombre;
    private String apellidos;
  //  private char sexo;
    private String especializacion;
    private String telefono;
    private String age;
    private int sexo;
    private String birth;
    private String email;
    private String foto;

    //metodos
    //constructores
    public Medic()
    {
        this.conta=0;
        this.codigo="";
        this.nombre="";
        this.apellidos="";
       // this.sexo='*';
        this.especializacion="";
        this.telefono="";
        this.age="";
        this.sexo=0;
        this.birth="";
        this.email="";
        this.foto="";
    }

    public Medic(int conta, String nombre, String apellidos,String codigo, String espec, String telefono,String age, int sexo,String birth,String email, String foto) 
    {
        this.conta=conta;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
       // this.sexo = sexo;
        this.especializacion=espec;
        this.telefono = telefono;
        this.age=age;
        this.sexo=sexo;
        this.birth= birth;
        this.email= email;
        this.foto=foto;
    }

    public int getConta() {
        return conta;
    }

    public String getFoto() {
        return foto;
    }

    public String getAge() {
        return age;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public int getSexo() 
    {
        return sexo;
    }

    public void setEspecializacion(String espec) {
        this.especializacion = espec;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
/*
    public char getSexo() {
        return sexo;
    }
*/
    public String getTelefono() {
        return telefono;
    }

    public String getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/*
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
*/
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setAge(String age) {
        this.age = age;
    }
    

    @Override
    public String toString() {
        return this.conta+","+this.nombre + "," + this.apellidos + "," + this.codigo + "," + this.especializacion+","+this.telefono +","+this.age+","+this.sexo+"," + this.birth +"," + this.email+","+this.foto;
    }
    
}