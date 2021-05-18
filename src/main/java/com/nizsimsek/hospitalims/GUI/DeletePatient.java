
package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class DeletePatient extends javax.swing.JFrame {

    /** Creates new form DeletePatient */
    public DeletePatient() {
        initComponents();
    }

    JButton btnDeletePatient = new JButton();
    JLabel lblDeletePatientTitle = new JLabel();
    JLabel lblNationalId = new JLabel();
    JButton btnGoPatientMenu = new JButton();
    JTextField txtNationalId = new JTextField();
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnDeletePatient.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeletePatient.setText("Hastayı Sil");
        btnDeletePatient.setToolTipText("");
        btnDeletePatient.setAlignmentY(0.0F);
        btnDeletePatient.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDeletePatient.addActionListener(this::btnDeletePatientActionPerformed);

        lblDeletePatientTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblDeletePatientTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeletePatientTitle.setText("Hasta Kimlik No Giriniz..");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        btnGoPatientMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPatientMenu.setText("Hasta Menüsüne Dön");
        btnGoPatientMenu.addActionListener(evt -> btnGoPatientMenuActionPerformed());

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDeletePatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(lblDeletePatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoPatientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        String nationalId = txtNationalId.getText();

        PatientDao patientDao = new PatientDao();
        PatientManager patientManager = new PatientManager(patientDao);
        patientManager.Delete(nationalId);
    }//GEN-LAST:event_btnDeletePatientActionPerformed

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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new DeletePatient().setVisible(true));
    }


}
