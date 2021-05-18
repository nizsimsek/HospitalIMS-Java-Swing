
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
 *
 * @author Nizamettin
 */
public class AddPersonnel extends javax.swing.JFrame {

    /** Creates new form AddPersonnel */
    public AddPersonnel() {
        initComponents();
    }

    JTextField txtName = new JTextField();
    JButton btnGoPersonnelMenu = new JButton();
    JRadioButton radBtnFemale = new JRadioButton();
    JRadioButton radBtnMale = new JRadioButton();
    JTextField txtField = new JTextField();
    JLabel lblSurname = new JLabel();
    JLabel lblAddPersonnelTitle = new JLabel();
    JTextField txtSurname = new JTextField();
    JLabel lblGender = new JLabel();
    JLabel lblNationalId = new JLabel();
    JLabel lblName = new JLabel();
    JLabel lblField = new JLabel();
    JTextField txtNationalId = new JTextField();
    JButton btnAddPersonnel = new JButton();
    ButtonGroup radBtnGroup = new ButtonGroup();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        radBtnGroup.add(radBtnFemale);
        radBtnGroup.add(radBtnMale);

        txtName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        btnGoPersonnelMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPersonnelMenu.setText("Personel Menüsüne Dön");
        btnGoPersonnelMenu.addActionListener(this::btnGoPersonnelMenuActionPerformed);

        radBtnFemale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnFemale.setText("Kadın");
        radBtnFemale.addActionListener(this::radBtnFemaleActionPerformed);

        radBtnMale.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        radBtnMale.setText("Erkek");
        radBtnMale.addActionListener(this::radBtnMaleActionPerformed);

        txtField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblSurname.setText("Soyadı :");

        lblAddPersonnelTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblAddPersonnelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPersonnelTitle.setText("Personel Bilgilerini Giriniz..");

        txtSurname.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        lblGender.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblGender.setText("Cinsiyet :");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        lblName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblName.setText("Adı :");

        lblField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblField.setText("Alanı :");

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        btnAddPersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnAddPersonnel.setText("Personeli Ekle");
        btnAddPersonnel.addActionListener(this::btnAddPersonnelActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblAddPersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(lblAddPersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnAddPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAddPersonnelActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String nationalId = txtNationalId.getText();
        String field = txtField.getText();

        PersonnelDao personnelDao = new PersonnelDao();
        PersonnelManager personnelManager = new PersonnelManager(personnelDao);
        Personnel personnel = new Personnel(name, surname, nationalId, gender, field);
        personnelManager.Add(personnel);
    }

    private void btnGoPersonnelMenuActionPerformed(java.awt.event.ActionEvent evt) {
        PersonnelMenu personnelMenu  = new PersonnelMenu();
        personnelMenu.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new AddPersonnel().setVisible(true));
    }


}
