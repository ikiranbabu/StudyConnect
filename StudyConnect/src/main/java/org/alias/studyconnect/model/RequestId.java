package org.alias.studyconnect.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RequestId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int subjectCRN;
	private int fromUserId;
	private int toUserId;
	
	
	
	public int getSubjectCRN() {
		return subjectCRN;
	}
	public void setSubjectCRN(int subjectCRN) {
		this.subjectCRN = subjectCRN;
	}
	public int getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(int fromUserId) {
		this.fromUserId = fromUserId;
	}
	public int getToUserId() {
		return toUserId;
	}
	public void setToUserId(int toUserId) {
		this.toUserId = toUserId;
	}	
}