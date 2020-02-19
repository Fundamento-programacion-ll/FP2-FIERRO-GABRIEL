
package com.crud.vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //para vizualizar en toda la pantalla
        JCliente.setEnabled(false);
        JAdmin.setEnabled(false);
    }

    public JMenu getJAdmin() {
        return JAdmin;
    }

    public void setJAdmin(JMenu JAdmin) {
        this.JAdmin = JAdmin;
    }

    public JMenu getJCliente() {
        return JCliente;
    }

    public void setJCliente(JMenu JCliente) {
        this.JCliente = JCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jIngreso_Usuario = new javax.swing.JMenuItem();
        JSalir = new javax.swing.JMenuItem();
        JCliente = new javax.swing.JMenu();
        JConsulta = new javax.swing.JMenuItem();
        JConsulta_M = new javax.swing.JMenuItem();
        JAdmin = new javax.swing.JMenu();
        JIngreso_P = new javax.swing.JMenuItem();
        JControl_D = new javax.swing.JMenuItem();
        JIngreso_M = new javax.swing.JMenuItem();
        JControl_M = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        jIngreso_Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jIngreso_Usuario.setText("Ingreso");
        jIngreso_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreso_UsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jIngreso_Usuario);

        JSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        JSalir.setText("Salir");
        JSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSalirActionPerformed(evt);
            }
        });
        jMenu1.add(JSalir);

        jMenuBar1.add(jMenu1);

        JCliente.setText("Cliente");

        JConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        JConsulta.setText("Consulta Datos");
        JConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JConsultaActionPerformed(evt);
            }
        });
        JCliente.add(JConsulta);

        JConsulta_M.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        JConsulta_M.setText("Consulta Medicina");
        JConsulta_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JConsulta_MActionPerformed(evt);
            }
        });
        JCliente.add(JConsulta_M);

        jMenuBar1.add(JCliente);

        JAdmin.setText("Administrador");

        JIngreso_P.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        JIngreso_P.setText("Ingreso Persona");
        JIngreso_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIngreso_PActionPerformed(evt);
            }
        });
        JAdmin.add(JIngreso_P);

        JControl_D.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        JControl_D.setText("Control datos");
        JControl_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JControl_DActionPerformed(evt);
            }
        });
        JAdmin.add(JControl_D);

        JIngreso_M.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        JIngreso_M.setText("Ingreso medicamentos");
        JIngreso_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIngreso_MActionPerformed(evt);
            }
        });
        JAdmin.add(JIngreso_M);

        JControl_M.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        JControl_M.setText("Control medicamentos");
        JControl_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JControl_MActionPerformed(evt);
            }
        });
        JAdmin.add(JControl_M);

        jMenuBar1.add(JAdmin);

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

    private void JIngreso_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIngreso_PActionPerformed
         IngresoPersona ingreso = new IngresoPersona();
         showJInternalFrameCenterPosition(ingreso);
    }//GEN-LAST:event_JIngreso_PActionPerformed

    private void JSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_JSalirActionPerformed

    private void JConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JConsultaActionPerformed
         ConsultaPersonas consulta = new ConsultaPersonas();
         showJInternalFrameCenterPosition(consulta);
    }//GEN-LAST:event_JConsultaActionPerformed

    private void JControl_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JControl_DActionPerformed
          DatosPersona datos = new DatosPersona();
          showJInternalFrameCenterPosition(datos);
    }//GEN-LAST:event_JControl_DActionPerformed

    private void JIngreso_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIngreso_MActionPerformed
        IngresoMedicina med= new IngresoMedicina();
        showJInternalFrameCenterPosition(med);
    }//GEN-LAST:event_JIngreso_MActionPerformed

    private void JControl_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JControl_MActionPerformed
        DatosMedicina conm = new DatosMedicina ();
        showJInternalFrameCenterPosition(conm);
    }//GEN-LAST:event_JControl_MActionPerformed

    private void JConsulta_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JConsulta_MActionPerformed
        ConsultaMedicina cm=new ConsultaMedicina();
        showJInternalFrameCenterPosition(cm);
    }//GEN-LAST:event_JConsulta_MActionPerformed

    private void jIngreso_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreso_UsuarioActionPerformed
        Logui login = new Logui(this);
        showJInternalFrameCenterPosition(login);
    }//GEN-LAST:event_jIngreso_UsuarioActionPerformed

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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JAdmin;
    private javax.swing.JMenu JCliente;
    private javax.swing.JMenuItem JConsulta;
    private javax.swing.JMenuItem JConsulta_M;
    private javax.swing.JMenuItem JControl_D;
    private javax.swing.JMenuItem JControl_M;
    private javax.swing.JMenuItem JIngreso_M;
    private javax.swing.JMenuItem JIngreso_P;
    private javax.swing.JMenuItem JSalir;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem jIngreso_Usuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
