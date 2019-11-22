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
public class PatientsManage 
{
    //variablesclase
    
    private String ruta;
    //metodos
    //obligatorios
    public PatientsManage()
    {
        this.ruta="./Archives/Patients.txt";//Array
        this.verificArchivo();


    }
    //metodosdeservicio
    
   
       public void guardaPatient(Patient Pat)
       {
            File file=new File(ruta);

           try
           {
                FileWriter fr=new FileWriter(file,true);
               PrintWriter ps=new PrintWriter(fr);
                ps.println(Pat);
               ps.close();
               JOptionPane.showMessageDialog(null, "PATIENT SAVE");
           }
           catch (IOException xxx)
           {
              JOptionPane.showMessageDialog(null, "SORRY, CRITICAL SISTEM FAILURE");
              xxx.printStackTrace();

           }
       }
            
        
   
     
   
   public void eliminaPatient(String code)

        {

        ArrayList<Patient> Pat=this.traerTodos(); 
        boolean encontrado=false;



        for(Patient Pati:Pat)

        {

            if(Pati.getCodigo().equals(code))

            {

            Pat.remove(Pati); 
            this.reemplazArchivo(Pat); 
            JOptionPane.showMessageDialog(null, "ELIMINATION SUCCESSFUL"); 
            encontrado=true; 
            break;

            }

        }

        if(!encontrado)

            JOptionPane.showMessageDialog(null, "ID NOT FOUND");

        }
   public void eliminaPatien(String code)

        {

        ArrayList<Patient> Pati=this.traerTodos(); 
        boolean encontrado=false;



        for(Patient Pat:Pati)

        {

            if(Pat.getCodigo().equals(code))

            {

            Pati.remove(Pat); 
            this.reemplazArchivo(Pati); 
            encontrado=true; 
            break;

            }

        }

        if(!encontrado)

            JOptionPane.showMessageDialog(null, "ID NOT FOUND");

        }


private void reemplazArchivo(ArrayList<Patient> Pat)

    {   
    try

        {

        File file=new File(ruta);

        FileWriter fr=new FileWriter(file, false); 
        PrintWriter ps = new PrintWriter(fr); 
        for(Patient Pati:Pat)

        {

        ps.println(Pati);

        }

        ps.close();

        }

        catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"ERROR, PATIENT NOT SAVED");

            }

       }

           private ArrayList<Patient> traerTodos()

            {

            ArrayList<Patient> Pati=new ArrayList(); 

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

            Patient Patie=new Patient(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6],campos[7],campos[8]); 
            Pati.add(Patie);

            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"ERROR!! SEARCHING PATIENT");

            }

            return Pati;

            } 
     
     
     
      public void modifyExtreme(String name,String surname,String code,String birth,String age,String phone,String sex,String country,String city)
                    {
                        ArrayList<Patient> Pat=this.traerTodos(); 
                       boolean encontrado=false;


                        for(Patient Pati:Pat)

                        {

                        if(Pati.getCodigo().equals(code))

                        {


                        Pati.setNombre(name);
                        Pati.setSurname(surname);
                        Pati.setBirth(birth);
                        Pati.setAge(age);
                        Pati.setPhone(phone);
                        Pati.setSex(sex);
                        Pati.setCountry(country);
                        Pati.setCity(city);
                        this.reemplazArchivo(Pat);  
                        JOptionPane.showMessageDialog(null, "MODIFICATION SUCCESSFUL"); 
                        encontrado=true; 
                        break;

                        }

                        }

                        if(!encontrado)

                        JOptionPane.showMessageDialog(null, "The code does not exist");

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
                            JOptionPane.showMessageDialog(null, "Route Failure");
                            xxx.printStackTrace();
                        }
                    }
             
}
