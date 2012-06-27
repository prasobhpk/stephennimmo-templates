package com.codemkr.etrm.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.codemkr.etrm.object.ApplicationUser;
import com.hazelcast.core.IMap;
import com.hazelcast.core.IdGenerator;

@Service
public class AdministrationServiceImpl implements AdministrationService {
	
	private static Logger logger = LoggerFactory.getLogger(AdministrationServiceImpl.class);
	
	@Resource
	IMap<Long, ApplicationUser> applicationUserMap;
	
	@Resource
	IdGenerator applicationUserIdGenerator;
	
	public ApplicationUser findUser(String login, String password){
		return new ApplicationUser();
	}
	
	@PostConstruct
	public void initialize(){
		if (applicationUserIdGenerator.newId() == 1){
			long maxKey = 0;
			for (Long key : applicationUserMap.keySet()) {
				if (maxKey < key){
					maxKey = key;
				}
			} 
			while (applicationUserIdGenerator.newId() < maxKey){}
			logger.debug("ApplicationUserIdGenerator set to " + maxKey);
		}
	}

}
