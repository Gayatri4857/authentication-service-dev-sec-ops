package org.dnyanyog.services;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddUserServices {
	@PostMapping(path="/api/auth/AddUser")
	public AddUserResponse adduser(@RequestBody AddUserRequest addUserRequest){
		AddUserResponse response = new AddUserResponse();
		
	response.setStatus("success");
	response.setMessage("user successfully added");
	response.setUser_id(addUserRequest.getUser_id());
	response.setusername(addUserRequest.getusername());
	response.setuseremail(addUserRequest.getuseremail());
	response.setuserage(addUserRequest.getuserage());
	
	return response;
	}
}
	
