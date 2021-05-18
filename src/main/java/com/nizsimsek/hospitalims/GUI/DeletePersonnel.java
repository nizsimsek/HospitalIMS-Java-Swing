package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.PersonnelManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nizamettin
 */
public class DeletePersonnel extends javax.swing.JFrame {

    /** Creates new form DeletePersonnel */
    public DeletePersonnel() {
        initComponents();
    }

    JButton btnGoPersonnelMenu = new JButton();
    JTextField txtNationalId = new JTextField();
    JButton btnDeletePersonnel = new JButton();
    JLabel lblDeletePersonnelTitle = new JLabel();
    JLabel lblNationalId = new JLabel();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGoPersonnelMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPersonnelMenu.setText("Personel Menüsüne Dön");
        btnGoPersonnelMenu.addActionListener(this::btnGoPersonnelMenuActionPerformed);

        txtNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        btnDeletePersonnel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnDeletePersonnel.setText("Personeli Sil");
        btnDeletePersonnel.setToolTipText("");
        btnDeletePersonnel.setAlignmentY(0.0F);
        btnDeletePersonnel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDeletePersonnel.addActionListener(this::btnDeletePersonnelActionPerformed);

        lblDeletePersonnelTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblDeletePersonnelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeletePersonnelTitle.setText("Personel Kimlik No Giriniz..");

        lblNationalId.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNationalId.setText("Kimlik No :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDeletePersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeletePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(lblDeletePersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnDeletePersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonnelActionPerformed
        String nationalId = txtNationalId.getText();

        PersonnelDao personnelDao = new PersonnelDao();
        PersonnelManager personnelManager = new PersonnelManager(personnelDao);
        personnelManager.Delete(nationalId);
    }//GEN-LAST:event_btnDeletePersonnelActionPerformed

    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new DeletePersonnel().setVisible(true));
    }


}
