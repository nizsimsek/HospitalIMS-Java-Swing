package com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate;

import com.nizsimsek.hospitalims.DataAccess.Abstract.IPersonnelDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PersonnelDao implements IPersonnelDao {

    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Personnel.class)
            .buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    @Override
    public List<Personnel> GetAll() {
        try {
            session.beginTransaction();
            List<Personnel> personnels = session.createQuery("SELECT a FROM Personnel a", Personnel.class).list();
            session.getTransaction().commit();
            return personnels;
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Add(Personnel personnel) {
        try {
            session.beginTransaction();
            session.save(personnel);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Update(Personnel personnel) {
        try {
            session.beginTransaction();
            Personnel oldPersonnel = session.get(Personnel.class, personnel.getNationalId());
            oldPersonnel.setName(personnel.getName());
            oldPersonnel.setSurname(personnel.getSurname());
            oldPersonnel.setNationalId(personnel.getNationalId());
            oldPersonnel.setGender(personnel.getGender());
            oldPersonnel.setField(personnel.getField());
            session.update(oldPersonnel);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Delete(String nationalId) {
        Personnel personnel;
        try {
            session.beginTransaction();
            personnel = session.get(Personnel.class, nationalId);
            session.delete(personnel);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public Personnel GetByNationalId(String nationalId) {
        Personnel personnel;
        try {
            session.beginTransaction();
            personnel = session.get(Personnel.class, nationalId);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return personnel;
    }
}
