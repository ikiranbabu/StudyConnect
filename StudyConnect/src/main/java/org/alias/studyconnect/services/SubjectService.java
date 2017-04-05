package org.alias.studyconnect.services;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.alias.studyconnect.model.College;
import org.alias.studyconnect.model.Subject;
import org.alias.studyconnect.model.UserDetails;


public class SubjectService {
	
	private EntityManager em ;
	
	
	public List<Subject>getAllSubjects(){
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from Subject");
		@SuppressWarnings("unchecked")
		List<Subject> subList = (List<Subject>)query.getResultList();
		em.getTransaction().commit();
		em.close();
		return subList;	
	}
	
	
	public Set<Subject> mySubjects(int id){
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		UserDetails user = em.find(UserDetails.class, id);
		user.getSubjectList();
		Set<Subject> mySubjects = (Set<Subject>) user.getSubjectList();
		em.getTransaction().commit();
		em.close();
		return mySubjects;
	}


	public void addSubject(int id , Subject subject) {
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		UserDetails user = em.find(UserDetails.class, id);
		user.getSubjectList().add(subject);
		em.getTransaction().commit();
		em.close();
	}


	public Set<Subject> delSubject(int id, Subject subject) {
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		UserDetails user = em.find(UserDetails.class, id);
		Subject sub = em.find(Subject.class, subject.getSubjectCRN());
		user.getSubjectList().remove(sub);
		em.getTransaction().commit();
		em.close();
		return user.getSubjectList(); 
		
	}
	
	public List<Subject> getSubjectInCollege(int id){
		em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		College college = em.find(College.class, id);
		System.out.println(college.getCollegeName());
		Query query = em.createQuery("from Subject as sub where sub.college.collegeID = ?");
		query.setParameter(0 , new Integer(id));
		@SuppressWarnings("unchecked")
		List<Subject> subjects = (List<Subject>) query.getResultList();
		em.getTransaction().commit();
		em.close();
		return subjects;
	}
	
}
