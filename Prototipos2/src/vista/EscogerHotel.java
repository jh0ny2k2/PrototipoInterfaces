package vista;


public class EscogerHotel extends javax.swing.JDialog {

    
    VentanaPrincipal vMainFrame = new VentanaPrincipal();

    public EscogerHotel(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtonBuscarDesti = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelReservaDeHabit = new javax.swing.JLabel();
        jLabelButtonVolverAtrás = new javax.swing.JLabel();
        jLabelHotelesEncontrados = new javax.swing.JLabel();
        jLabelTextoInfoExtra = new javax.swing.JLabel();
        jLabelTextoComentarios = new javax.swing.JLabel();
        jLabelTextoCamas = new javax.swing.JLabel();
        jLabelTextoHabitaciones = new javax.swing.JLabel();
        jLabelTextoPRECIO = new javax.swing.JLabel();
        jLabelTextoAdvertencia = new javax.swing.JLabel();
        jLabelHotelInfo = new javax.swing.JLabel();
        jLabelPulgarArriba = new javax.swing.JLabel();
        jLabelPulgarEstrella = new javax.swing.JLabel();
        jLabelPulgarEstrella1 = new javax.swing.JLabel();
        jLabelPulgarEstrella2 = new javax.swing.JLabel();
        jLabelPulgarEstrella3 = new javax.swing.JLabel();
        jLabelUbicacionIcono = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();
        jButtonVolverAtrásButton = new javax.swing.JButton();
        jButtonBuscarDestino = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("8.3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 40));

        jPanelButtonBuscarDesti.setBackground(new java.awt.Color(0, 0, 0));
        jPanelButtonBuscarDesti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONAR HOTEL");

        javax.swing.GroupLayout jPanelButtonBuscarDestiLayout = new javax.swing.GroupLayout(jPanelButtonBuscarDesti);
        jPanelButtonBuscarDesti.setLayout(jPanelButtonBuscarDestiLayout);
        jPanelButtonBuscarDestiLayout.setHorizontalGroup(
            jPanelButtonBuscarDestiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonBuscarDestiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        getContentPane().add(jPanelButtonBuscarDesti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, -1));

        jLabelReservaDeHabit.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabelReservaDeHabit.setText("GRANADA, ESPAÑA | 2, 5 Diciembre");
        getContentPane().add(jLabelReservaDeHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 590, -1));

        jLabelButtonVolverAtrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonVolverAtras.png"))); // NOI18N
        getContentPane().add(jLabelButtonVolverAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelHotelesEncontrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PuertaHotel1.jpg"))); // NOI18N
        jLabelHotelesEncontrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabelHotelesEncontrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabelTextoInfoExtra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoInfoExtra.setText("En el centro de la ciudad");
        getContentPane().add(jLabelTextoInfoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 200, -1));

        jLabelTextoComentarios.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoComentarios.setText("Muy bien - 4289 comentarios");
        getContentPane().add(jLabelTextoComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 230, -1));

        jLabelTextoCamas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelTextoCamas.setText("2 camas");
        getContentPane().add(jLabelTextoCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 60, -1));

        jLabelTextoHabitaciones.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoHabitaciones.setText("Habitación de hotel:");
        getContentPane().add(jLabelTextoHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, -1));

        jLabelTextoPRECIO.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabelTextoPRECIO.setText("€ 83");
        getContentPane().add(jLabelTextoPRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 90, 40));

        jLabelTextoAdvertencia.setBackground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabelTextoAdvertencia.setForeground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia.setText("Atención, sólo queda 1 a este precio");
        getContentPane().add(jLabelTextoAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 290, -1));

        jLabelHotelInfo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelHotelInfo.setText("Hotel Granada Center, Granada");
        getContentPane().add(jLabelHotelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 330, -1));

        jLabelPulgarArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/meGusta.png"))); // NOI18N
        getContentPane().add(jLabelPulgarArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 40, 40));

        jLabelPulgarEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N
        getContentPane().add(jLabelPulgarEstrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabelPulgarEstrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N
        getContentPane().add(jLabelPulgarEstrella1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabelPulgarEstrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N
        getContentPane().add(jLabelPulgarEstrella2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabelPulgarEstrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N
        getContentPane().add(jLabelPulgarEstrella3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabelUbicacionIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubica.png"))); // NOI18N
        getContentPane().add(jLabelUbicacionIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoTerceraVentana.png"))); // NOI18N
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

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
        getContentPane().add(jButtonBuscarDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarDestinoActionPerformed
        PasarelaDePago ventanaPagos = new PasarelaDePago(vMainFrame, true);
        ventanaPagos.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarDestinoActionPerformed

    private void jButtonVolverAtrásButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAtrásButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverAtrásButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EscogerHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscogerHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscogerHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscogerHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EscogerHotel dialog = new EscogerHotel(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelButtonVolverAtrás;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelHotelInfo;
    private javax.swing.JLabel jLabelHotelesEncontrados;
    private javax.swing.JLabel jLabelPulgarArriba;
    private javax.swing.JLabel jLabelPulgarEstrella;
    private javax.swing.JLabel jLabelPulgarEstrella1;
    private javax.swing.JLabel jLabelPulgarEstrella2;
    private javax.swing.JLabel jLabelPulgarEstrella3;
    private javax.swing.JLabel jLabelReservaDeHabit;
    private javax.swing.JLabel jLabelTextoAdvertencia;
    private javax.swing.JLabel jLabelTextoCamas;
    private javax.swing.JLabel jLabelTextoComentarios;
    private javax.swing.JLabel jLabelTextoHabitaciones;
    private javax.swing.JLabel jLabelTextoInfoExtra;
    private javax.swing.JLabel jLabelTextoPRECIO;
    private javax.swing.JLabel jLabelUbicacionIcono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButtonBuscarDesti;
    // End of variables declaration//GEN-END:variables
}
