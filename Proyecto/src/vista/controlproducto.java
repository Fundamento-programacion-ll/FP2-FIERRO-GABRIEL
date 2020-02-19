
package vista;

import conexion.conexionJDBC;
import controlador.producto_controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class controlproducto extends javax.swing.JInternalFrame {
    conexionJDBC cc = new conexionJDBC();
    Connection con = cc.getConnection();
    producto_controlador pro=new producto_controlador();
    PreparedStatement ps;
    ResultSet rs;
    
    public controlproducto() {
        initComponents();
        j1.setVisible(false);
        j2.setVisible(false);
        j3.setVisible(false);
        j4.setVisible(false);
        j5.setVisible(false);
        btn_actualizar.setVisible(false);
        txt_ac_id.setVisible(false);
        txt_ac_nombre.setVisible(false);
        txt_ac_precio.setVisible(false);
        txt_ac_cantidad.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_ac_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        btn_limpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        txt_ac_nombre = new javax.swing.JTextField();
        txt_ac_precio = new javax.swing.JTextField();
        txt_ac_cantidad = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CONTROL DE DATOS");

        btn_volver.setText("VOLVER");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel2.setText("ID del producto:");

        txt_ac_id.setEditable(false);
        txt_ac_id.setFocusable(false);

        btn_buscar.setText("BUSCAR");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_buscarMousePressed(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        j1.setText("MODIFICACION DE DATOS");

        j2.setText("Id del producto:");

        j3.setText("Nombre:");

        j4.setText("Precio:");

        j5.setText("Cantidad:");

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("*Si no escribe ningun valor cargara toda la tabla*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(btn_buscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(btn_actualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j2)
                                    .addComponent(j3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ac_nombre)
                                    .addComponent(txt_ac_id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j4)
                                    .addComponent(j5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_ac_cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ac_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(j1)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_volver)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)))
                .addGap(28, 28, 28)
                .addComponent(j1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j2)
                            .addComponent(txt_ac_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j3)
                            .addComponent(txt_ac_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j4)
                            .addComponent(txt_ac_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j5)
                            .addComponent(txt_ac_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
        j1.setVisible(false);
        j2.setVisible(false);
        j3.setVisible(false);
        j4.setVisible(false);
        j5.setVisible(false);
        btn_actualizar.setVisible(false);
        txt_ac_id.setVisible(false);
        txt_ac_nombre.setVisible(false);
        txt_ac_precio.setVisible(false);
        txt_ac_cantidad.setVisible(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        menu m=new menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_buscar.getText());        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarMousePressed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        String cod="";
        cod=tbl_datos.getValueAt(fila, 0).toString();
        System.out.println(cod);
        try {
            ps=con.prepareStatement("DELETE FROM `baseproyecto`.`producto` WHERE `ID_PRODUCTO`="+cod);
            int elim = ps.executeUpdate();
            if(elim>0){
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                modelo.removeRow(fila);
            }else{
                JOptionPane.showMessageDialog(null, "no selecciono ninguna fila");
            }
        } catch (SQLException ex) {
            Logger.getLogger(controlproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        if(fila>=0){
            txt_ac_id.setText(tbl_datos.getValueAt(fila, 0).toString());
            txt_ac_nombre.setText(tbl_datos.getValueAt(fila, 1).toString());
            txt_ac_precio.setText(tbl_datos.getValueAt(fila, 2).toString());
            txt_ac_cantidad.setText(tbl_datos.getValueAt(fila, 3).toString());
            
            
            txt_ac_id.setVisible(true);
            txt_ac_nombre.setVisible(true);
            txt_ac_precio.setVisible(true);
            txt_ac_cantidad.setVisible(true);
            
            j1.setVisible(true);
            j2.setVisible(true);
            j3.setVisible(true);
            j4.setVisible(true);
            j5.setVisible(true);
            btn_actualizar.setVisible(true);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if(txt_ac_id.getText().equals("") || txt_ac_nombre.getText().equals("") || txt_ac_precio.getText().equals("") || txt_ac_cantidad.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos");
        }else{
            try {
                ps=con.prepareStatement("UPDATE `baseproyecto`.`producto` SET `NOMBRE_P` = ?,`PRECIO_P` = ?,`CANTIDAD_P` = ? WHERE `ID_PRODUCTO` = "+txt_ac_id.getText());
                ps.setString(1, txt_ac_nombre.getText());
                ps.setString(2, txt_ac_precio.getText());
                ps.setString(3, txt_ac_cantidad.getText());
                int res = ps.executeUpdate();
                if(res > 0){
                    JOptionPane.showMessageDialog(null,"Datos actualizados correctamente");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al actualizar");
                }
            } catch (SQLException ex) {
                System.out.println("error: "+ex);
            }
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    public void mostrar(String valor){
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
        String sql = "";
        if(valor.equals("")){
                sql="SELECT * FROM  baseproyecto.producto";
        }else{
            sql = "SELECT * FROM baseproyecto.producto WHERE NOMBRE_P='"+valor+"'";
        }
        Object [] fila = new Object [4];
        try {
        Statement st = con.createStatement();
        rs=st.executeQuery(sql);
        
        while(rs.next()){
            fila [0]= rs.getString(1) ;
            fila [1]= rs.getString(2) ;
            fila [2]= rs.getString(3);
            fila [3]= rs.getString(4);  
            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        Logger.getLogger(controlproducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_ac_cantidad;
    private javax.swing.JTextField txt_ac_id;
    private javax.swing.JTextField txt_ac_nombre;
    private javax.swing.JTextField txt_ac_precio;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
