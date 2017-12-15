package com.jensen.model.EJB;

import java.io.Serializable;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	
	public UserBean() {
		
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
