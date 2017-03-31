package org.alias.studyconnect.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class UserDetails {
	
	@Id
	private int userId;
	private String userName;
	private String email;
	private String password;
	@Embedded
	private ChatDetails chatDetails;
	@ManyToMany
	private List<Subject> subjectList = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	List<Request> requestList = new ArrayList<>();
	

	public UserDetails(){}
	
	//Getters and Setters
	
	//UserID
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	//UserName
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//ChatDetails
	public ChatDetails getChatDetails() {
		return chatDetails;
	}

	public void setChatDetails(ChatDetails chatDetails) {
		this.chatDetails = chatDetails;
	}
	
	//SubjectList
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	//RequestList
	public List<Request> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<Request> requestList) {
		this.requestList = requestList;
	}
	
	
}
