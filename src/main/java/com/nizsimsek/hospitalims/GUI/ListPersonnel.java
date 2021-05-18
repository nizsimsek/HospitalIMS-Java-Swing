package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.DoctorManager;
import com.nizsimsek.hospitalims.Business.Concrete.PersonnelManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;
import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author Nizamettin
 */
public class ListPersonnel extends javax.swing.JFrame {

    public ListPersonnel() {
        initComponents();
    }

    JButton btnGoMainMenu = new JButton();
    JLabel lblListPersonnelTitle = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable tblPersonnelList = new JTable();
    JButton btnGoPersonnelMenu = new JButton();

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGoMainMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(evt -> btnGoMainMenuActionPerformed());

        lblListPersonnelTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblListPersonnelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListPersonnelTitle.setText("Güncel Personel Listesi");

        tblPersonnelList.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        getDataForTable();
        jScrollPane1.setViewportView(tblPersonnelList);

        btnGoPersonnelMenu.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        btnGoPersonnelMenu.setText("Personel Menüsüne Dön");
        btnGoPersonnelMenu.addActionListener(this::btnGoPersonnelMenuActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(lblListPersonnelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblListPersonnelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoPersonnelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnGoMainMenuActionPerformed() {
        MainMenu mainMenu = new MainMenu() ;
        mainMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnGoPersonnelMenuActionPerformed(java.awt.event.ActionEvent evt) {
        PersonnelMenu personnelMenu = new PersonnelMenu();
        personnelMenu.setVisible(true);
        this.setVisible(false);
    }

    private void getDataForTable() {
        ArrayList<Personnel> personnels;
        PersonnelManager personnelManager = new PersonnelManager(new PersonnelDao());
        personnels = (ArrayList<Personnel>) personnelManager.GetAll();
        String[][] datas = new String[personnels.size()][];

        for (int i = 0; i < personnels.size(); i++) {
            datas[i] = new String[]{
                    String.valueOf(personnels.get(i).getId()),
                    String.valueOf(personnels.get(i).getName()),
                    String.valueOf(personnels.get(i).getSurname()),
                    String.valueOf(personnels.get(i).getNationalId()),
                    String.valueOf(personnels.get(i).getGender()),
                    String.valueOf(personnels.get(i).getField()),
            };
        }
        tblPersonnelList.setModel(new javax.swing.table.DefaultTableModel(
                datas,
                new String[] {"Id", "Adı","Soyadı","Kimlik No","Cinsiyet","Alanı"}
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
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new ListPersonnel().setVisible(true));
    }
}
