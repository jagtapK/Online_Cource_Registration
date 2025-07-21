package courceRegistration.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CourceRegistrationUtility {

	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure("Hibernate.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
}
