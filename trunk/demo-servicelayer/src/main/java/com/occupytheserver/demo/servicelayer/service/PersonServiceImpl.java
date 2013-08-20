package com.occupytheserver.demo.servicelayer.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.occupytheserver.demo.servicelayer.dto.Person;
import com.occupytheserver.demo.servicelayer.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired 
	private PersonRepository personRepository;
	
	@Transactional(readOnly = true)
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Person findById(Integer id){
		return personRepository.findById(id, false);
	}
	
	@Transactional
	public Person saveOrUpdate(Person person){
		return personRepository.saveOrUpdate(person);
	}

}
