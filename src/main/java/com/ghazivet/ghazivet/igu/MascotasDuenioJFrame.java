package com.ghazivet.ghazivet.igu;

import com.ghazivet.ghazivet.logica.Controller;
import com.ghazivet.ghazivet.logica.Duenios;
import com.ghazivet.ghazivet.logica.Mascotas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MascotasDuenioJFrame extends javax.swing.JFrame {

    Controller Controller = new Controller();
    int idDuenio;

    public MascotasDuenioJFrame() {
        initComponents();
    }

    public MascotasDuenioJFrame(int idDuenio) {
        this.idDuenio = idDuenio;
        initComponents();
        cargarDatos(idDuenio);
        cargarTabla(idDuenio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MascotasDuenioPanel = new javax.swing.JPanel();
        nombreApellidoTitleLabel = new javax.swing.JLabel();
        idDuenioLabel = new javax.swing.JLabel();
        documentoDuenioLabel = new javax.swing.JLabel();
        telefonoDuenioLabel = new javax.swing.JLabel();
        correoDuenioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mascotasTable = new javax.swing.JTable();
        editarMascotaBtn = new javax.swing.JButton();
        nuevaMascotaBtn = new javax.swing.JButton();
        cerrarBtn = new javax.swing.JButton();
        editarMascotaBtn1 = new javax.swing.JButton();
        nuevaMascotaBtn1 = new javax.swing.JButton();
        nuevaMascotaBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        MascotasDuenioPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        nombreApellidoTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nombreApellidoTitleLabel.setText("ANTONELLA MARTINI.");

        idDuenioLabel.setText("ID:");

        documentoDuenioLabel.setText("Documento:");

        telefonoDuenioLabel.setText("Telefono: ");

        correoDuenioLabel.setText("Correo:");

        mascotasTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mascotasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        mascotasTable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(mascotasTable);

        editarMascotaBtn.setText("Editar mascota");
        editarMascotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMascotaBtnActionPerformed(evt);
            }
        });

        nuevaMascotaBtn.setText("Nueva mascota");
        nuevaMascotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaMascotaBtnActionPerformed(evt);
            }
        });

        cerrarBtn.setText("Cerrar");
        cerrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarBtnActionPerformed(evt);
            }
        });

        editarMascotaBtn1.setText("Editar mascota");

        nuevaMascotaBtn1.setText("Vacunas");

        nuevaMascotaBtn2.setText("Historias Medicas");
        nuevaMascotaBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaMascotaBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MascotasDuenioPanelLayout = new javax.swing.GroupLayout(MascotasDuenioPanel);
        MascotasDuenioPanel.setLayout(MascotasDuenioPanelLayout);
        MascotasDuenioPanelLayout.setHorizontalGroup(
            MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MascotasDuenioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MascotasDuenioPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(MascotasDuenioPanelLayout.createSequentialGroup()
                        .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idDuenioLabel)
                            .addComponent(documentoDuenioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoDuenioLabel)
                            .addComponent(correoDuenioLabel))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MascotasDuenioPanelLayout.createSequentialGroup()
                        .addComponent(nombreApellidoTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MascotasDuenioPanelLayout.createSequentialGroup()
                        .addComponent(nuevaMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevaMascotaBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevaMascotaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarMascotaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        MascotasDuenioPanelLayout.setVerticalGroup(
            MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MascotasDuenioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreApellidoTitleLabel)
                    .addComponent(cerrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoDuenioLabel)
                    .addComponent(idDuenioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentoDuenioLabel)
                    .addComponent(correoDuenioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MascotasDuenioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaMascotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarMascotaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaMascotaBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaMascotaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MascotasDuenioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MascotasDuenioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarBtnActionPerformed

    private void editarMascotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMascotaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarMascotaBtnActionPerformed

    private void nuevaMascotaBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaMascotaBtn2ActionPerformed

    }//GEN-LAST:event_nuevaMascotaBtn2ActionPerformed

    private void nuevaMascotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaMascotaBtnActionPerformed
        NuevaMascotaJFrame NuevaMascotaJFrame = new NuevaMascotaJFrame(idDuenio);
        NuevaMascotaJFrame.setVisible(true);
        NuevaMascotaJFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_nuevaMascotaBtnActionPerformed

    private void cargarDatos(int idDuenio) {
        Duenios Duenio = Controller.getDuenio(idDuenio);

        System.out.println(Duenio.toString());

        nombreApellidoTitleLabel.setText(Duenio.getNombre() + " " + Duenio.getApellido() + ".");
        idDuenioLabel.setText("ID: " + Duenio.getId_duenio());
        documentoDuenioLabel.setText("Documento: " + Duenio.getApellido());
        telefonoDuenioLabel.setText("Telefono: " + Duenio.getTelefono());
        correoDuenioLabel.setText("Correo: " + Duenio.getCorreo());
    }

    private void cargarTabla(int idDuenio) {
        DefaultTableModel tableModel = new DefaultTableModel() {
            // Filas y columnas no se pueden editar.
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // Establecemos nombres de las columnas.
        String[] columnsTitle = {"ID", "Nombre", "Especie", "Género", "Raza", "Color", "Edad"};
        tableModel.setColumnIdentifiers(columnsTitle);

        // Cargamos datos de la columna desde la DB.
        List<Mascotas> listaMascotas = Controller.getMascotasDuenio(idDuenio);

        // Recorrer la lista y cargar cada unos de los registros como fila de la tabla.
        if (listaMascotas != null) {
            for (Mascotas mascota : listaMascotas) {
                System.out.println(mascota.toString());
                Object[] mascotaObject = {mascota.getId_mascota(), mascota.getNombre(), mascota.getEspecie().getId_especie(), mascota.getGenero().getId_genero(), mascota.getRaza(), mascota.getColor(), mascota.getEdad()};
                tableModel.addRow(mascotaObject);
            }
        }
        mascotasTable.setModel(tableModel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MascotasDuenioPanel;
    private javax.swing.JButton cerrarBtn;
    private javax.swing.JLabel correoDuenioLabel;
    private javax.swing.JLabel documentoDuenioLabel;
    private javax.swing.JButton editarMascotaBtn;
    private javax.swing.JButton editarMascotaBtn1;
    private javax.swing.JLabel idDuenioLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mascotasTable;
    private javax.swing.JLabel nombreApellidoTitleLabel;
    private javax.swing.JButton nuevaMascotaBtn;
    private javax.swing.JButton nuevaMascotaBtn1;
    private javax.swing.JButton nuevaMascotaBtn2;
    private javax.swing.JLabel telefonoDuenioLabel;
    // End of variables declaration//GEN-END:variables
}
