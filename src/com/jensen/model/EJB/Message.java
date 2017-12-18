package com.jensen.model.EJB;

import java.io.Serializable;

/**
 * Message object with setter and getter.
 * 
 * <p>Created on Dec 15, 2017<p>
 * @author Saikat Talukder And Roberto
 * @version 1.0
 *
 */

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	private String user;
	private String message;
	private int messageId;

	
	
	public Message()
	{
		
	}
	
	/**
	 * 
	 * @return the current message as String.
	 * 
	 */
	public String getMessage() {
		return message;
	}
	
	
	/**
	 * 
	 * @param message message sets the currents message as String from user input.
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 
	 * @return the current user as String
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * 
	 * @param user user sets the new users name as String from user input.
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the messageId
	 */
	public int getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}


}
