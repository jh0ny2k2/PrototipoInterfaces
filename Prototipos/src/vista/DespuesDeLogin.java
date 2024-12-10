package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DespuesDeLogin extends javax.swing.JDialog {

    VentanaPrincipal vMainFrame = new VentanaPrincipal();

    public DespuesDeLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(modal);
        setLocationRelativeTo(this);
        /* MANDAMOS EL FOCO AL LABEL PARA QUE AL ABRIR EL JDIALOG
           EL FOCO NO ESTÉ EN jTextField1*/
        jLabelReservaDeHabit.requestFocusInWindow();

    }

   

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelReservaDeHabit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldBuscarDestino = new javax.swing.JTextField();
        jTextFieldFechaViaje = new javax.swing.JTextField();
        jTextFieldElegirHabit = new javax.swing.JTextField();
        jLabelHabitIcono = new javax.swing.JLabel();
        jLabelCalendarioIcono = new javax.swing.JLabel();
        jLabelUbicacionIcono = new javax.swing.JLabel();
        jPanelButtonBuscarDesti = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelButtonVolverAtrás = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();
        jButtonVolverAtrásButton = new javax.swing.JButton();
        jButtonBuscarDestino = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelReservaDeHabit.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabelReservaDeHabit.setText("RESERVA DE HABITACIONES.");
        getContentPane().add(jLabelReservaDeHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldBuscarDestino.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldBuscarDestino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextFieldBuscarDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBuscarDestino.setText("Introduce el destino...");
        jTextFieldBuscarDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldBuscarDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBuscarDestinoFocusGained(evt);
            }
        });
        jTextFieldBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarDestinoActionPerformed(evt);
            }
        });

        jTextFieldFechaViaje.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldFechaViaje.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextFieldFechaViaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFechaViaje.setText("Lun, 9 - Mierc, 11");
        jTextFieldFechaViaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldFechaViaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaViajeFocusGained(evt);
            }
        });
        jTextFieldFechaViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaViajeActionPerformed(evt);
            }
        });

        jTextFieldElegirHabit.setBackground(new java.awt.Color(200, 235, 241));
        jTextFieldElegirHabit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextFieldElegirHabit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldElegirHabit.setText("1 HAB. 2 Adultos...");
        jTextFieldElegirHabit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldElegirHabit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldElegirHabitFocusGained(evt);
            }
        });

        jLabelHabitIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/habitacion_1.png"))); // NOI18N

        jLabelCalendarioIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        jLabelUbicacionIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubica.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHabitIcono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldElegirHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCalendarioIcono)
                            .addComponent(jLabelUbicacionIcono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFechaViaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBuscarDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUbicacionIcono)
                    .addComponent(jTextFieldBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCalendarioIcono)
                    .addComponent(jTextFieldFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHabitIcono)
                    .addComponent(jTextFieldElegirHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 380, 210));

        jPanelButtonBuscarDesti.setBackground(new java.awt.Color(200, 235, 241));
        jPanelButtonBuscarDesti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BUSCAR DESTINO");

        javax.swing.GroupLayout jPanelButtonBuscarDestiLayout = new javax.swing.GroupLayout(jPanelButtonBuscarDesti);
        jPanelButtonBuscarDesti.setLayout(jPanelButtonBuscarDestiLayout);
        jPanelButtonBuscarDestiLayout.setHorizontalGroup(
            jPanelButtonBuscarDestiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonBuscarDestiLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52))
        );
        jPanelButtonBuscarDestiLayout.setVerticalGroup(
            jPanelButtonBuscarDestiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonBuscarDestiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelButtonBuscarDesti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jLabelButtonVolverAtrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonVolverAtras.png"))); // NOI18N
        getContentPane().add(jLabelButtonVolverAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/segundoFondo.png"))); // NOI18N
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonVolverAtrásButton.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolverAtrásButton.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolverAtrásButton.setBorder(null);
        jButtonVolverAtrásButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAtrásButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAtrásButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jButtonBuscarDestino.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarDestino.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButtonBuscarDestino.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscarDestino.setBorder(null);
        jButtonBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarDestinoActionPerformed
        EscogerHotel escogerH = new EscogerHotel(vMainFrame, true);
        escogerH.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarDestinoActionPerformed

    private void jTextFieldBuscarDestinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscarDestinoFocusGained

        if (jTextFieldBuscarDestino.getText().equalsIgnoreCase("Introduce el destino...")) {
            jTextFieldBuscarDestino.setText("");
        }


    }//GEN-LAST:event_jTextFieldBuscarDestinoFocusGained

    private void jTextFieldFechaViajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaViajeFocusGained
        if (jTextFieldFechaViaje.getText().equalsIgnoreCase("Lun, 9 - Mierc, 11")) {
            jTextFieldFechaViaje.setText("");
        }

        JDateChooser dateChooserInicio = new JDateChooser();
        dateChooserInicio.setMinSelectableDate(new Date());
        dateChooserInicio.setDateFormatString("EEE, d MMM yyyy");

        int optionInicio = JOptionPane.showConfirmDialog(
                null,
                dateChooserInicio,
                "Seleccione la fecha de inicio de su estancia.",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (optionInicio == JOptionPane.OK_OPTION) {
            Date fechaInicio = dateChooserInicio.getDate();

            if (fechaInicio != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy");
                String fechaInicioStr = dateFormat.format(fechaInicio);

                jTextFieldFechaViaje.setText(fechaInicioStr);

                JDateChooser dateChooserFin = new JDateChooser();
                dateChooserFin.setMinSelectableDate(new Date(fechaInicio.getTime() + 24 * 60 * 60 * 1000)); // Un día después de la fecha de inicio
                dateChooserFin.setDateFormatString("EEE, d MMM yyyy");

                int optionFin = JOptionPane.showConfirmDialog(
                        null,
                        dateChooserFin,
                        "Seleccione la fecha de fin de su estancia.",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE
                );

                if (optionFin == JOptionPane.OK_OPTION) {
                    Date fechaFin = dateChooserFin.getDate();
                    if (fechaFin != null) {
                        String fechaFinStr = dateFormat.format(fechaFin);
                        jTextFieldFechaViaje.setText(fechaInicioStr + " - " + fechaFinStr);
                    }
                }

                jTextFieldElegirHabit.requestFocusInWindow();
            }
        }

    }//GEN-LAST:event_jTextFieldFechaViajeFocusGained

    private void jTextFieldElegirHabitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldElegirHabitFocusGained

        if (jTextFieldElegirHabit.getText().equalsIgnoreCase("1 HAB. 2 Adultos...")) {
            jTextFieldElegirHabit.setText("");
        }
    }//GEN-LAST:event_jTextFieldElegirHabitFocusGained

    private void jButtonVolverAtrásButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAtrásButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverAtrásButtonActionPerformed

    private void jTextFieldFechaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaViajeActionPerformed

    private void jTextFieldBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarDestinoActionPerformed

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
            java.util.logging.Logger.getLogger(DespuesDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DespuesDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DespuesDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DespuesDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DespuesDeLogin dialog = new DespuesDeLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonBuscarDestino;
    private javax.swing.JButton jButtonVolverAtrásButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelButtonVolverAtrás;
    private javax.swing.JLabel jLabelCalendarioIcono;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelHabitIcono;
    private javax.swing.JLabel jLabelReservaDeHabit;
    private javax.swing.JLabel jLabelUbicacionIcono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButtonBuscarDesti;
    private javax.swing.JTextField jTextFieldBuscarDestino;
    private javax.swing.JTextField jTextFieldElegirHabit;
    private javax.swing.JTextField jTextFieldFechaViaje;
    // End of variables declaration//GEN-END:variables
}
