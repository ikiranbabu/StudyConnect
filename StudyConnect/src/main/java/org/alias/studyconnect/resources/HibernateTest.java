package org.alias.studyconnect.resources;

import org.alias.studyconnect.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails user = new UserDetails();
		user.setEmail("aliasgar@mail.usf.edu");
		user.setUserId(1);
		user.setUserName("Ali Asgar");
		user.setPassword("Hellbent");
		
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
