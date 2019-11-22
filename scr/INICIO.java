/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class INICIO extends javax.swing.JFrame implements ActionListener
    {
    private final String rutaFotos;



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
        setTitle("UMBRELLA CORPORATION MEDICAL SERVICES");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 90);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 90, 510, 350);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 100, 670, 640);

        jLabel4.setText("jLabel4");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 460, 510, 280);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 10, 1150, 80);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        jMenuBar1.setForeground(new java.awt.Color(204, 0, 0));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jMenu1.setForeground(new java.awt.Color(204, 0, 0));
        jMenu1.setText("OPERATIONS");
        jMenu1.setBorderPainted(true);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(190, 25));

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/icon.png"))); // NOI18N
        jMenuItem2.setText("Specialities");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem2.setBorderPainted(true);
        jMenuItem2.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/box.png"))); // NOI18N
        jMenuItem3.setText("Medical Staff");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem3.setBorderPainted(true);
        jMenuItem3.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/fa.png"))); // NOI18N
        jMenuItem4.setText("Patients data");
        jMenuItem4.setActionCommand("Patients Data");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem4.setBorderPainted(true);
        jMenuItem4.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu1.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/ste.png"))); // NOI18N
        jMenuItem5.setText("Medical Appointments");
        jMenuItem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem5.setBorderPainted(true);
        jMenuItem5.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu1.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/re3.png"))); // NOI18N
        jMenuItem6.setText("Medical Consultation");
        jMenuItem6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem6.setBorderPainted(true);
        jMenuItem6.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jMenu3.setForeground(new java.awt.Color(204, 0, 0));
        jMenu3.setText("ABOUT US");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(135, 28));

        jMenuItem8.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/handshake2.png"))); // NOI18N
        jMenuItem8.setText("Business Partners");
        jMenuItem8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem8.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/medicalfacilities.png"))); // NOI18N
        jMenuItem9.setText("Medical Facilities");
        jMenuItem9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem9.setPreferredSize(new java.awt.Dimension(350, 50));
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jMenu2.setForeground(new java.awt.Color(204, 0, 0));
        jMenu2.setText("LOG OUT");
        jMenu2.setToolTipText("");
        jMenu2.setBorderPainted(true);
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(130, 27));

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/exit3.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jMenuItem1.setBorderPainted(true);
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(220, 60));
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

public static void main(String args[]) 
    {
        new INICIO();

    }
     public INICIO() 
    {
        initComponents();
        
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
       
        this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"UMB2.gif");
        jLabel1.setIcon(image);
        ImageIcon image2=new ImageIcon(rutaFotos+"umbrellacorp3.jpg");
        jLabel3.setIcon(image2);
        ImageIcon image3=new ImageIcon(rutaFotos+"UmbrellaAd2.png");
        jLabel2.setIcon(image3);
        ImageIcon image4=new ImageIcon(rutaFotos+"GW2.gif");
        jLabel4.setIcon(image4);
        ImageIcon image5=new ImageIcon(rutaFotos+"wide.png");
        jLabel5.setIcon(image5);
        
    }
    
     
   private void poneaEscuchar()
   {
       this.jMenuItem2.addActionListener(this);
       this.jMenuItem3.addActionListener(this);
       this.jMenuItem4.addActionListener(this);
       this.jMenuItem5.addActionListener(this);
       this.jMenuItem6.addActionListener(this);
       this.jMenuItem1.addActionListener(this);
       this.jMenuItem8.addActionListener(this);
       this.jMenuItem9.addActionListener(this);

       
       
   }
   
  
   

  
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
      
        if(evento.getSource()==jMenuItem3)
        {
            MedicalStaff op=new MedicalStaff(this);
            this.setVisible(false);
        }
        if(evento.getSource()==jMenuItem1)
        {
                       if( JOptionPane.showConfirmDialog(null,"Are you sure you want to exit this session?","Exitting Window", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)

             {
            System.exit(0);
             }
            
        }
        if(evento.getSource()==jMenuItem2)
        {
            Specialitations ope=new Specialitations(this);
            this.setVisible(false);
        }   
        
       
        if(evento.getSource()==jMenuItem5)
        {
            MedicalAppointment ope=new MedicalAppointment(this);
            this.setVisible(false);
        }   
        
        if(evento.getSource()==jMenuItem4)
        {
            Patients e=new Patients(this);
            this.setVisible(false);
        } 
        /*
        if(evento.getSource()==jMenuItem9)
        {
            Patients e=new Patients(this);
            this.setVisible(false);
        }  
                */
        if(evento.getSource()==jMenuItem8)
        {
           
            
            Business start=new Business(this);
            this.setVisible(false);
            
        }   
        if(evento.getSource()==jMenuItem6)
        {
           
            
            PASSLogin start=new PASSLogin(this);
            this.setVisible(false);
            
        }   
            
    }
}
