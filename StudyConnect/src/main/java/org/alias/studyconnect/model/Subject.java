package org.alias.studyconnect.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity		
public class Subject {
	
	private int subjectCRN;
	private String subjectName;
	@ElementCollection
	private Set<Module> modules = new HashSet<>();
	@ManyToMany
	private List<UserDetails> studentList = new ArrayList<>();
	

	public Subject(){}
	
	
	//Getters and Setters
	
	//Subject CRN
	public int getSubjectCRN() {
		return subjectCRN;
	}
	public void setSubjectCRN(int subjectCRN) {
		this.subjectCRN = subjectCRN;
	}
	
	//SubjectName
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//ModuleList
	public Set<Module> getModules() {
		return modules;
	}
	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}
	
	//UserList
	public List<UserDetails> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<UserDetails> studentList) {
		this.studentList = studentList;
	}

}
