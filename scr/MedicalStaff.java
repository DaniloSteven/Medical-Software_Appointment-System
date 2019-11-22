/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICALCENTER;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class MedicalStaff extends javax.swing.JFrame implements ActionListener,KeyListener,MouseWheelListener
    {
    private final String rutaFotos;
    private final MedicalStaffManage aria;
    private int contador;
    private int conta;

   
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
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

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
        setTitle("MEDICAL STAFF");
        setMinimumSize(new java.awt.Dimension(1194, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("FIRST NAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 210, 150, 16);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 210, 300, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setCaretColor(new java.awt.Color(0, 0, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(460, 310, 260, 30);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("LAST NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 260, 140, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("VIEW ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 670, 110, 40);

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("ID NUMBER:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 310, 120, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(460, 260, 300, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 670, 140, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("BACK");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 670, 130, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("SAVE");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 670, 140, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("DELETE");
        jButton5.setToolTipText("");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(320, 670, 130, 40);

        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 200, 230, 270);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("SPECIALIZATION:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 360, 180, 22);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("TELEPHONE:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 410, 140, 22);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(490, 360, 270, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(460, 410, 150, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("SEX:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 460, 41, 22);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "MALE", "FEMALE" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(360, 460, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("BIRTH DATE:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 460, 120, 22);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField5.setText("yyyy/mm/dd");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(620, 460, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("E-MAIL:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 510, 90, 22);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(410, 510, 350, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 204));
        jButton6.setText("UPLOAD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 500, 110, 27);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton7.setText("CLEAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(150, 500, 110, 27);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/Calendar.png"))); // NOI18N
        jButton8.setText("AGENDA");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(740, 670, 140, 40);

        jButton9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/right.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(680, 670, 30, 30);

        jButton10.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/left.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(620, 670, 30, 30);

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(290, 190, 490, 380);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("PERSONAL DATA");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 160, 180, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("MEDIC PHOTO");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 160, 140, 22);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 90, 1170, 560);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, -20, 1170, 200);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(800, 110, 370, 530);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 100, 1170, 150);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MEDICALCENTER/search2.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton11);
        jButton11.setBounds(727, 310, 30, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("AGE:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(640, 410, 43, 30);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(700, 410, 60, 30);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 153, 204));
        jButton12.setText("MODIFY");
        jPanel1.add(jButton12);
        jButton12.setBounds(30, 540, 230, 27);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 153, 204));
        jButton14.setText("VIEW ALL");
        jPanel1.add(jButton14);
        jButton14.setBounds(1010, 670, 140, 40);

        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 640, 1170, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 1170, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private INICIO al;
     public MedicalStaff(INICIO al) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.buscarTodos();
               this.aria=new MedicalStaffManage();
            this.jButton9.setEnabled(false);
            this.jButton10.setEnabled(false);

        
        
        this.poneaEscuchar();
        this.al=al;
        
         this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"BARRA.jpg");
       jLabel16.setIcon(image);
        ImageIcon image2=new ImageIcon(rutaFotos+"23.png");
        jLabel10.setIcon(image2);
        
        ImageIcon image4=new ImageIcon(rutaFotos+"6.jpg");
        jLabel17.setIcon(image4);
        
        ImageIcon image3=new ImageIcon(rutaFotos+"B2ACK.jpg");
        jLabel18.setIcon(image3);
        ImageIcon image10=new ImageIcon(rutaFotos+"NO.png");
        jLabel4.setIcon(image10);
        this.jLabel4.setName("NO.png");

        
    }
     
   private void poneaEscuchar()
   {
       this.jButton1.addActionListener(this);
       this.jButton2.addActionListener(this);
       this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
       this.jButton5.addActionListener(this);
       this.jButton6.addActionListener(this);
       this.jButton7.addActionListener(this);
       this.jButton8.addActionListener(this);
       this.jTextField1.addKeyListener(this);
       this.jTextField2.addKeyListener(this);
       this.jTextField3.addKeyListener(this);
       this.jTextField4.addKeyListener(this);
       this.jTextField5.addKeyListener(this);
       this.jTextField6.addKeyListener(this);
        this.jButton9.addActionListener(this);
         this.jButton10.addActionListener(this);
          this.jButton11.addActionListener(this);
         this.jButton12.addActionListener(this);
         this.jButton14.addActionListener(this);
                this.jTextField8.addKeyListener(this);



   }
    private void buscaFoto()
   {
     JFileChooser jfc=new JFileChooser();
     String nombrefoto=new String();
     
     int rta=jfc.showSaveDialog(null);
     
     if(rta==JFileChooser.APPROVE_OPTION)
     {
         nombrefoto=jfc.getSelectedFile().getName();
         this.jLabel4.setName(nombrefoto);
     }
     else
     {
         nombrefoto="NO.png";
         this.jLabel4.setName("NO.png");
     }
      ImageIcon image=new ImageIcon(rutaFotos+nombrefoto);
      jLabel4.setIcon(image);
      
        
   }
 private void limpiarFoto()
   {
     
     String nombrefoto=new String();
     
    
      nombrefoto="NO.png";
      ImageIcon image=new ImageIcon(rutaFotos+nombrefoto);
      jLabel4.setIcon(image);
        
   }
 /*
    private void VerificaCode()
         {
              if(this.jTextField2.equals(""))
        {
           JOptionPane.showMessageDialog(null, "Imput the code first");

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
            file=new FileReader("./Archives/Medics.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(campos[3].equals(code))
                {
                    
             JOptionPane.showMessageDialog(null, "That code already exist");

                }
                
            }
            if(!encontrado)
             JOptionPane.showMessageDialog(null, "That code doesn't exist");

        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a student");

              }
        
        
        
        }
    }
   */
   
  public void contamas(int x)
  {
      /*
      conta2=conta2+1;
      if(conta2==1)
      {
          conta=-1;
      }
              */
      //pasar pagina
    
      this.Aconta();
      conta=conta+x;
       if(conta>contador)
      {
          conta=1;
      }
      if(conta==0)
      {
          conta=contador;
      }

      this.mostrarMedic(conta);
     
  }
   public void mostrarMedic(int conta)
    {
        boolean encontrado=false;
        FileReader file;
        BufferedReader br;
        String registro;
        try
        {
            file=new FileReader("./Archives/Medics.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(Integer.parseInt(campos[0])==(conta))
                {
                    this.jTextField1.setText(campos[1]);
                    this.jTextField3.setText(campos[2]);
                    this.jTextField2.setText(campos[3]);
                    String es = campos[4];
                    Object e=es;
                    this.jComboBox1.setSelectedItem(e);
                    this.jTextField4.setText(campos[5]);
                    this.jTextField8.setText(campos[6]);
                    this.jComboBox2.setSelectedIndex(Integer.parseInt(campos[7]));
                    this.jTextField5.setText(campos[8]);
                    this.jTextField6.setText(campos[9]);
                    ImageIcon image10=new ImageIcon(rutaFotos+campos[10]);
                    jLabel4.setIcon(image10);
                    this.jLabel4.setName(campos[10]);
                    encontrado=true;
                    break;


                }
                
            }
            if(!encontrado)
            {
                
            }

        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showInputDialog(null, "Fatal error, trying to search a MEDIC");

              }
        
       
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
            file=new FileReader("./Archives/Medics.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(campos[3].equals(code))
                {
                    this.jTextField1.setText(campos[1]);
                    this.jTextField3.setText(campos[2]);
                    this.jTextField2.setText(campos[3]);
                    String es = campos[4];
                    Object e=es;
                    this.jComboBox1.setSelectedItem(e);
                    this.jTextField4.setText(campos[5]);
                    this.jTextField8.setText(campos[6]);
                    this.jComboBox2.setSelectedIndex(Integer.parseInt(campos[7]));
                    this.jTextField5.setText(campos[8]);
                    this.jTextField6.setText(campos[9]);
                    ImageIcon image10=new ImageIcon(rutaFotos+campos[10]);
                    jLabel4.setIcon(image10);
                    this.jLabel4.setName(campos[10]);
                    encontrado=true;
                    break;


                }
                
            }
            if(!encontrado)
            {
             JOptionPane.showMessageDialog(null, "That ID doesn't exist");
                        this.jButton4.setEnabled(true);

            }
        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a MEDIC");

              }
        
        
        
        }
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
                private int Aconta()

                {
                FileReader file;
                contador=0;
                BufferedReader br; 
                String registro; 
                try

                    {

                    file=new FileReader("./Archives/Medics.txt"); 
                    br = new BufferedReader(file); 
                        while ((registro = br.readLine()) != null)

                        {

                        contador++;
                        }

                }

                catch(IOException ioe)

                {

                }

                return contador;
         
                }
                
   private void massiveEnable()
   {
     this.jTextField8.setEditable(true);
     this.jTextField1.setEditable(true);
     this.jTextField2.setEditable(true);
     this.jTextField3.setEditable(true);
     this.jTextField4.setEditable(true);
     this.jTextField8.setEditable(true);
     this.jTextField5.setEditable(true);
     this.jTextField6.setEditable(true);
     this.jComboBox1.setEnabled(true);
     this.jComboBox2.setEnabled(true);
     this.jButton1.setEnabled(true);
     this.jButton3.setEnabled(true);
     this.jButton4.setEnabled(true);
     this.jButton5.setEnabled(true);
     this.jButton6.setEnabled(true);
     this.jButton7.setEnabled(true);
     this.jButton11.setEnabled(true);
     this.jButton12.setEnabled(true);
          this.jButton14.setEnabled(true);

     
     
   }
   private void massiveDisable()
   {
     this.jTextField8.setEditable(false);
     this.jTextField1.setEditable(false);
     this.jTextField2.setEditable(false);
     this.jTextField3.setEditable(false);
     this.jTextField4.setEditable(false);
     this.jTextField8.setEditable(false);
     this.jTextField5.setEditable(false);
     this.jTextField6.setEditable(false);
     //this.jComboBox1.setEnabled(false);
     //this.jComboBox2.setEnabled(false);
     this.jButton1.setEnabled(false);
     this.jButton4.setEnabled(false);
     //this.jButton5.setEnabled(false);
     this.jButton6.setEnabled(false);
     this.jButton7.setEnabled(false);
     this.jButton11.setEnabled(false);
     this.jButton12.setEnabled(false);
     this.jButton14.setEnabled(false);

   }

   private void limpiar()
   {
     this.jTextField8.setText("");
     this.jTextField1.setText("");
     this.jTextField2.setText("");
     this.jTextField3.setText("");
     this.jTextField4.setText("");
     this.jTextField8.setText("");
     this.jTextField5.setText("yyyy/mm/dd");
     this.jTextField6.setText("");
     this.jComboBox1.setSelectedIndex(0);
     this.jComboBox2.setSelectedIndex(0);
     this.limpiarFoto();
     this.jButton4.setEnabled(true);
     this.jTextField2.setEditable(true);
    this.jButton9.setEnabled(false);
     this.jButton10.setEnabled(false);
   }
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getSource()==jButton4)
        {
            if(this.jComboBox1.getSelectedIndex()==0||this.jComboBox2.getSelectedIndex()==0||this.jTextField1.getText().equals("")||this.jTextField3.getText().equals("")||this.jTextField2.getText().equals("")||this.jTextField4.getText().equals("")||this.jTextField5.getText().equals("")||this.jTextField6.getText().equals("")||this.jTextField8.getText().equals(""))
            {

               JOptionPane.showMessageDialog(null, "First Input the required data");

           

            }
            else
            {
            String code=this.jTextField2.getText();
            String name=this.jTextField1.getText();
            String surname=this.jTextField3.getText();
            int especializacion=this.jComboBox1.getSelectedIndex(); 
            Object e = jComboBox1.getSelectedItem();
            String espec = String.valueOf(e);             
            String phone=this.jTextField4.getText();
            String age=this.jTextField8.getText();
            int sexo=this.jComboBox2.getSelectedIndex();
            String birth=this.jTextField5.getText();
            String email=this.jTextField6.getText();
            String foto=this.jLabel4.getName();
            this.Aconta();
            conta=contador+1;
            
             Medic Med=new Medic(conta,name,surname,code,espec,phone,age,sexo,birth,email,foto);
       
            this.aria.guardaMedic(Med);
          
            this.jTextField8.setText("");
            this.jTextField1.setText("");
            this.jTextField2.setText("");
             this.jTextField3.setText("");
            this.jTextField4.setText("");  
             this.jTextField5.setText("yyyy/mm/dd");
            this.jTextField6.setText("");  
            this.jComboBox1.setSelectedIndex(0);
            this.jComboBox2.setSelectedIndex(0);
            this.limpiarFoto();


            }
        }
        if(evento.getSource()==jButton2)
        {
            this.limpiar();
            this.jButton1.setEnabled(false);
            this.massiveEnable();

            
        }
        if(evento.getSource()==jButton11)
        {
            this.SearchMedic();
            this.jButton4.setEnabled(false);
            //this.jTextField2.setEditable(false);
            
        }
        if(evento.getSource()==jButton3)
        {
            this.setVisible(false);
            this.al.setVisible(true);

        }
        if(evento.getSource()==jButton6)
        {
                    this.buscaFoto();

        
        }
        if(evento.getSource()==jButton5)
        {
            if(this.jTextField2.getText().equals(null)||this.jTextField2.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "First Input the code");

            }
            else
            {
                     if( JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this data?","Deleting Medic", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)

                     {
                    String code=this.jTextField2.getText();
                    this.aria.eliminaMedic(code);
                    this.limpiar();
                    this.massiveEnable();
                     }
            }

        
        }
        if(evento.getSource()==jButton10)
        {
            int x=-1;
            this.contamas(x);
        
        }
         if(evento.getSource()==jButton9)
        {
                    int x=1;
            this.contamas(x);

        
        }
         if(evento.getSource()==jButton7)
        {
                    this.limpiarFoto();

        
        }
          if(evento.getSource()==jButton8)
        {
                if(this.jTextField2.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(null, " Input the ID First");

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
            file=new FileReader("./Archives/Medics.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(campos[3].equals(code))
                {
                                 JOptionPane.showMessageDialog(null, "ID Confirmed... Accessing Encripted Files\n"+
                                                                          "MEDIC: "+campos[1]+" "+campos[2] );
                    String codice=this.jTextField2.getText();
                    Agendas ope=new Agendas(this,codice);
                    this.setVisible(false);
                    encontrado=true;
                    break;


                }
                
            }
            if(!encontrado)
            {
             JOptionPane.showMessageDialog(null, "That ID doesn't exist");
                        this.jButton4.setEnabled(true);

            }
        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a MEDIC");

              }
                
                }
        
        }
        if(evento.getSource()==jButton1)
        {
            conta=0;
            int x=1;
            this.contamas(x);
            //this.jButton1.setEnabled(false);
            this.jButton9.setEnabled(true);
            this.jButton10.setEnabled(true);
            this.massiveDisable();
            
        }
        if(evento.getSource()==jButton14)
        {
            REspecTable2 ope=new REspecTable2(this);
            this.setVisible(false);

        }    
        if(evento.getSource()==jButton12)
        {
       
            boolean encontrado=false;
        String code=this.jTextField2.getText();
            
        FileReader file;
        BufferedReader br;
        String registro;
        try
        {
            file=new FileReader("./Archives/Medics.txt");
            br= new BufferedReader(file);
            while((registro=br.readLine())!= null)
            {
                String[] campos = registro.split(",");
                if(campos[3].equals(code))
                {
                    
                
            if(this.jComboBox1.getSelectedIndex()==0||this.jComboBox2.getSelectedIndex()==0||this.jTextField1.getText().equals("")||this.jTextField3.getText().equals("")||this.jTextField2.getText().equals("")||this.jTextField4.getText().equals("")||this.jTextField5.getText().equals("")||this.jTextField6.getText().equals("")||this.jTextField8.getText().equals(""))
            {

               JOptionPane.showMessageDialog(null, "First Input the required data");

           

            }
            else
            {
            String name=this.jTextField1.getText();
            String surname=this.jTextField3.getText();
            //int especializacion=this.jComboBox1.getSelectedIndex();
            Object e = jComboBox1.getSelectedItem();
            String espec = String.valueOf(e);
            String phone=this.jTextField4.getText();
            String age=this.jTextField8.getText();
            int sexo=this.jComboBox2.getSelectedIndex();
            String birth=this.jTextField5.getText();
            String email=this.jTextField6.getText();
            String photo=this.jLabel4.getName();

            
       
            this.aria.modifyExt(name,surname,code,espec,phone,age,sexo,birth,email,photo);
          
            
            this.jTextField8.setText("");
            this.jTextField1.setText("");
            this.jTextField2.setText("");
             this.jTextField3.setText("");
            this.jTextField4.setText("");  
             this.jTextField5.setText("yyyy/mm/dd");
            this.jTextField6.setText("");  
            this.jComboBox1.setSelectedIndex(0);
            this.jComboBox2.setSelectedIndex(0);
            this.limpiarFoto();
            this.jTextField2.setEditable(true);
            this.jButton4.setEnabled(true);
            }
                        encontrado=true;

            }
            }
             if(!encontrado)
             JOptionPane.showMessageDialog(null, "That code doesn't exist");

        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a MEDIC");

              }
        
        
        
        }
        }

        


    @Override
    public void keyTyped(KeyEvent e) 
    {
        if (jTextField2.getText().length()==10)
            {
                e.consume();
            }
        
        
        char c= e.getKeyChar();
        if(e.getSource()==this.jTextField1)
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
             if(e.getSource()==this.jTextField3)
        
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
        if(e.getSource()==this.jTextField2)
        {
            if(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
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
            if(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField4)
        {
            if(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField5)
        {
            if(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SLASH)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
        /*
        if(e.getSource()==this.jTextField6)
        {
            if(Character.isLetterOrDigit(c)||c== KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_AT||c==KeyEvent.VK_ALT||c==KeyEvent.VK_DECIMAL)
            {
                
            }
            else
            {
                getToolkit();
                JOptionPane.showMessageDialog(null, "Invalid Character in this space");
                e.consume();
            }
        }
       */
        
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) 
    {
               
        
    }
}
