
package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nizamettin
 */
public class AddPatient extends javax.swing.JFrame {

    /** Creates new form AddPatient */
    public AddPatient() {
        initComponents();
    }

    JLabel lblStatus = new JLabel();
    JButton btnAddPatient = new JButton();
    JButton btnGoPatientMenu = new JButton();
    JTextField txtStatus = new JTextField();
    JLabel lblSurname = new JLabel();
    JLabel lblAddPatientTitle = new JLabel();
    JTextField txtSurname = new JTextField();
    JLabel lblGender = new JLabel();
    JLabel lblNationalId = new JLabel();
    JLabel lblName = new JLabel();
    JTextField txtNationalId = new JTextField();
    JTextField txtName = new JTextField();
    JRadioButton radBtnFemale = new JRadioButton();
    JRadioButton radBtnMale = new JRadioButton();
    ButtonGroup radBtnGroup = new ButtonGroup();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        radBtnGroup.add(radBtnFemale);
        radBtnGroup.add(radBtnMale);

        lblStatus.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblStatus.setText("Durum :");

        btnAddPatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnAddPatient.setText("Hastayı Ekle");
        btnAddPatient.addActionListener(this::btnAddPatientActionPerformed);

        btnGoPatientMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPatientMenu.setText("Hasta Menüsüne Dön");
        btnGoPatientMenu.addActionListener(evt -> btnGoPatientMenuActionPerformed());

        radBtnMale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnMale.setText("Erkek");
        radBtnMale.addActionListener(this::radBtnMaleActionPerformed);

        txtStatus.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblSurname.setText("Soyadı :");

        lblAddPatientTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblAddPatientTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPatientTitle.setText("Hasta Bilgilerini Giriniz..");

        txtSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblGender.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblGender.setText("Cinsiyet :");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        lblName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblName.setText("Adı :");

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        radBtnFemale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnFemale.setText("Kadın");
        radBtnFemale.addActionListener(this::radBtnFemaleActionPerformed);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblAddPatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(txtStatus))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblAddPatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String nationalId = txtNationalId.getText();
        String status = txtStatus.getText();

        PatientDao patientDao = new PatientDao();
        PatientManager patientManager = new PatientManager(patientDao);
        Patient patient = new Patient(name, surname, nationalId, gender, status);
        patientManager.Add(patient);
    }

    private void btnGoPatientMenuActionPerformed() {
        PatientMenu patientMenu = new PatientMenu();
        patientMenu.setVisible(true);
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new AddPatient().setVisible(true));
    }


}
