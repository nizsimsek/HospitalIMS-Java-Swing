package com.nizsimsek.hospitalims.GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class PatientMenu extends javax.swing.JFrame {

    public PatientMenu() {
        initComponents();
    }

    private void initComponents() {

        JLabel lblPatientMenuTitle = new JLabel();
        
        JButton btnAddPatient = new JButton();
        JButton btnUpdatePatient = new JButton();
        JButton btnDeletePatient = new JButton();
        JButton btnListPatient = new JButton();
        JButton btnGoMainMenu = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblPatientMenuTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblPatientMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientMenuTitle.setText("Lütfen İşlem Türünü Seçiniz..");

        btnAddPatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnAddPatient.setText("Hasta Ekle");
        btnAddPatient.addActionListener(this::btnAddPatientActionPerformed);

        btnUpdatePatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdatePatient.setText("Hasta Güncelle");
        btnUpdatePatient.addActionListener(this::btnUpdatePatientActionPerformed);

        btnDeletePatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeletePatient.setText("Hasta Sil");
        btnDeletePatient.addActionListener(evt -> btnDeletePatientActionPerformed());

        btnListPatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnListPatient.setText("Hasta Listesi");
        btnListPatient.setToolTipText("");
        btnListPatient.addActionListener(evt -> btnListPatientActionPerformed());

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
                        .addComponent(lblPatientMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPatientMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnListPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {
        AddPatient addPatient = new AddPatient();
        addPatient.setVisible(true);
        this.setVisible(false);
    }

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {
        UpdatePatient updatePatient = new UpdatePatient();
        updatePatient.setVisible(true);
        this.setVisible(false);
    }

    private void btnDeletePatientActionPerformed() {
        DeletePatient deletePatient = new DeletePatient();
        deletePatient.setVisible(true);
        this.setVisible(false);
    }

    private void btnListPatientActionPerformed() {
        ListPatient listPatient = new ListPatient();
        listPatient.setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(PatientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new PatientMenu().setVisible(true));
    }
}
