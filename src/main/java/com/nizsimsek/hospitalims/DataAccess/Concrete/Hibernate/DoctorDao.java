package com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate;

import com.nizsimsek.hospitalims.DataAccess.Abstract.IDoctorDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DoctorDao implements IDoctorDao {

    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Doctor.class)
            .buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    @Override
    public List<Doctor> GetAll() {
        try {
            session.beginTransaction();
            List<Doctor> doctors = session.createQuery("SELECT a FROM Doctor a", Doctor.class).getResultList();
            session.getTransaction().commit();
            return doctors;
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Add(Doctor doctor) {
        try {
            session.beginTransaction();
            session.save(doctor);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Update(Doctor doctor) {
        try {
            session.beginTransaction();
            Doctor oldDoctor = session.get(Doctor.class, doctor.getNationalId());
            oldDoctor.setName(doctor.getName());
            oldDoctor.setSurname(doctor.getSurname());
            oldDoctor.setNationalId(doctor.getNationalId());
            oldDoctor.setGender(doctor.getGender());
            oldDoctor.setField(doctor.getField());
            session.update(oldDoctor);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Delete(String nationalId) {
        Doctor doctor;
        try {
            session.beginTransaction();
            doctor = session.get(Doctor.class, nationalId);
            session.delete(doctor);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public Doctor GetByNationalId(String nationalId) {
        Doctor doctor;
        try {
            session.beginTransaction();
            doctor = session.get(Doctor.class, nationalId);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return doctor;
    }
}
