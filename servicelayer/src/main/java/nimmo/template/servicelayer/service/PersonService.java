package nimmo.template.servicelayer.service;

import java.util.List;

import nimmo.template.servicelayer.dto.Person;

public interface PersonService {

	List<Person> findAll();
	
	Person findById(Integer id);
	
	Person saveOrUpdate(Person person);

}