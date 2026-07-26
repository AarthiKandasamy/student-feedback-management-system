package com.feedback.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {

        try {

            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

            System.out.println(
                    "Hibernate SessionFactory Created Successfully"
            );

        } catch (Exception e) {

            System.out.println(
                    "Hibernate SessionFactory Creation Failed"
            );

            e.printStackTrace();

            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }
}