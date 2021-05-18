package com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate;

import com.nizsimsek.hospitalims.DataAccess.Abstract.IPatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class PatientDao implements IPatientDao {

    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Patient.class)
            .buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    @Override
    public List<Patient> GetAll() {
        try {
            session.beginTransaction();
            List<Patient> patients = session.createQuery("SELECT a FROM Patient a", Patient.class).list();
            session.getTransaction().commit();
            return patients;
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Add(Patient patient) {
        try {
            session.beginTransaction();
            session.save(patient);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Update(Patient patient) {
        try {
            session.beginTransaction();
            Patient oldPatient = session.get(Patient.class, patient.getNationalId());
            oldPatient.setName(patient.getName());
            oldPatient.setSurname(patient.getSurname());
            oldPatient.setNationalId(patient.getNationalId());
            oldPatient.setGender(patient.getGender());
            oldPatient.setStatus(patient.getStatus());
            session.update(oldPatient);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Delete(String nationalId) {
        Patient patient;
        try {
            session.beginTransaction();
            patient = session.get(Patient.class, nationalId);
            session.delete(patient);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public Patient GetByNationalId(String nationalId) {
        Patient patient;
        try {
            session.beginTransaction();
            patient = session.get(Patient.class, nationalId);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return patient;
    }
}
