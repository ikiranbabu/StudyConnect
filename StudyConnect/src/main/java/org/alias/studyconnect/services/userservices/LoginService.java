package org.alias.studyconnect.services.userservices;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.alias.studyconnect.model.Subject;
import org.alias.studyconnect.model.UserDetails;

import javassist.NotFoundException;

public class LoginService {

	private EntityManager em;
	private UserDetails user;
	private Set<Subject> subjectList = new HashSet<>();

	public Set<Subject> login(int id, String password) {
		// TODO Auto-generated method stub
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();

		try {
			validate(id, password);
		} catch (NotFoundException e) {
			return null;
		}

		em.getTransaction().commit();
		em.close();

		return subjectList;
	}

	private void validate(int id, String password) throws NotFoundException {
		user = em.find(UserDetails.class, id);
		if (user.getPassword().equals(password)) {
			subjectList = user.getSubjectList();
		} else {
			subjectList = null;
		}
		return;

	}

}
