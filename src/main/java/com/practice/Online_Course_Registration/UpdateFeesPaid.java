package com.practice.Online_Course_Registration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Utility.CourceRegistrationUtility;

public class UpdateFeesPaid {

	public void updateFees() {
	SessionFactory factory = CourceRegistrationUtility.getSessionFactory();

	Session session = factory.openSession();

	Transaction transaction = session.beginTransaction();

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Paid Fees");
	int fee = sc.nextInt();
	
	Registration r1 = session.find(Registration.class, fee);
	System.out.println(r1.toString());
	r1.setFeesPaid(fee);
	
	transaction.commit();

	session.close();
	
	}
}
