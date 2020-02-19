
package com.crud.vista;

import com.crud.dao.ConexionJDBC;
import com.crud.modelo.Persona;
import com.crud.servicio.PersonaServ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatosPersona extends javax.swing.JInternalFrame {
    private DefaultTableModel dtm;
    List<Persona> persona = null;
    public static int codPersona = 0;
    ConexionJDBC cc = new ConexionJDBC();
    Connection con = cc.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    Persona personas ;
    String mensaje;
    
    public DatosPersona() {
        initComponents();
        
        cmb_seleccionar.setSelectedItem("Todos");
        persona = PersonaServ.ListarPersona();
        cargarTabla(persona);
        cargarComboId_persona(persona);
        
        jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            Edad.setVisible(false);

            txt_id_persona.setVisible(false);
            txt_nombre.setVisible(false);
            txt_apellido.setVisible(false);
            txt_fecha_nac.setVisible(false);
            txt_tratamiento.setVisible(false);
            txt_edad.setVisible(false);
            bot_actualizar.setVisible(false);
    }
    public void ModificarPersona() {
        
        DatosPersona dato = new DatosPersona();
        int Id = dato.codPersona;
        personas = new PersonaServ().BuscarPersonaID(Id);
        
        txt_id_persona.setText(Integer.toString(personas.getId_persona())); 
        txt_nombre.setText(personas.getNombre());
        txt_apellido.setText(personas.getApellido());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(personas.getFecha_nac());
        txt_fecha_nac.setText(fecha);

        txt_tratamiento.setText(String.valueOf(personas.getTratamiento()));
        txt_edad.setText(Boolean.toString(personas.getEdad())); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_seleccionar = new javax.swing.JComboBox<>();
        bot_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        bot_eliminar = new javax.swing.JButton();
        bot_volver = new javax.swing.JButton();
        bot_limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tratamiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bot_actualizar = new javax.swing.JButton();
        txt_id_persona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_fecha_nac = new javax.swing.JTextField();
        Edad = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bot_Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Manejo de Datos");

        jLabel2.setText("Id_Persona:");

        cmb_seleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Persona", "Nombres", "F. Nacimiento", "Tratamiento", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        bot_eliminar.setText("Eliminar");
        bot_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_eliminarActionPerformed(evt);
            }
        });

        bot_volver.setText("volver");
        bot_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_volverActionPerformed(evt);
            }
        });

        bot_limpiar.setText("Limpiar");
        bot_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_limpiarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tratamiento:");

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Modificacion de Datos");

        txt_tratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tratamientoKeyTyped(evt);
            }
        });

        jLabel4.setText("Id_persona:");

        bot_actualizar.setText("Actualizar");
        bot_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarActionPerformed(evt);
            }
        });

        txt_id_persona.setEditable(false);
        txt_id_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_personaKeyTyped(evt);
            }
        });

        jLabel5.setText("Nombre:");

        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        jLabel6.setText("F. Nacimiento:");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_fecha_nac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_nacKeyTyped(evt);
            }
        });

        Edad.setText("Edad:");

        jLabel8.setText("Apellido:");

        bot_Modificar.setText("Modificar ");
        bot_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(bot_buscar)
                        .addGap(0, 192, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot_Modificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bot_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151)
                        .addComponent(bot_volver)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id_persona))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(Edad))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_nac)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(36, 36, 36)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_apellido)
                    .addComponent(txt_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bot_actualizar)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bot_volver))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bot_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bot_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot_eliminar)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bot_actualizar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        if (cmb_seleccionar.getSelectedItem() == "Seleccionar") {
            persona = PersonaServ.ListarPersona();
            cargarTabla(persona);
        } else {
            String Id = cmb_seleccionar.getSelectedItem().toString();
            cargaTablaBusqueda(Id);
        }
    }//GEN-LAST:event_bot_buscarActionPerformed
  
    private void bot_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_eliminarActionPerformed
         int filaSeleccionada = tbl_datos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
            codPersona = (int) modelo.getValueAt(filaSeleccionada, 0);
            PersonaServ.EliminarPersona(Integer.toString(codPersona));
            JOptionPane.showMessageDialog(null, "Fila eliminada con exito !!");
            
            persona = PersonaServ.ListarPersona();
            dtm.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
        }
    }//GEN-LAST:event_bot_eliminarActionPerformed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_bot_volverActionPerformed

    private void bot_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_limpiarActionPerformed
        int fila = dtm.getRowCount();
        for(int i = 0;i < fila;i++){
            dtm.removeRow(0);
        }
    }//GEN-LAST:event_bot_limpiarActionPerformed

    private void bot_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarActionPerformed
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
    }//GEN-LAST:event_bot_actualizarActionPerformed

    private void bot_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_ModificarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        if(fila>=0){
            txt_id_persona.setText(tbl_datos.getValueAt(fila,0).toString());
            txt_nombre.setText(tbl_datos.getValueAt(fila,1).toString());
            txt_apellido.setText(tbl_datos.getValueAt(fila,1).toString());
            txt_fecha_nac.setText(tbl_datos.getValueAt(fila,2).toString());
            txt_tratamiento.setText(tbl_datos.getValueAt(fila,3).toString());
            txt_edad.setText(tbl_datos.getValueAt(fila,4).toString());

            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            Edad.setVisible(true);

            txt_id_persona.setVisible(true);
            txt_nombre.setVisible(true);
            txt_apellido.setVisible(true);
            txt_fecha_nac.setVisible(true);
            txt_tratamiento.setVisible(true);
            txt_edad.setVisible(true);
            bot_actualizar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");

        }
    }//GEN-LAST:event_bot_ModificarActionPerformed

    private void txt_id_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_personaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        } 
    }//GEN-LAST:event_txt_id_personaKeyTyped

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

    private void txt_fecha_nacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_nacKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        } 
    }//GEN-LAST:event_txt_fecha_nacKeyTyped

    private void txt_tratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tratamientoKeyTyped
        
    }//GEN-LAST:event_txt_tratamientoKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        } 
    }//GEN-LAST:event_txt_edadKeyTyped

    public void cargarTabla(List<Persona> persona) {
        dtm = (DefaultTableModel) tbl_datos.getModel();
        for (Persona p : persona) {
            Vector fila = new Vector();
            fila.add(p.getId_persona());
            fila.add(p.getNombre() + " " + p.getApellido());
            fila.add(p.getFecha_nac());
            fila.add(p.getTratamiento());
            fila.add(p.getEdad());
            dtm.addRow(fila);
        }    
    }

    public void cargarComboId_persona(List<Persona> persona) {
         for (Persona p : persona) {
            cmb_seleccionar.addItem(Integer.toString(p.getId_persona()));
        }
    }
    
    public void cargaTablaBusqueda(String Id) {
    
        Persona cliente = new PersonaServ().BuscarPersonaID(Integer.parseInt(Id));
        dtm = (DefaultTableModel) tbl_datos.getModel();
        Vector fila = new Vector();
        fila.add(cliente.getId_persona());
        fila.add(cliente.getNombre() + "" + cliente.getApellido());
        fila.add(cliente.getFecha_nac());
        fila.add(cliente.getTratamiento());
        fila.add(cliente.getEdad());
        dtm.addRow(fila);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JButton bot_Modificar;
    private javax.swing.JButton bot_actualizar;
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_eliminar;
    private javax.swing.JButton bot_limpiar;
    private javax.swing.JButton bot_volver;
    private javax.swing.JComboBox<String> cmb_seleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha_nac;
    private javax.swing.JTextField txt_id_persona;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tratamiento;
    // End of variables declaration//GEN-END:variables

}
