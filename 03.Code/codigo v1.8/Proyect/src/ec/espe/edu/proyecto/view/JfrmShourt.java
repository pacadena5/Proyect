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
public class JfrmShourt extends javax.swing.JFrame {

    /**
     * Creates new form JfrmShourt
     */
    public JfrmShourt() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        JbutReturn = new javax.swing.JButton();
        JbutExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Buscar Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, -1));

        JbutReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/returns.png"))); // NOI18N
        JbutReturn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbutReturn.setBorderPainted(false);
        JbutReturn.setContentAreaFilled(false);
        JbutReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbutReturnActionPerformed(evt);
            }
        });
        getContentPane().add(JbutReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 40, 40));

        JbutExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/exit.png"))); // NOI18N
        JbutExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbutExit.setBorderPainted(false);
        JbutExit.setContentAreaFilled(false);
        JbutExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbutExitActionPerformed(evt);
            }
        });
        getContentPane().add(JbutExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/fondo verde.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbutReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbutReturnActionPerformed
       JfrmMenuAdmin jfrmMenuAdmin = new JfrmMenuAdmin();
       jfrmMenuAdmin.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_JbutReturnActionPerformed

    private void JbutExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbutExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JbutExitActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmShourt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmShourt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmShourt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmShourt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmShourt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbutExit;
    private javax.swing.JButton JbutReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
