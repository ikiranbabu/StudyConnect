package org.alias.studyconnect.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Module {
	
	@Id
	private int moduleId;
	private String moduleName;
	@ManyToOne
	private Subject subjectName;
	@ManyToMany
	Set<UserDetails> user = new HashSet<>();
	
	public Subject getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(Subject subjectName) {
		this.subjectName = subjectName;
	}
	public Set<UserDetails> getUser() {
		return user;
	}
	public void setUser(Set<UserDetails> user) {
		this.user = user;
	}
	//Getters and Setters
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
}
