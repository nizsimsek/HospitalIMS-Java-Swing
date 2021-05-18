package com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate;

import com.nizsimsek.hospitalims.DataAccess.Abstract.IUserDao;
import com.nizsimsek.hospitalims.Entities.Concrete.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDao implements IUserDao {

    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(User.class)
            .buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    @Override
    public List<User> GetAll() {
        try {
            session.beginTransaction();
            List<User> users = session.createQuery("SELECT a FROM User a", User.class).getResultList();
            session.getTransaction().commit();
            return users;
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Add(User user) {
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Update(User user) {
        try {
            session.beginTransaction();
            User newUser = session.get(User.class, user.getUsername());
            newUser.setPassword(user.getPassword());
            session.update(newUser);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public void Delete(String nationalId) {
        User user;
        try {
            session.beginTransaction();
            user = session.get(User.class, nationalId);
            session.delete(user);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    @Override
    public User GetByUsername(String username) {
        User user;
        try {
            session.beginTransaction();
            user = session.get(User.class, username);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return user;
    }
}
