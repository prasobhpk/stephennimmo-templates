package com.occupytheserver.demo.servicelayer.repository;


import org.springframework.stereotype.Repository;

import com.occupytheserver.demo.servicelayer.dto.Person;

@Repository
public class PersonRepositoryHibernate extends GenericRepositoryHibernate<Integer, Person> implements PersonRepository {
	
}
