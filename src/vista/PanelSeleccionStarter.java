package vista;

import modelo.Globals;
import modelo.Starter;

public class PanelSeleccionStarter extends javax.swing.JPanel {

    public GUI GUICallBack;
    public Starter starter;

    public PanelSeleccionStarter() {
        initComponents();
    }

    void mostrar(GUI.SeleccionStarter seleccionStarter, GUI gui) {
        this.setVisible(true);
        this.requestFocusInWindow();

        this.GUICallBack = gui;
        this.starter = Globals.starter;

        if (seleccionStarter == GUI.SeleccionStarter.NORMAL) {
            labCabecera.setText("TUS CAMPEONES");
            if (!Globals.starter.isTeemoAvailable()) {
                labTeemo.setVisible(false);
                butTeemo.setVisible(false);
            }
            if (!starter.isPoppyAvailable()) {
                labPoppy.setVisible(false);
                butPoppy.setVisible(false);
            }
            if (!starter.isGnarAvailable()) {
                labGnar.setVisible(false);
                butGnar.setVisible(false);
            }
            if (!starter.isYuumiAvailable()) {
                labYuumi.setVisible(false);
                butYuumi.setVisible(false);
            }
        } else {
            GUICallBack.obtenerBarraMenu().setVisible(false);
            labCabecera.setText("ELIGE UN CAMPEÓN" + (!starter.isTeemoAvailable()
                    && !starter.isPoppyAvailable() && !starter.isGnarAvailable()
                    && !starter.isYuumiAvailable() ? " INICIAL" : ""));
            if (starter.isTeemoAvailable()) {
                labTeemo.setVisible(false);
                butTeemo.setVisible(false);
            }
            if (starter.isPoppyAvailable()) {
                labPoppy.setVisible(false);
                butPoppy.setVisible(false);
            }
            if (starter.isGnarAvailable()) {
                labGnar.setVisible(false);
                butGnar.setVisible(false);
            }
            if (starter.isYuumiAvailable()) {
                labYuumi.setVisible(false);
                butYuumi.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labTeemo = new javax.swing.JLabel();
        butTeemo = new javax.swing.JButton();
        labGnar = new javax.swing.JLabel();
        butGnar = new javax.swing.JButton();
        labPoppy = new javax.swing.JLabel();
        butPoppy = new javax.swing.JButton();
        labYuumi = new javax.swing.JLabel();
        butYuumi = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("ELIGE TU CAMPEON:");

        labTeemo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labTeemo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTeemo.setText("Teemo");

        butTeemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N
        butTeemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTeemoActionPerformed(evt);
            }
        });

        labGnar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labGnar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labGnar.setText("Gnar");

        butGnar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png"))); // NOI18N
        butGnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGnarActionPerformed(evt);
            }
        });

        labPoppy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labPoppy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPoppy.setText("Poppy");

        butPoppy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/poppy.png"))); // NOI18N
        butPoppy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPoppyActionPerformed(evt);
            }
        });

        labYuumi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labYuumi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labYuumi.setText("Yuumi");

        butYuumi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png"))); // NOI18N
        butYuumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYuumiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butPoppy, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(labPoppy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butYuumi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labYuumi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labGnar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butGnar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labPoppy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butPoppy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(labYuumi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butYuumi)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(labGnar)
                                .addGap(18, 18, 18)
                                .addComponent(butGnar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(labTeemo)
                                .addGap(18, 18, 18)
                                .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butTeemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTeemoActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        setTeemoDisponible();
        Globals.starter = Globals.teemo;
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butTeemoActionPerformed

    public void setTeemoDisponible() {
        starter.setTeemoAvailable(true);
        Globals.teemo.setTeemoAvailable(true);
        Globals.poppy.setTeemoAvailable(true);
        Globals.gnar.setTeemoAvailable(true);
        Globals.yuumi.setTeemoAvailable(true);
    }

    private void butGnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGnarActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        setGnarDisponible();
        Globals.starter = Globals.gnar;
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butGnarActionPerformed

    public void setGnarDisponible() {
        starter.setGnarAvailable(true);
        Globals.teemo.setGnarAvailable(true);
        Globals.poppy.setGnarAvailable(true);
        Globals.gnar.setGnarAvailable(true);
        Globals.yuumi.setGnarAvailable(true);
    }

    private void butPoppyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPoppyActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        setPoppyDisponible();
        Globals.starter = Globals.poppy;
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butPoppyActionPerformed

    public void setPoppyDisponible() {
        starter.setPoppyAvailable(true);
        Globals.teemo.setPoppyAvailable(true);
        Globals.poppy.setPoppyAvailable(true);
        Globals.gnar.setPoppyAvailable(true);
        Globals.yuumi.setPoppyAvailable(true);
    }

    private void butYuumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYuumiActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        setYuumiDisponible();
        Globals.starter = Globals.yuumi;
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butYuumiActionPerformed

    public void setYuumiDisponible() {
        starter.setYuumiAvailable(true);
        Globals.teemo.setYuumiAvailable(true);
        Globals.poppy.setYuumiAvailable(true);
        Globals.gnar.setYuumiAvailable(true);
        Globals.yuumi.setYuumiAvailable(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGnar;
    private javax.swing.JButton butPoppy;
    private javax.swing.JButton butTeemo;
    private javax.swing.JButton butYuumi;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labGnar;
    private javax.swing.JLabel labPoppy;
    private javax.swing.JLabel labTeemo;
    private javax.swing.JLabel labYuumi;
    // End of variables declaration//GEN-END:variables

}
