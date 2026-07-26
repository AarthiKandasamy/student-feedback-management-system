package com.feedback.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.feedback.entity.Student;
import com.feedback.util.HibernateUtil;

public class StudentDAO {

    public void registerStudent(Student student) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();

        session.close();
    }

    public Student login(String email, String password) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        String hql =
                "FROM Student WHERE email = :email AND password = :password";

        Query<Student> query = session.createQuery(hql, Student.class);

        query.setParameter("email", email);
        query.setParameter("password", password);

        Student student = query.uniqueResult();

        session.close();

        return student;
    }
}