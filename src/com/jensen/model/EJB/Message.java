package com.jensen.model.EJB;

import java.io.Serializable;
import java.util.Date;

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
	private Date dateSent;
	private String user;
	private String message;

	
	public Message()
	{
		
	}
	
	/**
	 * 
	 * @return the current date as Date object.
	 * 
	 */
	public Date getDateSent() {
		return dateSent;
	}

	
	/**
	  *  
	  * @param dateSent sets the currents date for dateSent variable
	  * 		 (as Date)	 
	  */
	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
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

	
}
