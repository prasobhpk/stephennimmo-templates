package com.occupytheserver.demo.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.occupytheserver.demo.jpa.object.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.firstName like ?1")
	List<User> search(String firstName);

}
