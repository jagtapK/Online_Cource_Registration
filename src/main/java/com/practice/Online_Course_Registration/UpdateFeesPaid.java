package com.practice.Online_Course_Registration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Utility.CourceRegistrationUtility;

public class UpdateFeesPaid {

	public void updateFees() {

		//Update Fees by Student Id
		SessionFactory factory = CourceRegistrationUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id to Update paid Fees");
		int Stu_Id = sc.nextInt();
		sc.nextLine();

		Registration r1 = session.find(Registration.class, Stu_Id);

		System.out.println("Enter Updated Fees");
		int stuFees = sc.nextInt();
		r1.setFeesPaid(stuFees);

		transaction.commit();

		session.close();

		System.out.println("Updated Paid Fees Successfully..!");
	}
}
