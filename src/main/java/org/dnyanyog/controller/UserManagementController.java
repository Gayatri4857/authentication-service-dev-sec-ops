package org.dnyanyog.controller;


import java.util.List;

import org.dnyanyog.dto.User;
import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.services.UserManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementServices userService;
	
	@PostMapping(path="/auth/user",
	      consumes = {"application/json","application/xml"},
	      produces = {"application/json","application/xml"})
	public UserResponse addUpdateUser(@RequestBody UserRequest userRequest)
	{
		return userService.addUpdateUser(userRequest);
	}
	
	@GetMapping(path="/auth/user/{userId}")
	public User getSingleUser(@PathVariable Long userId)
	{
		return userService.getSingleUser(userId);
	}
	
	@DeleteMapping(path="/auth/user/delete/{userId}")
	public String deleteuser(@PathVariable Long userId)
	{
		return userService.deleteuser(userId);
		
	}
	
	@PostMapping(path="/auth/user/update/{userId}",
			 consumes = {"application/json","application/xml"},
		      produces = {"application/json","application/xml"})
	public UserResponse UpdateUser(@RequestBody UserRequest userRequest,@PathVariable Long userId)
	{
		return userService.UpdateUser(userId, userRequest);
	}
}
