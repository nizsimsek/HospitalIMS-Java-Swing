package com.nizsimsek.hospitalims;

import com.nizsimsek.hospitalims.Business.Concrete.DoctorManager;
import com.nizsimsek.hospitalims.Business.Concrete.PatientManager;
import com.nizsimsek.hospitalims.Business.Concrete.PersonnelManager;
import com.nizsimsek.hospitalims.Business.Concrete.UserManager;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.UserDao;

public class HospitalIMS {

    public static void main(String[] args) {

        PatientDao patientDao = new PatientDao();
        PatientManager patientManager = new PatientManager(patientDao);
        System.out.println("HASTA BİLGİSİ");
        System.out.println(patientManager.GetAll());
        System.out.println("------------------------------------------\n");

        UserDao userDao = new UserDao();
        UserManager userManager = new UserManager(userDao);
        System.out.println("KULLANICI BİLGİSİ");
        System.out.println(userManager.GetAll());
        System.out.println("------------------------------------------\n");

        DoctorDao doctorDao = new DoctorDao();
        DoctorManager doctorManager = new DoctorManager(doctorDao);
        System.out.println("DOKTOR BİLGİSİ");
        System.out.println(doctorManager.GetAll());
        System.out.println("------------------------------------------\n");

        PersonnelDao personnelDao = new PersonnelDao();
        PersonnelManager personnelManager = new PersonnelManager(personnelDao);
        System.out.println("PERSONEL BİLGİSİ");
        System.out.println(personnelManager.GetAll());
        System.out.println("------------------------------------------\n");
    }

}
