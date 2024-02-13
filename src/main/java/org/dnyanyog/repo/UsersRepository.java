package org.dnyanyog.repo;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.dto.User;
import org.dnyanyog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UsersRepository extends JpaRepository<Users, Long>{
	List<Users> findByUsernameAndPassword(String username,String password);


 
	

	
}
