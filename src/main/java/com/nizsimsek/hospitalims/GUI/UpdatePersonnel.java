package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.Business.Concrete.PersonnelManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;
import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Nizamettin
 */
public class UpdatePersonnel extends javax.swing.JFrame {

    public UpdatePersonnel() {
        initComponents();
    }

    JTextField txtField = new JTextField();
    JLabel lblSurname = new JLabel();
    JLabel lblUpdatePersonnelTitle = new JLabel();
    JTextField txtSurname = new JTextField();
    JLabel lblGender = new JLabel();
    JLabel lblNationalId = new JLabel();
    JLabel lblName = new JLabel();
    JTextField txtName = new JTextField();
    JLabel lblField = new JLabel();
    JButton btnGoPersonnelMenu = new JButton();
    JTextField txtNationalId = new JTextField();
    JRadioButton radBtnFemale = new JRadioButton();
    JButton btnUpdatePersonnel = new JButton();
    JRadioButton radBtnMale = new JRadioButton();
    ButtonGroup radBtnGroup = new ButtonGroup();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        radBtnGroup.add(radBtnFemale);
        radBtnGroup.add(radBtnMale);

        radBtnGroup.add(radBtnFemale);
        radBtnGroup.add(radBtnMale);

        txtField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblSurname.setText("Soyadı :");

        lblUpdatePersonnelTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblUpdatePersonnelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdatePersonnelTitle.setText("Personel Bilgilerini Giriniz..");

        txtSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblGender.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblGender.setText("Cinsiyet :");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        lblName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblName.setText("Adı :");

        txtName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblField.setText("Alanı :");

        btnGoPersonnelMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPersonnelMenu.setText("Personel Menüsüne Dön");
        btnGoPersonnelMenu.addActionListener(this::btnGoPersonnelMenuActionPerformed);

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        radBtnFemale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnFemale.setText("Kadın");
        radBtnFemale.addActionListener(this::radBtnFemaleActionPerformed);

        btnUpdatePersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdatePersonnel.setText("Personeli Güncelle");
        btnUpdatePersonnel.setToolTipText("");
        btnUpdatePersonnel.setAlignmentY(0.0F);
        btnUpdatePersonnel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUpdatePersonnel.addActionListener(this::btnUpdatePersonnelActionPerformed);

        radBtnMale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnMale.setText("Erkek");
        radBtnMale.addActionListener(this::radBtnMaleActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(lblUpdatePersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnUpdatePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(lblUpdatePersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(btnUpdatePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnGoPersonnelMenuActionPerformed(java.awt.event.ActionEvent evt) {
        PersonnelMenu personnelMenu = new PersonnelMenu();
        personnelMenu.setVisible(true);
        this.setVisible(false);
    }

    String gender = null;

    private void radBtnMaleActionPerformed(ActionEvent actionEvent) {
        String font = actionEvent.getActionCommand();
        if (font.equals("Erkek")) {
            gender = "Erkek";
        }
    }

    private void radBtnFemaleActionPerformed(ActionEvent actionEvent) {
        String font = actionEvent.getActionCommand();
        if (font.equals("Kadın")) {
            gender = "Kadın";
        }
    }

    private void btnUpdatePersonnelActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String nationalId = txtNationalId.getText();
        String field = txtField.getText();

        PersonnelDao personnelDao = new PersonnelDao();
        PersonnelManager personnelManager = new PersonnelManager(personnelDao);
        Personnel personnel = new Personnel(name, surname, nationalId, gender, field);
        personnelManager.Update(personnel);
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new UpdatePersonnel().setVisible(true));
    }
}
