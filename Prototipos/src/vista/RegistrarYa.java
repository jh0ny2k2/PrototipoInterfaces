package vista;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9

public class RegistrarYa extends javax.swing.JDialog {

    
    VentanaPrincipal vMainFrame = new VentanaPrincipal();
    

    public RegistrarYa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(modal);
        setLocationRelativeTo(this);



    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jPanelButtonBuscarDesti = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBuscarDestino = new javax.swing.JButton();
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jPanel1 = new javax.swing.JPanel();
        jLabelButtonVolverAtrás = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelPass = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelRepetirPass = new javax.swing.JLabel();
        jPasswordFieldDOS = new javax.swing.JPasswordField();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelUserName1 = new javax.swing.JLabel();
        jTextFieldNombreUsuario1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreUsuario2 = new javax.swing.JTextField();
        jLabelUserName2 = new javax.swing.JLabel();
        jLabelUserName3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jButtonVolverAtrásButton = new javax.swing.JButton();
=======
        jButtonBuscarDestino = new javax.swing.JButton();
        jButtonVolverAtrásButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOTELESYA | Registro de cuenta nueva ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        jPanelButtonBuscarDesti.setBackground(new java.awt.Color(0, 0, 0));
        jPanelButtonBuscarDesti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRAR CUENTA");

        javax.swing.GroupLayout jPanelButtonBuscarDestiLayout = new javax.swing.GroupLayout(jPanelButtonBuscarDesti);
        jPanelButtonBuscarDesti.setLayout(jPanelButtonBuscarDestiLayout);
        jPanelButtonBuscarDestiLayout.setHorizontalGroup(
            jPanelButtonBuscarDestiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonBuscarDestiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(52, 52, 52))
        );
        jPanelButtonBuscarDestiLayout.setVerticalGroup(
            jPanelButtonBuscarDestiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonBuscarDestiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelButtonBuscarDesti, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 290, -1));

        jButtonBuscarDestino.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarDestino.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButtonBuscarDestino.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscarDestino.setBorder(null);
        jButtonBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 290, 40));

=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelButtonVolverAtrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonVolverAtras.png"))); // NOI18N
        jPanel1.add(jLabelButtonVolverAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(200, 235, 241));
        jPasswordField.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 310, 30));

        jLabelPass.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPass.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelPass.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelPass.setText("CONTRASEÑA:");
        jPanel1.add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 30));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelUserName.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelUserName.setText("NOMBRE DE USUARIO:");
        jPanel1.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 280, 30));

        jLabelRepetirPass.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRepetirPass.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelRepetirPass.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelRepetirPass.setText("REPITA CONTRASEÑA:");
        jPanel1.add(jLabelRepetirPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 280, 30));

        jPasswordFieldDOS.setBackground(new java.awt.Color(200, 235, 241));
        jPasswordFieldDOS.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPasswordFieldDOS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jPasswordFieldDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 310, 30));

        jTextFieldNombreUsuario.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldNombreUsuario.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
<<<<<<< HEAD
        jTextFieldNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jTextFieldNombreUsuario.setToolTipText("");
        jTextFieldNombreUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextFieldNombreUsuario.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 310, 30));

        jLabelUserName1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName1.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelUserName1.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelUserName1.setText("NÚMERO DE TELÉFONO:");
        jPanel1.add(jLabelUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 280, 30));

        jTextFieldNombreUsuario1.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldNombreUsuario1.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
<<<<<<< HEAD
        jTextFieldNombreUsuario1.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jTextFieldNombreUsuario1.setToolTipText("");
        jTextFieldNombreUsuario1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextFieldNombreUsuario1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextFieldNombreUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 310, 30));

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 20, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("conforme a la normativa vigente.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 290, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Declaro haber leído y aceptado los términos y condiciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 290, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("de privacidad, autorizando el tratamiento de mis datos conforme a la normativa vigente.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 290, 20));

        jTextFieldNombreUsuario2.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldNombreUsuario2.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
<<<<<<< HEAD
        jTextFieldNombreUsuario2.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jTextFieldNombreUsuario2.setToolTipText("");
        jTextFieldNombreUsuario2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextFieldNombreUsuario2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextFieldNombreUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuario2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 310, 30));

        jLabelUserName2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
<<<<<<< HEAD
        jLabelUserName2.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelUserName2.setText("CREAR NUEVA CUENTA!");
        jPanel1.add(jLabelUserName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 360, 30));

        jLabelUserName3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName3.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelUserName3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserName3.setText("CORREO ELECTRÓNICO:");
        jPanel1.add(jLabelUserName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 580));

        jButtonVolverAtrásButton.setBackground(new java.awt.Color(255, 255, 255));
=======
        jLabelUserName3.setText("CORREO ELECTRÓNICO:");
        jPanel1.add(jLabelUserName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 30));

        jButtonBuscarDestino.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBuscarDestino.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jButtonBuscarDestino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarDestino.setText("Registrar");
        jButtonBuscarDestino.setBorder(null);
        jButtonBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 320, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 580));

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jButtonVolverAtrásButton.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolverAtrásButton.setBorder(null);
        jButtonVolverAtrásButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAtrásButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAtrásButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

<<<<<<< HEAD
=======
        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarDestinoActionPerformed
<<<<<<< HEAD

=======
        String username = jTextFieldNombreUsuario.getText();
        String password = new String(jPasswordField.getPassword());
        String confirmPassword = new String(jPasswordFieldDOS.getPassword());

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return;
        }

        String filePath = System.getProperty("user.home") + File.separator + "DatosLoginRegistro.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(username + "," + password);
            JOptionPane.showMessageDialog(null, "Datos guardados en: " + filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        this.dispose();
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    }//GEN-LAST:event_jButtonBuscarDestinoActionPerformed

    private void jButtonVolverAtrásButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAtrásButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverAtrásButtonActionPerformed

    private void jTextFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldNombreUsuarioActionPerformed

    private void jTextFieldNombreUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuario1ActionPerformed

    }//GEN-LAST:event_jTextFieldNombreUsuario1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextFieldNombreUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuario2ActionPerformed
<<<<<<< HEAD

=======
        
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    }//GEN-LAST:event_jTextFieldNombreUsuario2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarYa dialog = new RegistrarYa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
    private javax.swing.JButton jButton1;
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    private javax.swing.JButton jButtonBuscarDestino;
    private javax.swing.JButton jButtonVolverAtrásButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel4;
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    private javax.swing.JLabel jLabelButtonVolverAtrás;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelRepetirPass;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserName1;
    private javax.swing.JLabel jLabelUserName2;
    private javax.swing.JLabel jLabelUserName3;
    private javax.swing.JPanel jPanel1;
<<<<<<< HEAD
    private javax.swing.JPanel jPanelButtonBuscarDesti;
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldDOS;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldNombreUsuario1;
    private javax.swing.JTextField jTextFieldNombreUsuario2;
    // End of variables declaration//GEN-END:variables
}
