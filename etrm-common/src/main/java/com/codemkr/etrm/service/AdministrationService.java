package com.codemkr.etrm.service;

import com.codemkr.etrm.object.ApplicationUser;

public interface AdministrationService {
	
	ApplicationUser findUser(String login, String password);

}