/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author SangreFx
 */
public class mensaje_cliente_no_existe extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public mensaje_cliente_no_existe() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        lblDatosPesonalesChofer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(0, 26, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple3.setBackground(new java.awt.Color(48, 227, 202));
        rSButtonRiple3.setForeground(new java.awt.Color(0, 26, 41));
        rSButtonRiple3.setText("OK");
        rSButtonRiple3.setColorHover(new java.awt.Color(48, 227, 202));
        rSButtonRiple3.setColorText(new java.awt.Color(0, 26, 41));
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, 30));

        lblDatosPesonalesChofer.setBackground(new java.awt.Color(255, 255, 255));
        lblDatosPesonalesChofer.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblDatosPesonalesChofer.setForeground(new java.awt.Color(0, 26, 41));
        lblDatosPesonalesChofer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosPesonalesChofer.setText("CLIENTE NO EXISTE!!");
        lblDatosPesonalesChofer.setOpaque(true);
        jPanel1.add(lblDatosPesonalesChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

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
            java.util.logging.Logger.getLogger(mensaje_cliente_no_existe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mensaje_cliente_no_existe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mensaje_cliente_no_existe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mensaje_cliente_no_existe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mensaje_cliente_no_existe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDatosPesonalesChofer;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    // End of variables declaration//GEN-END:variables
}
