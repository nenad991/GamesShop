package com.gamesShop.dao;

import com.gamesShop.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public List<User> find() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<User> list = session.createCriteria(User.class).list();
        tx.commit();

        return list;
    }

    public boolean checkLogin(String mail, String pass) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        boolean userFound = false;

        String SQL_QUERY = " from User as u where u.email=? and u.password=?";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0, mail);
        query.setParameter(1, pass);
        List list = query.list();

        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        tx.commit();
        session.close();
        return userFound;
    }

    public void insertUser(String name, String lastname, String country, String email, String password, int access) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User u = new User(name, lastname, country, email, password, access);
        session.persist(u);
        tx.commit();
    }
}
