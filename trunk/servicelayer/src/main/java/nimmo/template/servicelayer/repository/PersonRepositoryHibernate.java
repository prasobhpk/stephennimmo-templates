package nimmo.template.servicelayer.repository;

import nimmo.template.servicelayer.dto.Person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryHibernate extends GenericRepositoryHibernate<Integer, Person> implements PersonRepository {

}
