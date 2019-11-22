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
public class AgendaManage 
{
    //variablesclase
    
    private String ruta;
    //metodos
    //obligatorios
    public AgendaManage()
    {
        this.ruta="./Archives/Agendas.txt";//Array
        this.verificArchivo();


    }
    //metodosdeservicio

    
    
   
       public void guardaAgenda(Agenda Agent)
       {
            File file=new File(ruta);

           try
           {
                FileWriter fr=new FileWriter(file,true);
               PrintWriter ps=new PrintWriter(fr);
                ps.println(Agent);
               ps.close();
           }
           
           catch (IOException xxx)
           {
              JOptionPane.showMessageDialog(null, "SORRY, CRITICAL SISTEM FAILURE");
              xxx.printStackTrace();

           }

       }
            
        //this.fulanito=new Estadisticas(datos);
        
   
     
   /*
   public void eliminaEsp(String code)

        {

        ArrayList<Specialization> Spec=this.traerTodos(); 
        boolean encontrado=false;



        for(Specialization Espec:Spec)

        {

            if(Espec.getCodigo().equals(code))

            {

            Spec.remove(Espec); 
            this.reemplazArchivo(Spec); 
            JOptionPane.showMessageDialog(null, "ELIMINATION SUCCESSFUL"); 
            encontrado=true; 
            break;

            }

        }

        if(!encontrado)

            JOptionPane.showMessageDialog(null, "CODE NOT FOUND");

        }
   public void eliminaEspe(String code)

        {

        ArrayList<Specialization> Spec=this.traerTodos(); 
        boolean encontrado=false;



        for(Specialization Espec:Spec)

        {

            if(Espec.getCodigo().equals(code))

            {

            Spec.remove(Espec); 
            this.reemplazArchivo(Spec); 
            encontrado=true; 
            break;

            }

        }

        if(!encontrado)

            JOptionPane.showMessageDialog(null, "CODE NOT FOUND");

        }


private void reemplazArchivo(ArrayList<Specialization> Spec)

    {   
    try

        {

        File file=new File(ruta);

        FileWriter fr=new FileWriter(file, false); 
        PrintWriter ps = new PrintWriter(fr); 
        for(Specialization Espec:Spec)

        {

        ps.println(Espec);

        }

        ps.close();

        }

        catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"ERROR, SPEC NOT SAVED");

            }

       }

           private ArrayList<Specialization> traerTodos()

            {

            ArrayList<Specialization> especializacion=new ArrayList(); 

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

            Specialization special=new Specialization(campos[0],campos[1]); 
            especializacion.add(special);

            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"ERROR!! SEARCHING SPEC");

            }

            return especializacion;

            } 
     
     
     
      public void modifyNombre(String newname, String code)
                    {
                        ArrayList<Specialization> Spec=this.traerTodos(); 
                       boolean encontrado=false;


                        for(Specialization Espec:Spec)

                        {

                        if(Espec.getCodigo().equals(code))

                        {


                        Espec.setNombre(newname);
                        this.reemplazArchivo(Spec);  
                        JOptionPane.showMessageDialog(null, "MODIFICATION SUCCESSFUL"); 
                        encontrado=true; 
                        break;

                        }

                        }

                        if(!encontrado)

                        JOptionPane.showMessageDialog(null, "The code does not exist");

                    } 
       */
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
