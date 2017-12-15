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

	private String message;
	
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
	
	
	


}
