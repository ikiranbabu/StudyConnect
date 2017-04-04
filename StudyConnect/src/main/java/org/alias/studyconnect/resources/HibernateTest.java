package org.alias.studyconnect.resources;

import java.util.HashSet;
import java.util.Set;

import org.alias.studyconnect.model.College;
import org.alias.studyconnect.model.Department;
import org.alias.studyconnect.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		College college = new College();
		Set<String> collegeList = new HashSet<>();
		Department dept = new Department();
		Set<String> deptList = new HashSet<>();
		

		collegeList.add("Arts & Sciences");
		collegeList.add("Behavioral & Community Sciences");
		collegeList.add("Business");
		collegeList.add("College of Pharmacy");
		collegeList.add("College of Arts");
		collegeList.add("Education");
		collegeList.add("Engineering");
		collegeList.add("Global Sustainability");
		collegeList.add("Graduate School");
		collegeList.add("Honors College");
		collegeList.add("Marine Science");
		collegeList.add("Medicine");
		collegeList.add("Nursing");
		collegeList.add("Public Health");
		collegeList.add("Undergraduate Studies");
		session.beginTransaction();
		
		for(String collegename : collegeList){
			college.setCollegeName(collegename);	
			session.save(college);
			session.flush();
			session.clear();
			
		}
		
		session.getTransaction().commit();
		session.close();
		
		
		deptList.add("Basic & Interdisciplinary Engineering");
		deptList.add("Chemical & Biomedical Engineering");
		deptList.add("Civil & Environmental Engineering");
		deptList.add("Electrical Engineering");
		deptList.add("Engineering & Computer Science");
		deptList.add("Industrial Systems");
		deptList.add("Mechanical Engineering");
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		for(String deptName : deptList){
			dept.setCollegeId(session2.get(College.class,8));
			dept.setName(deptName);
			session2.save(dept);
			session2.flush();
			session2.clear();
			
		}
		
		session2.getTransaction().commit();
		session2.close();
	}

}
