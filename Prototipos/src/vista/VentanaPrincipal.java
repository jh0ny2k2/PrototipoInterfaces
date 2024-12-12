// PAQUETES -----------
package vista;

// IMPORTACIONES -----------
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;

public class VentanaPrincipal extends javax.swing.JFrame {


=======
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    public VentanaPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        addIcon();
<<<<<<< HEAD
        
=======

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    }

    // MÉTODO PARA COLOCAR ICONO EN EL JFRAME:
    private void addIcon() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconoDeLaApp.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonRegistrateYA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTELESYA | Reserva habitaciones en los mejores hoteles del mundo!");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelUsuario.setText("CONTRASEÑA:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 280, -1));

        jLabelContrasena.setBackground(new java.awt.Color(0, 0, 0));
        jLabelContrasena.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
<<<<<<< HEAD
        jLabelContrasena.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabelContrasena.setText("NOMBRE DE USUARIO:");
        getContentPane().add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 280, -1));

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
        getContentPane().add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 310, 30));

        jPasswordField.setBackground(new java.awt.Color(200, 235, 241));
        jPasswordField.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 310, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
<<<<<<< HEAD
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabel1.setText("¿Todavía no tienes cuenta? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 200, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("REGÍSTRATE YA!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        jPanel1.setBackground(new java.awt.Color(200, 235, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
<<<<<<< HEAD

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
=======
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jLabel3.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 270, -1));

        jLabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoVPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(200, 235, 241));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
<<<<<<< HEAD
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 270, 40));

<<<<<<< HEAD
        jButtonRegistrateYA.setBackground(new java.awt.Color(255, 255, 255));
=======
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
        jButtonRegistrateYA.setBorder(null);
        jButtonRegistrateYA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrateYAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrateYA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 320, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
<<<<<<< HEAD
        DespuesDeLogin dLogin = new DespuesDeLogin(this, true);
        dLogin.setVisible(true);
=======
        String filePath = System.getProperty("user.home") + File.separator + "DatosLoginRegistro.txt";
        File archivo = new File(filePath);
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo de usuarios no existe. Por favor, regístrate primero.");
            return;
        }
        String usernameIngresado = jTextFieldNombreUsuario.getText().trim();
        String passwordIngresado = new String(jPasswordField.getPassword()).trim();
        if (usernameIngresado.isEmpty() || passwordIngresado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa el nombre de usuario y la contraseña.");
            return;
        }

        // Check for admin login first
        if ("admin".equals(usernameIngresado) && "admin".equals(passwordIngresado)) {
            InicioAdmin admin = new InicioAdmin();
            admin.setVisible(true);
            return;
        }

        boolean usuarioEncontrado = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Split the line by comma
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String usernameArchivo = partes[0].trim();
                    String passwordArchivo = partes[1].trim();
                    if (usernameArchivo.equals(usernameIngresado)
                            && passwordArchivo.equals(passwordIngresado)) {
                        usuarioEncontrado = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        if (usuarioEncontrado) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. ¡Bienvenido, " + usernameIngresado + "!");
            DespuesDeLogin dLogin = new DespuesDeLogin(this, true);
            dLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Inténtalo de nuevo.");
        }
>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRegistrateYAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrateYAActionPerformed
        RegistrarYa ventanaRegistro = new RegistrarYa(this, true);
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrateYAActionPerformed

<<<<<<< HEAD
=======
    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

>>>>>>> 3e065cd5f317fbc09d77895a7154a79055c19ed9
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegistrateYA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
