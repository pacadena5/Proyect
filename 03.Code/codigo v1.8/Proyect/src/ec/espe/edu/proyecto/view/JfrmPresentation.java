/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.view;

import javax.swing.ImageIcon;

/**
 *
 * @author Cristian Arauz
 */
public class JfrmPresentation extends javax.swing.JFrame {

    /**
     * Creates new form JfrmPresentation
     */
    public JfrmPresentation() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Video games");
        this.setIconImage(new ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/iconSystem.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnAcces = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("GAME ON");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        BtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(153, 0, 0));
        BtnExit.setText("Salir");
        BtnExit.setToolTipText("Presione para cerrar el sistema");
        BtnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnExit.setContentAreaFilled(false);
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 70, -1));

        BtnAcces.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnAcces.setForeground(new java.awt.Color(153, 0, 0));
        BtnAcces.setText("Acceder");
        BtnAcces.setToolTipText("Presione para acceder al sistema");
        BtnAcces.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAcces.setContentAreaFilled(false);
        BtnAcces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAccesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAcces, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/ec.espe.edu.imagenes.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnAccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccesActionPerformed
        JfrmMain jfrmMain = new JfrmMain();
        jfrmMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAccesActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmPresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPresentation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcces;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
