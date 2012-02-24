package com.occupytheserver.demo.jpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.occupytheserver.demo.jpa.object.User;
import com.occupytheserver.demo.jpa.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-demo-jpa.xml")
public class TestUserRepository {
	
	@Autowired UserRepository userRepository;
	
	@Test
	@Transactional
	public void testSave(){
		User user = new User();
		user.setFirstName("Tim");
		user.setLastName("Tebow");
		user = userRepository.save(user);
		Assert.notNull(user);
		Assert.notNull(user.getUserUid());
	}
	
	@Test
	@Transactional
	public void testFindAll(){
		testSave();
		List<User> users = userRepository.findAll();
		Assert.notNull(users);
		Assert.state(users.iterator().hasNext());
	}

}
