package com.jensen.model.EJB;

import java.io.Serializable;
import java.util.Date;

public class DateBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dateSent;
	
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

}
