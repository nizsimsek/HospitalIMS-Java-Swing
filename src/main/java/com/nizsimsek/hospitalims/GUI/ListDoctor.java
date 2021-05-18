package com.nizsimsek.hospitalims.GUI;

import com.nizsimsek.hospitalims.Business.Concrete.DoctorManager;
import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Nizamettin
 */
public class ListDoctor extends javax.swing.JFrame {

    public ListDoctor() {
        initComponents();
    }

    JLabel lblListDoctorTitle = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable tblDoctorList = new JTable();
    JButton btnGoMainMenu = new JButton();
    JButton btnGoDoctorMenu = new JButton();

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblListDoctorTitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblListDoctorTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblListDoctorTitle.setText("Güncel Doktor Listesi");

        tblDoctorList.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        getDataForTable();
        jScrollPane1.setViewportView(tblDoctorList);

        btnGoMainMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnGoMainMenu.setText("Anamenüye Dön");
        btnGoMainMenu.addActionListener(this::btnGoMainMenuActionPerformed);

        btnGoDoctorMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnGoDoctorMenu.setText("Doktor Menüsüne Dön");
        btnGoDoctorMenu.addActionListener(evt -> btnGoDoctorMenuActionPerformed());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGoDoctorMenu, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(150, 150, 150)
                                                .addComponent(btnGoMainMenu, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)
                                        .addComponent(lblListDoctorTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblListDoctorTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGoDoctorMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGoMainMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        pack();
    }

    private void btnGoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.setVisible(false);
    }

    private void btnGoDoctorMenuActionPerformed() {
        DoctorMenu doctorMenu = new DoctorMenu();
        doctorMenu.setVisible(true);
        this.setVisible(false);
    }

    private void getDataForTable() {
        ArrayList<Doctor> doctors;
        DoctorManager doctorManager = new DoctorManager(new DoctorDao());
        doctors = (ArrayList<Doctor>) doctorManager.GetAll();
        String[][] datas = new String[doctors.size()][];

        for (int i = 0; i < doctors.size(); i++) {
            datas[i] = new String[]{
                    String.valueOf(doctors.get(i).getId()),
                    String.valueOf(doctors.get(i).getName()),
                    String.valueOf(doctors.get(i).getSurname()),
                    String.valueOf(doctors.get(i).getNationalId()),
                    String.valueOf(doctors.get(i).getGender()),
                    String.valueOf(doctors.get(i).getField()),
            };
        }
        tblDoctorList.setModel(new javax.swing.table.DefaultTableModel(
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
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new ListDoctor().setVisible(true));
    }
}
