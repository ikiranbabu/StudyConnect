package org.alias.studyconnect.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Request {
	
	@EmbeddedId
	private RequestId requestId;
	@ManyToOne
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	@ManyToOne
	private UserDetails userSent;
	@ManyToOne
	private UserDetails userReceived;
	private int flag;
	
	
	public Request(){}

	//Getters and Setters

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public RequestId getRequestId() {
		return requestId;
	}

	public void setRequestId(RequestId requestId) {
		this.requestId = requestId;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	
}
