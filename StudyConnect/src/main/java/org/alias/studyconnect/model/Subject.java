package org.alias.studyconnect.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity		
public class Subject {
	
	@Id
	@GeneratedValue
	private int subjectCRN;
	private String subjectName;
	@ElementCollection
	private Set<Module> modules = new HashSet<>();
	@ManyToMany(mappedBy = "subjectList")
	private List<UserDetails> studentList = new ArrayList<>();
	@OneToMany(mappedBy = "subject")
	private List<Request> requestList = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department dept;
	@ManyToOne
	@JoinColumn(name = "COLLEGE_ID")
	private College college;



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
	
	//RequestList
	public List<Request> getRequestList() {
		return requestList;
	}
	public void setRequestList(List<Request> requestList) {
		this.requestList = requestList;
	}
}
