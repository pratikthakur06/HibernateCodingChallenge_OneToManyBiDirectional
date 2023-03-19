package com.gl.HibernateCCOneToManyBi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gl.HibernateCCOneToManyBi.config.HibernateConfig;
import com.gl.HibernateCCOneToManyBi.entity.Course;
import com.gl.HibernateCCOneToManyBi.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	private static SessionFactory factory = HibernateConfig.getSessionFactory();

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Pratik");

		List<Course> courses = new ArrayList();
		Course course1 = new Course("Java", student);
		Course course2 = new Course("Python", student);

		courses.add(course1);
		courses.add(course2);

		student.setCourses(courses);

		// Inserting data in student and course
//		try {
//			Session session = factory.openSession();
//			Transaction tx = session.beginTransaction();
//			session.persist(student);
//			tx.commit();
//			session.close();
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Delete course without affecting student
//		try {
//			Session session = factory.openSession();
//			Transaction tx = session.beginTransaction();
//			Course course = session.get(Course.class, 2);
//			session.remove(course);
//			tx.commit();
//			session.close();
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
