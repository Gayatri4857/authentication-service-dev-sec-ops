package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddUserRequest {
	private String user_id;
	private String username;
	private String useremail;
	private String userage;
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public String getusername() {
		return username;
		
	}
	public void setusername(String username) {
		this.username = username;
		
	}
	public String getuseremail() {
		return useremail;
		
	}
	public void setuseremail(String useremail) {
		this.useremail = useremail;
		
	}
	public String getuserage() {
		return userage;
		
	}
	public void setuserage(String userage) {
		this.userage = userage;
		
	}
	
	
}