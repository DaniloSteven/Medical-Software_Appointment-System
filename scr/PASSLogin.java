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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class PASSLogin extends javax.swing.JFrame implements ActionListener
    {
    private final String rutaFotos;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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
        setTitle("LOG IN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel1.setLayout(null);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 204));
        jButton5.setText("LOG IN");
        jPanel1.add(jButton5);
        jButton5.setBounds(840, 380, 130, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("BACK");
        jPanel1.add(jButton6);
        jButton6.setBounds(710, 380, 120, 30);

        jPasswordField1.setText("imputpassword");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(730, 310, 210, 30);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(730, 260, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("USER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(660, 270, 50, 19);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("ACCES CODE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(610, 310, 110, 19);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(600, 250, 40, 40);

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 230, 400, 140);

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1040, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private INICIO pl;
     public PASSLogin(INICIO pl) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.pl=pl;
        this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"ae3.jpg");
        jLabel9.setIcon(image);
        
        ImageIcon image2=new ImageIcon(rutaFotos+"Bio.png");
        jLabel7.setIcon(image2);
    }
     
   private void poneaEscuchar()
   {
       this.jButton5.addActionListener(this);
       this.jButton6.addActionListener(this);

       
       
   }
   
   
   private void limpiar()
   {
     this.jTextField1.setText("");
     this.jPasswordField1.setText("Imputpassword");

   }
   private void vericode(String user)
     {
            FileReader file;
           BufferedReader br; String registro;
            boolean enc=false;

           try

           {

           file=new FileReader("./Archives/Passwords.txt"); 
           br = new BufferedReader(file); 
           while ((registro = br.readLine()) != null)

           {

           String[] campos = registro.split(",");
           
               String x=campos[1];
               String y=campos[2];
               
               
           if(user.equals(campos[3])) 
           {
           String clave=campos[0];
           this.Validar(x,y,clave);
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
           }
     }
   
   private void Validar(String x, String y,String clave)
   {
       
     
       
              if(this.jTextField1.getText().length()!=0)
              {
                  char[] key=this.jPasswordField1.getPassword();
                  if(key.length!=0)
                  {
                      String laclave=new String(key);
                    
                          if(laclave.equals(clave))
                          {
                              JOptionPane.showMessageDialog(null,"WELCOME DR. "+x+" "+y);
                                    Consultalpha start=new Consultalpha(this);
                                    this.setVisible(false);
                          }
                          else
                          {
                             JOptionPane.showMessageDialog(null, "Wrong PASSWORD");

                          }
                     
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "INPUT THE PASSWORD");

                  }
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "WTF?, IMPUT THE USER");
              }
               if(this.jTextField1.getText().length()==0)
              {
                  
              }

   }
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getSource()==jButton5)
        {
            if(this.jTextField1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "IMPUT THE USER NUMBER FIRST");
            }
            else
            {
                String user=this.jTextField1.getText();
                this.vericode(user);
            }
        }
        
            
        
        if(evento.getSource()==jButton6)
        {
            this.setVisible(false);
            this.pl.setVisible(true);

        }
                
            
    }
}
