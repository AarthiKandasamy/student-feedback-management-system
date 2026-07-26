package com.feedback.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;

import com.feedback.entity.Feedback;

import com.feedback.util.HibernateUtil;

public class FeedbackDAO {

	/*
	 * SAVE FEEDBACK
	 */

	public void saveFeedback(Feedback feedback) {

		Session session =HibernateUtil.getSessionFactory().openSession();

		Transaction transaction =

				session.beginTransaction();

		session.save(feedback);

		transaction.commit();

		session.close();

	}

	/*
	 * GET ALL FEEDBACK
	 */

	public List<Feedback> getAllFeedback() {

		Session session =

				HibernateUtil

						.getSessionFactory()

						.openSession();

		Query<Feedback> query =

				session.createQuery(

						"FROM Feedback",

						Feedback.class

				);

		List<Feedback> list =

				query.list();

		session.close();

		return list;

	}

	/*
	 * GET FEEDBACK BY COURSE
	 */

	public List<Feedback> getFeedbackByCourse(

			String course) {

		Session session =

				HibernateUtil

						.getSessionFactory()

						.openSession();

		Query<Feedback> query =

				session.createQuery(

						"FROM Feedback " +

								"WHERE LOWER(courseName) " +

								"LIKE LOWER(:course)",

						Feedback.class

				);

		query.setParameter(

				"course",

				"%" +

						course.trim() +

						"%"

		);

		List<Feedback> list =

				query.list();

		session.close();

		return list;

	}

	/*
	 * DELETE FEEDBACK
	 */

	public void deleteFeedback(

			int id) {

		Session session =

				HibernateUtil

						.getSessionFactory()

						.openSession();

		Transaction transaction =

				session.beginTransaction();

		Feedback feedback =

				session.get(

						Feedback.class,

						id

				);

		if (

		feedback != null

		) {

			session.delete(

					feedback

			);

		}

		transaction.commit();

		session.close();

	}

}