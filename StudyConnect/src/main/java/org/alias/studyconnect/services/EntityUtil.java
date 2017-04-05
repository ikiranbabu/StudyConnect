package org.alias.studyconnect.services;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityUtil {

	    
	    public static EntityManager getEntityManager(){
	        EntityManager em =  Persistence.createEntityManagerFactory("studyconnect")
										   .createEntityManager();
	        return em;
	}

}
