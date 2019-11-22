/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class Patients extends javax.swing.JFrame implements ActionListener,KeyListener
    {
    private final String rutaFotos;
    
       private PatientsManage cass;


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        setTitle("SPECIALITIES");
        setMinimumSize(new java.awt.Dimension(1260, 740));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 720));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 230, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("ID NUMBER:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 330, 120, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 220, 370, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 320, 290, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("CLEAR");
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 580, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 580, 110, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("MODIFY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 580, 150, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setText("DELETE");
        jPanel1.add(jButton4);
        jButton4.setBounds(480, 580, 100, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("BACK");
        jPanel1.add(jButton5);
        jButton5.setBounds(80, 620, 220, 30);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("VIEW ALL");
        jPanel1.add(jButton7);
        jButton7.setBounds(320, 620, 260, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("SURNAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 280, 100, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 270, 360, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("PHONE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 430, 80, 22);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(200, 420, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("AGE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 370, 50, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(500, 370, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("BIRTH DATE:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 380, 119, 22);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField6.setText("yyyy/mm/dd");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(250, 370, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("SEX:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 420, 41, 22);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Female", "Male" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(460, 420, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("COUNTRY:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 480, 110, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(200, 470, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("CITY:");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 480, 60, 20);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(440, 470, 130, 30);

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 200, 520, 330);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("PATIENT'S DATA");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 170, 210, 16);

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/search2.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        jButton6.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton6.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(540, 320, 30, 30);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(230, 0, 1000, 680);

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1000, 680);

        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 296, 180, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 1230, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private INICIO ppal;
     public Patients(INICIO ppal) 
    {
        initComponents();
        this.setVisible(true);
        
       this.cass=new PatientsManage();

        
        
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.ppal=ppal;
        
         this.rutaFotos="./Images/";
         
          ImageIcon image2=new ImageIcon(rutaFotos+"helluponus3.png");
        jLabel13.setIcon(image2);
        ImageIcon image=new ImageIcon(rutaFotos+"back6.jpg");
        jLabel12.setIcon(image);
        
        /*
        ImageIcon image2=new ImageIcon(rutaFotos+"UMB4.jpg");
        jLabel1.setIcon(image2);
        ImageIcon image3=new ImageIcon(rutaFotos+"gh4.png");
        jLabel2.setIcon(image3);
        this.jButton6.setEnabled(false);
                */
    }
     
   private void poneaEscuchar()
   {
       this.jButton1.addActionListener(this);
       this.jButton2.addActionListener(this);
       this.jButton3.addActionListener(this);
       this.jButton4.addActionListener(this);
       this.jButton5.addActionListener(this);
       this.jTextField1.addKeyListener(this);
       this.jTextField2.addKeyListener(this);
       this.jButton7.addActionListener(this);
       this.jButton6.addActionListener(this);
       this.jTextField7.addKeyListener(this);
       this.jTextField8.addKeyListener(this);



       
       
   }
    
   private void SearchMedic()
    {
        
        
        if(this.jTextField2.equals(""))
        {
           JOptionPane.showMessageDialog(null, "Imput the ID first");

        }
        else
        {
        boolean encontrado=false;
        String code=this.jTextField2.getText();
            
        FileReader file;
        BufferedReader br;
        String registro;
        try
        {
            file=new FileReader("./Archives/Patients.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(campos[2].equals(code))
                {
                    this.jTextField1.setText(campos[0]);
                    this.jTextField3.setText(campos[1]);
                    this.jTextField2.setText(campos[2]);
                    String es = campos[6];
                    Object e=es;
                    this.jComboBox1.setSelectedItem(e);
                    this.jTextField4.setText(campos[5]);
                    this.jTextField8.setText(campos[8]);
                    this.jTextField5.setText(campos[4]);
                    this.jTextField6.setText(campos[3]);
                    this.jTextField7.setText(campos[7]);
                    this.jTextField2.setEditable(false);
                    this.jButton2.setEnabled(false);
                    encontrado=true;
                    break;


                }
                
            }
            if(!encontrado)
            {
             JOptionPane.showMessageDialog(null, "That ID doesn't exist");
                         this.jTextField2.setText("");

            }
        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a PATIENT");

              }
        
        
        
        }
    }
   private void limpiar()
   {
     this.jTextField1.setText("");
     this.jTextField2.setText("");
     this.jTextField3.setText("");
     this.jTextField4.setText("");
     this.jTextField5.setText("");
     this.jTextField6.setText("yyyy/mm/dd");
     this.jTextField7.setText("");
     this.jTextField8.setText("");
     this.jComboBox1.setSelectedIndex(0);
     this.jTextField2.setEditable(true);
     this.jButton2.setEnabled(true);

   }
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getSource()==jButton2)
        {
            if(this.jComboBox1.getSelectedIndex()==0||this.jTextField1.getText().equals("")||this.jTextField3.getText().equals("")||this.jTextField2.getText().equals("")||this.jTextField4.getText().equals("")||this.jTextField5.getText().equals("")||this.jTextField6.getText().equals("")||this.jTextField8.getText().equals(""))
            {

               JOptionPane.showMessageDialog(null, "First Input the required data");

           

            }
            else
            {
            String code=this.jTextField2.getText();
            String name=this.jTextField1.getText();
            String surname=this.jTextField3.getText();
            String phone=this.jTextField4.getText();
            String age=this.jTextField5.getText();
            Object e = jComboBox1.getSelectedItem();
            String sex = String.valueOf(e);  
            String birth=this.jTextField6.getText();
            String country=this.jTextField7.getText();
            String city=this.jTextField8.getText();
            
            
            
            Patient Pat=new Patient(name,surname,code,birth,age,phone,sex,country,city);
       
            this.cass.guardaPatient(Pat);
          
            
            this.limpiar();

            }
        }
        if(evento.getSource()==jButton1)
        {
            this.limpiar();
            
        }
        
        
        if(evento.getSource()==jButton5)
        {
            this.setVisible(false);
            this.ppal.setVisible(true);

        }
        
            if(evento.getSource()==jButton7)
        {
            REspecTable3 ope=new REspecTable3(this);
            this.setVisible(false);

        }    
              if(evento.getSource()==jButton4)
        {
            
            if(!jTextField2.getText().equals(""))
            {
            
            String code=this.jTextField2.getText();
       
            this.cass.eliminaPatient(code);
            this.limpiar();
            
            
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Please input the Identification Number of the patient you want to delete");

            }

        }
              if(evento.getSource()==jButton6)
              {
                  this.SearchMedic();
              }
        if(evento.getSource()==jButton3)
        {
        
            
            if(!jTextField2.getText().equals(""))
            {
            
            if(this.jComboBox1.getSelectedIndex()==0||this.jTextField1.getText().equals(null)||this.jTextField3.getText().equals(null)||this.jTextField2.getText().equals(null)||this.jTextField4.getText().equals(null)||this.jTextField5.getText().equals(null)||this.jTextField6.getText().equals(null)||this.jTextField8.getText().equals(null))
                
                {
            
                    JOptionPane.showMessageDialog(null, "Please input the NEW DATA");


                }
                else
                {
                String code=this.jTextField2.getText();
            String name=this.jTextField1.getText();
            String surname=this.jTextField3.getText();
            String phone=this.jTextField4.getText();
            String age=this.jTextField5.getText();
            Object e = jComboBox1.getSelectedItem();
            String sex = String.valueOf(e);  
            String birth=this.jTextField6.getText();
            String country=this.jTextField7.getText();
            String city=this.jTextField8.getText();
            
            
            

                 this.cass.modifyExtreme(name,surname,code,birth,age,phone,sex,country,city);
                 this.limpiar();
                 this.jTextField2.setEditable(true);
                 this.jButton2.setEnabled(true);

                
                }
            
            
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Please input the ID of the PATIENT you want to MODIFY");

            }
        }
            
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        if (jTextField2.getText().length()==7)
        {
                e.consume();
            }
        char c= e.getKeyChar();//capturar caracer que se oprimio
        if(e.getSource()==this.jTextField1)
        {
            if(Character.isLetter(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Character invalid in this space");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField2)
        {
            if(Character.isLetterOrDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Character invalid in this space");
                e.consume();
            }
        }
       
        if(e.getSource()==this.jTextField7)
        {
        if(Character.isLetter(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
        
        if(e.getSource()==this.jTextField8)
        {
        if(Character.isLetter(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

   
}
