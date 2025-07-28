package com.practice.Online_Course_Registration;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import courceRegistration.Entity.Registration;
import courceRegistration.Entity.Students;
import courceRegistration.Utility.CourceRegistrationUtility;

public class Set_Details {

	public void Details() {
		
		//Setting Student Details 
		SessionFactory factory = CourceRegistrationUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Students s = new Students();
        s.setFname("John");
        s.setLname("Shah");
        s.setMobileNo(12345567);
        s.setDepartment("Computer Science");
        
        Students s1 = new Students();
        s1.setFname("Alice");
        s1.setLname("Deo");
        s1.setMobileNo(123455677);
        s1.setDepartment("Electrical");
        
        Students s2 = new Students();
        s2.setFname("Tonny");
        s2.setLname("Lio");
        s2.setMobileNo(142451567);
        s2.setDepartment("Mechanical");
        
        Registration r = new Registration();
        r.setCourceName("Computer");
        r.setRegistrationDate("12/3/2024");
        r.setFeesPaid(50000);
        
        Registration r1 = new Registration();
        r1.setCourceName("IT");
        r1.setRegistrationDate("1/4/2025");
        r1.setFeesPaid(30000);
        
        Registration r2 = new Registration();
        r2.setCourceName("Maths");
        r2.setRegistrationDate("13/6/2022");
        r2.setFeesPaid(40000);
        
        //List to store multiple Registration
        List<Registration> rlist = Arrays.asList(r,r1,r2);
        
        s.setRegistration(rlist);
        s1.setRegistration(rlist);
        s2.setRegistration(rlist);
        
        session.persist(r);
        session.persist(r1);
        session.persist(r2);
        
        session.persist(s);
        session.persist(s1);
        session.persist(s2);
        
        transaction.commit();
        session.close();
        
        System.out.println("Details added Sccessfully..");
	}

}
