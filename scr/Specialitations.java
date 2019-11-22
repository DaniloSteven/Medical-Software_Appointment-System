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
public class Specialitations extends javax.swing.JFrame implements ActionListener,KeyListener
    {
    private final String rutaFotos;
    
       private SpecialitationManage liara;


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(1020, 460));
        setPreferredSize(new java.awt.Dimension(995, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 0, 570, 400);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("CODE:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 190, 70, 22);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 130, 270, 30);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 180, 270, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("CLEAR");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 310, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 310, 110, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("CHANGE NAME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 310, 150, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setText("DELETE");
        jPanel1.add(jButton4);
        jButton4.setBounds(410, 310, 100, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("BACK");
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 350, 220, 30);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Automatic code generation");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(40, 230, 200, 25);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("VIEW ALL");
        jPanel1.add(jButton7);
        jButton7.setBounds(250, 350, 260, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton6.setText("GENERATE");
        jPanel1.add(jButton6);
        jButton6.setBounds(250, 230, 150, 25);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 730, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 980, 401);

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private INICIO ppal;
     public Specialitations(INICIO ppal) 
    {
        initComponents();
        this.setVisible(true);
        this.ACode();
        
       this.liara=new SpecialitationManage();

        
        
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.ppal=ppal;
        
         this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"2.jpg");
        jLabel5.setIcon(image);
        
        ImageIcon image2=new ImageIcon(rutaFotos+"UMB4.jpg");
        jLabel1.setIcon(image2);
        ImageIcon image3=new ImageIcon(rutaFotos+"gh4.png");
        jLabel2.setIcon(image3);
        this.jButton6.setEnabled(false);
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
       this.jCheckBox1.addActionListener(this);
       this.jCheckBox1.addKeyListener(this);
       this.jButton6.addActionListener(this);
       this.jButton7.addActionListener(this);

       this.jButton1.addKeyListener(this);
       this.jButton2.addKeyListener(this);
       this.jButton3.addKeyListener(this);
       this.jButton4.addKeyListener(this);
       this.jButton5.addKeyListener(this);
       this.jTextField1.addKeyListener(this);
       this.jTextField2.addKeyListener(this);
       this.jCheckBox1.addKeyListener(this);
       this.jButton6.addKeyListener(this);
       this.jButton7.addKeyListener(this);


       
       
   }
    
  
 private void ACode()
   {
       if(this.jCheckBox1.isSelected())
       {

           
           if(!this.jTextField2.equals(null))
           {
             this.jTextField2.setText(null);
           }
           
           if(!this.jTextField1.equals(null))
           {
             String x,y;
            Random rnd = new Random(); 
           
           x=this.jTextField1.getText();
           y = x.substring(0,3);
          
           int ale = 1000+rnd.nextInt(9999);
           
           this.jTextField2.setText(y.toUpperCase()+ale);

           }
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
        if(evento.getSource()==jButton2)
        {
            
            
            if(this.jTextField1.getText().equals("")||this.jTextField2.getText().equals(""))
            {

               JOptionPane.showMessageDialog(null, "First Input the required data");

           

            }
            else
            {
                
                
            String code=this.jTextField2.getText();
            String name=this.jTextField1.getText();
            
            
            Specialization fulanito=new Specialization(name,code);
       
            this.liara.guardaEsp(fulanito);
          
            
            this.jTextField1.setText("");
            this.jTextField2.setText("");  

            }
        }
        if(evento.getSource()==jButton1)
        {
            this.limpiar();
            
        }
         if(evento.getSource()==jButton6)
        {
            if(!this.jTextField1.getText().equals(""))
           {
            
            this.ACode();

           }
            else
            {
             JOptionPane.showMessageDialog(null, "First Input the Especialitation name");
            }
        }
        if(evento.getSource()==jButton5)
        {
            this.setVisible(false);
            this.ppal.setVisible(true);

        }
        
        if(evento.getSource()==jCheckBox1)
        {
            if(this.jTextField1.getText().equals(""))
           {
            
             JOptionPane.showMessageDialog(null, "First Input the Especialitation name");
              this.jCheckBox1.setSelected(false);
           }
           
           
            else
            {
                this.jButton6.setEnabled(true);
            }
            
            if(!this.jCheckBox1.isSelected())
            {
              this.jButton6.setEnabled(false);
 
            }
            
            
        }
            if(evento.getSource()==jButton7)
        {
            REspecTable ope=new REspecTable(this);
            this.setVisible(false);

        }    
              if(evento.getSource()==jButton4)
        {
            
            if(!jTextField2.getText().equals(""))
            {
            
            String code=this.jTextField2.getText();
       
            this.liara.eliminaEsp(code);
            this.jTextField2.setText("");  

            
            
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Please input the code of the Specialization you want to delete");

            }

        }
        if(evento.getSource()==jButton3)
        {
        
            
            if(!jTextField2.getText().equals(""))
            {
            
                if(!jTextField1.getText().equals(""))
                {
                    String newname=this.jTextField1.getText();
                String code=this.jTextField2.getText();


                this.liara.modifyNombre(newname,code);
                 this.limpiar();

                }
                else
                {
                
                                  JOptionPane.showMessageDialog(null, "Please input the NEW NAME");

                
                }
            
            
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Please input the code of the Specialization you want to RENAME and in the Name gap the NEW NAME");

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
       
        
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        int key=e.getKeyCode();
        if(e.getSource()==jTextField2)
        {
            if(key==KeyEvent.VK_UP)
            {
                jTextField1.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jCheckBox1.requestFocus();
            }
        }
        
          if(e.getSource()==jCheckBox1)
        {
            
            
            if(key==KeyEvent.VK_ENTER)
            {
                
                jCheckBox1.setSelected(true);
                
                if(jCheckBox1.isSelected()==true)
                {
                    this.jButton6.setEnabled(true);
                    jCheckBox1.setSelected(true);
                }
            }
        }   
          if(e.getSource()==jCheckBox1)
        {
            
            if(key==KeyEvent.VK_UP)
            {
                jTextField2.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
                    {
                        jButton1.requestFocus();
                    }
            if(key==KeyEvent.VK_RIGHT)
                    {
                        jButton6.requestFocus();
                    }
        }  
          if(e.getSource()==jButton6)
        {
            
            if(key==KeyEvent.VK_UP)
            {
                jCheckBox1.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jButton5.requestFocus();
            }
            if(key==KeyEvent.VK_RIGHT)
            {
                jButton2.requestFocus();
            }
        }
          if(e.getSource()==jButton2)
        {
            
            if(key==KeyEvent.VK_LEFT)
            {
                jButton1.requestFocus();
            }
            if(key==KeyEvent.VK_RIGHT)
            {
                jButton3.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jButton5.requestFocus();
            }
        }
          if(e.getSource()==jButton3)
        {
            
            if(key==KeyEvent.VK_LEFT)
            {
                jButton2.requestFocus();
            }
            if(key==KeyEvent.VK_RIGHT)
            {
                jButton4.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jButton7.requestFocus();
            }
        }
          
           if(e.getSource()==jButton4)
        {
            
            if(key==KeyEvent.VK_LEFT)
            {
                jButton3.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jButton7.requestFocus();
            }
     
        }
           
             if(e.getSource()==jButton7)
        {
            
            
            if(key==KeyEvent.VK_ENTER)
            {
                REspecTable ope=new REspecTable(this);
                this.setVisible(false);
            }
            
            if(key==KeyEvent.VK_LEFT)
            {
                jButton5.requestFocus();
            }
            if(key==KeyEvent.VK_UP)
            {
                jButton4.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jTextField1.requestFocus();
            }
        }
             if(e.getSource()==jButton5)
        {
            if(key==KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                this.ppal.setVisible(true);
            }
            if(key==KeyEvent.VK_RIGHT)
            {
                jButton7.requestFocus();
            }
            if(key==KeyEvent.VK_UP)
            {
                jButton1.requestFocus();
            }
        }
             if(e.getSource()==jButton1)
        {
            
                        this.limpiar();
            if(key==KeyEvent.VK_ENTER)
            {
                        this.limpiar();
            }
            
            if(key==KeyEvent.VK_RIGHT)
            {
                jButton2.requestFocus();
            }
            if(key==KeyEvent.VK_DOWN)
            {
                jButton5.requestFocus();
            }
             if(key==KeyEvent.VK_UP)
            {
                jCheckBox1.requestFocus();
            }
        }
             if(e.getSource()==jTextField1)
        {
            
            
            if(key==KeyEvent.VK_UP)
            {
                jButton7.requestFocus();
            }
             if(key==KeyEvent.VK_DOWN)
            {
                jTextField2.requestFocus();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

   
}
