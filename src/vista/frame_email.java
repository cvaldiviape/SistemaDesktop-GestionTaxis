package vista;

import conexion_BBDD.Auxiliar;

public class frame_email extends javax.swing.JFrame {
    int xx,xy;
    //Singleton: se implemento con la finalidad de evitar que el frame "frame_email" se instancia varias veces.
    //Declaro la variable una variable del mismo tipo de la clase en la que se encuentra como "private static"
    private static frame_email instancia;
    //Definimos el constructor con "private" para que no se pueda instancia desde otra clases. Y asi solo 
    //se pueda mediante este metodo "getInstancia".
    private frame_email() {
        initComponents();
        
    }
    //Creamos el metodo getInstancia, para que por medio del mismo se pueda llamar a la instancia solo una vez.
    //Por mas que llames a ese metodo varias veces, la instancia sera la misma.
    public static frame_email getInstancia(){
        if(instancia==null){
            instancia=new frame_email();
        }
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtEmailAsunto = new rojeru_san.RSMTextFull();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtClienteEmail = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmailContenido = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btnViajes1 = new rojeru_san.RSButtonRiple();
        btnViajes2 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
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
        rSButtonRiple2.setForeground(new java.awt.Color(48, 227, 202));
        rSButtonRiple2.setText("X");
        rSButtonRiple2.setColorHover(new java.awt.Color(48, 227, 202));
        rSButtonRiple2.setColorText(new java.awt.Color(48, 227, 202));
        rSButtonRiple2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 60, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(48, 227, 202));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("E-MAIL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        jPanel4.setBackground(new java.awt.Color(0, 26, 41));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmailAsunto.setBackground(new java.awt.Color(0, 26, 41));
        txtEmailAsunto.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailAsunto.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtEmailAsunto.setBotonColor(new java.awt.Color(64, 81, 78));
        txtEmailAsunto.setPlaceholder("Asunto");
        jPanel4.add(txtEmailAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 380, 40));

        jLabel12.setBackground(new java.awt.Color(0, 26, 41));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(48, 227, 202));
        jLabel12.setText("CONTENIDO");
        jLabel12.setOpaque(true);
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        jLabel13.setBackground(new java.awt.Color(0, 26, 41));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(48, 227, 202));
        jLabel13.setText("PARA       :");
        jLabel13.setOpaque(true);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        txtClienteEmail.setBackground(new java.awt.Color(0, 26, 41));
        txtClienteEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtClienteEmail.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtClienteEmail.setBotonColor(new java.awt.Color(64, 81, 78));
        txtClienteEmail.setPlaceholder("E-mail");
        jPanel4.add(txtClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 380, 40));

        txtEmailContenido.setColumns(20);
        txtEmailContenido.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        txtEmailContenido.setRows(5);
        jScrollPane1.setViewportView(txtEmailContenido);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 510, 140));

        jLabel14.setBackground(new java.awt.Color(0, 26, 41));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(48, 227, 202));
        jLabel14.setText("ASUNTO :");
        jLabel14.setOpaque(true);
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        btnViajes1.setBackground(new java.awt.Color(48, 227, 202));
        btnViajes1.setForeground(new java.awt.Color(0, 26, 41));
        btnViajes1.setText("SALIR");
        btnViajes1.setColorHover(new java.awt.Color(48, 227, 202));
        btnViajes1.setColorText(new java.awt.Color(0, 26, 41));
        btnViajes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajes1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnViajes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 170, 30));

        btnViajes2.setBackground(new java.awt.Color(48, 227, 202));
        btnViajes2.setForeground(new java.awt.Color(0, 26, 41));
        btnViajes2.setText("ENVIAR");
        btnViajes2.setColorHover(new java.awt.Color(48, 227, 202));
        btnViajes2.setColorText(new java.awt.Color(0, 26, 41));
        btnViajes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajes2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnViajes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 170, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btnViajes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajes1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnViajes1ActionPerformed

    private void btnViajes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajes2ActionPerformed
        Auxiliar au=new Auxiliar();
        au.setEnviarEmail(this.txtClienteEmail.getText(), this.txtEmailAsunto.getText(), this.txtEmailContenido.getText());
        
    }//GEN-LAST:event_btnViajes2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame_email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_email().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnViajes1;
    private rojeru_san.RSButtonRiple btnViajes2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    public rojeru_san.RSMTextFull txtClienteEmail;
    public rojeru_san.RSMTextFull txtEmailAsunto;
    public javax.swing.JTextArea txtEmailContenido;
    // End of variables declaration//GEN-END:variables
}
