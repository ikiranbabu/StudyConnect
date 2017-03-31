package org.alias.studyconnect.model;

import javax.persistence.Embeddable;

@Embeddable
public class ChatDetails {

	private int chatID;
	private int fromUser;
	private int toUser;

	public int getChatID() {
		return chatID;
	}

	public void setChatID(int chatID) {
		this.chatID = chatID;
	}

	public int getFromUser() {
		return fromUser;
	}

	public void setFromUser(int fromUser) {
		this.fromUser = fromUser;
	}

	public int getToUser() {
		return toUser;
	}

	public void setToUser(int toUser) {
		this.toUser = toUser;
	}

}
