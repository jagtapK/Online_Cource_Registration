package com.practice.Online_Course_Registration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Utility.CourceRegistrationUtility;

public class ViewAllRecord {

	public void viewRecord() {
		
SessionFactory factory = CourceRegistrationUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		List<Registration> userList = session.createQuery("select r from Registration r",Registration.class).getResultList();
		userList.stream().forEach( a -> System.out.println(a.toString()));
		
		transaction.commit();
		session.close();
	}
	
}
