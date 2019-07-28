package interfaces;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class dashboard extends javax.swing.JFrame {

    String arch;
    String nom;
    String correo;
    String contrasena;

    public dashboard(String valor1, String valor2) {
        this.correo = valor1;
        this.contrasena = valor2;
        initComponents();
        ruta.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("ENVIO DE CORREO ELECTRONICO");
    }

    private dashboard() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        para = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        asunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Envio de Mensajes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 54));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("Destinatorio(s)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 25));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 670, -1));

        para.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        para.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paraKeyPressed(evt);
            }
        });
        getContentPane().add(para, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 68, 550, 30));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel1.setText("Si va enviar el mensaje a varios correos separelos por ; y sin espacios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 360, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mensaje");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 30));

        asunto.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        asunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asuntoActionPerformed(evt);
            }
        });
        asunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                asuntoKeyPressed(evt);
            }
        });
        getContentPane().add(asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 550, 30));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        texto.setRows(5);
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 650, 110));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setText("Asunto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 670, -1));

        jButton1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jButton1.setText("AGREGAR ARCHIVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 40));

        ruta.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        getContentPane().add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, -1));

        jButton2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 170, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, 670, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, 670, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 362, 670, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 670, 10));

        jButton3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 150, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asuntoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            arch = dlg.getSelectedFile().getPath();
            nom = dlg.getSelectedFile().getName();
            ruta.setVisible(true);
            ruta.setText(arch);
            ruta.setEditable(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (para.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No ha digitado el destinatario");
        } else {
            int valor = 5;
            if (asunto.getText().equals("")) {
                valor = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea enviar el correo sin asunto?");
            }
            if (valor == 5 || valor == 0) {
                proceso objeto = new proceso(correo, contrasena, para, asunto, texto, ruta, nom, label);
                objeto.start();
                objeto = null;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ruta.setText("");
        ruta.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void paraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paraKeyPressed
        label.setText("");
    }//GEN-LAST:event_paraKeyPressed

    private void asuntoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asuntoKeyPressed
        label.setText("");
    }//GEN-LAST:event_asuntoKeyPressed

    private void textoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyPressed
        label.setText("");
    }//GEN-LAST:event_textoKeyPressed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asunto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel label;
    private javax.swing.JTextField para;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}