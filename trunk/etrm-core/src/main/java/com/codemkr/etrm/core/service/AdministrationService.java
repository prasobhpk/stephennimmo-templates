package com.codemkr.etrm.core.service;

import com.codemkr.etrm.core.object.User;

public interface AdministrationService {
	
	User findUser(String login, String password);

}