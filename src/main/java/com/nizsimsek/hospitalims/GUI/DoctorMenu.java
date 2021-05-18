
package com.nizsimsek.hospitalims.GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class DoctorMenu extends javax.swing.JFrame {

    /** Creates new form DoctorMenu */
    public DoctorMenu() {
        initComponents();
    }

    private void initComponents() {

        JLabel lblDoctorMenuTitle = new JLabel();
        
        JButton btnAddDoctor = new JButton();
        JButton btnUpdateDoctor = new JButton();
        JButton btnDeleteDoctor = new JButton();
        JButton btnListDoctor = new JButton();
        JButton btnGoMainMenu = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblDoctorMenuTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblDoctorMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorMenuTitle.setText("Lütfen İşlem Türünü Seçiniz..");

        btnAddDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnAddDoctor.setText("Doktor Ekle");
        btnAddDoctor.addActionListener(this::btnAddDoctorActionPerformed);

        btnUpdateDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdateDoctor.setText("Doktor Güncelle");
        btnUpdateDoctor.addActionListener(this::btnUpdateDoctorActionPerformed);

        btnDeleteDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeleteDoctor.setText("Doktor Sil");
        btnDeleteDoctor.addActionListener(this::btnDeleteDoctorActionPerformed);

        btnListDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnListDoctor.setText("Doktor Listesi");
        btnListDoctor.addActionListener(this::btnListDoctorActionPerformed);

        btnGoMainMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(this::btnGoMainMenuActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDoctorMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDoctorMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnListDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        AddDoctor addDoctor = new AddDoctor();
        addDoctor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        UpdateDoctor updateDoctor = new UpdateDoctor();
        updateDoctor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        DeleteDoctor deleteDoctor = new DeleteDoctor();
        deleteDoctor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeleteDoctorActionPerformed

    private void btnListDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListDoctorActionPerformed
        ListDoctor listDoctor = new ListDoctor();
        listDoctor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListDoctorActionPerformed

    private void btnGoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new DoctorMenu().setVisible(true));
    }


}
