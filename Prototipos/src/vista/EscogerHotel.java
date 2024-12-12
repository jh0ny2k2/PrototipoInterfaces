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

        jLabelButtonVolverAtrás = new javax.swing.JLabel();
        jLabelReservaDeHabit = new javax.swing.JLabel();
        jScrollPaneHOTELES = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelHotelesEncontrados = new javax.swing.JLabel();
        jLabelTextoInfoExtra = new javax.swing.JLabel();
        jLabelTextoComentarios = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTextoCamas = new javax.swing.JLabel();
        jLabelTextoHabitaciones = new javax.swing.JLabel();
        jLabelTextoPRECIO = new javax.swing.JLabel();
        jLabelHotelInfo = new javax.swing.JLabel();
        jLabelPulgarArriba = new javax.swing.JLabel();
        jLabelPulgarEstrella = new javax.swing.JLabel();
        jLabelPulgarEstrella1 = new javax.swing.JLabel();
        jLabelPulgarEstrella2 = new javax.swing.JLabel();
        jLabelPulgarEstrella3 = new javax.swing.JLabel();
        jLabelUbicacionIcono = new javax.swing.JLabel();
        jLabelTextoAdvertencia = new javax.swing.JLabel();
        jLabelPulgarEstrella4 = new javax.swing.JLabel();
        jLabelUbicacionIcono1 = new javax.swing.JLabel();
        jLabelPulgarArriba1 = new javax.swing.JLabel();
        jLabelPulgarEstrella5 = new javax.swing.JLabel();
        jLabelPulgarEstrella6 = new javax.swing.JLabel();
        jLabelPulgarEstrella7 = new javax.swing.JLabel();
        jLabelTextoAdvertencia1 = new javax.swing.JLabel();
        jLabelTextoCamas1 = new javax.swing.JLabel();
        jLabelTextoPRECIO1 = new javax.swing.JLabel();
        jLabelTextoHabitaciones1 = new javax.swing.JLabel();
        jLabelHotelInfo1 = new javax.swing.JLabel();
        jLabelTextoComentarios1 = new javax.swing.JLabel();
        jLabelTextoInfoExtra1 = new javax.swing.JLabel();
        jLabelHotelesEncontrados1 = new javax.swing.JLabel();
        jLabelPulgarEstrella8 = new javax.swing.JLabel();
        jButtonSelecc1 = new javax.swing.JButton();
        jButtonSelecc2 = new javax.swing.JButton();
        jButtonVolverAtrásButton = new javax.swing.JButton();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelButtonVolverAtrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonVolverAtras.png"))); // NOI18N
        getContentPane().add(jLabelButtonVolverAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelReservaDeHabit.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabelReservaDeHabit.setText("GRANADA, ESPAÑA | 2, 5 Diciembre");
        getContentPane().add(jLabelReservaDeHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 590, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("8.3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabelHotelesEncontrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PuertaHotel1.jpg"))); // NOI18N
        jLabelHotelesEncontrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabelTextoInfoExtra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoInfoExtra.setText("En el centro de la ciudad");

        jLabelTextoComentarios.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoComentarios.setText("Muy bien - 4289 comentarios");

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("8.3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabelTextoCamas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelTextoCamas.setText("2 camas");

        jLabelTextoHabitaciones.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoHabitaciones.setText("Habitación de hotel:");

        jLabelTextoPRECIO.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabelTextoPRECIO.setText("€ 83");

        jLabelHotelInfo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelHotelInfo.setText("Hotel Granada Center");

        jLabelPulgarArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/meGusta.png"))); // NOI18N

        jLabelPulgarEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelPulgarEstrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelPulgarEstrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelPulgarEstrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelUbicacionIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubica.png"))); // NOI18N

        jLabelTextoAdvertencia.setBackground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabelTextoAdvertencia.setForeground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia.setText("Atención, sólo queda 1 a este precio");

        jLabelPulgarEstrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelUbicacionIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubica.png"))); // NOI18N

        jLabelPulgarArriba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/meGusta.png"))); // NOI18N

        jLabelPulgarEstrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelPulgarEstrella6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelPulgarEstrella7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jLabelTextoAdvertencia1.setBackground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabelTextoAdvertencia1.setForeground(new java.awt.Color(204, 0, 51));
        jLabelTextoAdvertencia1.setText("Atención, sólo quedan 4 a este precio");

        jLabelTextoCamas1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelTextoCamas1.setText("2 camas");

        jLabelTextoPRECIO1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabelTextoPRECIO1.setText("€ 153");

        jLabelTextoHabitaciones1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoHabitaciones1.setText("Habitación de hotel:");

        jLabelHotelInfo1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelHotelInfo1.setText("Hotel Alhambra Palace");

        jLabelTextoComentarios1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoComentarios1.setText("Muy bien - 12.129 comentarios");

        jLabelTextoInfoExtra1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelTextoInfoExtra1.setText("En el centro de la ciudad");

        jLabelHotelesEncontrados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alhambraPalace.jpg"))); // NOI18N
        jLabelHotelesEncontrados1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabelPulgarEstrella8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estrella.png"))); // NOI18N

        jButtonSelecc1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSelecc1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButtonSelecc1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelecc1.setText("SELECCIONAR HOTEL");
        jButtonSelecc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonSelecc2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSelecc2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButtonSelecc2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelecc2.setText("SELECCIONAR HOTEL");
        jButtonSelecc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHotelesEncontrados1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHotelesEncontrados)
                            .addComponent(jButtonSelecc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabelUbicacionIcono1)
                                                    .addComponent(jLabelPulgarEstrella7))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabelPulgarEstrella4)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jLabelPulgarEstrella5)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jLabelPulgarEstrella6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabelPulgarEstrella8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabelPulgarArriba1))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelTextoComentarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabelTextoCamas1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabelTextoInfoExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabelTextoPRECIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addComponent(jLabelTextoHabitaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTextoAdvertencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelHotelInfo1))
                                        .addGap(0, 881, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelHotelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabelUbicacionIcono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelTextoInfoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTextoComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabelPulgarEstrella1)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabelPulgarEstrella2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPulgarEstrella3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPulgarEstrella)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPulgarArriba))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTextoPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabelTextoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelTextoCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTextoAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSelecc1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHotelesEncontrados)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelHotelInfo)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPulgarEstrella1)
                            .addComponent(jLabelPulgarEstrella2)
                            .addComponent(jLabelPulgarEstrella3)
                            .addComponent(jLabelPulgarEstrella)
                            .addComponent(jLabelPulgarArriba))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTextoComentarios)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUbicacionIcono)
                            .addComponent(jLabelTextoInfoExtra))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTextoCamas)
                            .addComponent(jLabelTextoHabitaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTextoAdvertencia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelecc2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelHotelInfo1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPulgarEstrella7)
                            .addComponent(jLabelPulgarEstrella4)
                            .addComponent(jLabelPulgarEstrella5)
                            .addComponent(jLabelPulgarEstrella6)
                            .addComponent(jLabelPulgarArriba1)
                            .addComponent(jLabelPulgarEstrella8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabelTextoComentarios1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUbicacionIcono1)
                            .addComponent(jLabelTextoInfoExtra1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTextoCamas1)
                            .addComponent(jLabelTextoHabitaciones1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoPRECIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoAdvertencia1))
                    .addComponent(jLabelHotelesEncontrados1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelecc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jScrollPaneHOTELES.setViewportView(jPanel2);

        getContentPane().add(jScrollPaneHOTELES, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 510, 380));

        jButtonVolverAtrásButton.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolverAtrásButton.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolverAtrásButton.setBorder(null);
        jButtonVolverAtrásButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAtrásButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAtrásButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoTerceraVentana.png"))); // NOI18N
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton jButtonSelecc1;
    private javax.swing.JButton jButtonSelecc2;
    private javax.swing.JButton jButtonVolverAtrásButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelButtonVolverAtrás;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelHotelInfo;
    private javax.swing.JLabel jLabelHotelInfo1;
    private javax.swing.JLabel jLabelHotelesEncontrados;
    private javax.swing.JLabel jLabelHotelesEncontrados1;
    private javax.swing.JLabel jLabelPulgarArriba;
    private javax.swing.JLabel jLabelPulgarArriba1;
    private javax.swing.JLabel jLabelPulgarEstrella;
    private javax.swing.JLabel jLabelPulgarEstrella1;
    private javax.swing.JLabel jLabelPulgarEstrella2;
    private javax.swing.JLabel jLabelPulgarEstrella3;
    private javax.swing.JLabel jLabelPulgarEstrella4;
    private javax.swing.JLabel jLabelPulgarEstrella5;
    private javax.swing.JLabel jLabelPulgarEstrella6;
    private javax.swing.JLabel jLabelPulgarEstrella7;
    private javax.swing.JLabel jLabelPulgarEstrella8;
    private javax.swing.JLabel jLabelReservaDeHabit;
    private javax.swing.JLabel jLabelTextoAdvertencia;
    private javax.swing.JLabel jLabelTextoAdvertencia1;
    private javax.swing.JLabel jLabelTextoCamas;
    private javax.swing.JLabel jLabelTextoCamas1;
    private javax.swing.JLabel jLabelTextoComentarios;
    private javax.swing.JLabel jLabelTextoComentarios1;
    private javax.swing.JLabel jLabelTextoHabitaciones;
    private javax.swing.JLabel jLabelTextoHabitaciones1;
    private javax.swing.JLabel jLabelTextoInfoExtra;
    private javax.swing.JLabel jLabelTextoInfoExtra1;
    private javax.swing.JLabel jLabelTextoPRECIO;
    private javax.swing.JLabel jLabelTextoPRECIO1;
    private javax.swing.JLabel jLabelUbicacionIcono;
    private javax.swing.JLabel jLabelUbicacionIcono1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPaneHOTELES;
    // End of variables declaration//GEN-END:variables
}
