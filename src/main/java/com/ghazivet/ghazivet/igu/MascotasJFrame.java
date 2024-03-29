package com.ghazivet.ghazivet.igu;

import com.ghazivet.ghazivet.logica.Controller;
import com.ghazivet.ghazivet.logica.Duenios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MascotasJFrame extends javax.swing.JFrame {

    Controller Controller = new Controller();
    public MascotasJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarMascotaBtn = new javax.swing.JButton();
        nuevaMascotaBtn = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        buscarMascotaTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dueniosTable = new javax.swing.JTable();
        actualizarListaBtn = new javax.swing.JButton();
        mascotasDuenioBtn = new javax.swing.JButton();
        editarMascotaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("MASCOTAS");

        buscarMascotaBtn.setText("Buscar");
        buscarMascotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMascotaBtnActionPerformed(evt);
            }
        });

        nuevaMascotaBtn.setText("Nueva");
        nuevaMascotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaMascotaBtnActionPerformed(evt);
            }
        });

        atrasBtn.setText("Atrás");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        buscarMascotaTF.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dueniosTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dueniosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dueniosTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        actualizarListaBtn.setText("Actualizar");
        actualizarListaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarListaBtnActionPerformed(evt);
            }
        });

        mascotasDuenioBtn.setText("Dueño");
        mascotasDuenioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasDuenioBtnActionPerformed(evt);
            }
        });

        editarMascotaBtn.setText("Editar");
        editarMascotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMascotaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nuevaMascotaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(atrasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buscarMascotaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mascotasDuenioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizarListaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(atrasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevaMascotaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMascotaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarMascotaBtn)
                    .addComponent(actualizarListaBtn)
                    .addComponent(mascotasDuenioBtn)
                    .addComponent(editarMascotaBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMascotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMascotaBtnActionPerformed

    }//GEN-LAST:event_buscarMascotaBtnActionPerformed

    private void nuevaMascotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaMascotaBtnActionPerformed
        NuevoDuenioJFrame NuevoDuenioJFrame = new NuevoDuenioJFrame();
        NuevoDuenioJFrame.setVisible(true);
        NuevoDuenioJFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_nuevaMascotaBtnActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        dispose();
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void actualizarListaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarListaBtnActionPerformed
        
    }//GEN-LAST:event_actualizarListaBtnActionPerformed

    private void mascotasDuenioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasDuenioBtnActionPerformed
        
    }//GEN-LAST:event_mascotasDuenioBtnActionPerformed

    private void editarMascotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMascotaBtnActionPerformed
        if(dueniosTable.getRowCount() > 0){
            if(dueniosTable.getSelectedRow() != -1){
                int idDuenio = Integer.parseInt(String.valueOf(dueniosTable.getValueAt(dueniosTable.getSelectedRow(), 0)));
                EditarDuenioJFrame EditarDuenioJFrame = new EditarDuenioJFrame(idDuenio);
                EditarDuenioJFrame.setVisible(true);
                EditarDuenioJFrame.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_editarMascotaBtnActionPerformed

    private void cargarTabla() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            // Filas y columnas no se pueden editar.
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // Establecemos nombres de las columnas.
        String[] columnsTitle = {"ID", "Documento", "Nombre", "Apellido", "Telefono", "Correos"};
        tableModel.setColumnIdentifiers(columnsTitle);

        // Cargamos datos de la columna desde la DB.
        List<Duenios> listaDuenios = Controller.getDuenios();

        // Recorrer la lista y cargar cada unos de los registros como fila de la tabla.
        if (listaDuenios != null) {
            for (Duenios duenio : listaDuenios) {
                Object[] duenioObject = {duenio.getId_duenio() ,duenio.getId_documento_duenio(), duenio.getNombre(), duenio.getApellido(), duenio.getTelefono(), duenio.getCorreo()};
                tableModel.addRow(duenioObject);
            }
        }
        dueniosTable.setModel(tableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarListaBtn;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton buscarMascotaBtn;
    private javax.swing.JTextField buscarMascotaTF;
    private javax.swing.JTable dueniosTable;
    private javax.swing.JButton editarMascotaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mascotasDuenioBtn;
    private javax.swing.JButton nuevaMascotaBtn;
    // End of variables declaration//GEN-END:variables
}
