package org.alias.studyconnect.model;

import javax.persistence.Embeddable;

@Embeddable
public class Request {
	
	private int requestID;
	private Subject subject;
	private Module module;
	private UserDetails toUser;
	private UserDetails fromUser;
	
	public Request(){}


	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public UserDetails getToUser() {
		return toUser;
	}

	public void setToUser(UserDetails toUser) {
		this.toUser = toUser;
	}

	public UserDetails getFromUser() {
		return fromUser;
	}

	public void setFromUser(UserDetails fromUser) {
		this.fromUser = fromUser;
	}
	
}
