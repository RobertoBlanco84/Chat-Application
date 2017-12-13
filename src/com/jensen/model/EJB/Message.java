package com.jensen.model.EJB;

import java.io.Serializable;
import java.util.Date;


public class Message implements Serializable {
   
	private static final long serialVersionUID = 1L;
	private DateBean dateSent;
    private UserBean user;
    private MessageBeanTest message;
 
    public DateBean getDateSent() {
        return dateSent;
    }
 
    public void setDateSent(DateBean dateSent) {
        this.dateSent = dateSent;
    }
 
    public MessageBeanTest getMessage() {
        return message;
    }
 
    public void setMessage(MessageBeanTest message) {
        this.message = message;
    }
 
    public UserBean getUser() {
        System.out.println(user);
    	return user;
    }
 
    public void setUser(UserBean user) {
    	System.out.println(user);
    	this.user = user;
    }
}
