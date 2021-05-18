package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class ListPatient extends javax.swing.JFrame {

    public ListPatient() {
        initComponents();
    }

    JButton btnGoMainMenu = new JButton();
    JLabel lblListPatientTitle = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable tblPatientList = new JTable();
    JButton btnGoPatientMenu = new JButton();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGoMainMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(this::btnGoMainMenuActionPerformed);

        lblListPatientTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblListPatientTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListPatientTitle.setText("Güncel Hasta Listesi");

        tblPatientList.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        getDataForTable();
        jScrollPane1.setViewportView(tblPatientList);

        btnGoPatientMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPatientMenu.setText("Hasta Menüsüne Dön");
        btnGoPatientMenu.addActionListener(evt -> btnGoPatientMenuActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(150, 150, 150)
                                                .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)
                                        .addComponent(lblListPatientTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblListPatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnGoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnGoPatientMenuActionPerformed() {
        PatientMenu patientMenu = new PatientMenu();
        patientMenu.setVisible(true);
        this.setVisible(false);
    }

    private void getDataForTable() {
        ArrayList<Patient> patients;
        PatientManager patientManager = new PatientManager(new PatientDao());
        patients = (ArrayList<Patient>) patientManager.GetAll();
        String[][] datas = new String[patients.size()][];

        for (int i = 0; i < patients.size(); i++) {
            datas[i] = new String[]{
                    String.valueOf(patients.get(i).getId()),
                    String.valueOf(patients.get(i).getName()),
                    String.valueOf(patients.get(i).getSurname()),
                    String.valueOf(patients.get(i).getNationalId()),
                    String.valueOf(patients.get(i).getGender()),
                    String.valueOf(patients.get(i).getStatus()),
            };
        }
        tblPatientList.setModel(new javax.swing.table.DefaultTableModel(
                datas,
                new String[] {"Id", "Adı","Soyadı","Kimlik No","Cinsiyet","Durumu"}
        ) {
            final boolean[] canEdit = new boolean [] {
                    false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new ListPatient().setVisible(true));
    }
}
