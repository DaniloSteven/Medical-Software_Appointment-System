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
public class Agendas extends javax.swing.JFrame implements ActionListener,KeyListener
    {
    private final String rutaFotos;
    private final String ruta;
    private final AgendaManage lena;

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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
        setTitle("AGENDAS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
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
        jButton3.setBounds(470, 640, 190, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.setGridColor(new java.awt.Color(204, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(470, 340, 590, 270);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 60, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("NAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 270, 70, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 220, 190, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 270, 280, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jButton1.setText("SEARCH");
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 220, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("ADD");
        jPanel1.add(jButton2);
        jButton2.setBounds(680, 640, 180, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(480, 260, 180, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(710, 260, 130, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(890, 260, 140, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("DAY:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 230, 37, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("START HOUR:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 230, 110, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("FINAL HOUR:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(890, 230, 110, 19);

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 210, 600, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("AVAILABILITY");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 180, 150, 22);

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 210, 390, 110);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("MEDIC");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 180, 90, 22);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("SAVE");
        jPanel1.add(jButton4);
        jButton4.setBounds(880, 640, 180, 40);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 10, 650, 160);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(670, 0, 380, 170);

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 350, 440, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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

private MedicalStaff e;

 private DefaultTableModel modelo;   
 ArrayList<Agendas> todos=new ArrayList();


     public Agendas(MedicalStaff e,String codice) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.lena=new AgendaManage();
        this.llenarcombos();
        this.jTextField1.setText(codice);
       this.jTextField2.setEditable(false);
       

       
        this.poneaEscuchar();
        //this.leer();
        this.modelaTabla();

        this.mediname(codice);
        //this.AgregarFila();
        this.e=e;

        this.ruta="./Archives/Agendas.txt";//Array

        
        this.rutaFotos="./Images/";
        ImageIcon image=new ImageIcon(rutaFotos+"umz2.png");
        jLabel10.setIcon(image);
        
        ImageIcon image2=new ImageIcon(rutaFotos+"Overwatch3.png");
        jLabel11.setIcon(image2);
        
        ImageIcon image3=new ImageIcon(rutaFotos+"23.gif");
        jLabel12.setIcon(image3);
        
        
    }
     
     
            private void mediname(String codice)

            {


            FileReader file;

            BufferedReader br; 
            String registro; 
            try

            {

            file=new FileReader("./Archives/Medics.txt"); 
            br = new BufferedReader(file); 
            while ((registro=br.readLine())!=null)

            {

            String[] campos = registro.split(","); 

            if(campos[3].equals(codice))
            {
            String x=(campos[1]);
            String y=(campos[2]);
            
            this.jTextField2.setText(x+" "+y);
            

            }

            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"FATAL ERROR");

            }

            }
            /*
            private void table(String codice)

            {


            FileReader file;

            BufferedReader br; 
            String registro; 
            try

            {

            file=new FileReader("./Archives/Medics.txt"); 
            br = new BufferedReader(file); 
            while ((registro=br.readLine())!=null)

            {

            String[] campos = registro.split(","); 

            if(campos[1].equals(codice))
            {
            String x=(campos[0]);
            String y=(campos[1]);
            Vector fila= new Vector();
            fila.add(x);
            fila.add(y);
            

            this.modelo.addRow(fila);
            }

            }

            }

            catch(IOException ioe)

            {

            JOptionPane.showMessageDialog(null,"FATAL ERROR");

            }

            }
            
            */
            private void DesignAlpha()

            {


                    if(this.jComboBox1.getSelectedIndex()==0||this.jComboBox2.getSelectedIndex()==0||this.jComboBox3.getSelectedIndex()==0||jTextField1.getText().equals(""))
                    {
                                   JOptionPane.showMessageDialog(null, "First Input the required data");

                    }
                    else
                    {

                    Object a = jComboBox1.getSelectedItem();
                    Object b = jComboBox2.getSelectedItem();
                    Object c = jComboBox3.getSelectedItem();
                    String day = String.valueOf(a);  
                    String hi = String.valueOf(b);
                    String hf = String.valueOf(c);
                    Vector fila= new Vector();
                    fila.add(day);
                    fila.add(hi);
                    fila.add(hf);

                    this.modelo.addRow(fila);
                    }
            
            }

            private void llenarcombos()
   {
       this.jComboBox1.addItem("Monday");
       this.jComboBox1.addItem("Tuesday");
       this.jComboBox1.addItem("Wednesday");
       this.jComboBox1.addItem("Thursday");
        this.jComboBox1.addItem("Friday");
        this.jComboBox1.addItem("Saturday");
        this.jComboBox1.addItem("Sunday");
        
        this.jComboBox2.addItem("6:00");
        this.jComboBox2.addItem("6:30");
        this.jComboBox2.addItem("7:00");
        this.jComboBox2.addItem("7:30");
        this.jComboBox2.addItem("8:00");
        this.jComboBox2.addItem("8:30");
        this.jComboBox2.addItem("9:00");
        this.jComboBox2.addItem("9:30");
        this.jComboBox2.addItem("10:00");
        this.jComboBox2.addItem("10:30");
        this.jComboBox2.addItem("11:00");
        this.jComboBox2.addItem("11:30");
        this.jComboBox2.addItem("12:00");
        this.jComboBox2.addItem("12:30");
        this.jComboBox2.addItem("13:00");
        this.jComboBox2.addItem("13:30");
        this.jComboBox2.addItem("14:00");
        this.jComboBox2.addItem("14:30");
        this.jComboBox2.addItem("15:00");
        this.jComboBox2.addItem("15:30");
        this.jComboBox2.addItem("16:00");
        this.jComboBox2.addItem("16:30");
        this.jComboBox2.addItem("17:00");
        this.jComboBox2.addItem("17:30");
        this.jComboBox2.addItem("18:00");
        
        this.jComboBox3.addItem("6:00");
        this.jComboBox3.addItem("6:30");
        this.jComboBox3.addItem("7:00");
        this.jComboBox3.addItem("7:30");
        this.jComboBox3.addItem("8:00");
        this.jComboBox3.addItem("8:30");
        this.jComboBox3.addItem("9:00");
        this.jComboBox3.addItem("9:30");
        this.jComboBox3.addItem("10:00");
        this.jComboBox3.addItem("10:30");
        this.jComboBox3.addItem("11:00");
        this.jComboBox3.addItem("11:30");
        this.jComboBox3.addItem("12:00");
        this.jComboBox3.addItem("12:30");
        this.jComboBox3.addItem("13:00");
        this.jComboBox3.addItem("13:30");
        this.jComboBox3.addItem("14:00");
        this.jComboBox3.addItem("14:30");
        this.jComboBox3.addItem("15:00");
        this.jComboBox3.addItem("15:30");
        this.jComboBox3.addItem("16:00");
        this.jComboBox3.addItem("16:30");
        this.jComboBox3.addItem("17:00");
        this.jComboBox3.addItem("17:30");
        this.jComboBox3.addItem("18:00");
        
        
        

   }
               private void poneaEscuchar()
               {

                   this.jButton3.addActionListener(this);
                   this.jButton1.addActionListener(this);
                    this.jButton2.addActionListener(this);
                    this.jButton4.addActionListener(this);
                    this.jTable1.addKeyListener(this);




               }

               private void EliminarFila()
               {

                   int selected=this.jTable1.getSelectedRow();
                   if(selected>=0)
                   {
                       this.modelo.removeRow(selected);


                    //System.out.println("objeto a string=" + y);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Select a row First");
                   }

               }
               
               
   
   private void modelaTabla()
   {
       this.modelo=new DefaultTableModel();
       this.jTable1.setModel(modelo);
       
       this.modelo.addColumn("DAY");
       this.modelo.addColumn("START HOUR");
       this.modelo.addColumn("FINAL HOUR");
       
       TableColumn columna=null;
       columna = jTable1.getColumnModel().getColumn(0);
       columna.setMinWidth(200);
       columna.setMaxWidth(100);
       
        TableRowSorter sorter = new TableRowSorter(modelo);
        jTable1.setRowSorter(sorter);

       




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
        String code=this.jTextField1.getText();
            
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
                    
                    this.jTextField2.setText(campos[1]+" "+campos[2]);
                    
                    encontrado=true;
                    break;


                }
                
            }
            if(!encontrado)
            {
             JOptionPane.showMessageDialog(null, "That ID doesn't exist");

            }
        }
        catch(IOException ioe)
              {
                  
                   JOptionPane.showMessageDialog(null, "Fatal error, trying to search a MEDIC");

              }
        
        
        
        }
    }
   
   /*
   private void Limpiartabla()
   {
        int filas=this.jTable1.getRowCount();
        for(int i=0;i<filas;i++)
                {
                    this.modelo.removeRow(0);
                }

   }
*/
  
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
        if(this.jTable1.getRowCount()<8)
        {
            this.DesignAlpha();
            this.jTextField1.setEditable(false);
            this.jComboBox1.setSelectedIndex(0);
            this.jComboBox2.setSelectedIndex(0);
            this.jComboBox3.setSelectedIndex(0);
        }
        else
        {
            this.jButton2.setEnabled(false);
        }
            
                   
        }
        
        if(evento.getSource()==jButton1)
        {
            this.SearchMedic();
                   
        }
        if(evento.getSource()==jButton4)
        {
            this.jTextField1.setEditable(true);
            this.jTable1.removeAll();
            this.jButton2.setEnabled(true);
               if(jTable1.getRowCount()>0)
               {
                              JOptionPane.showMessageDialog(null, "AGENDA SAVE");

                for(int index=0;index<jTable1.getRowCount();index++)
                {
                    
                                String cod=jTextField1.getText();
    				Object x=(jTable1.getValueAt(index, 0));
                                String day=objectToString(x);
                                Object y=(jTable1.getValueAt(index, 1));
                                String hi=objectToString(y);
                                Object z=(jTable1.getValueAt(index, 2));
                                String hf=objectToString(z);
                                
                                Agenda Agent=new Agenda(cod,day,hi,hf);
       
                                this.lena.guardaAgenda(Agent);
                                
                                
                                //System.out.println(cod+" " +day+" "+hi+" "+hf);
     
    		}
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "Create a Availability Space in the agenda First");
               }
                   
        }
        
        
                
            
    }

    private String objectToString(Object x) 
    {

         String day;
        day = (String) x;
        return day;   
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
         int key=e.getKeyCode();
        if(e.getSource()==jTable1)
        {
            if(key==KeyEvent.VK_DELETE)
            {
                this.EliminarFila();
              }
           
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
}
