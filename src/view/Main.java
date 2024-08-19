/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import base.Empleado;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author Kendall Rodríguez
 */
public class Main extends javax.swing.JFrame {

    ArrayList <Empleado> lista;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestionEmpleados = new javax.swing.JButton();
        btnTablaSalarios = new javax.swing.JButton();
        btnPromedioSalarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Empleados");
        setIconImage(getIconImage());

        btnGestionEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGestionEmpleados.setText("Gestion de Empleados");
        btnGestionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEmpleadosActionPerformed(evt);
            }
        });

        btnTablaSalarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTablaSalarios.setText("Tabla de Salarios");
        btnTablaSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaSalariosActionPerformed(evt);
            }
        });

        btnPromedioSalarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPromedioSalarios.setText("Promedio de Salarios por Genero");
        btnPromedioSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioSalariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnGestionEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnTablaSalarios)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnPromedioSalarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionEmpleados)
                    .addComponent(btnTablaSalarios))
                .addGap(40, 40, 40)
                .addComponent(btnPromedioSalarios)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEmpleadosActionPerformed
        GestionDeEmpleados winGestion = new GestionDeEmpleados(this, true, lista);
        winGestion.setVisible(true);
        
    }//GEN-LAST:event_btnGestionEmpleadosActionPerformed

    private void btnTablaSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaSalariosActionPerformed
       TablaDeSalarios winTabla = new TablaDeSalarios(this, true, lista);
       winTabla.setVisible(true);
       
    }//GEN-LAST:event_btnTablaSalariosActionPerformed

    private void btnPromedioSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioSalariosActionPerformed
       PromedioXGenero winSalarioGen = new PromedioXGenero(this, true, lista);
       winSalarioGen.setVisible(true);
       
    }//GEN-LAST:event_btnPromedioSalariosActionPerformed

    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource(
                        "img/bussinessMan.png"));

        return retValue;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionEmpleados;
    private javax.swing.JButton btnPromedioSalarios;
    private javax.swing.JButton btnTablaSalarios;
    // End of variables declaration//GEN-END:variables
}
