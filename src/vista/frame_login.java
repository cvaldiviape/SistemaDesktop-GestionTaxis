package vista;

import modelo.Usuario;
import controlador.DAOUsuariorImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.DAOUsuario;

public class frame_login extends javax.swing.JFrame {
    int xx, xy;
    public frame_login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        jtx_pass = new rojeru_san.RSMPassView();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        jtx_username = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 26, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 26, 41));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple2.setBackground(new java.awt.Color(0, 26, 41));
        rSButtonRiple2.setText("X");
        rSButtonRiple2.setColorHover(new java.awt.Color(48, 227, 202));
        rSButtonRiple2.setColorText(new java.awt.Color(48, 227, 202));
        rSButtonRiple2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        jtx_pass.setBackground(new java.awt.Color(0, 26, 41));
        jtx_pass.setForeground(new java.awt.Color(255, 255, 255));
        jtx_pass.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        jtx_pass.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        jtx_pass.setBotonColor(new java.awt.Color(48, 227, 202));
        jtx_pass.setDisabledTextColor(new java.awt.Color(48, 227, 202));
        jtx_pass.setPlaceholder("Ingrese contraseña");
        jtx_pass.setSelectedTextColor(new java.awt.Color(0, 26, 41));
        jtx_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtx_passActionPerformed(evt);
            }
        });
        jPanel1.add(jtx_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 40));

        rSButtonRiple3.setBackground(new java.awt.Color(48, 227, 202));
        rSButtonRiple3.setForeground(new java.awt.Color(0, 26, 41));
        rSButtonRiple3.setText("LOGIN");
        rSButtonRiple3.setColorHover(new java.awt.Color(48, 227, 202));
        rSButtonRiple3.setColorText(new java.awt.Color(0, 26, 41));
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 210, -1));

        jtx_username.setBackground(new java.awt.Color(0, 26, 41));
        jtx_username.setForeground(new java.awt.Color(255, 255, 255));
        jtx_username.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        jtx_username.setBordeColorNoFocus(new java.awt.Color(204, 0, 0));
        jtx_username.setBotonColor(new java.awt.Color(48, 227, 202));
        jtx_username.setPlaceholder("Ingrese usuario");
        jPanel1.add(jtx_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, 40));

        jLabel8.setBackground(new java.awt.Color(0, 26, 41));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 227, 202));
        jLabel8.setText("USERNAME:");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 30));

        jLabel10.setBackground(new java.awt.Color(0, 26, 41));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 227, 202));
        jLabel10.setText("PASSWORD:");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 210, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/taxis_icono6.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jtx_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtx_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtx_passActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        Usuario us=new Usuario();
        us.setUsername(this.jtx_username.getText());
        us.setPass(this.jtx_pass.getText());
        DAOUsuario dao=new DAOUsuariorImpl();
       
        if (us.getUsername().equals("") || us.getPass().equals("")){
            System.out.println("RELLENA CAMPOS");
        }else{
            try{
                if (dao.getValidarLogin(us) == null) {//si no devolvio nada del metodo "dao.getValidadLogin()"
                    System.out.println("USUARIO O CONSTRASEÑA SON INVALIDOS");
                    this.jtx_pass.setText("");
                }else{
                    Usuario usuario = dao.getValidarLogin(us);
                    frame_menu fm = new frame_menu();
                    fm.lbl_ID_USER.setText(String.valueOf(usuario.getId()));
                    fm.setVisible(true);
                    this.dispose();
                }
            }catch (Exception ex) {
                System.out.println("ERROR: Boton Login");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSMPassView jtx_pass;
    private rojeru_san.RSMTextFull jtx_username;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    // End of variables declaration//GEN-END:variables
}
