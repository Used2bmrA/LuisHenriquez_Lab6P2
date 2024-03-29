
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author h_lah
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_crearEquipo = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_pais = new javax.swing.JTextField();
        tf_nombreEquipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ciudad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_estadio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bt_agregarEquipo = new javax.swing.JButton();
        pn_crearJugador = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bt_agregarJugador = new javax.swing.JButton();
        tf_nombreJugador = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        cb_posicion = new javax.swing.JComboBox<>();
        pn_transferencias = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_jugadores = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtree_equipos = new javax.swing.JTree();
        bt_transferirJugador = new javax.swing.JButton();
        pp_jugadores = new javax.swing.JPopupMenu();
        jmi_modificarJugador = new javax.swing.JMenuItem();
        jmi_eliminarJugador = new javax.swing.JMenuItem();
        pp_equipos = new javax.swing.JPopupMenu();
        jmi_eliminarEquipo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_crearEquipo = new javax.swing.JButton();
        bt_crearJugador = new javax.swing.JButton();
        bt_transferencias = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmi_transferencia = new javax.swing.JMenu();
        jmi_crearEquipo = new javax.swing.JMenuItem();
        jmi_crearJugador = new javax.swing.JMenuItem();
        jmi_transferencias = new javax.swing.JMenuItem();
        jm_ayuda = new javax.swing.JMenu();

        pn_crearEquipo.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Crear Equipo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("País del equipo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));
        jPanel2.add(tf_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 160, -1));
        jPanel2.add(tf_nombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del equipo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 170, -1));
        jPanel2.add(tf_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ciudad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 70, -1));
        jPanel2.add(tf_estadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estadio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 70, -1));

        bt_agregarEquipo.setText("Agregar");
        bt_agregarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_agregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarEquipoActionPerformed(evt);
            }
        });
        jPanel2.add(bt_agregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        javax.swing.GroupLayout pn_crearEquipoLayout = new javax.swing.GroupLayout(pn_crearEquipo.getContentPane());
        pn_crearEquipo.getContentPane().setLayout(pn_crearEquipoLayout);
        pn_crearEquipoLayout.setHorizontalGroup(
            pn_crearEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearEquipoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_crearEquipoLayout.setVerticalGroup(
            pn_crearEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearEquipoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Crear Jugadores");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Posición:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Edad:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 80, -1));

        bt_agregarJugador.setText("Agregar");
        bt_agregarJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_agregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarJugadorActionPerformed(evt);
            }
        });
        jPanel3.add(bt_agregarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));
        jPanel3.add(tf_nombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 190, -1));

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));
        jPanel3.add(sp_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, -1));

        cb_posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));
        jPanel3.add(cb_posicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));

        javax.swing.GroupLayout pn_crearJugadorLayout = new javax.swing.GroupLayout(pn_crearJugador.getContentPane());
        pn_crearJugador.getContentPane().setLayout(pn_crearJugadorLayout);
        pn_crearJugadorLayout.setHorizontalGroup(
            pn_crearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearJugadorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_crearJugadorLayout.setVerticalGroup(
            pn_crearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearJugadorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Transferencias");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Jugadores");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Equipos");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jlist_jugadores.setModel(new DefaultListModel());
        jlist_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlist_jugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlist_jugadores);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 160));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Paises");
        jtree_equipos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_equiposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtree_equipos);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, 170));

        bt_transferirJugador.setText("Transferir ->");
        bt_transferirJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_transferirJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_transferirJugadorActionPerformed(evt);
            }
        });
        jPanel4.add(bt_transferirJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        javax.swing.GroupLayout pn_transferenciasLayout = new javax.swing.GroupLayout(pn_transferencias.getContentPane());
        pn_transferencias.getContentPane().setLayout(pn_transferenciasLayout);
        pn_transferenciasLayout.setHorizontalGroup(
            pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transferenciasLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_transferenciasLayout.setVerticalGroup(
            pn_transferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transferenciasLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pp_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp_jugadoresMouseClicked(evt);
            }
        });

        jmi_modificarJugador.setText("Modificar");
        jmi_modificarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_modificarJugadorMouseClicked(evt);
            }
        });
        pp_jugadores.add(jmi_modificarJugador);

        jmi_eliminarJugador.setText("Eliminar");
        jmi_eliminarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_eliminarJugadorMouseClicked(evt);
            }
        });
        pp_jugadores.add(jmi_eliminarJugador);

        jmi_eliminarEquipo.setText("Eliminar");
        jmi_eliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarEquipoActionPerformed(evt);
            }
        });
        pp_equipos.add(jmi_eliminarEquipo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Winning.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jToolBar1.setBackground(new java.awt.Color(255, 204, 102));
        jToolBar1.setRollover(true);

        bt_crearEquipo.setBackground(new java.awt.Color(255, 204, 102));
        bt_crearEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_crearEquipo.setText("Crear Equipo");
        bt_crearEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_crearEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearEquipoMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_crearEquipo);

        bt_crearJugador.setBackground(new java.awt.Color(255, 204, 102));
        bt_crearJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_crearJugador.setText("Crear Jugador");
        bt_crearJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_crearJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearJugadorMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_crearJugador);

        bt_transferencias.setBackground(new java.awt.Color(255, 204, 102));
        bt_transferencias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_transferencias.setText("Transferencias");
        bt_transferencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_transferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_transferenciasMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_transferencias);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 260, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Bienvenido a Boroa Fantasy League");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jmi_transferencia.setText("Opciones");
        jmi_transferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jmi_crearEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_crearEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-soccer-16.png"))); // NOI18N
        jmi_crearEquipo.setText("Crear Equipo");
        jmi_crearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearEquipoActionPerformed(evt);
            }
        });
        jmi_transferencia.add(jmi_crearEquipo);

        jmi_crearJugador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_crearJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-soccer-64.png"))); // NOI18N
        jmi_crearJugador.setText("Crear Jugador");
        jmi_crearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearJugadorActionPerformed(evt);
            }
        });
        jmi_transferencia.add(jmi_crearJugador);

        jmi_transferencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_transferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-soccer-ball-50.png"))); // NOI18N
        jmi_transferencias.setText("Transferencias");
        jmi_transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_transferenciasActionPerformed(evt);
            }
        });
        jmi_transferencia.add(jmi_transferencias);

        jMenuBar1.add(jmi_transferencia);

        jm_ayuda.setText("Ayuda");
        jm_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_ayudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jm_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_ayudaMouseClicked
        JOptionPane.showMessageDialog(this, "Instalé este botón para que me ayudara, pero, como gran parte de mi programa, no funcionó");
    }//GEN-LAST:event_jm_ayudaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "GOL!");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jmi_crearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearEquipoActionPerformed
        pn_crearEquipo.pack();
        pn_crearEquipo.setVisible(true);
        pn_crearEquipo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmi_crearEquipoActionPerformed

    private void bt_crearEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearEquipoMouseClicked
        pn_crearEquipo.pack();
        pn_crearEquipo.setVisible(true);
        pn_crearEquipo.setLocationRelativeTo(null);
    }//GEN-LAST:event_bt_crearEquipoMouseClicked

    private void jmi_crearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearJugadorActionPerformed
        pn_crearJugador.pack();
        pn_crearJugador.setVisible(true);
        pn_crearJugador.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmi_crearJugadorActionPerformed

    private void bt_crearJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearJugadorMouseClicked
        pn_crearJugador.pack();
        pn_crearJugador.setVisible(true);
        pn_crearJugador.setLocationRelativeTo(null);
    }//GEN-LAST:event_bt_crearJugadorMouseClicked

    private void jmi_transferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_transferenciasActionPerformed
        pn_transferencias.pack();
        pn_transferencias.setLocationRelativeTo(null);
        pn_transferencias.setVisible(true);
    }//GEN-LAST:event_jmi_transferenciasActionPerformed

    private void bt_transferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_transferenciasMouseClicked
        pn_transferencias.pack();
        pn_transferencias.setLocationRelativeTo(null);
        pn_transferencias.setVisible(true);
    }//GEN-LAST:event_bt_transferenciasMouseClicked

    private void bt_agregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarEquipoActionPerformed
        String pais, nombre, ciudad, estadio;
        pais = tf_pais.getText();
        nombre = tf_nombreEquipo.getText();
        ciudad = tf_ciudad.getText();
        estadio = tf_estadio.getText();
        
        if (pais.equals("") || nombre.equals("") || ciudad.equals("") || estadio.equals("")) {
            JOptionPane.showMessageDialog(pn_crearEquipo, "No puedes dejar un campo vacio");
        }else{
            tf_pais.setText("");
            tf_nombreEquipo.setText("");
            tf_ciudad.setText("");
            tf_estadio.setText("");
            Equipo nuevoEquipo = new Equipo(pais, nombre, ciudad, estadio);
            
            DefaultTreeModel modelo = (DefaultTreeModel) jtree_equipos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode equipo  = new DefaultMutableTreeNode (nuevoEquipo);
            DefaultMutableTreeNode pais1  = new DefaultMutableTreeNode (nuevoEquipo.getPais());

            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(pais)) {
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(equipo);
                    centinela = 1;
                }
            }
            
            if (centinela == -1) {
                pais1.add(equipo);
                raiz.add(pais1);
            }
            
            modelo.reload();
            JOptionPane.showMessageDialog(pn_crearEquipo, "Equipo creado exitosamente");
        }
    }//GEN-LAST:event_bt_agregarEquipoActionPerformed

    private void bt_agregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarJugadorActionPerformed
        String nombre, posicion;
        int edad;
        nombre = tf_nombreJugador.getText();
        posicion = cb_posicion.getSelectedItem().toString();
        edad = (int) sp_edad.getValue();
        
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(pn_crearJugador, "No puedes dejar el nombre vacio");
        }else{
            
            DefaultListModel modelo =(DefaultListModel) jlist_jugadores.getModel();
            modelo.addElement(new Jugador(nombre, posicion, edad));
            jlist_jugadores.setModel(modelo);

            tf_nombreJugador.setText("");
            JOptionPane.showMessageDialog(pn_crearJugador, "Jugador creado exitosamente");
        }
        
    }//GEN-LAST:event_bt_agregarJugadorActionPerformed

    private void bt_transferirJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_transferirJugadorActionPerformed
        if (jlist_jugadores.getSelectedIndex() >= 0 && jtree_equipos.getSelectionCount() != 0) {
            DefaultTreeModel modeloARBOL = (DefaultTreeModel) jtree_equipos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            DefaultListModel modeloLISTA = (DefaultListModel) jlist_jugadores.getModel();
            
            
            
            modeloARBOL.reload();
        } else {
            JOptionPane.showMessageDialog(pn_transferencias,"Seleccione un jugador y un equipo");
        }
    }//GEN-LAST:event_bt_transferirJugadorActionPerformed

    private void jlist_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlist_jugadoresMouseClicked
        if (jlist_jugadores.getSelectedIndex() >= 0) {
            if (evt.getButton() == 3) {
                pp_jugadores.show(evt.getComponent(),evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jlist_jugadoresMouseClicked

    private void pp_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp_jugadoresMouseClicked
        if (evt.getButton() == 3) {
            pp_jugadores.show(evt.getComponent(),evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_pp_jugadoresMouseClicked

    private void jmi_modificarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_modificarJugadorMouseClicked
        if (jlist_jugadores.getSelectedIndex() >= 0) {
            DefaultListModel modeloLISTA = (DefaultListModel) jlist_jugadores.getModel();
            ((Jugador) modeloLISTA.get(jlist_jugadores.getSelectedIndex()) ).setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            ((Jugador) modeloLISTA.get(jlist_jugadores.getSelectedIndex()) ).setEdad((Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))));
            jlist_jugadores.setModel(modeloLISTA);
        }
    }//GEN-LAST:event_jmi_modificarJugadorMouseClicked

    private void jtree_equiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_equiposMouseClicked
        if (evt.getButton() == 3) {
            int row = jtree_equipos.getClosestRowForLocation(evt.getX(), evt.getY());
            jtree_equipos.setSelectionRow(row);
            Object v1 = jtree_equipos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            
            if (nodo_seleccionado.getUserObject() instanceof Equipo) {
                equipo_seleccionado = (Equipo) nodo_seleccionado.getUserObject();
                 pp_equipos.show(evt.getComponent(), evt.getX(), evt.getY());
            }
            
           
        }
    }//GEN-LAST:event_jtree_equiposMouseClicked

    private void jmi_eliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarEquipoActionPerformed
        int response = JOptionPane.showConfirmDialog(pn_transferencias,"Seguro de Eliminar?",
                "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) jtree_equipos.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
    }//GEN-LAST:event_jmi_eliminarEquipoActionPerformed

    private void jmi_eliminarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_eliminarJugadorMouseClicked
         if (jlist_jugadores.getSelectedIndex() >= 0) {
            DefaultListModel modeloLISTA = (DefaultListModel) jlist_jugadores.getModel();
            modeloLISTA.remove(jlist_jugadores.getSelectedIndex());
            jlist_jugadores.setModel(modeloLISTA);
        }
    }//GEN-LAST:event_jmi_eliminarJugadorMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarEquipo;
    private javax.swing.JButton bt_agregarJugador;
    private javax.swing.JButton bt_crearEquipo;
    private javax.swing.JButton bt_crearJugador;
    private javax.swing.JButton bt_transferencias;
    private javax.swing.JButton bt_transferirJugador;
    private javax.swing.JComboBox<String> cb_posicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> jlist_jugadores;
    private javax.swing.JMenu jm_ayuda;
    private javax.swing.JMenuItem jmi_crearEquipo;
    private javax.swing.JMenuItem jmi_crearJugador;
    private javax.swing.JMenuItem jmi_eliminarEquipo;
    private javax.swing.JMenuItem jmi_eliminarJugador;
    private javax.swing.JMenuItem jmi_modificarJugador;
    private javax.swing.JMenu jmi_transferencia;
    private javax.swing.JMenuItem jmi_transferencias;
    private javax.swing.JTree jtree_equipos;
    private javax.swing.JFrame pn_crearEquipo;
    private javax.swing.JFrame pn_crearJugador;
    private javax.swing.JFrame pn_transferencias;
    private javax.swing.JPopupMenu pp_equipos;
    private javax.swing.JPopupMenu pp_jugadores;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_estadio;
    private javax.swing.JTextField tf_nombreEquipo;
    private javax.swing.JTextField tf_nombreJugador;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables

        DefaultMutableTreeNode nodo_seleccionado;
        Equipo equipo_seleccionado;


}
