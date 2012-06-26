package com.codemkr.etrm.core.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codemkr.etrm.core.object.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	@Query
	User findByLoginAndPassword(String login, String password);
	
}
