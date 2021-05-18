package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.DoctorManager;
import com.nizsimsek.hospitalims.Business.Concrete.PersonnelManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;
import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nizamettin
 */
public class UpdateDoctor extends javax.swing.JFrame {

    public UpdateDoctor() {
        initComponents();
    }

    JRadioButton radBtnFemale = new JRadioButton();
    JButton btnUpdateDoctor = new JButton();
    JRadioButton radBtnMale = new JRadioButton();
    ButtonGroup radBtnGroup = new ButtonGroup();
    JLabel lblUpdateDoctorTitle = new JLabel();
    JLabel lblGender = new JLabel();
    JLabel lblName = new JLabel();
    JLabel lblSurname = new JLabel();
    JTextField txtSurname = new JTextField();
    JLabel lblNationalId = new JLabel();
    JTextField txtNationalId = new JTextField();
    JTextField txtName = new JTextField();
    JLabel lblField = new JLabel();
    JButton btnGoDoctorMenu = new JButton();
    JTextField txtField = new JTextField();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        radBtnGroup.add(radBtnMale);
        radBtnGroup.add(radBtnFemale);

        radBtnFemale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnFemale.setText("Kadın");
        radBtnFemale.addActionListener(this::radBtnFemaleActionPerformed);

        btnUpdateDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdateDoctor.setText("Doktoru Güncelle");
        btnUpdateDoctor.addActionListener(this::btnUpdateDoctorActionPerformed);

        radBtnMale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnMale.setText("Erkek");
        radBtnMale.addActionListener(this::radBtnMaleActionPerformed);

        lblUpdateDoctorTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblUpdateDoctorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateDoctorTitle.setText("Doktor Bilgilerini Giriniz..");

        lblGender.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblGender.setText("Cinsiyet :");

        lblName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblName.setText("Adı :");

        lblSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblSurname.setText("Soyadı :");

        txtSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblField.setText("Alanı :");

        btnGoDoctorMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoDoctorMenu.setText("Doktor Menüsüne Dön");
        btnGoDoctorMenu.addActionListener(this::btnGoDoctorMenuActionPerformed);

        txtField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblUpdateDoctorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoDoctorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(radBtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName)
                                    .addComponent(txtSurname)
                                    .addComponent(txtNationalId)
                                    .addComponent(txtField))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUpdateDoctorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radBtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoDoctorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }

    String gender = null;

    private void radBtnMaleActionPerformed(ActionEvent actionEvent) {
        String font = actionEvent.getActionCommand();
        if(font.equals("Erkek")) {
            gender = "Erkek";
        }
    }

    private void radBtnFemaleActionPerformed(ActionEvent actionEvent) {
        String font = actionEvent.getActionCommand();
        if(font.equals("Kadın")) {
            gender = "Kadın";
        }
    }

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String nationalId = txtNationalId.getText();
        String field = txtField.getText();

        DoctorDao doctorDao = new DoctorDao();
        DoctorManager doctorManager = new DoctorManager(doctorDao);
        Doctor doctor = new Doctor(name, surname, nationalId, gender, field);
        doctorManager.Update(doctor);
    }

    private void btnGoDoctorMenuActionPerformed(java.awt.event.ActionEvent evt) {
        DoctorMenu doctorMenu = new DoctorMenu();
        doctorMenu.setVisible(true);
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
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new UpdateDoctor().setVisible(true));
    }
}
