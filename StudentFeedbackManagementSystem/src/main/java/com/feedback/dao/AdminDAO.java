package com.feedback.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.feedback.entity.Admin;
import com.feedback.util.HibernateUtil;

public class AdminDAO {

    public Admin login(String username, String password) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        String hql =
                "FROM Admin " +
                "WHERE username = :username " +
                "AND password = :password";

        Query<Admin> query =
                session.createQuery(hql, Admin.class);

        query.setParameter("username", username);
        query.setParameter("password", password);

        Admin admin = query.uniqueResult();

        session.close();

        return admin;
    }
}