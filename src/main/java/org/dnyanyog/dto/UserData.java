package org.dnyanyog.dto;

import org.springframework.stereotype.Component;


@Component
public class UserData {
	private String username;
	private String password;
	private String email;
	private String role;
	private String confirm_password;

	private String name_to_search;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getName_to_search() {
		return name_to_search;
	}
	public void setName_to_search(String name_to_search) {
		this.name_to_search = name_to_search;
	}
	
	
	

}
