
package com.crud.vista;

import com.crud.dao.ConexionJDBC;
import com.crud.modelo.Persona;
import com.crud.servicio.PersonaServ;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaPersonas extends javax.swing.JInternalFrame {
    ConexionJDBC cc = new ConexionJDBC();
    Connection con = cc.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    Persona persona;
    private DefaultTableModel dtm;

    public ConsultaPersonas() {
        initComponents();
        
        List<Persona> personas = PersonaServ.ListarPersona();
        dtm = (DefaultTableModel) tbl_datos.getModel();
       
        for (Persona p : personas) {
            Vector fila = new Vector();
            fila.add(p.getId_persona());
            fila.add(p.getNombre() + " " + p.getApellido());
            fila.add(p.getFecha_nac());
            fila.add(p.getTratamiento());
            fila.add(p.getEdad());
            dtm.addRow(fila);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_persona = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        bot_limpiar = new javax.swing.JButton();
        bot_volver = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Consulta Datos Persona");

        jLabel2.setText("Id_persona");

        txt_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_personaActionPerformed(evt);
            }
        });
        txt_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_personaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_personaKeyTyped(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_persona", "Nombres", "Fecha_Nacimiento", "Tratamiento", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        bot_limpiar.setText("Limpiar");
        bot_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_limpiarActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txt_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(58, 58, 58)
                        .addComponent(bot_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133)
                        .addComponent(bot_volver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bot_volver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bot_limpiar)
                    .addComponent(btn_buscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_personaActionPerformed

    }//GEN-LAST:event_txt_personaActionPerformed


    
    private void txt_personaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_personaKeyPressed
 
    }//GEN-LAST:event_txt_personaKeyPressed

    private void bot_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_limpiarActionPerformed
        int fila = dtm.getRowCount();
        for(int i = 0;i < fila;i++){
            dtm.removeRow(0); 
        }
    }//GEN-LAST:event_bot_limpiarActionPerformed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_bot_volverActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if(txt_persona!=null){
            persona = new PersonaServ().BuscarPersonaID(Integer.parseInt(txt_persona.getText()));
            dtm = (DefaultTableModel) tbl_datos.getModel();
            Vector fila = new Vector();
            fila.add(persona.getId_persona());
            fila.add(persona.getNombre() + " " + persona.getApellido());
            fila.add(persona.getFecha_nac());
            fila.add(persona.getTratamiento());
            fila.add(persona.getEdad());
            dtm.addRow(fila);
            tbl_datos.setModel(dtm);
            JOptionPane.showMessageDialog(null, "existe ese ID");
        }else if(txt_persona==null){
            JOptionPane.showMessageDialog(null, "No existe ese ID");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_personaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        
    }//GEN-LAST:event_txt_personaKeyTyped

  
private void comprobacion(){
    JOptionPane.showMessageDialog(null, "No existe ese ID");
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_limpiar;
    private javax.swing.JButton bot_volver;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_persona;
    // End of variables declaration//GEN-END:variables
}
