package com.occupytheserver.demo.servicelayer.service;

import java.util.List;

import com.occupytheserver.demo.servicelayer.dto.Person;


public interface PersonService {

	List<Person> findAll();
	
	Person findById(Integer id);
	
	Person saveOrUpdate(Person person);

}