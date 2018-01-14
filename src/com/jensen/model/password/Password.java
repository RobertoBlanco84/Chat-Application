package com.jensen.model.password;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Password {
	
	@NotNull
	@Size(min=3, max=10)
	private String password;
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
