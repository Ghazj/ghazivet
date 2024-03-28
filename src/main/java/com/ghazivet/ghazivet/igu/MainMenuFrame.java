package com.ghazivet.ghazivet.igu;


public class MainMenuFrame extends javax.swing.JFrame {

    public MainMenuFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mascotasBtn1 = new javax.swing.JButton();
        dueniosBtn = new javax.swing.JButton();
        mascotasBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("GHAZI VET");

        mascotasBtn1.setText("Salir");
        mascotasBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasBtn1ActionPerformed(evt);
            }
        });

        dueniosBtn.setText("Dueños");
        dueniosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueniosBtnActionPerformed(evt);
            }
        });

        mascotasBtn.setText("Mascotas");
        mascotasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 217, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146)
                        .addComponent(mascotasBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dueniosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mascotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(mascotasBtn1))
                .addGap(16, 16, 16)
                .addComponent(dueniosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mascotasBtn)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mascotasBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotasBtn1ActionPerformed

    private void mascotasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasBtnActionPerformed
        MascotasDuenioJFrame MascotasJFrame = new MascotasDuenioJFrame();
        MascotasJFrame.setVisible(true);
        MascotasJFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_mascotasBtnActionPerformed

    private void dueniosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueniosBtnActionPerformed
        DueniosJFrame DueniosJFrame = new DueniosJFrame();
        DueniosJFrame.setVisible(true);
        DueniosJFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_dueniosBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dueniosBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mascotasBtn;
    private javax.swing.JButton mascotasBtn1;
    // End of variables declaration//GEN-END:variables
}
