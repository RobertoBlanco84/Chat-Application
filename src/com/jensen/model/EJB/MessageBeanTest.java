package com.jensen.model.EJB;

import java.io.Serializable;

public class MessageBeanTest implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public MessageBeanTest()
	{
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
