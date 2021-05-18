package com.nizsimsek.hospitalims.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nizamettin
 */
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    private void initComponents() {

        JLabel lblMainMenuTitle = new JLabel();
        JButton btnPatientProcedures = new JButton();
        JButton btnPersonnelProcedures = new JButton();
        JButton btnDoctorProcedures = new JButton();
        JButton btnUserProcedures = new JButton();
        JButton btnLogout = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblMainMenuTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblMainMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMenuTitle.setText("Lütfen İşlem Türünü Seçiniz..");

        btnPatientProcedures.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnPatientProcedures.setText("Hasta İşlemleri");
        btnPatientProcedures.addActionListener(this::btnPatientProceduresActionPerformed);

        btnPersonnelProcedures.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnPersonnelProcedures.setText("Personel İşlemleri");
        btnPersonnelProcedures.addActionListener(this::btnPersonnelProceduresActionPerformed);

        btnDoctorProcedures.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDoctorProcedures.setText("Doktor İşlemleri");
        btnDoctorProcedures.addActionListener(this::btnDoctorProceduresActionPerformed);

        btnUserProcedures.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUserProcedures.setText("Kullanıcı İşlemleri");
        btnUserProcedures.addActionListener(this::btnUserProceduresActionPerformed);

        btnLogout.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnLogout.setText("Çıkış Yap");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblMainMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnPatientProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnUserProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDoctorProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnPersonnelProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblMainMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPatientProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPersonnelProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDoctorProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                    .addComponent(btnUserProcedures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnPersonnelProceduresActionPerformed(ActionEvent actionEvent) {
        PersonnelMenu personnelMenu = new PersonnelMenu();
        personnelMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnDoctorProceduresActionPerformed(ActionEvent actionEvent) {
        DoctorMenu doctorMenu = new DoctorMenu();
        doctorMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnLogoutActionPerformed(ActionEvent actionEvent) {
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }

    private void btnPatientProceduresActionPerformed(ActionEvent actionEvent) {
        PatientMenu patientMenu = new PatientMenu();
        patientMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnUserProceduresActionPerformed(ActionEvent actionEvent) {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
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
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }
}
