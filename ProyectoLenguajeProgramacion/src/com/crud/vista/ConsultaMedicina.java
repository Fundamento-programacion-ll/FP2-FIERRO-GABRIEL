
package com.crud.vista;

import com.crud.dao.ConexionJDBC;
import com.crud.modelo.Medicina;
import com.crud.servicio.MedicinaServ;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaMedicina extends javax.swing.JInternalFrame {
ConexionJDBC cc = new ConexionJDBC();
Connection con = cc.getConnection();
PreparedStatement ps;
ResultSet rs;
private DefaultTableModel dtm;

    public ConsultaMedicina() {
        initComponents();
        String valor="";
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
         String sql = "";
         if(valor.equals("")){
            sql="SELECT * FROM  medicinas";
         }else{
            sql = "SELECT * FROM medicinas m WHERE m.id_medicina='"+valor+"'";
         }
    
     Object [] fila = new Object [5];
        try {
        Statement st = con.createStatement();
        rs=st.executeQuery(sql);
        
        while(rs.next()){
            fila [0]= rs.getString(1) ;
            fila [1]= rs.getString(2) ;
            fila [2]= rs.getString(3);
            fila [3]= rs.getString(4);
            fila [4]= rs.getString(5);  
            modelo.addRow(fila);
            
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaMedicina.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "no existe ese ID");
        
    }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        bot_volver = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Consulta Medicina");

        jLabel3.setText("Codigo:");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre Medicina", "Dosis", "Fecha Vencimiento", "Medico Tratante"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        bot_volver.setText("volver");
        bot_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_volverActionPerformed(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(135, 135, 135)
                        .addComponent(bot_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_buscar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(bot_volver))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            mostrar(txt_codigo.getText());
        }
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_bot_volverActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_codigo.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    public void mostrar (String valor){
         DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
         String sql = "";
         if(valor.equals("")){
             sql="SELECT * FROM  medicinas";
         }else{
             sql = "SELECT * FROM medicinas m WHERE m.id_medicina='"+valor+"'";
         }
    
     Object [] fila = new Object [5];
        try {
        Statement st = con.createStatement();
        rs=st.executeQuery(sql);
        
        while(rs.next()){
            fila [0]= rs.getString(1) ;
            fila [1]= rs.getString(2) ;
            fila [2]= rs.getString(3);
            fila [3]= rs.getString(4);
            fila [4]= rs.getString(5);  
            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaMedicina.class.getName()).log(Level.SEVERE, null, ex);
    }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_volver;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
}
