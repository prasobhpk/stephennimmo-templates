package com.codemkr.etrm.core.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.repository.ApplicationUserRepository;
import com.codemkr.etrm.core.repository.dto.ApplicationUserDTO;
import com.codemkr.etrm.object.ApplicationUser;
import com.hazelcast.core.MapStore;

@Component
public class ApplicationUserMapStore implements MapStore<Long, ApplicationUser> {
	
	@Autowired
	ApplicationUserRepository repository;
	
	@Override
	public ApplicationUser load(Long key) {
		ApplicationUserDTO dto = repository.findOne(key);
		return dto == null ? null : dto.convertToDomain();
	}

	@Override
	public Map<Long, ApplicationUser> loadAll(Collection<Long> keys) {
		Map<Long, ApplicationUser> map = new HashMap<>();
		for (Long key : keys) {
			ApplicationUser object = repository.findOne(key).convertToDomain();
			map.put(object.getApplicationUserUid(), object);
		}
		return map;
	}

	@Override
	public Set<Long> loadAllKeys() {
		Set<Long> set = new HashSet<>();
		Iterable<ApplicationUserDTO> objects = repository.findAll();
		for (ApplicationUserDTO object : objects) {
			set.add(object.getApplicationUserUid());
		}
		return set;
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public void deleteAll(Collection<Long> keys) {
		for (Long key : keys) {
			repository.delete(key);
		}
	}

	@Override
	public void store(Long key, ApplicationUser value) {
		repository.save(new ApplicationUserDTO(value));
	}

	@Override
	public void storeAll(Map<Long, ApplicationUser> map) {
		for (ApplicationUser value : map.values()) {
			repository.save(new ApplicationUserDTO(value));
		} 
	}

}
