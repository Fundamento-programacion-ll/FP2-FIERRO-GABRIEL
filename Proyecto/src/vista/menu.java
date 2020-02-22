
package vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
//        Admin.setEnabled(false);
//        Cliente.setEnabled(false);
    }

    public JMenu getAdmin() {
        return Admin;
    }

    public void setAdmin(JMenu Admin) {
        this.Admin = Admin;
    }

    public JMenu getCliente() {
        return Cliente;
    }

    public void setCliente(JMenu Cliente) {
        this.Cliente = Cliente;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ingreso = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Admin = new javax.swing.JMenu();
        jMenu_ingreso = new javax.swing.JMenuItem();
        jMenucontrol = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        ingreso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        ingreso.setText("Ingreso");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
        jMenu1.add(ingreso);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        Cliente.setText("Cliente");

        jMenuItem5.setText("Comprar un Producto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem5);

        jMenuItem6.setText("Quejas o Sugerencias");
        Cliente.add(jMenuItem6);

        jMenuBar1.add(Cliente);

        Admin.setText("Administrador");

        jMenu_ingreso.setText("Ingreso de Productos");
        jMenu_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ingresoActionPerformed(evt);
            }
        });
        Admin.add(jMenu_ingreso);

        jMenucontrol.setText("Control de Datos");
        jMenucontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucontrolActionPerformed(evt);
            }
        });
        Admin.add(jMenucontrol);

        jMenuBar1.add(Admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
        login l=new login(this);
        showJInternalFrameCenterPosition(l);
    }//GEN-LAST:event_ingresoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jMenu_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ingresoActionPerformed
        Ing_pro ingre=new Ing_pro(this);
        showJInternalFrameCenterPosition(ingre);
    }//GEN-LAST:event_jMenu_ingresoActionPerformed

    private void jMenucontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucontrolActionPerformed
        controlproducto control=new controlproducto();
        showJInternalFrameCenterPosition(control);
    }//GEN-LAST:event_jMenucontrolActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        compra com=new compra();
        showJInternalFrameCenterPosition(com);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void showJInternalFrameCenterPosition(JInternalFrame jInternalFrame) {
        Panel.add(jInternalFrame);
        Dimension componentDim = jInternalFrame.getSize();
        Dimension desktopDim = Panel.getSize();
        int width = (int) (desktopDim.getWidth() - componentDim.getWidth()) / 2;
        int heigth = (int) (desktopDim.getHeight() - componentDim.getHeight()) / 2;
        Dimension positionDim = new Dimension(width, heigth);
        jInternalFrame.setBounds((int) positionDim.getWidth(), (int) positionDim.getHeight(), jInternalFrame.getWidth(), jInternalFrame.getHeight());
        jInternalFrame.setVisible(true);
    }
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Admin;
    private javax.swing.JMenu Cliente;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem ingreso;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenu_ingreso;
    private javax.swing.JMenuItem jMenucontrol;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
