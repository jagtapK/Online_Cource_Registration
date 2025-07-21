package com.practice.Online_Course_Registration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Utility.CourceRegistrationUtility;

public class DeleteRegistrationByID {

	public void deleteRegistration() {
		
		SessionFactory factory = CourceRegistrationUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Registration ID");
		int id = sc.nextInt();
		
		Registration r2 = session.find(Registration.class, id);
		session.remove(r2);
		
		transaction.commit();
		session.close();
		
	}
}
