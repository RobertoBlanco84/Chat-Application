package com.jensen.model.EJB;

import java.io.Serializable;
import java.util.Date;

public class DateBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2933578358640356892L;
	private Date dateSent;

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}
	
}
