
package com.crud.vista;


import com.crud.dao.ConexionJDBC;
import com.crud.modelo.Medicina;
import com.crud.servicio.MedicinaServ;
import java.sql.Connection;
import java.sql.Date;
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

public class DatosMedicina extends javax.swing.JInternalFrame {
           ConexionJDBC cc = new ConexionJDBC();
           Connection con = cc.getConnection();
           PreparedStatement ps;
           ResultSet rs;
    
    
    private DefaultTableModel dtm;
    List<Medicina> medicina = null;
    public static int codPersona = 0;
    public static int  codpersona2;
    
    public DatosMedicina() {
        initComponents();
        
        cmb_seleccionar.setSelectedItem("seleccionar");
        medicina = MedicinaServ.ListarMedicina();
        cargarTabla(medicina);
        cargarCombocod_medicina(medicina);
        
        lbl_titulo.setVisible(false);
        lbl_codigo.setVisible(false);
        lbl_dosis.setVisible(false);
        lbl_fechav.setVisible(false);
        lbl_medict.setVisible(false);
        lbl_nm.setVisible(false);
        txt_codigo.setVisible(false);
        txt_dosis.setVisible(false);
        txt_fecha.setVisible(false);
        txt_medico_tra.setVisible(false);
        txt_nombre_med.setVisible(false);
        bot_actualizar.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        bot_eliminar = new javax.swing.JButton();
        bot_Modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_seleccionar = new javax.swing.JComboBox<>();
        bot_buscar = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nm = new javax.swing.JLabel();
        lbl_dosis = new javax.swing.JLabel();
        lbl_fechav = new javax.swing.JLabel();
        lbl_medict = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre_med = new javax.swing.JTextField();
        txt_dosis = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_medico_tra = new javax.swing.JTextField();
        bot_actualizar = new javax.swing.JButton();
        bot_limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bot_volver = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Datos Medicina ");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre Medicina", "Dosis", "Fecha Vencimiento", "Medico Tratante"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        bot_eliminar.setText("Eliminar");
        bot_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_eliminarActionPerformed(evt);
            }
        });

        bot_Modificar.setText("Modificar ");
        bot_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_ModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        cmb_seleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cmb_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_seleccionarActionPerformed(evt);
            }
        });

        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });

        lbl_titulo.setText("Modificar Medicina");

        lbl_codigo.setText("Codigo:");

        lbl_nm.setText("Nombre Medicina:");

        lbl_dosis.setText("Dosis:");

        lbl_fechav.setText("Fecha vencimiento:");

        lbl_medict.setText("Medico Tratante");

        txt_codigo.setEditable(false);
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        txt_nombre_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_medActionPerformed(evt);
            }
        });
        txt_nombre_med.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_medKeyTyped(evt);
            }
        });

        txt_dosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dosisKeyTyped(evt);
            }
        });

        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });

        txt_medico_tra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_medico_traKeyTyped(evt);
            }
        });

        bot_actualizar.setText("Actualizar");
        bot_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarActionPerformed(evt);
            }
        });

        bot_limpiar.setText("Limpiar");
        bot_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_limpiarActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bot_volver.setText("volver");
        bot_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_volverActionPerformed(evt);
            }
        });

        lbl_error.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267)
                .addComponent(bot_volver))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_fechav)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bot_actualizar)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(275, 275, 275)
                                    .addComponent(lbl_titulo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jLabel2)
                                    .addGap(65, 65, 65)
                                    .addComponent(cmb_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(bot_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bot_limpiar)
                                .addComponent(bot_Modificar)
                                .addComponent(jButton1)
                                .addComponent(bot_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(83, 83, 83))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_nm)
                                        .addComponent(lbl_codigo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_medict)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_medico_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_dosis))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot_volver)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot_buscar)
                    .addComponent(bot_limpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot_eliminar)
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_titulo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nm)
                            .addComponent(txt_nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_medict)
                            .addComponent(txt_medico_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dosis)
                    .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechav)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lbl_error)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void cargarTabla(List<Medicina> medicina) {
         dtm = (DefaultTableModel) tbl_datos.getModel();
        for (Medicina p : medicina) {
            Vector fila = new Vector();
            fila.add(p.getCodigo());
            fila.add(p.getNombre_med());
            fila.add(p.getDosis());
            fila.add(p.getFecha_ven());
            fila.add(p.getMedico_tratante());
            dtm.addRow(fila);
        }    
    }

    private void cargarCombocod_medicina(List<Medicina> medicina) {
         for (Medicina m : medicina) {
            cmb_seleccionar.addItem(m.getCodigo());
        }    
    }
    
    private void cargaTablaBusqueda(String cod) {
    
        Medicina medicina = new MedicinaServ().BuscarMedicinaCod(cod);
        dtm = (DefaultTableModel) tbl_datos.getModel();
        Vector fila = new Vector();
        fila.add(medicina.getCodigo());
        fila.add(medicina.getNombre_med());
        fila.add(medicina.getDosis());
        fila.add(medicina.getFecha_ven());
        fila.add(medicina.getMedico_tratante());
        dtm.addRow(fila);
    }
    
    private void cmb_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_seleccionarActionPerformed

    }//GEN-LAST:event_cmb_seleccionarActionPerformed

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
         if (cmb_seleccionar.getSelectedItem() == "Todos") {
            medicina = MedicinaServ.ListarMedicina();
            cargarTabla(medicina);
        } else {
            String cod = cmb_seleccionar.getSelectedItem().toString();
            cargaTablaBusqueda(cod);
        }
    }//GEN-LAST:event_bot_buscarActionPerformed

    private void bot_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_ModificarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        if(fila>=0){
            txt_codigo.setText(tbl_datos.getValueAt(fila,0).toString());
            txt_nombre_med.setText(tbl_datos.getValueAt(fila,1).toString());
            txt_dosis.setText(tbl_datos.getValueAt(fila,2).toString());
            txt_fecha.setText(tbl_datos.getValueAt(fila,3).toString());
            txt_medico_tra.setText(tbl_datos.getValueAt(fila,4).toString());
            
        lbl_titulo.setVisible(true);
        lbl_codigo.setVisible(true);
        lbl_dosis.setVisible(true);
        lbl_fechav.setVisible(true);
        lbl_medict.setVisible(true);
        lbl_nm.setVisible(true);
        
        txt_codigo.setVisible(true);
        txt_dosis.setVisible(true);
        txt_fecha.setVisible(true);
        txt_medico_tra.setVisible(true);
        txt_nombre_med.setVisible(true);
        bot_actualizar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
            
        }
    }//GEN-LAST:event_bot_ModificarActionPerformed

    private void txt_nombre_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_medActionPerformed
        
    }//GEN-LAST:event_txt_nombre_medActionPerformed

    private void bot_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_limpiarActionPerformed
        int fila = dtm.getRowCount();
        for(int i = 0;i < fila;i++){
            dtm.removeRow(0);
        }
        lbl_titulo.setVisible(false);
        lbl_codigo.setVisible(false);
        lbl_dosis.setVisible(false);
        lbl_fechav.setVisible(false);
        lbl_medict.setVisible(false);
        lbl_nm.setVisible(false);
        txt_codigo.setVisible(false);
        txt_dosis.setVisible(false);
        txt_fecha.setVisible(false);
        txt_medico_tra.setVisible(false);
        txt_nombre_med.setVisible(false);
        bot_actualizar.setVisible(false);
    }//GEN-LAST:event_bot_limpiarActionPerformed

    private void bot_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarActionPerformed
        if(txt_codigo.getText().equals("") || txt_dosis.getText().equals("")
                || txt_fecha.getText().equals("") || txt_medico_tra .getText().equals("") || txt_nombre_med .getText().equals("")){
           
              lbl_error.setText("ingrese toda la informacion");
              }else {
        
        try {
        ps=con.prepareStatement("UPDATE medicinas SET nombre_medicina=?,dosis_medicina=?,fecha_vencimiento=?,nombre_medico=? WHERE id_medicina=? ");
        
        ps.setString(1, txt_nombre_med.getText());
        ps.setString(2, txt_dosis.getText());
        ps.setDate(3, Date.valueOf(txt_fecha.getText()));
        ps.setString(4, txt_medico_tra.getText());
        ps.setString(5, txt_codigo.getText());
        
        int res = ps.executeUpdate();
        lbl_error.setText("");
        if(res > 0){
            JOptionPane.showMessageDialog(null,"Datos actualizados correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
            con.close();
        
    } catch (SQLException ex) {
        Logger.getLogger(IngresoMedicina.class.getName()).log(Level.SEVERE, null, ex);
    }
         }
    }//GEN-LAST:event_bot_actualizarActionPerformed

    private void bot_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_eliminarActionPerformed
         int fila = tbl_datos.getSelectedRow();

         String cod="";
         cod=tbl_datos.getValueAt(fila, 0).toString();
         
               try {
                   ps=con.prepareStatement("DELETE FROM medicinas WHERE id_medicina=?");
                   int elim = ps.executeUpdate();
                   if(elim>0){
                       JOptionPane.showMessageDialog(null, "Dato eliminado");
                       dtm.removeRow(fila);
                   }else{
                       JOptionPane.showMessageDialog(null, "no selecciono ninguna fila");
                   }
                   
                   con.close();
               } catch (SQLException ex) {
                   Logger.getLogger(DatosMedicina.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               int filaSeleccionada = tbl_datos.getSelectedRow();   
    }//GEN-LAST:event_bot_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_bot_volverActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_nombre_medKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_medKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombre_medKeyTyped

    private void txt_medico_traKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_medico_traKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter<'a' || caracter>'z') && caracter != '\b')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_medico_traKeyTyped

    private void txt_dosisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dosisKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }        
        if(evt.getKeyChar()=='.'&&txt_dosis.getText().contains(".")){
          evt.consume();
        }
    }//GEN-LAST:event_txt_dosisKeyTyped

    private void txt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }        
    }//GEN-LAST:event_txt_fechaKeyTyped

    
    public void mostrar (String valor){
         DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
         String sql = "";
         if(valor.equals("")){
             sql="SELECT * FROM  medicinas";
         }else{
             sql = "SELECT * FROM medicinas m WHERE m.id_medicina=?";
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
        Logger.getLogger(DatosMedicina.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_Modificar;
    private javax.swing.JButton bot_actualizar;
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_eliminar;
    private javax.swing.JButton bot_limpiar;
    private javax.swing.JButton bot_volver;
    private javax.swing.JComboBox<Object> cmb_seleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_dosis;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_fechav;
    private javax.swing.JLabel lbl_medict;
    private javax.swing.JLabel lbl_nm;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_dosis;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_medico_tra;
    private javax.swing.JTextField txt_nombre_med;
    // End of variables declaration//GEN-END:variables

}
