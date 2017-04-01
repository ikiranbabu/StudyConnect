package org.alias.studyconnect.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String name;
	@ManyToOne
	@JoinColumn(name = "COLLEGE_ID")
	private College collegeId;
	@OneToMany(mappedBy = "dept")
	private List<Subject> subjectList = new ArrayList<>();
	
	public Department(){}
	
	public int getID() {
		return deptId;
	}

	public void setID(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
