/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
public class MedicalAppointment extends javax.swing.JFrame implements ActionListener
    {
    private final String rutaFotos;
    private DefaultTableModel modelo;
    private final MedicalApManage oxton;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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
        setTitle("OPERATION");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Starcraft", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("PATIENT ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 220, 120, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 210, 170, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setCaretColor(new java.awt.Color(0, 0, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 250, 260, 30);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Starcraft", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 260, 58, 16);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 610, 130, 40);

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("CANCEL ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 610, 130, 40);

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(960, 610, 150, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton4.setText("Search");
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 210, 80, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(540, 230, 280, 30);

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 430, 120);

        jLabel3.setFont(new java.awt.Font("Starcraft", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("PATIENT DATA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 170, 190, 19);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("REQUESITION ORDER DATA");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(510, 170, 300, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("SPECIALTY:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(540, 210, 240, 22);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(540, 300, 280, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("MEDIC:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 280, 220, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("DAY:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(890, 210, 220, 22);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(890, 230, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("HOUR:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(890, 280, 170, 22);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(890, 300, 150, 30);

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 3, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(510, 190, 570, 170);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("CANCEL APPOINMENT");
        jPanel1.add(jButton5);
        jButton5.setBounds(630, 610, 180, 40);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DAY", "START HOUR", "FINAL HOUR"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 410, 550, 170);

        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 3, true));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(510, 400, 570, 190);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("MEDICAL APPOINTMENT REQUEST");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 60, 460, 40);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 330, 430, 320);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(440, 20, 700, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private INICIO pp;
    
     public MedicalAppointment(INICIO pp) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.pp=pp;
        this.modelaTabla();
        this.buscarTodos();
        this.oxton=new MedicalApManage();
        this.llenarcombos();

        
        this.jComboBox1.setEnabled(false);
         this.jComboBox2.setEnabled(false);
         this.jComboBox3.setEnabled(false);
         this.jComboBox4.setEnabled(false);
        
        this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"35.png");
        jLabel14.setIcon(image);
        
        ImageIcon image2=new ImageIcon(rutaFotos+"ee.jpg");
        jLabel13.setIcon(image2);
    }
     
   private void poneaEscuchar()
   {
       this.jButton1.addActionListener(this);
       this.jButton2.addActionListener(this);
       this.jButton3.addActionListener(this);
       this.jButton4.addActionListener(this);
       this.jButton5.addActionListener(this);
       this.jComboBox1.addActionListener(this);
       this.jComboBox2.addActionListener(this);
       this.jComboBox3.addActionListener(this);
       this.jComboBox4.addActionListener(this);
       
       
   }
   private void llenarcombos()
   {
       
        this.jComboBox4.addItem("6:00");
        this.jComboBox4.addItem("6:30");
        this.jComboBox4.addItem("7:00");
        this.jComboBox4.addItem("7:30");
        this.jComboBox4.addItem("8:00");
        this.jComboBox4.addItem("8:30");
        this.jComboBox4.addItem("9:00");
        this.jComboBox4.addItem("9:30");
        this.jComboBox4.addItem("10:00");
        this.jComboBox4.addItem("10:30");
        this.jComboBox4.addItem("11:00");
        this.jComboBox4.addItem("11:30");
        this.jComboBox4.addItem("12:00");
        this.jComboBox4.addItem("12:30");
        this.jComboBox4.addItem("13:00");
        this.jComboBox4.addItem("13:30");
        this.jComboBox4.addItem("14:00");
        this.jComboBox4.addItem("14:30");
        this.jComboBox4.addItem("15:00");
        this.jComboBox4.addItem("15:30");
        this.jComboBox4.addItem("16:00");
        this.jComboBox4.addItem("16:30");
        this.jComboBox4.addItem("17:00");
        this.jComboBox4.addItem("17:30");
        this.jComboBox4.addItem("18:00");
        
       
   }
    private void table(String x)

            {


            FileReader file;

            BufferedReader br; 
            String registro; 
            try

            {

            file=new FileReader("./Archives/Agendas.txt"); 
            br = new BufferedReader(file); 
            while ((registro=br.readLine())!=null)

            {

                
            String[] campos = registro.split(","); 
            
            if(x.equals(campos[0]))
            {

            String r=(campos[1]);
            String y=(campos[2]);
            String f=(campos[3]);
            Vector fila= new Vector();
            fila.add(r);
            fila.add(y);
            fila.add(f);

            this.modelo.addRow(fila);
            
            }


            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"FATAL ERROR");

            }

            }
    private void modelaTabla()
   {
       this.modelo=new DefaultTableModel();
       this.jTable1.setModel(modelo);
       
       this.modelo.addColumn("DAY");
       this.modelo.addColumn("START HOUR");
       this.modelo.addColumn("END HOUR");
       
       TableColumn columna=null;
       columna = jTable1.getColumnModel().getColumn(0);
       columna.setMinWidth(150);
       columna.setMaxWidth(150);
       
       TableColumn columna2=null;
       columna2 = jTable1.getColumnModel().getColumn(1);
       columna2.setMinWidth(170);
       columna2.setMaxWidth(150);
       
        TableRowSorter sorter = new TableRowSorter(modelo);
        jTable1.setRowSorter(sorter);

       




   }
    
     private void buscarTodos()

           {


           FileReader file;

           BufferedReader br; String registro; try

           {

           file=new FileReader("./Archives/Especializaciones.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(","); 

           String x=campos[0];
           this.jComboBox1.addItem(x);

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }

           }
     private void combodoc(String espec)
     {
            FileReader file;
           BufferedReader br; String registro;
            this.jComboBox2.removeAllItems();
            this.jComboBox2.addItem("Select");

           try

           {

           file=new FileReader("./Archives/Medics.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(","); 
              
           if(espec.equals(campos[4])) 
           {

           
           String x=(campos[2]+","+campos[1]);
           String y=(campos[1]+" "+campos[2]);
           this.jComboBox2.addItem(x);
           
           }
          

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
     }
     private void enableall()
     {
         this.jComboBox1.setEnabled(true);
         this.jComboBox2.setEnabled(true);
         this.jComboBox3.setEnabled(true);
         this.jComboBox4.setEnabled(true);
     }
     private void llenarcombos(String x)
   {
       

           FileReader file;

           BufferedReader br; 
           String registro; 
           try

           {

           file=new FileReader("./Archives/Agendas.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(","); 

           if(campos[0].equals(x))
           {
           
           
           String i=campos[1];
           
           this.jComboBox3.addItem(i);
           }
            }
           
            }

           


           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
           
            this.obtenercombos();

   }
    
   private void obtenercombos()
   {
      
        for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+1)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+1);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+2)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+2);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+3)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+3);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+4)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+4);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+5)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+5);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+6)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+6);
                       
                    }
                }
for(int index=0;index<jComboBox3.getItemCount();index++)
                {
                    
                    if(this.jComboBox3.getItemAt(index).equals(this.jComboBox3.getItemAt(index+7)))
                    {
                       
                        this.jComboBox3.removeItemAt(index+7);
                       
                    }
                }
   }
      private void verifyid(String id)
     {
            FileReader file;
           BufferedReader br; String registro;
            boolean enc=false;

           try

           {

           file=new FileReader("./Archives/Patients.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(",");
           
               
               
           if(id.equals(campos[2])) 
           {
               JOptionPane.showMessageDialog(null,"Patient Identified: "+campos[0]+" "+campos[1]);
               this.jTextField2.setText(campos[0]+" "+campos[1]);
           this.enableall();
           enc=true;
           break;
               
           }
           

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
           if(enc==false)
           {
                JOptionPane.showMessageDialog(null,"THE MPUT ID DOES NOT EXIST");
                this.jTextField1.setEditable(true);
           }
     }
     private void docs(String doc)
     {
            FileReader file;
           BufferedReader br; String registro;
            

           try

           {

           file=new FileReader("./Archives/Medics.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(",");
           
           String[] docs = doc.split(","); 
               
               
           if(docs[0].equals(campos[2])&&docs[1].equals(campos[1])) 
           {

           
           String x=(campos[3]);
           this.table(x);
           this.llenarcombos(x);

           
           }
          

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
     }
   private void limpiar()
   {
     this.jTextField1.setText("");
     this.jTextField2.setText("");

   }
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getSource()==jComboBox1)
        {
            if(this.jComboBox1.getSelectedIndex()==0)
            {
                
            }
            else
            {
                    Object e = jComboBox1.getSelectedItem();
                    String espec = String.valueOf(e);       
                    this.combodoc(espec);
            
            }
            
            
        }
        
         if(evento.getSource()==jComboBox2)
        {
            if(this.jComboBox2.getSelectedIndex()==0)
            {
                
            }
            else
            {
                    Object e = jComboBox2.getSelectedItem();
                    String doc = String.valueOf(e);       
                    this.docs(doc);
            
            }
            
            
        }
         
          if(evento.getSource()==jButton4)
        {
            if(this.jTextField1.getText().equals(""))
            {
                           JOptionPane.showMessageDialog(null,"What the hell, Imput the ID FIRST!!!!!!!","fatal user error",1);

            }
            else
            {
                            Object c=this.jTextField1.getText();
                            String id = String.valueOf(c);       
                            this.jTextField1.setEditable(false);
                            this.verifyid(id);
            
            }
            
            
        }
        
        if(evento.getSource()==jButton2)
        {
            this.limpiar();
            
        }
        
        if(evento.getSource()==jButton1)
        {
          
            if(this.jComboBox1.getSelectedIndex()==0||this.jComboBox2.getSelectedIndex()==0||this.jTextField1.getText().equals("")||this.jComboBox3.getSelectedIndex()==0||this.jTextField2.getText().equals("")||this.jComboBox4.getSelectedIndex()==0)
            {

               JOptionPane.showMessageDialog(null, "First Input the required data");

           

            }
            else
            {
            String code=this.jTextField1.getText();
            String name=this.jTextField2.getText();
            Object e = jComboBox1.getSelectedItem();
            String espec = String.valueOf(e); 
            Object a = jComboBox2.getSelectedItem();
            String doc = String.valueOf(a); 
             Object b = jComboBox3.getSelectedItem();
            String day = String.valueOf(b); 
             Object c = jComboBox4.getSelectedItem();
            String hour = String.valueOf(c); 
            FileReader file;
           BufferedReader br; String registro;
            

           try

           {

           file=new FileReader("./Archives/Medics.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(",");
           
           String[] docs = doc.split(","); 
               
               
           if(docs[0].equals(campos[2])&&docs[1].equals(campos[1])) 
           {

           
           String codedoc=(campos[3]);
           
           String conf="No";
            MedicalAp Appoint=new MedicalAp(name,code,espec,doc,codedoc,day,hour,conf);
       
            this.oxton.guardaApp(Appoint);
           
           }
          

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
           JOptionPane.showMessageDialog(null,"SAVED");

           
            this.jTextField1.setEditable(true);

          
            this.jTextField1.setText("");
            this.jTextField2.setText("");
            this.jComboBox1.setSelectedIndex(0);
            this.jComboBox2.setSelectedIndex(0);
            this.jComboBox3.setSelectedIndex(0);
            this.jComboBox4.setSelectedIndex(0);


            }
        
            
        }
        if(evento.getSource()==jButton3)
        {
            this.setVisible(false);
            this.pp.setVisible(true);

        }
                
            
    }
}
