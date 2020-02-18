
package com.crud.vista;

import com.crud.modelo.Persona;
import com.crud.servicio.PersonaServ;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IngresoPersona extends javax.swing.JInternalFrame {
String mensaje;

    public IngresoPersona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_tratamiento = new javax.swing.JTextField();
        bot_insertar = new javax.swing.JButton();
        bot_volver = new javax.swing.JButton();
        txt_edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_fecha_nac = new javax.swing.JTextField();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Ingreso Persona");

        jLabel3.setText("Nombre:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Tratamiento:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });

        txt_tratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tratamientoKeyTyped(evt);
            }
        });

        bot_insertar.setText("Insertar");
        bot_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_insertarActionPerformed(evt);
            }
        });

        bot_volver.setText("Volver");
        bot_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_volverActionPerformed(evt);
            }
        });

        txt_edad.setEditable(false);

        jLabel2.setText("Calendario:");

        txt_fecha_nac.setEditable(false);
        txt_fecha_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_nacActionPerformed(evt);
            }
        });

        lbl_error.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66)
                        .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txt_apellido))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(371, 371, 371))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(bot_volver)
                        .addGap(18, 18, 18)
                        .addComponent(bot_insertar)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(56, 56, 56)
                .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_error)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bot_volver)
                            .addComponent(bot_insertar))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void bot_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_insertarActionPerformed
        if(txt_nombre.getText().equals("") || txt_apellido.getText().equals("")
            || txt_tratamiento.getText().equals("")){
           
            lbl_error.setText("ingrese toda la informacion");
        }else {       
         // int dato = Integer.parseInt(txt_id.getText());
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate fechanacimiento = LocalDate.parse(txt_fecha_nac.getText(), date);
        LocalDate fechaactual = LocalDate.now();
        
        Period periodo=Period.between(fechanacimiento, fechaactual);
        String resultado = (""+periodo.getYears());
        txt_edad.setText(resultado);
        if (Integer.parseInt(resultado) >= 18){
        }
        
              if (txt_edad.getText() == "false"){
                  mensaje = "Menor de edad" ;
              }else{
                   mensaje = "Mayor Edad";
                   }
        if (!txt_nombre.getText().trim().equals("")
                && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos?", "Ingreso Persona", 
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNac = null;
            try {
                fechaNac = fechaNac = sdf.parse(txt_fecha_nac.getText());
                JOptionPane.showMessageDialog(null, "fecha correcta");
            } catch (ParseException ex) {
                Logger.getLogger(IngresoPersona.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Fecha incorrecta");
            }
            
            int numero=Integer.parseInt(txt_edad.getText());
            if(numero>18){
                Boolean mayor=true;
            }else{
                Boolean menor=false;
                
            }
            Persona persona = new Persona(
                txt_nombre.getText(),
                txt_apellido.getText(),
                fechaNac,
                txt_tratamiento.getText(),
                Boolean.parseBoolean(txt_edad.getText())       
            );
            PersonaServ.InsertarPersona(persona);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            }
        }
    }//GEN-LAST:event_bot_insertarActionPerformed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        Menu m = new Menu ();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_bot_volverActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_tratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tratamientoKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tratamientoKeyTyped

    private void txt_fecha_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_nacActionPerformed
        
    }//GEN-LAST:event_txt_fecha_nacActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_insertar;
    private javax.swing.JButton bot_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha_nac;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tratamiento;
    // End of variables declaration//GEN-END:variables
}
