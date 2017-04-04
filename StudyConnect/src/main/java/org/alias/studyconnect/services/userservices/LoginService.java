package org.alias.studyconnect.services.userservices;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.alias.studyconnect.model.Subject;
import org.alias.studyconnect.model.UserDetails;

public class LoginService {
	
	private EntityManager em;
	private UserDetails user;
	private Set<Subject> subjectList = new HashSet<>();
	
	public Set<Subject> login(String email, String password) {
		// TODO Auto-generated method stub
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		user = em.find(UserDetails.class, email);
		subjectList = user.getSubjectList();
		em.getTransaction().commit();
		em.close();
		
		return subjectList;
	}

}
