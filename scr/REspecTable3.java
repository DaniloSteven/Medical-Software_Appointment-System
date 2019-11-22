/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DANILO
 */
public class REspecTable3 extends javax.swing.JFrame implements ActionListener
    {
    private final String rutaFotos;
    private final String ruta;
    private final PatientsManage cass;

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PATIENTS DATA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1070, 300, 200, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 153, 204));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 80, 990, 210);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/Delete_Icon2.png"))); // NOI18N
        jButton2.setText("DELETE");
        jPanel1.add(jButton2);
        jButton2.setBounds(1290, 300, 180, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 350);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("PATIENTS DATA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 30, 260, 40);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(361, 0, 1120, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1481, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private Patients e;

 private DefaultTableModel modelo;   
 ArrayList<Patient> todos=new ArrayList();


     public REspecTable3(Patients e) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.cass=new PatientsManage();

        this.poneaEscuchar();
        //this.leer();
        this.modelaTabla();

        this.table();
        //this.AgregarFila();
        this.e=e;

        this.ruta="./Archives/Medics.txt";//Array

        
        this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"a.jpg");
        jLabel3.setIcon(image);
        
        ImageIcon image2=new ImageIcon(rutaFotos+"as.png");
        jLabel1.setIcon(image2);
    }
     
     
            private void table()

            {


            FileReader file;

            BufferedReader br; 
            String registro; 
            try

            {

            file=new FileReader("./Archives/Patients.txt"); 
            br = new BufferedReader(file); 
            while ((registro=br.readLine())!=null)

            {

            String[] campos = registro.split(","); 

            String x=(campos[0]);
            String y=(campos[1]);
            String z=(campos[2]);
            String w=(campos[3]);
            String t=(campos[4]);
            String s=(campos[5]);
            String n=(campos[6]);
            String h=((campos[8])+","+(campos[7]));
            
            Vector fila= new Vector();
            fila.add(x+" "+y);
            fila.add(z);
            fila.add(w);
            fila.add(t);
            fila.add(s);
            fila.add(n);
            fila.add(h);

            this.modelo.addRow(fila);


            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"FATAL ERROR");

            }

            }

               private void poneaEscuchar()
               {

                   this.jButton3.addActionListener(this);
                   this.jButton2.addActionListener(this);




               }

               private void EliminarFila()
               {

                   int selected=this.jTable1.getSelectedRow();
                   if(selected>=0)
                   {
                       Object x= (this.modelo.getValueAt(selected, 1));
                       String code=objectToString(x);

                       this.cass.eliminaPatien(code);
                       this.Limpiartabla();
                       this.table();

                    //System.out.println("objeto a string=" + y);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "SELECT A ROW FIRST");
                   }

               }
               
               
   
   private void modelaTabla()
   {
       this.modelo=new DefaultTableModel();
       this.jTable1.setModel(modelo);
       
       this.modelo.addColumn("PATIENT NAME");
       this.modelo.addColumn("CODE");
       this.modelo.addColumn("BIRTH DATE");
       this.modelo.addColumn("AGE");
       this.modelo.addColumn("PHONE");
       this.modelo.addColumn("SEX");
       this.modelo.addColumn("RECIDENCE");
       
       
       
       TableColumn columna=null;
       columna = jTable1.getColumnModel().getColumn(0);
       columna.setMinWidth(250);
       columna.setMaxWidth(350);
       
       TableColumn columna2=null;
       columna2 = jTable1.getColumnModel().getColumn(1);
       columna2.setMinWidth(100);
       columna2.setMaxWidth(100);
       
       TableColumn columna3=null;
       columna3 = jTable1.getColumnModel().getColumn(3);
       columna3.setMinWidth(50);
       columna3.setMaxWidth(150);
       
       TableColumn columna5=null;
       columna5 = jTable1.getColumnModel().getColumn(5);
       columna5.setMinWidth(50);
       columna5.setMaxWidth(150);
       
       TableColumn columna6=null;
       columna6 = jTable1.getColumnModel().getColumn(2);
       columna6.setMinWidth(120);
       columna6.setMaxWidth(120);
       
        TableColumn columna7=null;
       columna7 = jTable1.getColumnModel().getColumn(4);
       columna7.setMinWidth(120);
       columna7.setMaxWidth(120);
       
       
       
        TableRowSorter sorter = new TableRowSorter(modelo);
        jTable1.setRowSorter(sorter);

       




   }
   
  
   
   
   private void Limpiartabla()
   {
        int filas=this.jTable1.getRowCount();
        for(int i=0;i<filas;i++)
                {
                    this.modelo.removeRow(0);
                }

   }

  
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
      
        
        
        if(evento.getSource()==jButton3)
        {
        
            this.setVisible(false);
            this.e.setVisible(true);            
                   
        }
        
        if(evento.getSource()==jButton2)
        {
                if( JOptionPane.showConfirmDialog(null,"Are you sure you want to exit this session?","Exitting Window", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)

             {
                             this.EliminarFila();

             }
                   
        }
        
        
                
            
    }

    private String objectToString(Object x) 
    {

         String y;
        y = (String) x;
        return y;    }
}
