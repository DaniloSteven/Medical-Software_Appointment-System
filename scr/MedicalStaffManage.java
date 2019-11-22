/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class MedicalStaffManage 
{
    //variablesclase
    private String ruta;
    //metodos
    //obligatorios
    public MedicalStaffManage()
    {
        this.ruta="./Archives/Medics.txt";//Array
        this.verificArchivo();
        

    }
    //metodosdeservicio

    
    
   
      public void guardaMedic(Medic Med)
       {
            File file=new File(ruta);

           try
           {
                FileWriter fr=new FileWriter(file,true);
               PrintWriter ps=new PrintWriter(fr);
                ps.println(Med);
               ps.close();
               JOptionPane.showMessageDialog(null, "MEDIC SAVE");
           }
           catch (IOException xxx)
           {
              JOptionPane.showMessageDialog(null, "SORRY, CRITICAL SISTEM FAILURE");
              xxx.printStackTrace();

           }
       }
        //this.fulanito=new Estadisticas(datos);
        
    public void eliminaMedic(String code)

{

ArrayList<Medic> Medi=this.traerTodos(); 
boolean encontrado=false;


for(Medic medical:Medi)

{

if(medical.getCodigo().equals(code))

{

Medi.remove(medical); //lo elimina del Arreglo 
this.reemplazArchivo(Medi); //reemplaza el archivo 
JOptionPane.showMessageDialog(null, "DELETE SUCCESSFUL"); 
encontrado=true; 
break;

}

}

if(!encontrado)

JOptionPane.showMessageDialog(null, "That ID does not exist");

}

private void reemplazArchivo(ArrayList<Medic> Med)

{ try

{

File file=new File(ruta);

FileWriter fr=new FileWriter(file, false); 
PrintWriter ps = new PrintWriter(fr); 
for(Medic med:Med)

{

ps.println(med);

}

ps.close();

}

catch(IOException ioe)

{

JOptionPane.showMessageDialog(null,"SAVE Unsuccessful");


}

}

           

            
            private ArrayList<Medic> traerTodos()

            {

            ArrayList<Medic> Medi=new ArrayList(); 

            FileReader file;

            BufferedReader br; 
            String registro; 
            
            try

            {
            file=new FileReader(ruta); 
            br = new BufferedReader(file); 
            while ((registro = br.readLine()) != null)
            {

            String[] campos = registro.split(","); 

            Medic stud=new Medic(Integer.parseInt(campos[0]),campos[1],campos[2],campos[3],(campos[4]),campos[5],campos[6],Integer.parseInt(campos[7]),campos[8],campos[9],campos[10]); 
            Medi.add(stud);

            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"ERROR!! SEARCHING MEDIC");

            }

            return Medi;

            } 
                        //
                      
               
                    public void modifyExt(String name, String surname, String code,String espec,String phone,String age, int sexo, String birth, String mail,String photo)
                    {
                       ArrayList<Medic> Med=this.traerTodos(); 
                       boolean encontrado=false;

                        for(Medic Alpha:Med)

                        {

                        if(Alpha.getCodigo().equals(code))

                        {


                        Alpha.setNombre(name);
                        Alpha.setApellidos(surname);
                        Alpha.setEspecializacion(espec);
                        Alpha.setTelefono(phone);
                        Alpha.setAge(age);
                        Alpha.setSexo(sexo);
                        Alpha.setBirth(birth);
                        Alpha.setEmail(mail);
                        Alpha.setFoto(photo);
                        this.reemplazArchivo(Med); 
                        JOptionPane.showMessageDialog(null, "MODIFICATION SUCCESSFUL");                        
                        encontrado=true; 
                        break;

                        }

                        }

                        if(!encontrado)

                        JOptionPane.showMessageDialog(null, "That ID does not exist");

                    } 

                    
                    private void verificArchivo()
                    {
                        try
                        {
                           File objetofile=new File(this.ruta); 
                           if(!objetofile.exists())
                           {
                               objetofile.createNewFile();
                           }
                        }
                        catch(IOException xxx)
                        {
                            JOptionPane.showMessageDialog(null, "HEY ROUTE PROBLEMS OVER HERE!!!!");
                            xxx.printStackTrace();
                        }
                    }
             
}
