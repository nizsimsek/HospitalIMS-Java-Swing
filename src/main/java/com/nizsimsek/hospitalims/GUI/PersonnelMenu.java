package com.nizsimsek.hospitalims.GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class PersonnelMenu extends javax.swing.JFrame {

    public PersonnelMenu() {
        initComponents();
    }

    private void initComponents() {

        JButton btnUpdatePersonnel = new JButton();
        JButton btnDeletePersonnel = new JButton();
        JButton btnListPersonnel = new JButton();
        JButton btnGoMainMenu = new JButton();
        JLabel lblPersonnelMenuTitle = new JLabel();
        
        JButton btnAddPersonnel = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnUpdatePersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdatePersonnel.setText("Personel Güncelle");
        btnUpdatePersonnel.addActionListener(this::btnUpdatePersonnelActionPerformed);

        btnDeletePersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeletePersonnel.setText("Personel Sil");
        btnDeletePersonnel.addActionListener(this::btnDeletePersonnelActionPerformed);

        btnListPersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnListPersonnel.setText("Personel Listesi");
        btnListPersonnel.setToolTipText("");
        btnListPersonnel.addActionListener(this::btnListPersonnelActionPerformed);

        btnGoMainMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(this::btnGoMainMenuActionPerformed);

        lblPersonnelMenuTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblPersonnelMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonnelMenuTitle.setText("Lütfen İşlem Türünü Seçiniz..");

        btnAddPersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnAddPersonnel.setText("Personel Ekle");
        btnAddPersonnel.addActionListener(evt -> btnAddPersonnelActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblPersonnelMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAddPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeletePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnUpdatePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPersonnelMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAddPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnUpdatePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDeletePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnListPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnUpdatePersonnelActionPerformed(java.awt.event.ActionEvent evt) {
        UpdatePersonnel updatePersonnel = new UpdatePersonnel();
        updatePersonnel.setVisible(true);
        this.setVisible(false);
    }

    private void btnDeletePersonnelActionPerformed(java.awt.event.ActionEvent evt) {
        DeletePersonnel deletePersonnel = new DeletePersonnel();
        deletePersonnel.setVisible(true);
        this.setVisible(false);
    }

    private void btnListPersonnelActionPerformed(java.awt.event.ActionEvent evt) {
        ListPersonnel listPersonnel = new ListPersonnel();
        listPersonnel.setVisible(true);
        this.setVisible(false);
    }

    private void btnGoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnAddPersonnelActionPerformed() {
        AddPersonnel addPersonnel = new AddPersonnel();
        addPersonnel.setVisible(true);
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
            java.util.logging.Logger.getLogger(PersonnelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new PersonnelMenu().setVisible(true));
    }
}
