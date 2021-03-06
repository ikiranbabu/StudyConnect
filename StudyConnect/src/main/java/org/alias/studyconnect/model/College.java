package org.alias.studyconnect.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int collegeID;
	private String collegeName;
	@OneToMany(mappedBy = "collegeId")
	private List<Department> deptList = new ArrayList<>();
	@OneToMany(mappedBy = "college")
	private List<Subject> subjectList = new ArrayList<>();
	
	public College(){}
	
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
}
