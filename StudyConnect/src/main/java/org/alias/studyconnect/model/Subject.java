package org.alias.studyconnect.model;

import java.util.HashSet;
import java.util.Set;

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
	private int subjectCRN;
	private String subjectName;
	@OneToMany(mappedBy = "subjectName")
	private Set<Module> modules = new HashSet<>();
	@ManyToMany(mappedBy = "subjectList")
	private Set<UserDetails> studentList = new HashSet<>();
	@OneToMany(mappedBy = "subject")
	private Set<Request> requestList = new HashSet<>();
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
	public Set<UserDetails> getStudentList() {
		return studentList;
	}
	public void setStudentList(Set<UserDetails> studentList) {
		this.studentList = studentList;
	}
	
	//RequestList
	public Set<Request> getRequestList() {
		return requestList;
	}
	public void setRequestList(Set<Request> requestList) {
		this.requestList = requestList;
	}
	
	//Department
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	//College
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
}
