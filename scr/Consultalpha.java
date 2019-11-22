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
public class Consultalpha extends javax.swing.JFrame implements ActionListener
    {
    private DefaultTableModel modelo;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("MEDIC (USER)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 130, 300, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("SPECIALTY:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 170, 240, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("MEDIC:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 230, 220, 22);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("Go to Appointment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(630, 610, 320, 40);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT", "PATIENT ID", "SPECIALTY", "DAY", "START HOUR", "FINAL HOUR"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 300, 990, 170);

        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 3, true));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 290, 1020, 190);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("MEDICAL APPOINTMENT");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 40, 460, 40);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 170, 220, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 220, 220, 30);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 160, 400, 110);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private PASSLogin pp;
    
     public Consultalpha(PASSLogin pp) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.pp=pp;
        this.modelaTabla();
        
        
    }
     
   private void poneaEscuchar()
   {
       this.jButton2.addActionListener(this);
       this.jButton3.addActionListener(this);
       this.jButton5.addActionListener(this);
       
       
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

            String r=(campos[0]);
            String y=(campos[1]);
            String f=(campos[1]);
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

           
           }
          

           }

           }

           catch(IOException ioe)

           {

           JOptionPane.showMessageDialog(null,"FATAL ERROR");

           }
     }
   
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        
                if(evento.getSource()==jButton3)
        {
            this.setVisible(false);
            this.pp.setVisible(true);            
        } 
            
    }
}
