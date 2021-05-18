
package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.DoctorManager;
import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class DeleteDoctor extends javax.swing.JFrame {

    /** Creates new form DeleteDoctor */
    public DeleteDoctor() {
        initComponents();
    }

    JButton btnDeleteDoctor = new JButton();
    JLabel lblDeleteDoctorTitle = new JLabel();
    JLabel lblNationalId = new JLabel();
    JButton btnGoDoctorMenu = new JButton();
    JTextField txtNationalId = new JTextField();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnDeleteDoctor.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeleteDoctor.setText("Doktoru Sil");
        btnDeleteDoctor.setToolTipText("");
        btnDeleteDoctor.setAlignmentY(0.0F);
        btnDeleteDoctor.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDeleteDoctor.addActionListener(this::btnDeleteDoctorActionPerformed);

        lblDeleteDoctorTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblDeleteDoctorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteDoctorTitle.setText("Doktor Kimlik No Giriniz..");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        btnGoDoctorMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoDoctorMenu.setText("Doktor Menüsüne Dön");
        btnGoDoctorMenu.addActionListener(evt -> btnGoDoctorMenuActionPerformed());

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDeleteDoctorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoDoctorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDeleteDoctorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoDoctorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {
        String nationalId = txtNationalId.getText();

        DoctorDao doctorDao = new DoctorDao();
        DoctorManager doctorManager = new DoctorManager(doctorDao);
        doctorManager.Delete(nationalId);
    }

    private void btnGoDoctorMenuActionPerformed() {
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new DeleteDoctor().setVisible(true));
    }


}
