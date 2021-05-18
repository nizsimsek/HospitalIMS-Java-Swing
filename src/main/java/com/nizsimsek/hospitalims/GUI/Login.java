package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.UserManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.UserDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 *
 * @author Nizamettin
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    JLabel lblLoginTitle = new JLabel();
    JLabel lblUsername = new JLabel();
    JLabel lblPassword = new JLabel();
    JButton btnLogin = new JButton();
    JTextField txtUsername = new JTextField();
    JTextField txtPassword = new JTextField();

    private void initComponents() {



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Hastane Bilgi Yönetim Sistemi");

        lblUsername.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblUsername.setText("Kullanıcı Adı :");

        lblPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblPassword.setText("Şifre :");

        btnLogin.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnLogin.setText("Giriş Yap");
        btnLogin.addActionListener(this::btnLoginActionPerformed);

        txtUsername.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        txtPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnLoginActionPerformed(ActionEvent actionEvent) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (!username.equals("") && !password.equals("")) {
            UserDao userDao = new UserDao();
            UserManager userManager = new UserManager(userDao);
            String dbPassword = userManager.GetByUsername(username).getPassword();
            if (password.equals(dbPassword)) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                this.setVisible(false);
            } else {
                System.out.println("Kullanıcı Adı ve Şifre Eşleşmedi..");
            }
        } else {
            System.out.println("Lütfen Bilgileri Giriniz..");
        }
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
}
