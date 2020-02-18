
package com.crud.vista;

import com.crud.dao.ConexionJDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IngresoMedicina extends javax.swing.JInternalFrame {
ConexionJDBC cc = new ConexionJDBC();
Connection con = cc.getConnection();
PreparedStatement ps;
ResultSet rs;

private void limpiar(){
    txt_codigo.setText("");
    txt_nombremed.setText("");
    txt_dosis.setText("");
    txt_fechaV.setText("");
    txt_medico.setText("");
    lbl_error.setText("");
}

    public IngresoMedicina() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_dosis = new javax.swing.JTextField();
        txt_nombremed = new javax.swing.JTextField();
        txt_fechaV = new javax.swing.JTextField();
        txt_medico = new javax.swing.JTextField();
        bot_ingreso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Ingreso Medicina");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre medicina:");

        jLabel4.setText("Dosis:");

        jLabel5.setText("Fecha Vencimiento");

        jLabel6.setText("Medico Tratante:");

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        txt_dosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dosisKeyTyped(evt);
            }
        });

        txt_nombremed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombremedKeyTyped(evt);
            }
        });

        txt_fechaV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaVKeyTyped(evt);
            }
        });

        txt_medico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_medicoKeyTyped(evt);
            }
        });

        bot_ingreso.setText("Ingreso");
        bot_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_ingresoActionPerformed(evt);
            }
        });

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_error.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_dosis, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txt_codigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombremed, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txt_fechaV))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(bot_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombremed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot_ingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lbl_error)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_ingresoActionPerformed
        if(txt_codigo.getText().equals("") || txt_dosis.getText().equals("")
                || txt_fechaV.getText().equals("") || txt_medico .getText().equals("") || txt_nombremed .getText().equals("")){
           
              lbl_error.setText("ingrese toda la informacion");
              }else {
        if (!txt_codigo.getText().trim().equals("") && !txt_nombremed.getText().trim().equals("")
                && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos?", "Ingreso Cliente", 
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
        try {
        ps=con.prepareStatement("INSERT INTO medicinas (id_medicina,nombre_medicina,DOSIS_medicina,fecha_vencimiento,nombre_medico) VALUE (?,?,?,?,?)");
        ps.setString(1, txt_codigo.getText());
        ps.setString(2, txt_nombremed.getText());
        ps.setString(3, txt_dosis.getText());
        ps.setDate(4, Date.valueOf(txt_fechaV.getText()));
        ps.setString(5, txt_medico.getText());
        
        int res = ps.executeUpdate();
        if(res > 0){
            JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
            con.close();
        
    } catch (SQLException ex) {
        Logger.getLogger(IngresoMedicina.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        }
    }//GEN-LAST:event_bot_ingresoActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }   
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_nombremedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombremedKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombremedKeyTyped

    private void txt_dosisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dosisKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }        
        if(evt.getKeyChar()=='.'&&txt_dosis.getText().contains(".")){
          evt.consume();
        }
    }//GEN-LAST:event_txt_dosisKeyTyped

    private void txt_fechaVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaVKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }   
    }//GEN-LAST:event_txt_fechaVKeyTyped

    private void txt_medicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_medicoKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_medicoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_dosis;
    private javax.swing.JTextField txt_fechaV;
    private javax.swing.JTextField txt_medico;
    private javax.swing.JTextField txt_nombremed;
    // End of variables declaration//GEN-END:variables


}
