package com.codemkr.etrm.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemkr.etrm.core.object.User;
import com.codemkr.etrm.core.repository.UserRepository;

@Service
public class AdministrationServiceImpl implements AdministrationService {
	
	@Autowired UserRepository userRepository;
	
	public User findUser(String login, String password){
		return userRepository.findByLoginAndPassword(login, password);
	}

}
