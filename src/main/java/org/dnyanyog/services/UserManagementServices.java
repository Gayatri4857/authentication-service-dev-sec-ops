package org.dnyanyog.services;

import java.util.Optional;

import org.dnyanyog.dto.User;
import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementServices {
	@Autowired
	UsersRepository userRepo;
	
	public UserResponse addUpdateUser(UserRequest request) {
		
		UserResponse response = new UserResponse();
		Users usersTable = new Users();
		
		usersTable.setRole(request.getRole());
		usersTable.setEmail(request.getEmail());
		usersTable.setpassword(request.getPassword());
		usersTable.setusername(request.getUsername());
		usersTable.setConfirmPassword(request.getConfirm_password());
	    usersTable = userRepo.save(usersTable);
	   
	    response.setUser_id(usersTable.getUser_id());
	    response.setUsername(usersTable.getusername());
	    response.setPassword(usersTable.getpassword());
	    response.setEmail(usersTable.getEmail());
	    response.setRole(usersTable.getRole());
	    response.setConfirm_password(usersTable.getConfirmPassword());
	    response.setMeassage("User added Successfully");
	    response.setStatus("Success");
	    
		return response;
	}
	public User getSingleUser(Long user_id) {
		User userResponse = new User();
		
		Optional<Users> receivedData = userRepo.findById(user_id);
		if(receivedData.isEmpty()) {
			userResponse.setStatus("Fail");
			userResponse.setMessage("User not found");
		}
		else {
			Users user = receivedData.get();
			userResponse.setStatus("Success");
			userResponse.setMessage("User found");
			userResponse.setUser_id(user.getUser_id());
			
			userResponse.setEmail(user.getEmail());
			userResponse.setUsername(user.getusername());
			userResponse.setPassword(user.getpassword());
			userResponse.setRole(user.getRole());
			userResponse.setConfirm_password(user.getConfirmPassword());
		}
		return userResponse;
	}
	public String deleteuser(Long user_id) {
	userRepo.deleteById(user_id);
		return "Deleted"+user_id;
	}

	public UserResponse UpdateUser(Long user_id, UserRequest request) {
		
		UserResponse response = new UserResponse();
		Optional<Users> receivedData = userRepo.findById(user_id);
		if(receivedData.isPresent()) {
			
		Users usersTable = new Users();
		
		usersTable.setRole(request.getRole());
		usersTable.setEmail(request.getEmail());
		usersTable.setpassword(request.getPassword());
		usersTable.setusername(request.getUsername());
		usersTable.setConfirmPassword(request.getConfirm_password());
		
		usersTable.setUser_id(user_id);
	    usersTable = userRepo.save(usersTable);
	    
	    response.setMeassage("User added Successfully");
	    response.setStatus("Success");
	    response.setUser_id(user_id);
	    response.setUsername(usersTable.getusername());
	    response.setPassword(usersTable.getpassword());
	    response.setEmail(usersTable.getEmail());
	    response.setRole(usersTable.getRole());
	    response.setConfirm_password(usersTable.getConfirmPassword());
	    
	
	}
		return response;
	}
	
}
