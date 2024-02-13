package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginRequest {
	
	private String username;
	private String password;
	
	public String getusername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

}
