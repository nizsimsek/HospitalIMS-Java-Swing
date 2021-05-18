
package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.UserManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.UserDao;
import com.nizsimsek.hospitalims.Entities.Concrete.User;

import javax.swing.*;
import java.awt.*;

/**
 * @author Nizamettin
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
    }

    JLabel lblAdminMenuTitle = new JLabel();
    JLabel lblOldPassword = new JLabel();
    JLabel lblNewPassword = new JLabel();
    JLabel lblNewPasswordAgain = new JLabel();
    JLabel lblUserName = new JLabel();
    JTextField txtUserName = new JTextField();
    JTextField txtOldPassword = new JTextField();
    JTextField txtNewPassword = new JTextField();
    JTextField txtNewPasswordAgain = new JTextField();
    JButton btnUpdatePassword = new JButton();
    JButton btnGoMainMenu = new JButton();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblAdminMenuTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblAdminMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminMenuTitle.setText("Kullanıcı Şifresi Güncelleme");

        lblUserName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblUserName.setText("Kullanıcı Adı :");

        lblOldPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblOldPassword.setText("Eski Şifre :");

        lblNewPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNewPassword.setText("Yeni Şifre :");

        lblNewPasswordAgain.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblNewPasswordAgain.setText("Yeni Şifre Tekrar :");

        txtUserName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtOldPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtNewPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtNewPasswordAgain.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        btnUpdatePassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnUpdatePassword.setText("Şifreyi Güncelle");
        btnUpdatePassword.addActionListener(this::btnUpdatePasswordActionPerformed);

        btnGoMainMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(this::btnGoMainMenuActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAdminMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnUpdatePassword)
                                                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblNewPasswordAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnGoMainMenu)
                                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblAdminMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNewPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUserName.getText();
        String newPassword = txtNewPassword.getText();
        String newPasswordAgain = txtNewPasswordAgain.getText();

        UserDao userDao = new UserDao();
        UserManager userManager = new UserManager(userDao);

        if (newPassword.equals(newPasswordAgain)) {
            User user = new User(username, newPassword);
            userManager.Update(user);
        } else {
            System.out.println("Şifreler eşleşmedi");
        }

    }//GEN-LAST:event_btnUpdatePasswordActionPerformed

    private void btnGoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new AdminMenu().setVisible(true));
    }


}
