package com.practice.Online_Course_Registration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Utility.CourceRegistrationUtility;

public class RegisterForCourse {

	public void Register() {

		// 1.session Factory
		SessionFactory factory = CourceRegistrationUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Registration r = new Registration();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID: ");

		r.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter Student Name: ");
		r.setStudentName(sc.nextLine());

		System.out.println("Enter Course Name: ");
		r.setCourceName(sc.nextLine());

		System.out.println("Enter Cource Registration Date: ");
		r.setRegistrationDate(sc.nextLine());

		System.out.println("Enter Fees Paid: ");
		r.setFeesPaid(sc.nextInt());

		// 4.save process
		session.persist(r);

		System.out.println("Updated Successfully " + r);
		// 5.pass to database
		transaction.commit();

	}
}
