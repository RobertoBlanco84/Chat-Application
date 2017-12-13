package com.jensen.model.EJB;

import java.io.Serializable;
import java.util.Date;


public class Message implements Serializable {
   
	private static final long serialVersionUID = 1L;
	private Date dateSent;
    private String user;
    private String message;
 
    public Date getDateSent() {
        return dateSent;
    }
 
    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String getUser() {
        System.out.println(user);
    	return user;
    }
 
    public void setUser(String user) {
    	System.out.println(user);
    	this.user = user;
    }
}
