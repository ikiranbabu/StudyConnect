package org.alias.studyconnect.services.userservices;

import javax.persistence.EntityManager;

import org.alias.studyconnect.model.UserDetails;

public class UserService {
	
	private EntityManager entityManager;
	
		public UserDetails fetchProfile(int id){
			entityManager = EntityUtil.getEntityManager();
			entityManager.getTransaction().begin();
			UserDetails userProfile = (UserDetails)entityManager.find(UserDetails.class, id);
			entityManager.getTransaction().commit();
			entityManager.close();
			return userProfile;
		}
}
