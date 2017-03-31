package org.alias.studyconnect.model;

import javax.persistence.Embeddable;

@Embeddable
public class Module {
	
	private String moduleName;
	
	//Getters and Setters
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
